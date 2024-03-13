package LLD.Parking_Lot.Service.ParkingSlot.ParkingSlotManager;

import LLD.Parking_Lot.Models.ParkingSlot.IParkingSlot;
import LLD.Parking_Lot.Models.Vehicle.Vehicle;
import LLD.Parking_Lot.Service.ParkingSlot.ParkingSpace.IParkingSpace;

import java.util.List;

/*
TODO :
-> if we want to use heap not list, then we need to pass it dynamically. so for now we use simple list.
 */


public abstract class ParkingSlotManager {

    List<IParkingSlot> parkingSlots;
    IParkingSpace parkingSpace;

    /*
     * Each either two/four wheeler get mapped to some parking strategy.
     */
    ParkingSlotManager(IParkingSpace parkingSpace){
        this.parkingSpace = parkingSpace;
    }

    public IParkingSlot findParkingSlot(int entryGate){
        return parkingSpace.find(entryGate,parkingSlots);
    }

    public void addParkingSpace(IParkingSlot parkingSlot){
        this.parkingSlots.add(parkingSlot);
    }

    public void removeParkingSpace(IParkingSlot parkingSlot){
        this.parkingSlots.remove(parkingSlot);
    }

    public void parkVehicle(Vehicle vehicle, IParkingSlot parkingSlot){
        System.out.println("Park Vehicle : "+ vehicle.toString()+ " - "+ vehicle.getType()+ " in slot : "+ parkingSlot.getId()+" - "+parkingSlot.getVehicle().getType());
        parkingSlots.remove(parkingSlot);
        parkingSlot.parkVehicle(vehicle);
    }

    public void removeVehicle(IParkingSlot parkingSlot){
        parkingSlot.removeVehicle();
        parkingSlots.add(parkingSlot);
    }

}
