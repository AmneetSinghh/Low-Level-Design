package LLD.MANAGEMENT_SYSTEMS.Hotel_Management_System.Implementation;

import LLD.MANAGEMENT_SYSTEMS.Hotel_Management_System.Implementation.enums.RoomType;
import LLD.MANAGEMENT_SYSTEMS.Hotel_Management_System.Implementation.service.room.IRoomService;
import LLD.MANAGEMENT_SYSTEMS.Hotel_Management_System.Implementation.service.room.RoomFactory;
import LLD.MANAGEMENT_SYSTEMS.Hotel_Management_System.Implementation.service.room.amountDecorator.*;

public class Hotel_Management_Runner {
    public static void main(String[] args){
        RoomFactory roomFactory = RoomFactory.getInstance();
        IRoomService roomService = roomFactory.getRoomServiceByType(RoomType.DELUXE);
        IBaseRoomCharge roomCharge = new RoomCharge();
        roomCharge = new RoomTypeChargeDecorator(roomCharge,roomService);
        roomCharge = new RoomServiceChargeDecorator(roomCharge);
        roomCharge = new FoodServiceChargeDecorator(roomCharge);
        System.out.println(roomCharge.getPrice());


    }
}
