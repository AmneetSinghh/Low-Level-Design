package LLD_Quesitons_Practice.Design_Elevator_Systems.models;

import LLD_Quesitons_Practice.Design_Elevator_Systems.service.InternalButton;

public class ElevatorCar {
    int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ElevatorDirection getElevatorDirection() {
        return elevatorDirection;
    }

    public void setElevatorDirection(ElevatorDirection elevatorDirection) {
        this.elevatorDirection = elevatorDirection;
    }

    public ElevatorDisplay getElevatorDisplay() {
        return elevatorDisplay;
    }

    public void setElevatorDisplay(ElevatorDisplay elevatorDisplay) {
        this.elevatorDisplay = elevatorDisplay;
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

    public void setCurrentFloor(int currentFloor) {
        this.currentFloor = currentFloor;
    }

    public InternalButton getInternalButton() {
        return internalButton;
    }

    public void setInternalButton(InternalButton internalButton) {
        this.internalButton = internalButton;
    }

    ElevatorDirection elevatorDirection;
    ElevatorDisplay elevatorDisplay;
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
