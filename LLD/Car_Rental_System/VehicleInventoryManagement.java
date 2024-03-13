package LLD.Car_Rental_System;

import LLD.Car_Rental_System.Product.Vehicle;

import java.util.List;


public class VehicleInventoryManagement {

    List<Vehicle> vehicles;

    VehicleInventoryManagement(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    // we can get vehicles based on many filters,
    public List<Vehicle> getVehicles() {
        //filtering
        return vehicles;
    }

    public void setVehicles(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    // CRUD operations :  add , remove, get and delete vehicle.
}


/*

1. Every store has a vehicle inventory management System.
2. May be we can make it as interface and implements bike inventory system and car inventory system, for now simplicity purpose only one inventory system,
because we only have car for now.

 */