package LLD.MANAGEMENT_SYSTEMS.Hotel_Management_System.Implementation.service.room;

import LLD.MANAGEMENT_SYSTEMS.Hotel_Management_System.Implementation.data.IRoomRepository;
import LLD.MANAGEMENT_SYSTEMS.Hotel_Management_System.Implementation.data.impl.RoomRepository;
import LLD.MANAGEMENT_SYSTEMS.Hotel_Management_System.Implementation.enums.RoomStatus;
import LLD.MANAGEMENT_SYSTEMS.Hotel_Management_System.Implementation.enums.RoomType;
import LLD.MANAGEMENT_SYSTEMS.Hotel_Management_System.Implementation.model.Room;

import java.util.List;

public class RoomSearchService implements IRoomSearchService{
    IRoomRepository repository = RoomRepository.getInstance();
    public RoomSearchService() {
    }

    @Override
    public Room getById(int id) {
        return repository.getById(id);
    }

    @Override
    public Room getByNumber(String roomNumber) {
        return repository.getByNumber(roomNumber);
    }

    @Override
    public List<Room> getByStatus(RoomStatus roomStatus) {
        return repository.getByStatus(roomStatus);
    }
}
