package LLD.Parking_Lot.Service.TicketPriceCalculation.CostComputation;

import LLD.Parking_Lot.Models.Ticket.Ticket;
import LLD.Parking_Lot.Service.TicketPriceCalculation.PricingStrategy.PricingStrategy;

public class CostComputation {
    Ticket ticket;
    PricingStrategy pricingStrategy;
    public CostComputation(Ticket ticket, PricingStrategy pricingStrategy){
        this.ticket = ticket;
        this.pricingStrategy = pricingStrategy;
    }

    // make it abstract class we can do that.
    public int price(){
        return this.pricingStrategy.price();
    }
}

