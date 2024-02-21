package MachineCoding_HLD.StockTrading.implementation.model;

import MachineCoding_HLD.StockTrading.implementation.enums.ExchangeType;

import java.util.UUID;

public class Stock {
    private UUID id;
    private String name;
    private long units;
    private long unitPrice;                 //its keep changing realtime.
    private ExchangeType exchangeType;
    private long marketVolume; // number of stocks of this kind ,  available in market.
    // other info.
}
