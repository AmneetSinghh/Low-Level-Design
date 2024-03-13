package LLD.Elevator_Systems.service;

import LLD.Elevator_Systems.models.ElevatorRequest;

import java.util.List;

public class FixedFloorDispatcher implements ExternalButtonDispatcher{

    List<IElevatorController> elevatorControllers ;
    private static FixedFloorDispatcher uniqueInstance;

    // constructor is private  using singleton pattern here.
    private FixedFloorDispatcher(List<IElevatorController> elevatorControllers){ this.elevatorControllers = elevatorControllers;}   // constructor is private.

    public static FixedFloorDispatcher getInstance(List<IElevatorController> elevatorControllers){
        if(uniqueInstance == null){
            uniqueInstance = new FixedFloorDispatcher(elevatorControllers);
        }
        return uniqueInstance;
    }
    @Override
    public void submitRequest(ElevatorRequest elevatorRequest) {
            // send any elevator. based on direction or anything.
    }
}
