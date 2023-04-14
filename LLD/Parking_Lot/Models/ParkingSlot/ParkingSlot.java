package LLD.Parking_Lot.Models.ParkingSlot;

import LLD.Parking_Lot.Models.Vehicle.Vehicle;
import LLD.Parking_Lot.Models.Vehicle.VehicleType;

public class ParkingSlot {


    int id;
    boolean isEmpty;
    int price;
    Vehicle vehicle;


    public void parkVehicle(Vehicle v){
        getVehicle().setType(v.getType());
        getVehicle().setVehicleNumber(v.getVehicleNumber());
        this.setEmpty(false);
    }

    public void removeVehicle(){
        setEmpty(true);
        setVehicle(null);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
