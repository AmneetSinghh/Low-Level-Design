package LLD.Parking_Lot.Service.ParkingSlot.ParkingSpace;

import java.util.List;

import LLD.Parking_Lot.Models.ParkingSlot.ParkingSlot;

public interface IParkingSpace {
    ParkingSlot find(int enteranceGate, List<ParkingSlot> parkingSlotList);
}
