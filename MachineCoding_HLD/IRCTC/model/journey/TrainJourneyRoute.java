package MachineCoding_HLD.IRCTC.model.journey;

import MachineCoding_HLD.IRCTC.enums.TrainJourneyRouteStatus;

import java.util.UUID;

public class TrainJourneyRoute {
    private UUID trainJourneyRouteId;
    private TrainJourney trainJourney;// phillaur - delhi
    private long distanceFromOrigin;// distance from phillaur starting point to X_city;     (SORT BY DISTANCE_FROM_ORIGIN)
    private String source;
    private int sourcePlatform;
    private String destination;    // just this can be changed.
    private int destinationPlatform;
    private TrainJourneyRouteStatus trainJourneyRouteStatus;
    private long travelTime; /// from s - d
    private long delayTime;

}


/*

route : phillaur -> ludhiana -> chandigarh -> panipath - > sonipath -> delhi
tranJourneyId : phillayr - delhi
5 rows with date and timings.
p - l
l - c
c - p
p - s
s - d

*/


/*
phillaur to delhi: a- b - c - d - e - f - g - h - i - j - k - l - m - n - o ... z

- train search :
- search e - h
    solution : select * from train_journey_route


steps -
- find trains source - chandigarh - distanceFromOrigin &
- seat booking how ?
- -




 */