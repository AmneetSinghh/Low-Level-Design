package MachineCoding_HLD.Payment.PhonePe.implementation.service;

public interface WalletService {
    void createWallet();
    void updateWallet(); // max limit.
    void checkBalance();
    void debit();
    void credit();
}
