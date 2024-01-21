package MachineCoding_HLD.Hotel_Management_System.Implementation.service.room.impl;
import MachineCoding_HLD.Hotel_Management_System.Implementation.data.IRoomRepository;
import MachineCoding_HLD.Hotel_Management_System.Implementation.data.impl.RoomRepository;
import MachineCoding_HLD.Hotel_Management_System.Implementation.model.Room;
import MachineCoding_HLD.Hotel_Management_System.Implementation.service.room.IRoomSearchService;
import MachineCoding_HLD.Hotel_Management_System.Implementation.service.room.IRoomService;

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
