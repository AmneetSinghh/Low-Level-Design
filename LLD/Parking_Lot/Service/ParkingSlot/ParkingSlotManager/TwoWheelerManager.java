package LLD.Parking_Lot.Service.ParkingSlot.ParkingSlotManager;

import LLD.Parking_Lot.Service.ParkingSlot.ParkingSpace.IParkingSpace;

public class TwoWheelerManager extends ParkingSlotManager {
    IParkingSpace parkingSpace;
    TwoWheelerManager(IParkingSpace parkingSpace) {
        super(parkingSpace);
        this.parkingSpace = parkingSpace;
    }

}
