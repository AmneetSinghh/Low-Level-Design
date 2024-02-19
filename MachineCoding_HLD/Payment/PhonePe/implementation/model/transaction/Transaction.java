package MachineCoding_HLD.Payment.PhonePe.implementation.model.transaction;

import MachineCoding_HLD.Payment.PhonePe.implementation.enums.PaymentMode;
import MachineCoding_HLD.Payment.PhonePe.implementation.enums.TransactionState;
import MachineCoding_HLD.Payment.PhonePe.implementation.enums.TransactionType;
import MachineCoding_HLD.Payment.PhonePe.implementation.model.instrument.PaymentInstrument;
import java.util.List;

public abstract class Transaction {
    private String transactionId;
    private TransactionType type;
    private String globalPaymentId;
    private PaymentMode mode;
    private TransactionState state;
    private List<PaymentInstrument> paymentInstrument;
    private String paymentReferenceId;// sentPayment id.
    private String notes; /* Txn notes */
    private long amount;
    private long createdAt;
    private long updatedAt;
    private long deletedAt;
}
