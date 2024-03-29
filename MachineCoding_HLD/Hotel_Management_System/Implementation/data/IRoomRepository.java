package MachineCoding_HLD.Hotel_Management_System.Implementation.data;

import MachineCoding_HLD.Hotel_Management_System.Implementation.enums.RoomStatus;
import MachineCoding_HLD.Hotel_Management_System.Implementation.model.Room;

import java.util.List;

public interface IRoomRepository {
    public void add(Room room);
    public void delete(Room room);
    public void update(Room room);
    Room getById(int id);
    Room getByNumber(String roomNumber);
    List<Room> getByStatus(RoomStatus status);
    List<Room> getAll();
}
