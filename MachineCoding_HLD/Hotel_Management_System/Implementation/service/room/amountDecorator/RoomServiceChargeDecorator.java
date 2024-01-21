package MachineCoding_HLD.Hotel_Management_System.Implementation.service.room.amountDecorator;

public class RoomServiceChargeDecorator extends RoomCharge{

    public RoomServiceChargeDecorator(IBaseRoomCharge baseRoomCharge){
        this.baseRoomCharge = baseRoomCharge;
    }
    @Override
    public int getPrice() {
        System.out.println("RoomServiceChargeDecorator::getPrice() called");
        return baseRoomCharge.getPrice() + 20;
    }
}
