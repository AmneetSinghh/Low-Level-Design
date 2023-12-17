package LLD.Elevator_Systems.models;

import LLD.Elevator_Systems.service.InternalButton;

public class ElevatorCar {

    public ElevatorDirection getElevatorDirection() {
        return elevatorDirection;
    }

    public void setElevatorDirection(ElevatorDirection direction){
        this.elevatorDirection = direction;
    }

    public ElevatorStatus getElevatorStatus() {
        return elevatorStatus;
    }

    public void setElevatorStatus(ElevatorStatus elevatorStatus) {
        this.elevatorStatus = elevatorStatus;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }


    int id;
    ElevatorDirection elevatorDirection;
    ElevatorStatus elevatorStatus;
    int currentFloor;
    InternalButton internalButton;


    public ElevatorCar(int id){
        this.id = id;
        this.elevatorDirection = ElevatorDirection.UP;
        this.elevatorStatus = ElevatorStatus.IDLE;
        this.currentFloor = 0;
    }
    // why do we need the Elevator Display, Nothing else bro.

    public void move(int floor, ElevatorDirection elevatorDirection){
        this.elevatorDirection = elevatorDirection;
        this.currentFloor = floor;
    }

    public void pressInternalButton(ElevatorRequest elevatorRequest){
        internalButton.pressButton(elevatorRequest);
    }
    // move internal button.

}
