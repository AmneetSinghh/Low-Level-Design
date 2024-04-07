package com.appointment.booking.system.Appointment.booking.system.model;

import com.appointment.booking.system.Appointment.booking.system.enums.OperatorStatus;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Operator extends User {
    Customer currentServingCustomer;
    OperatorStatus status;
}
