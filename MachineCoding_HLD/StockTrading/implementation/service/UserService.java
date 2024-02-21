package MachineCoding_HLD.StockTrading.implementation.service;
import MachineCoding_HLD.StockTrading.implementation.model.User;
import MachineCoding_HLD.StockTrading.implementation.model.account.BankAccount;
import MachineCoding_HLD.StockTrading.implementation.model.account.StockAccount;

import java.util.UUID;

public interface UserService {
    public void getUserById(UUID userId);
    public void createUser(User user);
    public void addBankDetails(BankAccount bankAccount);
    public void removeBankDetails(BankAccount bankAccount);
    public void createStockAccount(StockAccount stockAccount);
    public void addFundsToStockAccount(long funds, StockAccount stockAccount);
}



/*
 * Stock Account & BankAccount can be a different class.
 */