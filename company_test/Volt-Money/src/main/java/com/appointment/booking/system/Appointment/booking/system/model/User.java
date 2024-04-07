package com.appointment.booking.system.Appointment.booking.system.model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Builder
public class User {
    private int id;
    private String name;
    private String phoneNumber;
    private String email;
    private String Address;
    private int agencyId;
}

