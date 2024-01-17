package LLD.MANAGEMENT_SYSTEMS.Hotel_Management_System.Implementation.service.room.impl;

import LLD.MANAGEMENT_SYSTEMS.Hotel_Management_System.Implementation.service.room.IRoomSearchService;

public class DeluxeRoomService extends RoomService {
    public DeluxeRoomService(IRoomSearchService roomSearchService) {
        this.roomSearchService = roomSearchService;
    }

    @Override
    public int getPrice() {
        System.out.println("DeluxeRoomService::getPrice() called");
        return 50;
    }
}
