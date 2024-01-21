package MachineCoding_HLD.BookMyShow.implementation.service.bookingChargeDecorator;

import MachineCoding_HLD.BookMyShow.implementation.model.Show;

public interface BaseBookingCharge {
    int calculateAmount(Show show, int seatNo, int hallNo);
}
