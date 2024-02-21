package MachineCoding_HLD.StockTrading.implementation.service;

/*
 It is connecting to third party exchange, so singleton.
 */

import MachineCoding_HLD.StockTrading.implementation.model.Stock;
import MachineCoding_HLD.StockTrading.implementation.model.order.Order;

public class NseStockExchange implements StockExchange{
    private static NseStockExchange nseStockExchange = null;
    private NseStockExchange() {}
    public static StockExchange getInstance(){
        if(nseStockExchange == null) nseStockExchange = new NseStockExchange();
        return nseStockExchange;
    }

    public void placeOrder(Order order){            // 3rd party api we will only send order info, user info we can have in own database.
        System.out.println("Order is placed");
    }

    @Override
    public void cancelOrder(Order order) {

    }

    @Override
    public void getStockPrice(Stock stock) {

    }
}
