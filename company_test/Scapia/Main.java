package company_test.Scapia;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        DeliveryPartnerService deliveryPartnerService = new DeliveryPartnerService();
        Map<Integer,Integer> customerTracking = new HashMap<>();
        customerTracking.put(1,1);
        customerTracking.put(2,4);
        customerTracking.put(3,5);
        customerTracking.put(4,6);

        DeliveryPartner deliveryPartner = new DeliveryPartner(1, "bludart");
        deliveryPartnerService.onboardDeliveryPartner(deliveryPartner);
        TrackingService trackingService = new TrackingService();
        trackingService.setTrackingCustomerMapping(customerTracking);



        Scanner scanner = new Scanner(System.in);
        while(true){
            int inputType = scanner.nextInt();
            if(inputType == 1){
                int trackingId = scanner.nextInt();
                String trackingStatus = scanner.next();
                int deliveryId = scanner.nextInt();
                trackingService.setTrackingStatus(trackingId,trackingStatus,deliveryPartnerService.get(deliveryId));
            }
            else{
                int customerId = scanner.nextInt();
                System.out.println("For customer _> " + customerId);
                for(String status : trackingService.getTrackingByCustomer(customerId)){
                    System.out.println("Status :- "+status);
                }
            }
        }




    }
}
