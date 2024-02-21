package MachineCoding_HLD.StockTrading.implementation.service;
import MachineCoding_HLD.StockTrading.implementation.model.order.Order;

public class OrderExecuter {
    StockExchange stockExchange;
    public OrderExecuter(StockExchange stockExchange){
        this.stockExchange = stockExchange;
    }
    public void executeOrder(Order order){
        stockExchange.placeOrder(order);
    }
}
