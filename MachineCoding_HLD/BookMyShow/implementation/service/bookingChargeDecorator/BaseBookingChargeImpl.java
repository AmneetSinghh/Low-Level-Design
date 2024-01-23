package MachineCoding_HLD.BookMyShow.implementation.service.bookingChargeDecorator;

import MachineCoding_HLD.BookMyShow.implementation.model.Seat;
import MachineCoding_HLD.BookMyShow.implementation.model.Show;

public class BaseBookingChargeImpl implements BaseBookingCharge{
    BaseBookingCharge baseBookingCharge;
    private final int BASE_CHARGE = 10;
    @Override
    public int calculateAmount(Seat seat) {
        return BASE_CHARGE;
    }
}
