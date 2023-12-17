package LLD.Parking_Lot.Models.Ticket;

import LLD.Parking_Lot.Models.ParkingSlot.IParkingSlot;
import LLD.Parking_Lot.Models.Vehicle.Vehicle;

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

    public IParkingSlot getParkingSlot() {
        return parkingSlot;
    }

    public void setParkingSlot(IParkingSlot parkingSlot) {
        this.parkingSlot = parkingSlot;
    }

    String entryTime;
    Vehicle vehicle;
    IParkingSlot parkingSlot;

}
