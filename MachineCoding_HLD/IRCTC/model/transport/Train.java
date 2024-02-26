package MachineCoding_HLD.IRCTC.model.transport;

import MachineCoding_HLD.IRCTC.enums.TrainStatus;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Data
public class Train {
    private int trainId;
    private String trainNumber;
    private String trainName;
    private List<String> stations;
    private List<String> arrivalTimes;
    private List<Integer> travelDays;
    private int numCompartments;
    private List<Compartment> compartments;
    private TrainStatus status;
    // other info.
}
