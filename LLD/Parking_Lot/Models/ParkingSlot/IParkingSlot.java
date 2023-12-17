package LLD.Parking_Lot.Models.ParkingSlot;

import LLD.Parking_Lot.Models.Vehicle.Vehicle;

public interface IParkingSlot {
    public void parkVehicle(Vehicle v);
    public void removeVehicle();

    public int getId();

    public Vehicle getVehicle();

    public void setId(int i );

    public void setEmpty(boolean empty);

    public void setPrice(int price);

    public void setVehicle(Vehicle vehicle);
}
