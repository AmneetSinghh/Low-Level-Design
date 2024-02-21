package MachineCoding_HLD.StockTrading.implementation.repository;

import MachineCoding_HLD.StockTrading.implementation.model.Stock;
import MachineCoding_HLD.StockTrading.implementation.model.User;
import MachineCoding_HLD.StockTrading.implementation.model.order.Order;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class Database {
    private static Database databaseInstance = null;
    private Database(){}
    public static Database getInstance(){
        if(databaseInstance == null)databaseInstance = new Database();
        return databaseInstance;
    }

    private final Map<UUID, Order> orderMap = new HashMap<>();
    private final Map<UUID, User> userMap = new HashMap<>();
    private final Map<UUID, Stock> stockMap = new HashMap<>();

    public User getUserById(UUID id){
        return userMap.get(id);

    }
}

