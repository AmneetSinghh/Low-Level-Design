package MachineCoding_HLD.StockTrading.implementation.service;

import MachineCoding_HLD.StockTrading.implementation.model.order.Order;

import java.util.UUID;

public class OrderManager {

    OrderValidator orderValidator;
    OrderExecuter orderExecuter;
    public OrderManager(OrderValidator orderValidator, OrderExecuter orderExecuter){
        this.orderExecuter = orderExecuter;
        this.orderValidator = orderValidator;
    }

    void placeOrder(UUID userId, Order order){
        if(orderValidator.validateOrder(userId,order)){
            orderExecuter.executeOrder(order);
        } else{
            System.out.println("Can't execute order");
        }
    }
}
