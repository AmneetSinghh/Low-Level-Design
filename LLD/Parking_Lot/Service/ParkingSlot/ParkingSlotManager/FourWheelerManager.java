package LLD.Parking_Lot.Service.ParkingSlot.ParkingSlotManager;
import java.util.ArrayList;
import java.util.List;

import LLD.Parking_Lot.Models.ParkingSlot.ParkingSlot;
import LLD.Parking_Lot.Service.ParkingSlot.ParkingSpace.IParkingSpace;

public class FourWheelerManager extends ParkingSlotManager {
    IParkingSpace parkingSpace;
    FourWheelerManager(IParkingSpace parkingSpace) {
        super(parkingSpace);
        this.parkingSpace = parkingSpace;
    }
}
