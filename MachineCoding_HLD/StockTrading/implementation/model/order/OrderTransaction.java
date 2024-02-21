package MachineCoding_HLD.StockTrading.implementation.model.order;

import MachineCoding_HLD.StockTrading.implementation.enums.OrderTransactionType;

import java.util.UUID;

//We didn't implement this class. This is to point out that order
//is comprised of multiple transactions.
//If user is selling 100 stocks, 30 might go to user2 but 70 might go to user3.
//Exchange will do the transactions and send back details which we will show in tradebook

public class OrderTransaction {
    private UUID orderId;
    private UUID vendorUserId;// seller or buyer id.
    private OrderTransactionType orderTransactionType;
    private int units;
    private int price;
    private long createdAt;

}

/*
- stock exchange just manage buyers and sellers, If I want to sell, then must a buy request as well, otherwise request will be in a queue.
-  stock exchange manages orders of buyers and sellers. thats it.

 u1 buy s1 unit = 100 , price = 20  ) 3 users id's created -> {o1,u3}  {u1,u2}  {u1,u3}


  u3 sell s1 unit = 21 , price = 15   eligible    ( 1 CREATED  full selled )
  u2 sell s1 unit = 40     , price = 19     eligible ( 1 CREATED  full selled )
  u3 sell s1 unit = 50 , price = 20 eligible    ( 1 CREATED  partially selled )

 u2 sell s1 unit = 23 , price = 30
 u3 sell s1 unit = 81 , price = 40
 u2 sell s1 unit = 23  , price = 50
 u3 sell s1 unit = 90 , price = 26
 u2 sell s1 unit = 20   , price = 19



 stock units in database : 2000
 */
