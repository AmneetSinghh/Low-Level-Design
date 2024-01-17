package LLD.MANAGEMENT_SYSTEMS.Hotel_Management_System.Implementation.model;

import LLD.MANAGEMENT_SYSTEMS.Hotel_Management_System.Implementation.model.users.HouseKeeper;

public class HouseKeepingLog {
    int id;
    String description;
    int duration;
    HouseKeeper houskeeper;
    long createdAt;
    long updatedAt;
    long deletedAt;
}
