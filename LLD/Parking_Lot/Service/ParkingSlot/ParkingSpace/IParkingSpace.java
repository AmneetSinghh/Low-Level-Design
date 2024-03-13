package LLD.Parking_Lot.Service.ParkingSlot.ParkingSpace;

import LLD.Parking_Lot.Models.ParkingSlot.IParkingSlot;

import java.util.List;

public interface IParkingSpace {
    IParkingSlot find(int enteranceGate, List<IParkingSlot> parkingSlotList);
}
