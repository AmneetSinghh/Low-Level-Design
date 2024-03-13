package LLD.Parking_Lot.Service.Ticket;

import LLD.Parking_Lot.Models.ParkingSlot.IParkingSlot;
import LLD.Parking_Lot.Models.Ticket.Ticket;
import LLD.Parking_Lot.Models.Vehicle.VehicleType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TicketParkingSlotMapper {
    public HashMap<Ticket, IParkingSlot> ticketAndSlotMap;
    public TicketParkingSlotMapper(){
        ticketAndSlotMap = new HashMap<>();
    }

    public void addSlot(Ticket ticket,IParkingSlot parkingSlot){
        ticketAndSlotMap.put(ticket,parkingSlot);
    }

    public IParkingSlot getSlot(Ticket ticket){
        return ticketAndSlotMap.get(ticket);
    }
    public List<Ticket> getWheeler(VehicleType type){
        List<Ticket> list = new ArrayList<>();
        for(Map.Entry<Ticket,IParkingSlot> entry: ticketAndSlotMap.entrySet()  ){
            if(entry.getKey().getVehicle().getType().equals(type)){
                list.add(entry.getKey());
            }
        }
        return list;
    }


}
