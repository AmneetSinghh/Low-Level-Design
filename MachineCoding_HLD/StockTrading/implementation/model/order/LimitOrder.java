package MachineCoding_HLD.StockTrading.implementation.model.order;

import MachineCoding_HLD.StockTrading.implementation.enums.OrderType;

public class LimitOrder extends Order{
    public LimitOrder(){
        super(OrderType.LIMIT);
    }
    private int proposingPrice;
}
