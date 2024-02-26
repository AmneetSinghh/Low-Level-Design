package MachineCoding_HLD.IRCTC.model.transport;

import MachineCoding_HLD.IRCTC.enums.CompartmentType;

import java.util.List;

public class Compartment {
    private int compartmentId;
    private String compartmentName;
    private CompartmentType compartmentType;// lets say general.
    private int seatAvailableCount;
    private List<Seat> seats;

}
