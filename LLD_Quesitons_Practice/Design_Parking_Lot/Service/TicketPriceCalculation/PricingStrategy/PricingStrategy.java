package LLD_Quesitons_Practice.Design_Parking_Lot.Service.TicketPriceCalculation.PricingStrategy;

import LLD_Quesitons_Practice.Design_Parking_Lot.Models.Ticket.Ticket;

public class PricingStrategy {
    Ticket ticket;
    public PricingStrategy (Ticket ticket){
        this.ticket = ticket;
    }
    public int price(){
        // fixed price;
        return 30;
    }
}