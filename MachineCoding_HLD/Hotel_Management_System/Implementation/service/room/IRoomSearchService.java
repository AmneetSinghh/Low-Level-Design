package MachineCoding_HLD.Hotel_Management_System.Implementation.service.room;

import MachineCoding_HLD.Hotel_Management_System.Implementation.enums.RoomStatus;
import MachineCoding_HLD.Hotel_Management_System.Implementation.model.Room;

import java.util.List;

public interface IRoomSearchService {
    Room getById(int id);
    Room getByNumber(String roomNumber);
    List<Room> getByStatus(RoomStatus status);
}
