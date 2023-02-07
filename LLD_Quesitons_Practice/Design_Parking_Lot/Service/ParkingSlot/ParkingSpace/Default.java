package LLD_Quesitons_Practice.Design_Parking_Lot.Service.ParkingSlot.ParkingSpace;

import LLD_Quesitons_Practice.Design_Parking_Lot.Models.ParkingSlot.ParkingSlot;

import java.util.List;

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
