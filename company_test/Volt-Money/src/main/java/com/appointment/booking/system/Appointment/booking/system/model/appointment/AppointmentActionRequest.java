package com.appointment.booking.system.Appointment.booking.system.model.appointment;

import lombok.*;

import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class AppointmentActionRequest extends AppointmentRequest{
    private UUID appointmentId;
}
