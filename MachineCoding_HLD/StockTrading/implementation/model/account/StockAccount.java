package MachineCoding_HLD.StockTrading.implementation.model.account;

import java.util.UUID;

public class StockAccount {
    private UUID id;
    private UUID userId;
    private long funds;
    private StockAccountType accountType;
}


enum StockAccountType{
    STOCK, MF, SOME_OTHER
}