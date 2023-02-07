package LLD_Quesitons_Practice.Design_Parking_Lot.Service.TicketPriceCalculation.CostComputation;

import LLD_Quesitons_Practice.Design_Parking_Lot.Models.Ticket.Ticket;
import LLD_Quesitons_Practice.Design_Parking_Lot.Service.TicketPriceCalculation.PricingStrategy.MinuteStrategy;
import LLD_Quesitons_Practice.Design_Parking_Lot.Service.TicketPriceCalculation.PricingStrategy.PricingStrategy;

public class FourWheelerCostComputation extends CostComputation{
    public FourWheelerCostComputation(Ticket ticket) {
        super(ticket, new MinuteStrategy(ticket));
    }
}
