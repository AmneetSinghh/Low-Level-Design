package LLD.Elevator_Systems.service;

import LLD.Elevator_Systems.models.ElevatorRequest;

public interface IElevatorController {
    public void submitRequest(ElevatorRequest request);
}
