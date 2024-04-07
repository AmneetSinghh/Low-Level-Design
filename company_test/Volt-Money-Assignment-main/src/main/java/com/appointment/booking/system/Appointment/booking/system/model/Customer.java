package com.appointment.booking.system.Appointment.booking.system.model;

import com.appointment.booking.system.Appointment.booking.system.enums.CustomerOnboardingSource;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Customer extends User {
    CustomerOnboardingSource onboardingSource;

}
