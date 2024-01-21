package MachineCoding_HLD.Hotel_Management_System.Implementation.service.room.impl;

import MachineCoding_HLD.Hotel_Management_System.Implementation.data.IRoomRepository;
import MachineCoding_HLD.Hotel_Management_System.Implementation.data.impl.RoomRepository;
import MachineCoding_HLD.Hotel_Management_System.Implementation.enums.RoomType;
import MachineCoding_HLD.Hotel_Management_System.Implementation.model.Room;
import MachineCoding_HLD.Hotel_Management_System.Implementation.service.room.IRoomAdmin;
import MachineCoding_HLD.Hotel_Management_System.Implementation.service.room.IRoomService;

public class RoomAdminService implements IRoomAdmin {

    IRoomAdmin roomAdmin;
    IRoomService roomService;
    IRoomRepository repository = RoomRepository.getInstance(); // singleton.

    public RoomAdminService(IRoomAdmin roomAdmin, IRoomService roomService){
        this.roomAdmin = roomAdmin;
        this.roomService = roomService;
    }

    @Override
    public void addRoom(RoomType type) {
        Room room = new Room();
        room.setId(1);
        room.setRoomNumber("12_a");
        room.setRoomType(type);
        repository.add(room);
    }

    @Override
    public void deleteRoom(Room room) {
        repository.delete(room);
    }

    @Override
    public void updateRoom(Room room) {
        repository.update(room);
    }

}
