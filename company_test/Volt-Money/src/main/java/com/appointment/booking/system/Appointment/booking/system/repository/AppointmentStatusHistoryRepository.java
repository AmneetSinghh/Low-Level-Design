package com.appointment.booking.system.Appointment.booking.system.repository;
import com.appointment.booking.system.Appointment.booking.system.data.entity.AppointmentStatusHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface AppointmentStatusHistoryRepository extends JpaRepository<AppointmentStatusHistory, UUID> {

}
