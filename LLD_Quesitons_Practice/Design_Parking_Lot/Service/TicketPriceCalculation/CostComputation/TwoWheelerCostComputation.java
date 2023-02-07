package LLD_Quesitons_Practice.Design_Parking_Lot.Service.TicketPriceCalculation.CostComputation;

import LLD_Quesitons_Practice.Design_Parking_Lot.Models.Ticket.Ticket;
import LLD_Quesitons_Practice.Design_Parking_Lot.Service.TicketPriceCalculation.PricingStrategy.HourlyStrategy;
import LLD_Quesitons_Practice.Design_Parking_Lot.Service.TicketPriceCalculation.PricingStrategy.PricingStrategy;

public class TwoWheelerCostComputation extends CostComputation{
    public TwoWheelerCostComputation(Ticket ticket) {
        super(ticket, new HourlyStrategy(ticket));
    }
}
