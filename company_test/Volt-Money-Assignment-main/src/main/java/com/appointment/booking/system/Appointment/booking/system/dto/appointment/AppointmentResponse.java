package com.appointment.booking.system.Appointment.booking.system.dto.appointment;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Builder
public class AppointmentResponse {
    private int startHour;
    private int endHour;
    private String day;
}
