package LLD.Parking_Lot.Service.ParkingSlot.ParkingSlotManager;
import java.util.List;
import java.util.logging.Logger;

import LLD.Parking_Lot.Models.ParkingSlot.ParkingSlot;
import LLD.Parking_Lot.Models.Vehicle.Vehicle;
import LLD.Parking_Lot.Models.Vehicle.VehicleType;
import LLD.Parking_Lot.Service.ParkingSlot.ParkingSpace.IParkingSpace;

/*
TODO :
-> if we want to use heap not list, then we need to pass it dynamically. so for now we use simple list.
 */


public abstract class ParkingSlotManager {

    List<ParkingSlot> parkingSlots;
    IParkingSpace parkingSpace;

    ParkingSlotManager(IParkingSpace parkingSpace){
        this.parkingSpace = parkingSpace;
    }

    public ParkingSlot findParkingSlot(int entryGate){
        return parkingSpace.find(entryGate,parkingSlots);
    }

    public void addParkingSpace(ParkingSlot parkingSlot){
        this.parkingSlots.add(parkingSlot);
    }

    public void removeParkingSpace(ParkingSlot parkingSlot){
        this.parkingSlots.remove(parkingSlot);
    }

    public void parkVehicle(Vehicle vehicle, ParkingSlot parkingSlot){
        System.out.println("Park Vehicle : "+ vehicle.toString()+ " - "+ vehicle.getType()+ " in slot : "+ parkingSlot.getId()+" - "+parkingSlot.getVehicle().getType());
        parkingSlots.remove(parkingSlot);
        parkingSlot.parkVehicle(vehicle);
    }

    public void removeVehicle(ParkingSlot parkingSlot){
        parkingSlot.removeVehicle();
        parkingSlots.add(parkingSlot);
    }

}
