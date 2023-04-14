package LLD.Parking_Lot.Service.ExitGate;
import LLD.Parking_Lot.Models.ParkingSlot.ParkingSlot;
import LLD.Parking_Lot.Models.Ticket.Ticket;
import LLD.Parking_Lot.Service.ParkingSlot.ParkingSlotManager.ParkingSlotManager;
import LLD.Parking_Lot.Service.Ticket.TicketParkingSlotMapper;
import LLD.Parking_Lot.Service.TicketPriceCalculation.CostComputation.CostComputation;
import LLD.Parking_Lot.Service.TicketPriceCalculation.CostComputation.CostComputationFactory;

public class ExitGate {
    Ticket ticket;

    ParkingSlotManager parkingSlotManager;

    TicketParkingSlotMapper ticketParkingSlotMapper;

    public ExitGate(TicketParkingSlotMapper ticketParkingSlotMapper, Ticket ticket, ParkingSlotManager parkingSlotManager){
        this.ticket = ticket;
        this.ticketParkingSlotMapper = ticketParkingSlotMapper;
        this.parkingSlotManager = parkingSlotManager;
    }
    // pass it dynamic based on circumstances/business requirement
    public int priceCalculation(){
        CostComputationFactory factory = new CostComputationFactory();
        CostComputation costComputation =  factory.getCostComputation(ticket);
        return costComputation.price();
    }

    public void payment(int price){
        // make separate classes -> payment by card, payment by cash, payment by debitcard, payment by upi etc.
        System.out.println("Payment of Price"+ price+" done");
    }

    public void removeVehicle(){
        ParkingSlot parkingSlot = ticketParkingSlotMapper.getSlot(ticket);
        ticketParkingSlotMapper.ticketAndSlotMap.remove(ticket);
        parkingSlotManager.removeVehicle(parkingSlot);

    }
}
