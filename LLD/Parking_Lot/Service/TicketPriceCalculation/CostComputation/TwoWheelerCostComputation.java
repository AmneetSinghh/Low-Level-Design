package LLD.Parking_Lot.Service.TicketPriceCalculation.CostComputation;

import LLD.Parking_Lot.Models.Ticket.Ticket;
import LLD.Parking_Lot.Service.TicketPriceCalculation.PricingStrategy.HourlyStrategy;

public class TwoWheelerCostComputation extends CostComputation{
    public TwoWheelerCostComputation(Ticket ticket) {
        super(ticket, new HourlyStrategy(ticket));
    }
}
