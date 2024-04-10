package LLD.Parking_Lot.Models.ParkingSlot;
import LLD.Parking_Lot.Models.Vehicle.Vehicle;

abstract class ParkingSlot implements IParkingSlot{


    int id;
    boolean isEmpty;
    int price;
    Vehicle vehicle;


    public void parkVehicle(Vehicle v){
        getVehicle().setType(v.getType());
        this.setEmpty(false);
    }

    public void removeVehicle(){
        setEmpty(true);
        setVehicle(null);
    }

    abstract public int getPrice();

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
