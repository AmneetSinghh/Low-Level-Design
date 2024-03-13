package company_test.Scapia.model;


import company_test.Scapia.enums.DeliveryPartnerType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Data
public abstract class DeliveryPartner {
    private Integer deliveryPartnerId;
    private String contactInfo;
    private String deliveryPartnerName;
    public abstract DeliveryPartnerType getDeliveryPartnerType();
}



