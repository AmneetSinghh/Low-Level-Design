package MachineCoding_HLD.Hotel_Management_System.Implementation.service.room.amountDecorator;


import MachineCoding_HLD.Hotel_Management_System.Implementation.service.room.IRoomService;

public class RoomTypeChargeDecorator extends RoomCharge{

    IRoomService roomService;

    public RoomTypeChargeDecorator(IBaseRoomCharge baseRoomCharge, IRoomService roomService){
        this.baseRoomCharge = baseRoomCharge;
        this.roomService = roomService;
    }
    @Override
    public int getPrice() {
        System.out.println("RoomTypeChargeDecorator::getPrice() called");
        return baseRoomCharge.getPrice() + roomService.getPrice();
    }
}