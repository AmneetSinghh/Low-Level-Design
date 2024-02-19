package MachineCoding_HLD.Payment.PhonePe.implementation.service;

import MachineCoding_HLD.Hotel_Management_System.Implementation.model.Account;



// this will not be needed, as due to time management we will consider phonepe account as final account.

// original flow
// phonepe-account -> bank account.
public interface BankService {
    void creditToAccount(String accountId);
    void debitToAccount();
    void checkBalance(Account account);
}
