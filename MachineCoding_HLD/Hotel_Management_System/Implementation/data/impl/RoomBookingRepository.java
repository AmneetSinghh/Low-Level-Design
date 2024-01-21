package MachineCoding_HLD.Hotel_Management_System.Implementation.data.impl;

import MachineCoding_HLD.Hotel_Management_System.Implementation.data.IRoomBookingRepository;
import MachineCoding_HLD.Hotel_Management_System.Implementation.enums.BookingStatus;
import MachineCoding_HLD.Hotel_Management_System.Implementation.model.RoomBooking;
import MachineCoding_HLD.Hotel_Management_System.Implementation.model.users.Guest;

import java.util.ArrayList;
import java.util.List;

/*
 Singleton
*/
public class RoomBookingRepository implements IRoomBookingRepository {

    private static RoomBookingRepository instance;
    private final List<RoomBooking> roomBookingList ;
    private RoomBookingRepository() {
        roomBookingList = new ArrayList<>(); // only once initialized.
    }

    public static RoomBookingRepository getInstance(){
        if(instance == null){
            instance = new  RoomBookingRepository();
        }
        return instance;
    }

    @Override
    public List<RoomBooking> bookingList(Guest bookedBy) {
        List<RoomBooking> guestBookingList = new ArrayList<>();
        for(RoomBooking booking : roomBookingList){
            if(booking.getBookedBy().equals(bookedBy)){
                guestBookingList.add(booking);
            }
        }
        return guestBookingList;
    }

    @Override
    public void create(RoomBooking roomBooking) {
        roomBookingList.add(roomBooking);
    }

    @Override
    public void cancel(int id) {
        for (RoomBooking roomBooking : roomBookingList) {
            if (roomBooking.getId() == id) {
                roomBooking.setStatus(BookingStatus.CANCELLED);
            }
        }
    }

    @Override
    public RoomBooking getBookingById(int id) {
        for(RoomBooking booking : roomBookingList){
            if(booking.getId() == id){
                return booking;
            }
        }
        return null;
    }
}
