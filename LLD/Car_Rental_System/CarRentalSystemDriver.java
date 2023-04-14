package LLD.Car_Rental_System;

import java.util.ArrayList;
import java.util.List;

import LLD.Car_Rental_System.Product.Car;
import LLD.Car_Rental_System.Product.Vehicle;
import LLD.Car_Rental_System.Product.VehicleType;

public class CarRentalSystemDriver {

    public static void main(String args[]) {


        List<User> users = addUsers();
        List<Vehicle> vehicles = addVehicles();
        List<Store> stores = addStores(vehicles);

        VehicleRentalSystem rentalSystem = new VehicleRentalSystem(stores, users);

        //0. User comes
        User user = users.get(0);

        //1. user search store based on location
        Location location = new Location(403012, "Bangalore", "Karnataka", "India");
        Store store = rentalSystem.getStore(location);

        //2. get All vehicles you are interested in (based upon different filters)
        List<Vehicle> storeVehicles = store.getVehicles(VehicleType.CAR);


        //3.reserving the particular vehicle
        Reservation reservation = store.createReservation(storeVehicles.get(0), users.get(0));

        //4. generate the bill
        Bill bill = new Bill(reservation);

        //5. make payment
        Payment payment = new Payment();
        payment.payBill(bill);

        //6. trip completed, submit the vehicle and close the reservation,,,, may be delete from the list
        store.completeReservation(reservation.reservationId);

    }



    public static List<Vehicle> addVehicles(){

        List<Vehicle> vehicles = new ArrayList<>();
        Vehicle vehicle1 = new Car();
        vehicle1.setVehicleID(1);
        vehicle1.setVehicleType(VehicleType.CAR);

        Vehicle vehicle2 = new Car();
        vehicle1.setVehicleID(2);
        vehicle1.setVehicleType(VehicleType.CAR);

        vehicles.add(vehicle1);
        vehicles.add(vehicle2);

        return vehicles;
    }

    public static List<User> addUsers(){

        List<User> users = new ArrayList<>();
        User user1 = new User();
        user1.setUserId(1);

        users.add(user1);
        return users;
    }

    public static List<Store> addStores(List<Vehicle> vehicles){

        List<Store> stores = new ArrayList<>();
        Store store1 = new Store();
        store1.storeId=1;
        store1.setVehicles(vehicles);

        stores.add(store1);
        return stores;
    }

}

/*
Flow :
user comes with rent need of (bike or car) Vehicle -> user based on the location search the stores ->
he will get list of stores -> search the store -> get list of vehicles -> filter the vehicles
-> click on some vehicle -> reserve the vehicle -> bill is generated for that reservation -> payment is done
-> return the vehicle, then reservation is completed.




For optimising this :
we can use the hashmap approach, stores will have hashmap of reservations,,,,, so in constant time we can get reservation.
 */