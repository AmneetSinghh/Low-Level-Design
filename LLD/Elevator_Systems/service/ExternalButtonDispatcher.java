package LLD.Elevator_Systems.service;

import java.util.List;

import LLD.Elevator_Systems.models.ElevatorDirection;
import LLD.Elevator_Systems.models.ElevatorRequest;




// It will have a list of elevators. which elevator he will select that is the theory.
public interface ExternalButtonDispatcher {
    public void submitRequest(ElevatorRequest elevatorRequest);
}
