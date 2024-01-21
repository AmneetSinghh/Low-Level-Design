package MachineCoding_HLD.Hotel_Management_System.Implementation.model;

import MachineCoding_HLD.Hotel_Management_System.Implementation.enums.BookingStatus;
import MachineCoding_HLD.Hotel_Management_System.Implementation.model.users.Guest;

import java.util.List;

public class RoomBooking {
    int id;  // when foreign key then it will be bookingId
    List<Room> roomList;
    List<Guest> guestList;
    PaymentDetails paymentDetails;
    Guest bookedBy;
    int durationInDays;
    BookingStatus status;

    long createdAt;
    long updatedAt;
    long deletedAt;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Room> getRoomList() {
        return roomList;
    }

    public void setRoomList(List<Room> roomList) {
        this.roomList = roomList;
    }

    public List<Guest> getGuestList() {
        return guestList;
    }

    public void setGuestList(List<Guest> guestList) {
        this.guestList = guestList;
    }

    public PaymentDetails getPaymentDetails() {
        return paymentDetails;
    }

    public void setPaymentDetails(PaymentDetails paymentDetails) {
        this.paymentDetails = paymentDetails;
    }

    public Guest getBookedBy() {
        return bookedBy;
    }

    public void setBookedBy(Guest bookedBy) {
        this.bookedBy = bookedBy;
    }

    public int getDurationInDays() {
        return durationInDays;
    }

    public void setDurationInDays(int durationInDays) {
        this.durationInDays = durationInDays;
    }

    public BookingStatus getStatus() {
        return status;
    }

    public void setStatus(BookingStatus status) {
        this.status = status;
    }

    public long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }

    public long getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(long updatedAt) {
        this.updatedAt = updatedAt;
    }

    public long getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(long deletedAt) {
        this.deletedAt = deletedAt;
    }


}
