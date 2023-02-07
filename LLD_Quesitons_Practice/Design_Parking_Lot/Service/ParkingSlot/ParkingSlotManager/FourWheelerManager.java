package LLD_Quesitons_Practice.Design_Parking_Lot.Service.ParkingSlot.ParkingSlotManager;
import LLD_Quesitons_Practice.Design_Parking_Lot.Models.ParkingSlot.ParkingSlot;
import LLD_Quesitons_Practice.Design_Parking_Lot.Service.ParkingSlot.ParkingSpace.IParkingSpace;
import java.util.ArrayList;
import java.util.List;

public class FourWheelerManager extends ParkingSlotManager {
    IParkingSpace parkingSpace;
    FourWheelerManager(IParkingSpace parkingSpace) {
        super(parkingSpace);
        this.parkingSpace = parkingSpace;
    }
}
