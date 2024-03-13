package company_test.Scapia;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DeliveryPartnerService {

    Map<Integer, List<Integer>> deliveryPartnerTrackingList = new HashMap<>();
    Map<Integer, DeliveryPartner> deliveryPartnerMap = new HashMap<>();

    public void onboardDeliveryPartner(DeliveryPartner deliveryPartner){
        if(!deliveryPartnerMap.containsKey(deliveryPartner.getDeliveryPartnerId())){
            deliveryPartnerMap.put(deliveryPartner.getDeliveryPartnerId(), deliveryPartner);
            deliveryPartnerTrackingList.put(deliveryPartner.getDeliveryPartnerId(),new ArrayList<>());
        }
    }

    public void addTrackingForDeliveryPartner(int deliveryPartnerId, int trackingId){
        deliveryPartnerTrackingList.get(deliveryPartnerId).add(trackingId);
    }

    public DeliveryPartner get(int deliveryPartnerId){
        return deliveryPartnerMap.get(deliveryPartnerId);
    }
}
