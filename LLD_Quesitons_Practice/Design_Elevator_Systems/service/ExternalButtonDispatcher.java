package LLD_Quesitons_Practice.Design_Elevator_Systems.service;

import LLD_Quesitons_Practice.Design_Elevator_Systems.models.ElevatorDirection;
import LLD_Quesitons_Practice.Design_Elevator_Systems.models.ElevatorRequest;

import java.util.List;




public interface ExternalButtonDispatcher {
    public void submitRequest(ElevatorRequest elevatorRequest);
}
