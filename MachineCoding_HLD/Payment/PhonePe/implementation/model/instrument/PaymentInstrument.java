package MachineCoding_HLD.Payment.PhonePe.implementation.model.instrument;

import MachineCoding_HLD.Payment.PhonePe.implementation.enums.InstrumentType;
import MachineCoding_HLD.Payment.PhonePe.implementation.enums.TransactionState;

public class PaymentInstrument {
    private InstrumentType type;
    private TransactionState state;// state of particular instrument type. ( lets say if I selected instruments walleet and account, while paying account is sucessful wallet failed, we need to get status for each paymenet intrument)
    private long amount;// amount to pay.
}
