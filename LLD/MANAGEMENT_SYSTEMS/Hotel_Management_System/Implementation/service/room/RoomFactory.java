package LLD.MANAGEMENT_SYSTEMS.Hotel_Management_System.Implementation.service.room;

import LLD.MANAGEMENT_SYSTEMS.Hotel_Management_System.Implementation.enums.RoomType;
import LLD.MANAGEMENT_SYSTEMS.Hotel_Management_System.Implementation.service.room.impl.DeluxeRoomService;
import LLD.MANAGEMENT_SYSTEMS.Hotel_Management_System.Implementation.service.room.impl.FamilySuiteRoomService;
import LLD.MANAGEMENT_SYSTEMS.Hotel_Management_System.Implementation.service.room.impl.StandardRoomService;

/*
Throw exception here in default later.
 */
public class RoomFactory {
    private static RoomFactory instance = null;
    private RoomFactory() {}

    public static RoomFactory getInstance(){
        if(instance == null){
            instance = new RoomFactory();
        }
        return instance;
    }
    // make it singleton.
    public IRoomService getRoomServiceByType(RoomType roomType) {
        IRoomService roomService;

        switch (roomType) {
            case DELUXE:
                roomService = new DeluxeRoomService(new RoomSearchService());
                break;
            case FAMILY_SUITE:
                roomService = new FamilySuiteRoomService(new RoomSearchService());
                break;
            case STANDARD:
                roomService = new StandardRoomService(new RoomSearchService());
                break;
            default:
                // Handle default case if necessary
                throw new IllegalArgumentException("Unsupported room type: " + roomType);
        }

        return roomService;
    }
}
