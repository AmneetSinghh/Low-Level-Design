package LLD.MANAGEMENT_SYSTEMS.Hotel_Management_System.Implementation.service.room.impl;
import LLD.MANAGEMENT_SYSTEMS.Hotel_Management_System.Implementation.data.IRoomRepository;
import LLD.MANAGEMENT_SYSTEMS.Hotel_Management_System.Implementation.data.impl.RoomRepository;
import LLD.MANAGEMENT_SYSTEMS.Hotel_Management_System.Implementation.enums.RoomType;
import LLD.MANAGEMENT_SYSTEMS.Hotel_Management_System.Implementation.model.Room;
import LLD.MANAGEMENT_SYSTEMS.Hotel_Management_System.Implementation.service.room.IRoomSearchService;
import LLD.MANAGEMENT_SYSTEMS.Hotel_Management_System.Implementation.service.room.IRoomService;
import LLD.MANAGEMENT_SYSTEMS.Hotel_Management_System.Implementation.service.room.IRoomAdmin;
import java.util.List;

abstract class RoomService implements IRoomService {
    IRoomSearchService roomSearchService;
    IRoomRepository repository = RoomRepository.getInstance(); // singleton.
    public abstract int getPrice();

    @Override
    public List<Room> roomList() {
        return repository.getAll();
    }

}
