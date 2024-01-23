package MachineCoding_HLD.BookMyShow.implementation.model;
import MachineCoding_HLD.BookMyShow.implementation.enums.BookingStatus;
import MachineCoding_HLD.BookMyShow.implementation.model.user.Customer;
import MachineCoding_HLD.BookMyShow.implementation.service.bookingChargeDecorator.BaseBookingCharge;

import java.util.List;

public class Booking {

    private int id;
    private List<Ticket> tickets;
    private Customer customer;
    private PaymentDetails paymentDetails;
    private BookingStatus status;
    private long createdAt;
    private BaseBookingCharge baseBookingCharge;
    private long amount;
    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }


    public BaseBookingCharge getBaseBookingCharge() {
        return baseBookingCharge;
    }

    public void setBaseBookingCharge(BaseBookingCharge baseBookingCharge) {
        this.baseBookingCharge = baseBookingCharge;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public PaymentDetails getPaymentDetails() {
        return paymentDetails;
    }

    public void setPaymentDetails(PaymentDetails paymentDetails) {
        this.paymentDetails = paymentDetails;
    }

    public BookingStatus getStatus() {
        return status;
    }

    public void setStatus(BookingStatus status) {
        this.status = status;
    }

    public long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }
}
