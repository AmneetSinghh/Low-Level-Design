package LLD_Quesitons_Practice.Design_Elevator_Systems.service;

import java.util.ArrayList;
import java.util.List;

public class Building {
    List<Floor> floorList;
    // dispatch is single object for building.
    public Building(int floors, ExternalButtonDispatcher externalButtonDispatcher){
        initilizeFloors(floors, externalButtonDispatcher);
    }

    public void initilizeFloors(int floors,ExternalButtonDispatcher externalButtonDispatcher){
        floorList = new ArrayList<>();
        for(int i=0;i<floors;i++){
            floorList.add(new Floor(i+1,externalButtonDispatcher));
        }
    }

    public Floor getCurrentFloor(int id){
        return floorList.get(id);
    }
}
