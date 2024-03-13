package LLD.Parking_Lot.Service.TicketPriceCalculation.CostComputation;

import LLD.Parking_Lot.Models.Ticket.Ticket;
import LLD.Parking_Lot.Service.TicketPriceCalculation.PricingStrategy.MinuteStrategy;

public class FourWheelerCostComputation extends CostComputation{
    public FourWheelerCostComputation(Ticket ticket) {
        super(ticket, new MinuteStrategy(ticket));
    }
}
