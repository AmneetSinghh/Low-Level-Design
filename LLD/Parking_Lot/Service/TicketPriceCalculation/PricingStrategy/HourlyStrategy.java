package LLD.Parking_Lot.Service.TicketPriceCalculation.PricingStrategy;

import LLD.Parking_Lot.Models.Ticket.Ticket;

public class HourlyStrategy extends  PricingStrategy{
    Ticket ticket;
    public HourlyStrategy(Ticket ticket) {
        super(ticket);
        this.ticket = ticket;
    }
    public int price(){
        // get ticket entry time.
        // entry time * curren time hours.
        return 35;
    }
}
