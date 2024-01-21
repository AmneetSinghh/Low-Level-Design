package MachineCoding_HLD.Hotel_Management_System.Implementation.model;

import MachineCoding_HLD.Hotel_Management_System.Implementation.enums.RoomStatus;
import MachineCoding_HLD.Hotel_Management_System.Implementation.enums.RoomType;

import java.util.List;

public class Room {

    private int id;
    private String RoomNumber;
    private RoomStatus roomStatus;
    private RoomType roomType;
    private List<RoomAmenities> roomAmenitiesList;
    private List<RoomReviews> roomReviews;
    private List<HouseKeepingLog> houseKeepingLog;
    private long createdAt;
    private long updatedAt;
    private long deletedAt;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        id = id;
    }

    public String getRoomNumber() {
        return RoomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        RoomNumber = roomNumber;
    }

    public RoomStatus getRoomStatus() {
        return roomStatus;
    }

    public void setRoomStatus(RoomStatus roomStatus) {
        this.roomStatus = roomStatus;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

    public List<RoomAmenities> getRoomAmenitiesList() {
        return roomAmenitiesList;
    }

    public void setRoomAmenitiesList(List<RoomAmenities> roomAmenitiesList) {
        this.roomAmenitiesList = roomAmenitiesList;
    }

    public List<RoomReviews> getRoomReviews() {
        return roomReviews;
    }

    public void setRoomReviews(List<RoomReviews> roomReviews) {
        this.roomReviews = roomReviews;
    }

    public List<HouseKeepingLog> getHouseKeepingLog() {
        return houseKeepingLog;
    }

    public void setHouseKeepingLog(List<HouseKeepingLog> houseKeepingLog) {
        this.houseKeepingLog = houseKeepingLog;
    }

    public long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }

    public long getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(long updatedAt) {
        this.updatedAt = updatedAt;
    }

    public long getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(long deletedAt) {
        this.deletedAt = deletedAt;
    }

}
