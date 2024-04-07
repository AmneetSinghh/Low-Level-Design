package com.appointment.booking.system.Appointment.booking.system.repository;

import com.appointment.booking.system.Appointment.booking.system.data.entity.Appointment;
import com.appointment.booking.system.Appointment.booking.system.enums.AppointmentStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, UUID> {
    @Query("SELECT a.slot FROM appointments a WHERE a.status IN :statusList AND a.operatorId = :operatorId AND a.deletedAt=null")
    List<Long> findAppointmentsByStatusList(@Param("operatorId") int operatorId, @Param("statusList") List<AppointmentStatus> statusList);

    @Query("SELECT a.status FROM appointments a WHERE a.slot=:slot AND a.operatorId = :operatorId AND a.deletedAt=null")
    String findAppointmentByOperatorAndSlot(@Param("operatorId") int operatorId, @Param("slot") Long slot);
}
