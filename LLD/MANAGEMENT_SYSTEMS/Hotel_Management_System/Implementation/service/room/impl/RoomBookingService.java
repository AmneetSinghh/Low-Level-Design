package LLD.MANAGEMENT_SYSTEMS.Hotel_Management_System.Implementation.service.room.impl;

import LLD.MANAGEMENT_SYSTEMS.Hotel_Management_System.Implementation.data.IRoomBookingRepository;
import LLD.MANAGEMENT_SYSTEMS.Hotel_Management_System.Implementation.data.impl.RoomBookingRepository;
import LLD.MANAGEMENT_SYSTEMS.Hotel_Management_System.Implementation.enums.BookingStatus;
import LLD.MANAGEMENT_SYSTEMS.Hotel_Management_System.Implementation.enums.PaymentType;
import LLD.MANAGEMENT_SYSTEMS.Hotel_Management_System.Implementation.model.PaymentDetails;
import LLD.MANAGEMENT_SYSTEMS.Hotel_Management_System.Implementation.model.Room;
import LLD.MANAGEMENT_SYSTEMS.Hotel_Management_System.Implementation.model.RoomBooking;
import LLD.MANAGEMENT_SYSTEMS.Hotel_Management_System.Implementation.model.users.Guest;
import LLD.MANAGEMENT_SYSTEMS.Hotel_Management_System.Implementation.service.room.IRoomBookingService;
import LLD.MANAGEMENT_SYSTEMS.Hotel_Management_System.Implementation.service.room.RoomFactory;

import java.util.ArrayList;
import java.util.List;

public class RoomBookingService implements IRoomBookingService {

    IRoomBookingRepository roomBookingRepository = RoomBookingRepository.getInstance();
    RoomFactory roomFactory = RoomFactory.getInstance();

    @Override
    public List<RoomBooking> bookingList(Guest guest) {
        return roomBookingRepository.bookingList(guest);
    }

    @Override
    public void create(Guest guest, Room room) {

        RoomBooking roomBooking = new RoomBooking();
        roomBooking.setId(1);
        roomBooking.setBookedBy(guest);
        roomBooking.setStatus(BookingStatus.BOOKED);
        roomBooking.setRoomList(new ArrayList<>(List.of(room)));
        roomBooking.setGuestList(new ArrayList<>(List.of(guest)));
        roomBooking.setPaymentDetails(new PaymentDetails(1, PaymentType.CARD, roomFactory.getRoomServiceByType(room.getRoomType()).getPrice()));
        roomBooking.setDurationInDays(2);
        roomBookingRepository.create(roomBooking);
    }

    @Override
    public void cancel(int id) {
        roomBookingRepository.cancel(id);
    }

    @Override
    public RoomBooking getBookingById(int id) {
        return roomBookingRepository.getBookingById(id);
    }
}
