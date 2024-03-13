package LLD.Parking_Lot.Service.ParkingSlot.ParkingSlotManager;

import LLD.Parking_Lot.Service.ParkingSlot.ParkingSpace.IParkingSpace;

public class FourWheelerManager extends ParkingSlotManager {
    IParkingSpace parkingSpace;// why even need this.
    FourWheelerManager(IParkingSpace parkingSpace) {
        super(parkingSpace);
        this.parkingSpace = parkingSpace;
    }
}
