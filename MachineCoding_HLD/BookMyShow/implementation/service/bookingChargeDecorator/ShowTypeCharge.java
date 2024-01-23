package MachineCoding_HLD.BookMyShow.implementation.service.bookingChargeDecorator;

import MachineCoding_HLD.BookMyShow.implementation.model.Seat;

public class ShowTypeCharge extends BaseBookingChargeImpl {
    public ShowTypeCharge(BaseBookingCharge baseBookingCharge){
        this.baseBookingCharge = baseBookingCharge;
    }

    @Override
    public int calculateAmount(Seat seat) {
        int price = 0;
        switch (seat.getShowSlot().getShow().getShowType()){
            case TWO_D : {
                price = 100;
            }
            case THREE_D : {
                price = 200;
            }
            case I_MAX : {
                price = 300;
            }
        }
        return baseBookingCharge.calculateAmount(seat) + price;
    }
}
