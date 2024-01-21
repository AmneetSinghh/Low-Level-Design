package MachineCoding_HLD.Hotel_Management_System.Implementation.service.room.amountDecorator;


public class FoodServiceChargeDecorator extends RoomCharge{

    public FoodServiceChargeDecorator(IBaseRoomCharge baseRoomCharge){
        this.baseRoomCharge = baseRoomCharge;
    }
    @Override
    public int getPrice() {
        System.out.println("FoodServiceChargeDecorator::getPrice() called");
        return baseRoomCharge.getPrice() + 10;
    }
}
