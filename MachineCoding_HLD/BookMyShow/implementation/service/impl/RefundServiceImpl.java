package MachineCoding_HLD.BookMyShow.implementation.service.impl;

import MachineCoding_HLD.BookMyShow.implementation.model.Booking;
import MachineCoding_HLD.BookMyShow.implementation.model.Refund;
import MachineCoding_HLD.BookMyShow.implementation.service.PaymentService;
import MachineCoding_HLD.BookMyShow.implementation.service.RefundService;
import MachineCoding_HLD.Hotel_Management_System.Implementation.enums.RefundStatus;

public class RefundServiceImpl implements RefundService {
    public RefundServiceImpl(PaymentService paymentService){
        this.paymentService = paymentService;
    }

    PaymentService paymentService;
    @Override
    public void processRefund(Booking booking) {
        Refund refund = new Refund();
        refund.setId(booking.getId());
        refund.setBooking(booking);
        refund.setRefundAmount((int) (booking.getAmount() - Refund.refundDeduction));
        refund.setRefundReason("Doing refund falmi mi");
        refund.setStatus(RefundStatus.PENDING);
        paymentService.processPayment(refund.getRefundAmount());
    }

}
