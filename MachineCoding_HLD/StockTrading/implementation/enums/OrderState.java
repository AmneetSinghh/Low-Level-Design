package MachineCoding_HLD.StockTrading.implementation.enums;

public enum OrderState {
    PENDING, FILLED, CANCELLED, IN_PROGRESS, PARTIALLY_FILLED
}


// partially filled means. some lets say you said 100 units, 60 sold, some are on hold.


// one order can have many transactions.