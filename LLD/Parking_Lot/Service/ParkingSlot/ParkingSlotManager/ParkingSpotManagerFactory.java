package LLD.Parking_Lot.Service.ParkingSlot.ParkingSlotManager;

import LLD.Parking_Lot.Models.Vehicle.VehicleType;
import LLD.Parking_Lot.Service.ParkingSlot.ParkingSpace.Default;

import java.util.HashMap;
import java.util.Map;

/*
See txn Searfch manager class, to get idea what manager classes will do.
 */

/*a
 * Do call it in entry gate screen.
 */
public class ParkingSpotManagerFactory {

    Map<String,ParkingSlotManager> parkingSlotRegistry = new HashMap<>();

    public ParkingSlotManager getParkingSpotManager(VehicleType type){
        ParkingSlotManager manager = null;
        String vehicleType = type.toString();
        if(type.equals(VehicleType.TWO_WHEELER)){
            if(parkingSlotRegistry.containsKey(vehicleType)){
                return parkingSlotRegistry.get(vehicleType);
            }
            manager = new TwoWheelerManager(new Default());
        }
        else if(type.equals(VehicleType.FOUR_WHEELER)){
            if(parkingSlotRegistry.containsKey(vehicleType)){
                return parkingSlotRegistry.get(vehicleType);
            }
            manager = new FourWheelerManager(new Default());
        }
        parkingSlotRegistry.put(vehicleType,manager);
        return null;
    }
}

