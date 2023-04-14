package LLD.Parking_Lot.Service.TicketPriceCalculation.PricingStrategy;

import LLD.Parking_Lot.Models.Ticket.Ticket;

public class MinuteStrategy extends  PricingStrategy{
    Ticket ticket;
    public MinuteStrategy(Ticket ticket) {
        super(ticket);
        this.ticket = ticket;
    }
    public int price(){
        // get ticket entry time.
        // entry time * curren time hours.
        return 40;
    }
}