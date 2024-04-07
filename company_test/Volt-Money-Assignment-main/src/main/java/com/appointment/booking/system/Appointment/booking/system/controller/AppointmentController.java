package com.appointment.booking.system.Appointment.booking.system.controller;

import com.appointment.booking.system.Appointment.booking.system.data.entity.Appointment;
import com.appointment.booking.system.Appointment.booking.system.dto.appointment.AppointmentResponse;
import com.appointment.booking.system.Appointment.booking.system.model.appointment.AppointmentActionRequest;
import com.appointment.booking.system.Appointment.booking.system.model.appointment.AppointmentBooking;
import com.appointment.booking.system.Appointment.booking.system.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/appointment")
public class AppointmentController {

    @Autowired
    private AppointmentService appointmentService;

    @PostMapping("/book")
    public ResponseEntity<Object> book(@RequestBody AppointmentBooking booking) throws Exception {
        try {
            Appointment appointment = appointmentService.book(booking);
            return new ResponseEntity<>(appointment.toString(), HttpStatus.ACCEPTED);
        } catch (Exception exception) {
            return new ResponseEntity<>("Appointment not booked" + exception.toString(), HttpStatus.BAD_GATEWAY);
        }
    }

    @PostMapping("/sampleBooking")
    public ResponseEntity<Object> addSampleData(@RequestBody AppointmentBooking booking) throws Exception {
        try {
            appointmentService.sampleBookingForTesting(booking);
            return new ResponseEntity<>("Dummy data pushed into database", HttpStatus.ACCEPTED);
        } catch (Exception exception) {
            return new ResponseEntity<>("Appointment not booked" + exception.toString(), HttpStatus.BAD_GATEWAY);
        }
    }

    @PostMapping("/cancel")
    public ResponseEntity<Object> cancel(@RequestBody AppointmentActionRequest booking) throws Exception {
        try {
            Appointment appointment = appointmentService.cancel(booking);
            return new ResponseEntity<>(appointment.toString(), HttpStatus.ACCEPTED);
        } catch (Exception exception) {
            return new ResponseEntity<>(exception.toString(), HttpStatus.BAD_GATEWAY);
        }
    }

    @PostMapping("/reschedule")
    public ResponseEntity<Object> reschedule(@RequestBody AppointmentActionRequest booking) throws Exception {
        try {
            Appointment appointment = appointmentService.reschedule(booking);
            return new ResponseEntity<>(appointment.toString(), HttpStatus.ACCEPTED);
        } catch (Exception exception) {
            return new ResponseEntity<>(exception.toString(), HttpStatus.BAD_GATEWAY);
        }
    }

    @GetMapping("/booked/{operatorId}")
    public ResponseEntity<Object> bookedAppointments(@PathVariable int operatorId) throws Exception {
        try {
            List<AppointmentResponse>  booked = appointmentService.bookedAppointmentByOperator(operatorId);
            return new ResponseEntity<>(booked, HttpStatus.ACCEPTED);
        } catch (Exception exception) {
            return new ResponseEntity<>(exception.toString(), HttpStatus.BAD_GATEWAY);
        }
    }

    @GetMapping("/available/slots/{operatorId}")
    public ResponseEntity<Object> availableSlots(@PathVariable int operatorId) throws Exception {
        try {
            List<AppointmentResponse>  availableSlots = appointmentService.availableAppointmentSlots(operatorId);
            return new ResponseEntity<>(availableSlots, HttpStatus.ACCEPTED);
        } catch (Exception exception) {
            return new ResponseEntity<>(exception.toString(), HttpStatus.BAD_GATEWAY);
        }
    }

}