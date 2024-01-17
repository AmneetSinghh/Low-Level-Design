package LLD.MANAGEMENT_SYSTEMS.Hotel_Management_System.Implementation.service.room;

import LLD.MANAGEMENT_SYSTEMS.Hotel_Management_System.Implementation.enums.RoomType;
import LLD.MANAGEMENT_SYSTEMS.Hotel_Management_System.Implementation.model.Room;

public interface IRoomAdmin {
    void addRoom(RoomType type);
    void deleteRoom(Room room);
    void updateRoom(Room room);
}
