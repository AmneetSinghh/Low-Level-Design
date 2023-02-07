package LLD_Quesitons_Practice.Design_Parking_Lot.Service.ParkingSlot.ParkingSlotManager;

import LLD_Quesitons_Practice.Design_Parking_Lot.Models.ParkingSlot.ParkingSlot;
import LLD_Quesitons_Practice.Design_Parking_Lot.Models.Vehicle.VehicleType;
import LLD_Quesitons_Practice.Design_Parking_Lot.Service.ParkingSlot.ParkingSpace.Default;
import LLD_Quesitons_Practice.Design_Parking_Lot.Service.ParkingSlot.ParkingSpace.IParkingSpace;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ParkingSpotManagerFactory {

    public ParkingSlotManager getParkingSpotManager(VehicleType type){
        if(type.equals(VehicleType.TWO_WHEELER)){
            return new TwoWheelerManager(new Default());
        }
        else if(type.equals(VehicleType.FOUR_WHEELER)){
            return new FourWheelerManager(new Default());
        }
        return null;
    }
}

