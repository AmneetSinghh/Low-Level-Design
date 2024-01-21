package MachineCoding_HLD.Hotel_Management_System.Implementation.model;

import MachineCoding_HLD.Hotel_Management_System.Implementation.enums.RefundStatus;
import MachineCoding_HLD.Hotel_Management_System.Implementation.model.users.Guest;

public class Refund {
    int id;// refundId
    Guest guest;
    RoomBooking roomBooking;
    RefundStatus status;
    int amount;
}
