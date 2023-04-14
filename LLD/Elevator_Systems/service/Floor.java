package LLD.Elevator_Systems.service;

import LLD.Elevator_Systems.models.ElevatorRequest;

public class Floor {
    int floorId;
    ExternalButton externalButton;

    public int getFloorId() {
        return floorId;
    }

    public void setFloorId(int floorId) {
        this.floorId = floorId;
    }

    public ExternalButton getExternalButton() {
        return externalButton;
    }

    public void setExternalButton(ExternalButton externalButton) {
        this.externalButton = externalButton;
    }

    public Floor(int id, ExternalButtonDispatcher externalButtonDispatcher){
        this.floorId = id;
        externalButton = new ExternalButton(externalButtonDispatcher);
    }

    public void pressButton(ElevatorRequest elevatorRequest){
        this.getExternalButton().pressButton(elevatorRequest);
    }
}
