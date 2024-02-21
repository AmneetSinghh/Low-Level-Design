package MachineCoding_HLD.StockTrading.implementation.model;

import java.util.List;
import java.util.UUID;

public class PortFolio {
    private long id;
    private UUID userId;  // foreign key.
    private List<StockPortfolio> stockPortfolioList;
    private long totalWealth;
    private long investedAmount;
    private long interestAmount;
}


class StockPortfolio{
    private Stock stock;
    private long units;
    private long wealth;
}
