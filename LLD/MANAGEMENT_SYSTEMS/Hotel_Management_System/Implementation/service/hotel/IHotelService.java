package LLD.MANAGEMENT_SYSTEMS.Hotel_Management_System.Implementation.service.hotel;

import LLD.MANAGEMENT_SYSTEMS.Hotel_Management_System.Implementation.model.users.Guest;
import LLD.MANAGEMENT_SYSTEMS.Hotel_Management_System.Implementation.model.Room;

import java.util.List;

public interface IHotelService {
    public List<Room> roomList();
    public void checkIn(Guest guest, Room room);
    public void checkOut(Guest guest, Room room);
}
