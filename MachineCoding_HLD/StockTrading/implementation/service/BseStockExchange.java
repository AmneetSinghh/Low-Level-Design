package MachineCoding_HLD.StockTrading.implementation.service;

import MachineCoding_HLD.StockTrading.implementation.model.Stock;
import MachineCoding_HLD.StockTrading.implementation.model.order.Order;

/*

 */
public class BseStockExchange implements StockExchange{
    private static BseStockExchange bseStockExchange = null;
    private BseStockExchange() {}
    public static StockExchange getInstance(){
        if(bseStockExchange == null) bseStockExchange = new BseStockExchange();
        return bseStockExchange;
    }

    @Override
    public void placeOrder(Order order) {

    }

    @Override
    public void cancelOrder(Order order) {

    }

    @Override
    public void getStockPrice(Stock stock) {

    }
}
