package LLD_Quesitons_Practice.Car_Rental_System;


import LLD_Quesitons_Practice.Car_Rental_System.Product.Vehicle;
import LLD_Quesitons_Practice.Car_Rental_System.Product.VehicleType;

import java.util.ArrayList;
import java.util.List;

public class Store {

    int storeId;
    VehicleInventoryManagement inventoryManagement;
    Location storeLocation;
    List<Reservation> reservations = new ArrayList<>();


    public List<Vehicle> getVehicles(VehicleType vehicleType) {

        return inventoryManagement.getVehicles();
    }


    //addVehicles, update vehicles,get vehicles, delete vehicles, use inventory management to update those.

    public void setVehicles(List<Vehicle> vehicles) {
        inventoryManagement = new VehicleInventoryManagement(vehicles);
    }

    //addReservatopm, update reservation,get reservation, delete reservation,
    public Reservation createReservation(Vehicle vehicle, User user){
        Reservation reservation = new Reservation();
        reservation.createReserve(user,vehicle);
        reservations.add(reservation);
        return reservation;
    }

    public boolean completeReservation(int reservationID) {
        //take out the reservation from the list and call complete the reservation method.
        return true;
    }

    //update reservation

}


/*
Notes :
1. Vehicle is only managed by the vehicle inventory management, but that is only attached to store, so store is the caller part for reservation and vehicles.
 */