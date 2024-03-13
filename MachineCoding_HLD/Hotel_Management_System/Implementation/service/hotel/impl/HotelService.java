package MachineCoding_HLD.Hotel_Management_System.Implementation.service.hotel.impl;

import MachineCoding_HLD.Hotel_Management_System.Implementation.enums.RoomStatus;
import MachineCoding_HLD.Hotel_Management_System.Implementation.model.Room;
import MachineCoding_HLD.Hotel_Management_System.Implementation.model.users.Guest;
import MachineCoding_HLD.Hotel_Management_System.Implementation.service.hotel.IHotelService;
import MachineCoding_HLD.Hotel_Management_System.Implementation.service.room.IRoomAdmin;
import MachineCoding_HLD.Hotel_Management_System.Implementation.service.room.IRoomService;
import MachineCoding_HLD.Hotel_Management_System.Implementation.service.room.RoomFactory;
import MachineCoding_HLD.Hotel_Management_System.Implementation.service.room.amountDecorator.*;

import java.util.List;

/*
- hotel repository singleton
- update booking details
*/

public class HotelService implements IHotelService {

    IRoomService roomService; // constructor injection.

    IRoomAdmin roomAdminService;

    public HotelService(IRoomService roomService, IRoomAdmin roomAdminService){
        this.roomService = roomService;
        this.roomAdminService = roomAdminService;
    }

    @Override
    public List<Room> roomList() {
        return roomService.roomList();
    }

    @Override
    public void checkIn(Guest guest, Room room) {
        /*
         * get room key
         * print it.
         * update room status to occupied.
         */
        room.setRoomStatus(RoomStatus.OCCUPIED);
        roomAdminService.updateRoom(room);
    }

    @Override
    public void checkOut(Guest guest, Room room) {
        /*
         * update room status to available.
         * reassign room key
         * get room charge.
         */
        room.setRoomStatus(RoomStatus.AVAILABLE);
        roomAdminService.updateRoom(room);


        RoomFactory roomFactory = RoomFactory.getInstance();
        IRoomService roomService = roomFactory.getRoomServiceByType(room.getRoomType());
        IBaseRoomCharge roomCharge = new RoomCharge();
        roomCharge = new RoomTypeChargeDecorator(roomCharge,roomService);
        roomCharge = new RoomServiceChargeDecorator(roomCharge);
        roomCharge = new FoodServiceChargeDecorator(roomCharge);
        System.out.println(roomCharge.getPrice());
    }
}
