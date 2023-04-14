package LLD.Parking_Lot.Service.ParkingSlot.ParkingSlotManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import LLD.Parking_Lot.Models.ParkingSlot.ParkingSlot;
import LLD.Parking_Lot.Models.Vehicle.VehicleType;
import LLD.Parking_Lot.Service.ParkingSlot.ParkingSpace.Default;
import LLD.Parking_Lot.Service.ParkingSlot.ParkingSpace.IParkingSpace;

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

