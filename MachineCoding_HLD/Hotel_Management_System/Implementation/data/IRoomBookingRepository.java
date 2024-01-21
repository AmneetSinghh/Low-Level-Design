package MachineCoding_HLD.Hotel_Management_System.Implementation.data;

import MachineCoding_HLD.Hotel_Management_System.Implementation.model.RoomBooking;
import MachineCoding_HLD.Hotel_Management_System.Implementation.model.users.Guest;

import java.util.List;

public interface IRoomBookingRepository {
    List<RoomBooking> bookingList(Guest bookedBy);
    void create(RoomBooking roomBooking);
    void cancel(int id);
    RoomBooking getBookingById(int id);
}
