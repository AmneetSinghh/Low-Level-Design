package MachineCoding_HLD.Payment.PhonePe.implementation.model;

public class BankAccount {
    private long id;
    private String accNo;
    private String ifsc;
    private String bankName;
    private String accType;// type of account it must be finite. ( current,savings )
    private String branchName;
    private String availableBalance;
}