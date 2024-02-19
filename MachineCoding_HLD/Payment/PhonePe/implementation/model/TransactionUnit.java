package MachineCoding_HLD.Payment.PhonePe.implementation.model;

import MachineCoding_HLD.Payment.PhonePe.implementation.model.transaction.Transaction;

import java.util.List;

public class TransactionUnit {
    private List<Transaction> entities;
    private String globalPaymentId; /* for next NX_UUID, MF_UUID, SENT_UUID, RECEIVE_UUID */
}
