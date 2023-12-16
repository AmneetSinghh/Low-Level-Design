package DESIGN_PATTERN.Creational_Patterns.Builder;

import java.util.ArrayList;
import java.util.List;

public class PhoneRecharge {
    private String fulfillReference;
    private String contactId;
    private String paymentReference;



    private PhoneRecharge(Builder builder) {
        this.contactId = builder.contactId;
        this.fulfillReference = builder.fulfillmentReference;
        this.paymentReference = builder.paymentReference;
    }

    public static class Builder {

        private String fulfillmentReference;
        private String paymentReference;
        private String contactId;


        public Builder setContactId(String contactId) {
            this.contactId = contactId;
            return this;
        }

        public Builder setFulfillmentReference(String fulfillmentReference) {
            this.fulfillmentReference = fulfillmentReference;
            return this;
        }

        public Builder setPaymentReference(String paymentReference) {
            this.paymentReference = paymentReference;
            return this;
        }

        public PhoneRecharge build() {
            return new PhoneRecharge(this);
        }
    }
}
