package MachineCoding_HLD.BookMyShow.implementation.service.bookingChargeDecorator;

import MachineCoding_HLD.BookMyShow.implementation.model.Seat;
import MachineCoding_HLD.BookMyShow.implementation.service.SeatService;

public class SeatTypeCharge extends BaseBookingChargeImpl {

    SeatService seatService;
    public SeatTypeCharge(BaseBookingCharge baseBookingCharge, SeatService seatService){
        this.baseBookingCharge = baseBookingCharge;
        this.seatService = seatService;
    }
    @Override
    public int calculateAmount(Seat seat) {
        int price = 0;
        switch (seat.getSeatType()){
            case STANDARD : {
                price = 250;
            }
            case REGULAR : {
                price = 100;
            }
            case PREMIUM : {
                price = 300;
            }
        }
        return baseBookingCharge.calculateAmount(seat) + price;
    }
}