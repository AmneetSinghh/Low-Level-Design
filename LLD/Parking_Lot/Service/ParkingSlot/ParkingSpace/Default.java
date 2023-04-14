package LLD.Parking_Lot.Service.ParkingSlot.ParkingSpace;

import java.util.List;

import LLD.Parking_Lot.Models.ParkingSlot.ParkingSlot;

public class Default implements IParkingSpace{
    @Override
    public ParkingSlot find(int enteranceGate, List<ParkingSlot> parkingSlotList){
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
