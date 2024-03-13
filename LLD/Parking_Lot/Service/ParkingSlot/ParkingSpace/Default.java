package LLD.Parking_Lot.Service.ParkingSlot.ParkingSpace;

import LLD.Parking_Lot.Models.ParkingSlot.IParkingSlot;

import java.util.List;

public class Default implements IParkingSpace{
    @Override
    public IParkingSlot find(int enteranceGate, List<IParkingSlot> parkingSlotList){
        try{
            if(parkingSlotList.isEmpty()){
                throw new Exception("No parking space found");
            }
            return parkingSlotList.get(0);// get first.
        } catch(Exception e){
            System.out.println("No Parking Space Found");
            return null;
        }
    }
}
