package MachineCoding_HLD.Payment.PhonePe.implementation.model.instrument;

import MachineCoding_HLD.Payment.PhonePe.implementation.enums.TransactionState;
import MachineCoding_HLD.Payment.PhonePe.implementation.enums.TransactionType;

public class PaymentInstrument {
    private TransactionType type;
    private TransactionState state;// state of particular instrument type. ( lets say if I selected instruments walleet and account, while paying account is sucessful wallet failed, we need to get status for each paymenet intrument)
    private long amount;
}
