package MachineCoding_HLD.StockTrading.implementation.model.order;

import MachineCoding_HLD.StockTrading.implementation.enums.ExchangeType;
import MachineCoding_HLD.StockTrading.implementation.enums.OrderState;
import MachineCoding_HLD.StockTrading.implementation.enums.OrderTransactionType;
import MachineCoding_HLD.StockTrading.implementation.enums.OrderType;
import MachineCoding_HLD.StockTrading.implementation.model.Stock;

import java.util.List;
import java.util.UUID;

public abstract class Order {
    private UUID orderId;
    private int units;                                      // one order can have many transactions.
    private Stock stock;// all info currentPrice & all.
    private long orderPrice;
    private OrderState state;
    private OrderTransactionType orderTransactionType;
    private ExchangeType exchangeType; // this can be in stocks, a
    private OrderType orderType;
    private List<OrderTransaction> orderTransactionList;// this will be available in order-reports.
    private long brokerageFee;// depends on % of units*stocksPrice.
    private long createdAt;

    public Order(OrderType type){
        this.orderType = type;
    }

}

/*
For a single order, we can have multiple buyers or sellers. so multiple transactions for one order.
 */