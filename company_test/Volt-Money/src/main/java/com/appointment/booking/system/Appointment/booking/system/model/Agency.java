package com.appointment.booking.system.Appointment.booking.system.model;

import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@ToString
@EqualsAndHashCode
public class Agency {
    private int id;
    private String name;
    private String contactPerson;
    private String contactEmail;
    private String Address;
}