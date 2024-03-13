package company_test.Scapia;

import MachineCoding_HLD.CacheSystem.Cache.exceptions.NotFoundException;
import company_test.Scapia.enums.TrackingStatus;
import company_test.Scapia.model.DeliveryPartner;
import lombok.Getter;
import lombok.Setter;

import java.util.*;

@Getter
@Setter
public class TrackingService {

    public TrackingService(){
        createTrackingGraph();
    }

    Map<Integer, TrackDelivery> customerTracking = new HashMap<>();/// customer -> trackings.
    Map<Integer,Integer> trackingCustomerMapping = new HashMap<>();// customerId trackingId
    Map<String, Set<String>> trackingGraph = new HashMap<>();

    // tracking tree.


    public void setTrackingStatus(int trackingId, String status, DeliveryPartner deliveryPartner){
        if(customerTracking.containsKey(trackingId)){
            TrackDelivery trackDelivery = customerTracking.get(trackingId);
            String currentStatus = trackDelivery.getTracking().getStatus().toString();
//            if(validateTrackingStatus(trackDelivery.getTracking().getStatus()))
//            trackDelivery.getTrackingStatuses().add(status);
        }
        else{
            TrackDelivery trackDelivery = new TrackDelivery(new Tracking(trackingId,TrackingStatus.INITIATED,deliveryPartner),new ArrayList<>());
            trackDelivery.getTrackingStatuses().add(status);
            customerTracking.put(trackingId,trackDelivery);
        }
    }


    public List<String> getTrackingByCustomer(int customerId){
        int trackingId = trackingCustomerMapping.get(customerId);
        return customerTracking.get(trackingId).getTrackingStatuses();
    }


    public boolean validateTrackingStatus(String currentStatus, String nextStatus){
        return trackingGraph.get(currentStatus).contains(nextStatus);
    }

    public void createTrackingGraph(){
        trackingGraph.put(TrackingStatus.INITIATED.toString(),Set.of(TrackingStatus.PICKED.toString(),TrackingStatus.CANCELLED.toString()));
        trackingGraph.put(TrackingStatus.PICKED.toString(),Set.of(TrackingStatus.PACKED.toString(),TrackingStatus.CANCELLED.toString()));
        trackingGraph.put(TrackingStatus.PACKED.toString(),Set.of(TrackingStatus.DELIVERED.toString(),TrackingStatus.CANCELLED.toString()));
        trackingGraph.put(TrackingStatus.DELIVERED.toString(),Set.of());
        trackingGraph.put(TrackingStatus.CANCELLED.toString(),Set.of());
    }

}
