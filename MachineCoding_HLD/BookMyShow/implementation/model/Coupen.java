package MachineCoding_HLD.BookMyShow.implementation.model;
import MachineCoding_HLD.BookMyShow.implementation.enums.CoupenProviderType;
import MachineCoding_HLD.BookMyShow.implementation.enums.CoupenType;

public class Coupen {
    private int id;
    private int coupenCode;
    private long expiry; // expiry epoch;
    private int discount; // 10 rs off.
    private String offerDescription;
    private CoupenProviderType coupenProviderType;
    private CoupenType coupenType;
    private int isActive;
}
