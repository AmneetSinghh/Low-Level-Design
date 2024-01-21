package MachineCoding_HLD.Hotel_Management_System.Implementation.service.room;

import MachineCoding_HLD.Hotel_Management_System.Implementation.model.Room;
import MachineCoding_HLD.Hotel_Management_System.Implementation.model.RoomBooking;
import MachineCoding_HLD.Hotel_Management_System.Implementation.model.users.Guest;

import java.util.List;

public interface IRoomBookingService {
    List<RoomBooking> bookingList(Guest guest);
    void create(Guest guest, Room room);
    void  cancel(int id);
    RoomBooking getBookingById(int id);
}
