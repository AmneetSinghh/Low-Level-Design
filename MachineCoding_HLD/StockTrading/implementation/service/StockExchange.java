package MachineCoding_HLD.StockTrading.implementation.service;

import MachineCoding_HLD.StockTrading.implementation.model.Stock;
import MachineCoding_HLD.StockTrading.implementation.model.order.Order;

/*
 * Third party Api we need to call here.
 */

/*
 * All things handled by this, we are just middle layer.
 */
public interface StockExchange{
    void placeOrder(Order order);
    void cancelOrder(Order order);
    void getStockPrice(Stock stock);

}




/*

- live stock trading : as they are connecting with third party, so we can use observer here.
// while getting the stock update lets update it in lots of classes.

*/