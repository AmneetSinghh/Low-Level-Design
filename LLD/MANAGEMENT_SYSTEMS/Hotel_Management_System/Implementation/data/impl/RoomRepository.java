package LLD.MANAGEMENT_SYSTEMS.Hotel_Management_System.Implementation.data.impl;
import LLD.MANAGEMENT_SYSTEMS.Hotel_Management_System.Implementation.data.IRoomRepository;
import LLD.MANAGEMENT_SYSTEMS.Hotel_Management_System.Implementation.enums.RoomStatus;
import LLD.MANAGEMENT_SYSTEMS.Hotel_Management_System.Implementation.enums.RoomType;
import LLD.MANAGEMENT_SYSTEMS.Hotel_Management_System.Implementation.model.Room;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/*
   Singleton
*/

public class RoomRepository implements IRoomRepository {

    private static RoomRepository instance;
    private final List<Room> roomList ;
    private RoomRepository() {
        roomList = new ArrayList<>(); // only once initilized.
    }
    public static RoomRepository getInstance(){
        if(instance == null){
            instance = new  RoomRepository();
        }
        return instance;
    }

    @Override
    public void add(Room room) {
        roomList.add(room);

    }

    @Override
    public void delete(Room room) {
        for(int i=0;i<roomList.size();i++){
            if(room.getId() == roomList.get(i).getId()){
                roomList.remove(i);
                break;
            }
        }
    }

    @Override
    public void update(Room room) {
        for(int i=0;i<roomList.size();i++){
            if(room.getId() == roomList.get(i).getId()){
                roomList.set(i,room);
                break;
            }
        }
    }

    @Override
    public Room getById(int id) {
        for(int i=0;i<roomList.size();i++){
            if(id == roomList.get(i).getId()){
                return roomList.get(i);
            }
        }
        return null;
    }

    @Override
    public Room getByNumber(String roomNumber) {
        for (Room room : roomList) {
            if (Objects.equals(roomNumber, room.getRoomNumber())) {
                return room;
            }
        }
        return null;
    }

    @Override
    public List<Room> getByStatus(RoomStatus status) {
        List<Room> rooms = new ArrayList<>();
        for (Room room : rooms) {
            if (Objects.equals(status, room.getRoomStatus())) {
                roomList.add(room);
            }
        }
        return rooms;
    }

    @Override
    public List<Room> getAll() {
        return roomList;
    }

}
