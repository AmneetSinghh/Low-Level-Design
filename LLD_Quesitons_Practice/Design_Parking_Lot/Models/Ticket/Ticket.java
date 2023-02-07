package LLD_Quesitons_Practice.Design_Parking_Lot.Models.Ticket;

import LLD_Quesitons_Practice.Design_Parking_Lot.Models.ParkingSlot.ParkingSlot;
import LLD_Quesitons_Practice.Design_Parking_Lot.Models.Vehicle.Vehicle;

public class Ticket {
    public String getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(String entryTime) {
        this.entryTime = entryTime;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public ParkingSlot getParkingSlot() {
        return parkingSlot;
    }

    public void setParkingSlot(ParkingSlot parkingSlot) {
        this.parkingSlot = parkingSlot;
    }

    String entryTime;
    Vehicle vehicle;
    ParkingSlot parkingSlot;

}
