package LLD.Elevator_Systems.service;

import LLD.Elevator_Systems.models.ElevatorRequest;

import java.util.List;



// use singleton pattern here.


public class OddEvenDispatcher implements ExternalButtonDispatcher {

    List<IElevatorController> elevatorControllers ;
    private static OddEvenDispatcher uniqueInstance;

    // constructor is private  using singleton pattern here.
    private OddEvenDispatcher(List<IElevatorController> elevatorControllers){ this.elevatorControllers = elevatorControllers;}   // constructor is private.

    public static OddEvenDispatcher getInstance(List<IElevatorController> elevatorControllers){
        if(uniqueInstance == null){
            uniqueInstance = new OddEvenDispatcher(elevatorControllers);
        }
        return uniqueInstance;
    }
    @Override
    public void submitRequest(ElevatorRequest elevatorRequest) {
        // send any elevator.
        elevatorControllers.get(0).submitRequest(elevatorRequest);// check elevator direction then decidel.
    }
}
