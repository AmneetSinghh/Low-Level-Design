package LLD.MANAGEMENT_SYSTEMS.Hotel_Management_System.Implementation.service.room;

import LLD.MANAGEMENT_SYSTEMS.Hotel_Management_System.Implementation.enums.RoomStatus;
import LLD.MANAGEMENT_SYSTEMS.Hotel_Management_System.Implementation.enums.RoomType;
import LLD.MANAGEMENT_SYSTEMS.Hotel_Management_System.Implementation.model.Room;

import java.util.List;

public interface IRoomSearchService {
    Room getById(int id);
    Room getByNumber(String roomNumber);
    List<Room> getByStatus(RoomStatus status);
}
