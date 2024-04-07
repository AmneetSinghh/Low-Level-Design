package com.appointment.booking.system.Appointment.booking.system.model.appointment;
import com.appointment.booking.system.Appointment.booking.system.util.Utils;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Builder
public class AppointmentRequest {
    private int createdByOperatorId;
    private Long slotEpoch;
    private String slot;

    public long getSlotEpoch(){
        System.out.println("Slot -> for booking"+ slot);
        this.slotEpoch= Utils.convertDateToEpoch(slot);
        return this.slotEpoch;
    }
}
