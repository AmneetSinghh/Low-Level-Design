package com.appointment.booking.system.Appointment.booking.system.service;
import com.appointment.booking.system.Appointment.booking.system.data.entity.Appointment;
import com.appointment.booking.system.Appointment.booking.system.data.entity.AppointmentStatusHistory;
import com.appointment.booking.system.Appointment.booking.system.dto.appointment.AppointmentResponse;
import com.appointment.booking.system.Appointment.booking.system.enums.AppointmentStatus;
import com.appointment.booking.system.Appointment.booking.system.model.appointment.AppointmentActionRequest;
import com.appointment.booking.system.Appointment.booking.system.model.appointment.AppointmentBooking;
import com.appointment.booking.system.Appointment.booking.system.repository.AppointmentRepository;
import com.appointment.booking.system.Appointment.booking.system.repository.AppointmentStatusHistoryRepository;
import com.appointment.booking.system.Appointment.booking.system.util.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Pair;
import org.springframework.stereotype.Component;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.*;

@Component
public class AppointmentService {

    @Autowired
    AppointmentRepository appointmentRepository;

    @Autowired
    AppointmentStatusHistoryRepository appointmentStatusHistoryRepository;

    public Appointment book(AppointmentBooking booking) throws Exception {
        /*
         * If booking already present throw error
         */
        String status = appointmentRepository.findAppointmentByOperatorAndSlot(booking.getOperatorId(),booking.getSlotEpoch());
        if(status!=null && !status.equals(AppointmentStatus.CANCELLED.toString())) {
            throw new Exception("slot already scheduled");
        }
        Appointment appointment = Appointment.builder()
                .id(UUID.randomUUID())
                .slot(booking.getSlotEpoch())
                .customerId(booking.getCustomerId())
                .operatorId(booking.getOperatorId())
                .status(AppointmentStatus.BOOKED)
                .createdByOperatorId(booking.getCreatedByOperatorId())
                .build();
        Appointment appointment1 = appointmentRepository.save(appointment);
        saveAppointmentStatusHistory(appointment1);
        return appointment1;
    }

    public Appointment reschedule(AppointmentActionRequest actionRequest) throws Exception {
        return updateAppointment(actionRequest,AppointmentStatus.RESCHEDULED);
    }

    public Appointment cancel(AppointmentActionRequest actionRequest) throws Exception {
        return updateAppointment(actionRequest,AppointmentStatus.CANCELLED);
    }

    private Appointment updateAppointment(AppointmentActionRequest actionRequest, AppointmentStatus appointmentStatus) throws Exception {
        Appointment appointment = appointmentRepository.getReferenceById(actionRequest.getAppointmentId());
        /*
         * if appointment already cancelled then we not allowed to cancel/reschedule.
         */
        if(appointment.getStatus().equals(AppointmentStatus.CANCELLED)){
            throw new Exception("Appointment already cancelled");
        }
        if(appointmentStatus.equals(AppointmentStatus.CANCELLED)){
            LocalDateTime date = Instant.ofEpochMilli(System.currentTimeMillis()).atZone(ZoneId.systemDefault()).toLocalDateTime();
            appointment.setDeletedAt(date); // soft delete.
        }
        appointment.setStatus(appointmentStatus);
        appointment.setSlot(actionRequest.getSlotEpoch());
        appointment.setCreatedByOperatorId(actionRequest.getCreatedByOperatorId());
        appointment.setStatus(appointmentStatus);
        saveAppointmentStatusHistory(appointment);
        return appointment;
    }

    /*
     * Maintaining history of appointment_status changes BOOKED-> RESCHEDULED -> CANCEL
     * This table will be useful for audits ( for every update on appointment table we do insert in this table )
     */
    private void saveAppointmentStatusHistory(Appointment appointment){
        AppointmentStatusHistory appointmentStatusHistory = AppointmentStatusHistory.builder()
                .id(UUID.randomUUID())
                .slot(appointment.getSlot())
                .status(appointment.getStatus())
                .appointmentId(appointment.getId())
                .build();
        appointmentStatusHistoryRepository.save(appointmentStatusHistory);
    }

    public List<AppointmentResponse> bookedAppointmentByOperator(int operatorId){
        List<Long> booked = appointmentRepository.findAppointmentsByStatusList(operatorId,List.of(AppointmentStatus.BOOKED));
        Collections.sort(booked);
        List<AppointmentResponse> output = new ArrayList<>();
        for(Long slot : booked){
            Pair<String,Integer> date = Utils.convertEpochToDate(slot);
            int endHour = date.getSecond()+1;
            output.add(AppointmentResponse.builder()
                    .startHour(date.getSecond())
                    .endHour(endHour%24).day(date.getFirst()).build());
        }
        return output;
    }

    public List<AppointmentResponse> availableAppointmentSlots(int operatorId) {
        List<AppointmentResponse> output = new ArrayList<>();
        List<Long> booked = appointmentRepository.findAppointmentsByStatusList(operatorId, List.of(AppointmentStatus.BOOKED, AppointmentStatus.RESCHEDULED));
        Collections.sort(booked);
        Map<String, List<AppointmentResponse>> slotDateMapping = getDateWiseSlot(booked);
        for (Map.Entry<String, List<AppointmentResponse>> entry : slotDateMapping.entrySet()) {
            List<AppointmentResponse> slotList = entry.getValue();
            int prevSlot = 0;
            for (int i = 0; i < slotList.size(); i++) {
                    int availableSlot = slotList.get(i).getStartHour() - prevSlot;
                    if (availableSlot > 0) {
                        output.add(AppointmentResponse.builder().day(entry.getKey()).startHour(prevSlot).endHour(slotList.get(i).getStartHour()).build());
                    }
                    prevSlot = slotList.get(i).getEndHour();
            }

            /* last slot */
            if (prevSlot == 0 && slotList.size() == 0) {
                output.add(AppointmentResponse.builder().day(entry.getKey()).startHour(0).endHour(0).build());
            } else if (prevSlot != 0) {
                output.add(AppointmentResponse.builder().day(entry.getKey()).startHour(prevSlot).endHour(0).build());
            }

        }
        return output;
    }

    private Map<String, List<AppointmentResponse>> getDateWiseSlot(List<Long> booked){
        Map<String, List<AppointmentResponse>> slotDateMapping = new HashMap<>();
        for (Long slot : booked) {
            Pair<String, Integer> date = Utils.convertEpochToDate(slot);
            int endHour = date.getSecond()+1;
            AppointmentResponse response = AppointmentResponse.builder()
                    .startHour(date.getSecond())
                    .endHour(endHour%24).day(date.getFirst()).build();
            if (!slotDateMapping.containsKey(date.getFirst())) {
                slotDateMapping.put(date.getFirst(), new ArrayList<>());
            }
            slotDateMapping.get(date.getFirst()).add(response);
        }
        return slotDateMapping;
    }


    /*
     * For testing purpose for findAvailableSlots.
     */
    public void sampleBookingForTesting(AppointmentBooking booking){
        for(int i=2;i<=23;i+=5){
            String slot;
            if(i<10){
                slot = "2022-02-23 0"+i;
            }
            else{
                slot = "2022-02-23 "+i;
            }
            booking.setSlot(slot);
            System.out.println("Slot is : "+ slot);
            System.out.println("epoch  is : "+ booking.getSlotEpoch());
            try {
                book(booking);
            } catch (Exception e) {
                System.out.println("Already found skip it");
                continue;
            }
        }
    }

}
