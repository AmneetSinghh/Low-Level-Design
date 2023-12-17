package LLD.Elevator_Systems;

import javax.print.attribute.standard.OrientationRequested;

import LLD.Elevator_Systems.models.ElevatorDirection;
import LLD.Elevator_Systems.models.ElevatorRequest;
import LLD.Elevator_Systems.service.*;

import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class ElevatorSystemDriver {
    public static void main(String args[]){
        int floors = 10;// take user input.
        ExternalButtonDispatcher dispatcher = OddEvenDispatcher.getInstance(constructElevator(floors));
        Building building = new Building(floors,dispatcher);
        // sourceFloor, destinationFloor, Direction.
        ElevatorRequest elevatorRequest = new ElevatorRequest(5,7, ElevatorDirection.UP);
        Floor floor = building.getCurrentFloor(5);
        floor.pressButton(elevatorRequest);
    }

    public static List<IElevatorController> constructElevator(int floors){
        List<IElevatorController> list = new ArrayList<>();
        for(int i=1;i<=floors;i++){
            list.add(new ElevatorController(i));
        }
        return list;
    }
}






/*       Requirements from keerthi's mock interview
1.  Elevator is centralized, If we press any button : any elevator will come, which will be the closest.      So this is just the centralized elevator
we just need to add new dispatcher.
2. add new floors means new elevators is possible.
3. We can make the floor manager, here, which will add the new floors;










 */