package LLD_Quesitons_Practice.Design_Elevator_Systems.service;

import LLD_Quesitons_Practice.Design_Elevator_Systems.models.ElevatorDirection;
import LLD_Quesitons_Practice.Design_Elevator_Systems.models.ElevatorRequest;

import java.util.List;



// use singleton pattern here.


public class OddEvenDispatcher implements ExternalButtonDispatcher {

    List<ElevatorController> elevatorControllers ;
    private static OddEvenDispatcher uniqueInstance;

    // constructor is private  using singleton pattern here.
    private OddEvenDispatcher(List<ElevatorController> elevatorControllers){ this.elevatorControllers = elevatorControllers;}   // constructor is private.

    public static OddEvenDispatcher getInstance(List<ElevatorController> elevatorControllers){
        if(uniqueInstance == null){
            uniqueInstance = new OddEvenDispatcher(elevatorControllers);
        }
        return uniqueInstance;
    }
    @Override
    public void submitRequest(ElevatorRequest elevatorRequest) {
        // send any elevator.
        elevatorControllers.get(0).submitRequest(elevatorRequest);
    }
}
