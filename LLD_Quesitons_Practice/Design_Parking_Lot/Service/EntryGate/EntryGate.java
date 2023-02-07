package LLD_Quesitons_Practice.Design_Parking_Lot.Service.EntryGate;
import LLD_Quesitons_Practice.Design_Parking_Lot.Models.ParkingSlot.ParkingSlot;
import LLD_Quesitons_Practice.Design_Parking_Lot.Models.Ticket.Ticket;
import LLD_Quesitons_Practice.Design_Parking_Lot.Models.Vehicle.Vehicle;
import LLD_Quesitons_Practice.Design_Parking_Lot.Service.ParkingSlot.ParkingSlotManager.ParkingSlotManager;
import LLD_Quesitons_Practice.Design_Parking_Lot.Service.Ticket.TicketParkingSlotMapper;

/*
We have to use entry gate manager, if we want to add entry gates, remove entry gates, block entry gates, dynamically. or manager multiple entry gates.
*/
public class EntryGate {
    Ticket ticket;
    ParkingSlotManager parkingSlotManager;// pass it dynamically through factory.
    ParkingSlot parkingSlot;

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public ParkingSlotManager getParkingSlotManager() {
        return parkingSlotManager;
    }

    public void setParkingSlotManager(ParkingSlotManager parkingSlotManager) {
        this.parkingSlotManager = parkingSlotManager;
    }

    public ParkingSlot getParkingSlot() {
        return parkingSlot;
    }

    public void setParkingSlot(ParkingSlot parkingSlot) {
        this.parkingSlot = parkingSlot;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public TicketParkingSlotMapper getTicketParkingSlotMapper() {
        return ticketParkingSlotMapper;
    }

    public void setTicketParkingSlotMapper(TicketParkingSlotMapper ticketParkingSlotMapper) {
        this.ticketParkingSlotMapper = ticketParkingSlotMapper;
    }

    Vehicle vehicle;

    TicketParkingSlotMapper ticketParkingSlotMapper;


    public EntryGate(TicketParkingSlotMapper ticketParkingSlotMapper){
        this.ticketParkingSlotMapper = ticketParkingSlotMapper;
    }

    public void findParkingSpace(int entryGate){
        this.parkingSlot = parkingSlotManager.findParkingSlot(entryGate);
        System.out.println(parkingSlot);
    }

    public void bookParkingSpace(){
        parkingSlotManager.parkVehicle(vehicle,parkingSlot);
    }

    public void generateTicket(){
        ticket = new Ticket();
        ticket.setVehicle(vehicle);
        ticket.setEntryTime(String.valueOf(Math.random()));
        ticket.setParkingSlot(parkingSlot);
        ticketParkingSlotMapper.addSlot(ticket,parkingSlot);
    }

}
