package LLD_Quesitons_Practice.Design_Parking_Lot.Service.Ticket;

import LLD_Quesitons_Practice.Design_Parking_Lot.Models.ParkingSlot.ParkingSlot;
import LLD_Quesitons_Practice.Design_Parking_Lot.Models.Ticket.Ticket;
import LLD_Quesitons_Practice.Design_Parking_Lot.Models.Vehicle.VehicleType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TicketParkingSlotMapper {
    public HashMap<Ticket, ParkingSlot> ticketAndSlotMap;
    public TicketParkingSlotMapper(){
        ticketAndSlotMap = new HashMap<>();
    }

    public void addSlot(Ticket ticket,ParkingSlot parkingSlot){
        ticketAndSlotMap.put(ticket,parkingSlot);
    }

    public ParkingSlot getSlot(Ticket ticket){
        return ticketAndSlotMap.get(ticket);
    }
    public List<Ticket> getWheeler(VehicleType type){
        List<Ticket> list = new ArrayList<>();
        for(Map.Entry<Ticket,ParkingSlot> entry: ticketAndSlotMap.entrySet()  ){
            if(entry.getKey().getVehicle().getType().equals(type)){
                list.add(entry.getKey());
            }
        }
        return list;
    }


}
