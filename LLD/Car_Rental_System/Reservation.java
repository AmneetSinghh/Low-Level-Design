package LLD.Car_Rental_System;


import java.util.Date;

import LLD.Car_Rental_System.Product.Vehicle;

public class Reservation {

    int reservationId;
    User user;
    Vehicle vehicle;
    Date bookingDate;
    Date dateBookedFrom;
    Date dateBookedTo;
    Long fromTimeStamp;
    Long toTimeStamp;
    Location pickUpLocation;
    Location dropLocation;
    ReservationStatus reservationStatus;
    Location location;

    public int createReserve(User user, Vehicle vehicle){
        //generate new id
        reservationId = 12334;
        this.user=user;
        this.vehicle=vehicle;
        reservationStatus = ReservationStatus.SCHEDULED;
        return reservationId;
    }

    // CRUD operations

    // update reservation
    // create reservation
    // delete reservation
    // get reservation

}
