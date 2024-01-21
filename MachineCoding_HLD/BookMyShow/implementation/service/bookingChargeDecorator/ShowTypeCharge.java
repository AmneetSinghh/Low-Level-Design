package MachineCoding_HLD.BookMyShow.implementation.service.bookingChargeDecorator;

import MachineCoding_HLD.BookMyShow.implementation.model.Show;

public class ShowTypeCharge extends BaseBookingChargeImpl {
    public ShowTypeCharge(BaseBookingCharge baseBookingCharge){
        this.baseBookingCharge = baseBookingCharge;
    }
    @Override
    public int calculateAmount(Show show, int seatNo, int hallNo) {
        int price = 0;
        switch (show.getShowType()){
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
        return baseBookingCharge.calculateAmount(show,seatNo,hallNo) + price;
    }
}
