package com.appointment.booking.system.Appointment.booking.system.model.appointment;

import lombok.*;

import java.time.LocalTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class AppointmentBooking extends AppointmentRequest {
    private int operatorId;
    private int customerId;
}
