package LLD.MANAGEMENT_SYSTEMS.Hotel_Management_System.Implementation.service.room;

import LLD.MANAGEMENT_SYSTEMS.Hotel_Management_System.Implementation.model.Room;

import java.util.List;

public interface IRoomService {

    List<Room> roomList();
    int getPrice();
}
