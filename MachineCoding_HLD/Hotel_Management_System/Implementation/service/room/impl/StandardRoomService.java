package MachineCoding_HLD.Hotel_Management_System.Implementation.service.room.impl;

import MachineCoding_HLD.Hotel_Management_System.Implementation.service.room.IRoomSearchService;

public class StandardRoomService extends RoomService{

    public StandardRoomService(IRoomSearchService roomSearchService) {
        this.roomSearchService = roomSearchService;
    }
    @Override
    public int getPrice() {
        System.out.println("StandardRoomService::getPrice() called");
        return 30;
    }
}
