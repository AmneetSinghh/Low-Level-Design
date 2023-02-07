package LLD_Quesitons_Practice.Design_Parking_Lot.Service.ParkingSlot.ParkingSpace;

import LLD_Quesitons_Practice.Design_Parking_Lot.Models.ParkingSlot.ParkingSlot;

import java.util.List;

public interface IParkingSpace {
    ParkingSlot find(int enteranceGate, List<ParkingSlot> parkingSlotList);
}
