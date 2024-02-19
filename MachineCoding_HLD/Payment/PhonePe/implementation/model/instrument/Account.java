package MachineCoding_HLD.Payment.PhonePe.implementation.model.instrument;

public class Account extends PaymentInstrument{
    private long id;
    private String accNo;
    private String ifsc;
    private String bankName;
    private String accType;// type of account it must be finite. ( current,savings )
    private String branchName;
}
