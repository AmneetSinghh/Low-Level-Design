package LLD.Elevator_Systems.models;

public class ElevatorRequest {
    int sourceFloor;

    public ElevatorRequest(int sourceFloor, int destinationFloor, ElevatorDirection elevatorDirection){
        this.sourceFloor= sourceFloor;
        this.destinationFloor = destinationFloor;
        this.elevatorDirection = elevatorDirection;
    }

    public int getSourceFloor() {
        return sourceFloor;
    }

    public void setSourceFloor(int sourceFloor) {
        this.sourceFloor = sourceFloor;
    }

    public int getDestinationFloor() {
        return destinationFloor;
    }

    public void setDestinationFloor(int destinationFloor) {
        this.destinationFloor = destinationFloor;
    }

    public ElevatorDirection getElevatorDirection() {
        return elevatorDirection;
    }

    public void setElevatorDirection(ElevatorDirection elevatorDirection) {
        this.elevatorDirection = elevatorDirection;
    }

    int destinationFloor;
    ElevatorDirection elevatorDirection;
}
