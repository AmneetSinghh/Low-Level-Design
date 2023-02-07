package LLD_Quesitons_Practice.Design_Parking_Lot.Models.Vehicle;

public class Vehicle {

    public Vehicle(String no, VehicleType type){
        this.type = type;
        this.vehicleNumber = no;
    }
    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public VehicleType getType() {
        return type;
    }

    public void setType(VehicleType type) {
        this.type = type;
    }

    String vehicleNumber;
     VehicleType type;
}
