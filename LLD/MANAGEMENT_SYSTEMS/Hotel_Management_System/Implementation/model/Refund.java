package LLD.MANAGEMENT_SYSTEMS.Hotel_Management_System.Implementation.model;

import LLD.MANAGEMENT_SYSTEMS.Hotel_Management_System.Implementation.enums.RefundStatus;
import LLD.MANAGEMENT_SYSTEMS.Hotel_Management_System.Implementation.model.users.Guest;

public class Refund {
    int id;// refundId
    Guest guest;
    RoomBooking roomBooking;
    RefundStatus status;
    int amount;
}
