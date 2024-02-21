package MachineCoding_HLD.StockTrading.implementation.model;

import MachineCoding_HLD.StockTrading.implementation.model.account.BankAccount;
import MachineCoding_HLD.StockTrading.implementation.model.account.StockAccount;

import java.util.UUID;

public class User {
    private UUID userId;
    private String name;
    // user related information.
    private StockAccount stockAccount;
    private KyCDetails kycDetails;
    private BankAccount bankAccount;
}
