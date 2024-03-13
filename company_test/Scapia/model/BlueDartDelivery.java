package company_test.Scapia.model;

import company_test.Scapia.enums.DeliveryPartnerType;

public class BlueDartDelivery extends DeliveryPartner{
    public BlueDartDelivery(Integer deliveryPartnerId, String contactInfo, String deliveryPartnerName) {
        super(deliveryPartnerId, contactInfo, deliveryPartnerName);
    }

    @Override
    public DeliveryPartnerType getDeliveryPartnerType() {
        return DeliveryPartnerType.BLUE_DART;
    }
}
