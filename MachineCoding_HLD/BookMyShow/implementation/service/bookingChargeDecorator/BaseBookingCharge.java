package MachineCoding_HLD.BookMyShow.implementation.service.bookingChargeDecorator;

import MachineCoding_HLD.BookMyShow.implementation.model.Seat;

public interface BaseBookingCharge {
    int calculateAmount(Seat seat);
}
