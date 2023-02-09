package LLD_Quesitons_Practice.Design_Elevator_Systems.service;

import LLD_Quesitons_Practice.Design_Elevator_Systems.models.ElevatorRequest;

public class InternalButton {
    InternalButtonDispatcher internalButtonDispatcher;

    public InternalButton(InternalButtonDispatcher internalButtonDispatcher){
        this.internalButtonDispatcher = internalButtonDispatcher;
    }

    public void pressButton(ElevatorRequest elevatorRequest){

    }
}
