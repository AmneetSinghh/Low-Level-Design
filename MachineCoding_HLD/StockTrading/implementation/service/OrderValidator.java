package MachineCoding_HLD.StockTrading.implementation.service;


import MachineCoding_HLD.StockTrading.implementation.model.order.Order;
import MachineCoding_HLD.StockTrading.implementation.repository.Database;

import java.util.UUID;

public class OrderValidator {
    /*
     * Are you eligible to place order?             Multiple layers of validators.
     * Enough Funds : Funds  user have enough funds? & StockValidator
     * security validator
     * premium validator.
     *
     */
    Database database;
    public boolean validateOrder(UUID userId , Order order){
        // multiple layers.
        return true;
    }
}
