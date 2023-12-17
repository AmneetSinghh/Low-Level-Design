package LLD.Parking_Lot.Service.ParkingSlot.ParkingSpace;

import java.util.List;

import LLD.Parking_Lot.Models.ParkingSlot.IParkingSlot;

public interface IParkingSpace {
    IParkingSlot find(int enteranceGate, List<IParkingSlot> parkingSlotList);
}
