package LLD.Elevator_Systems.models;

public class ElevatorDisplay {
    int floor;
    ElevatorDirection elevatorDirection;

    public ElevatorDisplay(int floor, ElevatorDirection elevatorDirection){
        this.floor = floor;
        this.elevatorDirection = elevatorDirection;
    }
}
