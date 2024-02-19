package MachineCoding_HLD.Payment.PhonePe.implementation.service;

import MachineCoding_HLD.Payment.PhonePe.implementation.model.BankAccount;

public interface AccountService {
    BankAccount addAccount(String phoneNumber, String accountType);   /* phoneNumber registed with adhar card */
    void removeAccount(String accountId);
    BankAccount updateAccount(BankAccount account);
    void credit(long amount, String accountId);
    void debit(long amount, String accountId);
    long checkBalance(String accountId);
}
