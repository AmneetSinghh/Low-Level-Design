package MachineCoding_HLD.StockTrading.implementation.model.order;

import MachineCoding_HLD.StockTrading.implementation.enums.OrderType;

public class MarketOrder extends Order{
    public MarketOrder(){
        super(OrderType.MARKET);
    }
}
