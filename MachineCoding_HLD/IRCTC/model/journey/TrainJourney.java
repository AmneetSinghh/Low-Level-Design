package MachineCoding_HLD.IRCTC.model.journey;

import MachineCoding_HLD.IRCTC.enums.TrainJourneyStatus;
import MachineCoding_HLD.IRCTC.model.transport.Train;
import java.util.UUID;

public class TrainJourney {
    private UUID trainJourneyId;// lets say phillaur - pune.
    private Train train;
    private String source;
    private String destination;    // just this can be changed.
    private long totalTravelTime;
    private long totalDelayTime;
    private TrainJourneyStatus status;
    private long travelDate;
}

/*
- lets say route :
route : phillaur -> ludhiana -> chandigarh -> panipath - > sonipath -> delhi

- new route can get added dynamically while train running, so code must be extendable to that changes.
- doing with indexing or numbering routes means need to change route number, so not good approach.
indexing approach is wrong :


id = 1
source : phillaur
sourceRouteNum: 1
destination : delhi
destinationRouteNum: 5



 */
