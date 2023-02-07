package LLD_Quesitons_Practice.Design_Elevator_Systems.models;

import LLD_Quesitons_Practice.Design_Elevator_Systems.service.InternalButton;

public class ElevatorCar {
    int id;
    ElevatorDirection elevatorDirection;
    ElevatorDisplay elevatorDisplay;
    ElevatorStatus elevatorStatus;
    int currentFloor;
    InternalButton internalButton;

    // why do we need the Elevator Display, Nothing else bro.

    public void move(int floor, ElevatorDirection elevatorDirection){
        this.elevatorDirection = elevatorDirection;
        this.currentFloor = floor;
    }

    // move internal button.

}
