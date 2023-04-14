package LLD.Parking_Lot.Service.TicketPriceCalculation.CostComputation;

import LLD.Parking_Lot.Models.Ticket.Ticket;
import LLD.Parking_Lot.Models.Vehicle.VehicleType;

public class CostComputationFactory {
    public CostComputation getCostComputation(Ticket ticket){
        if(ticket.getVehicle().getType().equals(VehicleType.TWO_WHEELER)){
            return new TwoWheelerCostComputation(ticket);
        }
        else if(ticket.getVehicle().getType().equals(VehicleType.FOUR_WHEELER)){
            return new FourWheelerCostComputation(ticket);
        }
        return null;
    }
}
