package LLD_Quesitons_Practice.Design_Elevator_Systems.service;

import LLD_Quesitons_Practice.Design_Elevator_Systems.models.ElevatorRequest;

public class ExternalButton {

    ExternalButtonDispatcher externalButtonDispatcher;

    public ExternalButton(ExternalButtonDispatcher externalButtonDispatcher){
        this.externalButtonDispatcher = externalButtonDispatcher;
    }

    public void pressButton(ElevatorRequest elevatorRequest){
        externalButtonDispatcher.submitRequest(elevatorRequest);
    }
}