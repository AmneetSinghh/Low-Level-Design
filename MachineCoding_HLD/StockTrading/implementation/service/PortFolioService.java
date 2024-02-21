package MachineCoding_HLD.StockTrading.implementation.service;

import MachineCoding_HLD.StockTrading.implementation.model.PortFolio;
import MachineCoding_HLD.StockTrading.implementation.model.Stock;

public interface PortFolioService {
    PortFolio getPortFolio();
    void addStock(Stock stock, long portfolioId);
    void removeStock(Stock stock, long portfolioId);
    void updateStockDetails(Stock stock, long portfolioId);
}
