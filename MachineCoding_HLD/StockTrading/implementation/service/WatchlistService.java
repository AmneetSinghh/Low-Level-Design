package MachineCoding_HLD.StockTrading.implementation.service;

import MachineCoding_HLD.StockTrading.implementation.model.Stock;

public interface WatchlistService {
    void addStockToWatchlist(Stock stock, long watchlistId);
    void removeStockFromWatchlist(Stock stock, long watchlistId);
    void getWatchlistById(long watchlistId);
}
