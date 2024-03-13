package LLD.Elevator_Systems.service;

import LLD.Elevator_Systems.models.ElevatorRequest;




// It will have a list of elevators. which elevator he will select that is the theory.
public interface ExternalButtonDispatcher {
    public void submitRequest(ElevatorRequest elevatorRequest);
}
