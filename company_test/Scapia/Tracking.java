package company_test.Scapia;


import company_test.Scapia.enums.TrackingStatus;
import company_test.Scapia.model.DeliveryPartner;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@Data
public class Tracking {
    private int trackingId;
    private TrackingStatus status;
    private DeliveryPartner deliveryPartner;
}