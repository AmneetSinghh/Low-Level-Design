package company_test.Scapia;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Getter
@Setter
public class TrackingService {
    Map<Integer, TrackDelivery> customerTracking = new HashMap<>();/// customer -> trackings.
    Map<Integer,Integer> trackingCustomerMapping = new HashMap<>();// customerId trackingId


    public void setTrackingStatus(int trackingId, String status, DeliveryPartner deliveryPartner){
        if(customerTracking.containsKey(trackingId)){
            TrackDelivery trackDelivery = customerTracking.get(trackingId);
            trackDelivery.getTrackingStatuses().add(status.toString());
        }
        else{
            TrackDelivery trackDelivery = new TrackDelivery(new Tracking(trackingId,null,deliveryPartner),new ArrayList<>());
            trackDelivery.getTrackingStatuses().add(status);
            customerTracking.put(trackingId,trackDelivery);
        }
    }


    public List<String> getTrackingByCustomer(int customerId){
        int trackingId = trackingCustomerMapping.get(customerId);
        return customerTracking.get(trackingId).getTrackingStatuses();
    }

}
