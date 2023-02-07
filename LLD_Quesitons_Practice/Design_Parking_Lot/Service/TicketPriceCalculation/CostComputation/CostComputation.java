package LLD_Quesitons_Practice.Design_Parking_Lot.Service.TicketPriceCalculation.CostComputation;

import LLD_Quesitons_Practice.Design_Parking_Lot.Models.Ticket.Ticket;
import LLD_Quesitons_Practice.Design_Parking_Lot.Service.TicketPriceCalculation.PricingStrategy.PricingStrategy;

public class CostComputation {
    Ticket ticket;
    PricingStrategy pricingStrategy;
    public CostComputation(Ticket ticket, PricingStrategy pricingStrategy){
        this.ticket = ticket;
        this.pricingStrategy = pricingStrategy;
    }

    public int price(){
        return this.pricingStrategy.price();
    }
}

