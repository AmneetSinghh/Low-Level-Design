package LLD.Parking_Lot;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
// Practice it again bro.

import LLD.Parking_Lot.Models.ParkingSlot.ParkingSlot;
import LLD.Parking_Lot.Models.Ticket.Ticket;
import LLD.Parking_Lot.Models.Vehicle.Vehicle;
import LLD.Parking_Lot.Models.Vehicle.VehicleType;
import LLD.Parking_Lot.Service.EntryGate.EntryGate;
import LLD.Parking_Lot.Service.ExitGate.ExitGate;
import LLD.Parking_Lot.Service.Floor.Floor;
import LLD.Parking_Lot.Service.ParkingSlot.ParkingSlotManager.FourWheelerManager;
import LLD.Parking_Lot.Service.ParkingSlot.ParkingSlotManager.ParkingSlotManager;
import LLD.Parking_Lot.Service.ParkingSlot.ParkingSlotManager.ParkingSpotManagerFactory;
import LLD.Parking_Lot.Service.ParkingSlot.ParkingSlotManager.TwoWheelerManager;
import LLD.Parking_Lot.Service.Ticket.TicketParkingSlotMapper;

// refer this code after getting some experience with LLD
//https://github.com/GauravGuptaDeveloper/ParkingLot



// create 6 floors. Array<floors> values.add new Floors.
/*
1. Enterance Manager will add and pass the entrance gates. or it can add enterance gates new and remove enterances gate in future.
2. How to add floors : Make a class of entrance Manager : -> Do make array of enterance manager in floor class, then done it.



try this code after getting some experience with LLD
requirements :
1. add floors
2. add parking lot to floors
3. Park vehicle on the least floor as possible.
 */
public class ParkingSlotRunner {
    public static void main(String args[]){
        // vehicle type we can get dynamicallly by input value.


        // we will get the input vehicle and the type.

        ParkingSpotManagerFactory factory = new ParkingSpotManagerFactory();
        ParkingSlotManager twoWheelerParkingSlotManager = factory.getParkingSpotManager(VehicleType.TWO_WHEELER);// isda ik hi object rehna chaida.
        ParkingSlotManager fourWheelerParkingSlotManager = factory.getParkingSpotManager(VehicleType.FOUR_WHEELER);

        TicketParkingSlotMapper ticketParkingSlotMapper = new TicketParkingSlotMapper();

        List<Floor> floorList = new ArrayList<>();
        floorList.add(new Floor());// we added one new floor.
        floorList.get(0).setEntryGate(new EntryGate(ticketParkingSlotMapper));
        // pass .two wheler parking slot manager dynamicaly
        addVehicle(1,VehicleType.TWO_WHEELER,floorList.get(0),twoWheelerParkingSlotManager);// vehicle 2 wheeler.
        addVehicle(1,VehicleType.FOUR_WHEELER,floorList.get(0), fourWheelerParkingSlotManager);// vehicle 2 wheeler.


        // do same with exit get that you did with entry gate. do use getters and setters.
        List<Ticket> tickets = ticketParkingSlotMapper.getWheeler(VehicleType.TWO_WHEELER);
        for(Ticket ticket : tickets){
            ExitGate exitGate = new ExitGate(ticketParkingSlotMapper,ticket,twoWheelerParkingSlotManager);
            int price = exitGate.priceCalculation();
            exitGate.payment(price);
            exitGate.removeVehicle();
        }

        System.out.println("Check");
    }

    public static void addVehicle(int number, VehicleType type, Floor floor, ParkingSlotManager parkingSlotManager){
        Vehicle vehicleFourWheeler = new Vehicle(String.valueOf(number),type);// new vehicle.
        floor.getEntryGate().setParkingSlotManager(parkingSlotManager);
        floor.getEntryGate().setVehicle(vehicleFourWheeler);
        floor.getEntryGate().findParkingSpace(1);// for now take only one entry gate.
        floor.getEntryGate().bookParkingSpace();
        floor.getEntryGate().generateTicket();
    }



    public static List<ParkingSlot> getParkingLots(int price, VehicleType type){
        List<ParkingSlot> list = new ArrayList<>();
        for(int i=1;i<=10;i++){
            ParkingSlot parkingSlot = new ParkingSlot();
            parkingSlot.setId(i);
            parkingSlot.setEmpty(true);
            parkingSlot.setPrice(price);
            parkingSlot.setVehicle(new Vehicle(null, type));
            list.add(parkingSlot);
        }
        return list;
    }
}





