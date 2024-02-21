package MachineCoding_HLD.StockTrading.implementation.service;

import MachineCoding_HLD.StockTrading.implementation.model.Stock;

import java.util.UUID;

public interface StockService {
    // need to connect with market service for getting exact new pricing.
    void addStock(Stock stock);
    void updateStock(Stock stock);
    void removeStock(UUID stockId);
    void getStockById(UUID stockId);
    void getStockChart(UUID stockId);
}
