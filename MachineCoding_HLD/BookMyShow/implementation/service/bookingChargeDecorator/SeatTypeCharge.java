package MachineCoding_HLD.BookMyShow.implementation.service.bookingChargeDecorator;

import MachineCoding_HLD.BookMyShow.implementation.model.Seat;
import MachineCoding_HLD.BookMyShow.implementation.model.Show;
import MachineCoding_HLD.BookMyShow.implementation.service.SeatService;

public class SeatTypeCharge extends BaseBookingChargeImpl {

    SeatService seatService;
    public SeatTypeCharge(BaseBookingCharge baseBookingCharge, SeatService seatService){
        this.baseBookingCharge = baseBookingCharge;
        this.seatService = seatService;
    }
    @Override
    public int calculateAmount(Show show, int seatNo, int hallNo) {
        int price = 0;
        Seat seat = seatService.getByIdAndHallNo(seatNo,hallNo);
        switch (seat.getSeatType()){
            case STANDARD -> {
                price = 250;
            }
            case REGULAR -> {
                price = 100;
            }
            case PREMIUM -> {
                price = 300;
            }
        }
        return baseBookingCharge.calculateAmount(show,seatNo,hallNo) + price;
    }
}