package LLD.MANAGEMENT_SYSTEMS.Hotel_Management_System.Implementation.service.room.impl;

import LLD.MANAGEMENT_SYSTEMS.Hotel_Management_System.Implementation.service.room.IRoomSearchService;

public class FamilySuiteRoomService extends RoomService {
    public FamilySuiteRoomService(IRoomSearchService roomSearchService) {
        this.roomSearchService = roomSearchService;
    }
    @Override
    public int getPrice() {
        System.out.println("FamilySuiteRoomService::getPrice() called");
        return 100;
    }
}
