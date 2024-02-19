package MachineCoding_HLD.Payment.PhonePe.implementation.model.transaction;

import java.util.List;

public class SentPayment extends Transaction {

    List<Receiver> receiverList;
    private long sendAt;

}


abstract class Receiver{
    // receiver info account details.
    private long amount;
    private String state;
    private String city;
    private String name;
}

class AccountReceiver extends Receiver{
    private String accountId;
    private String ifsc;
    private String branchName;
    private String fullVpa;
}

class UserReceiver extends Receiver{   // phonepe info
    String upiId;
    String phoneNumber;

}