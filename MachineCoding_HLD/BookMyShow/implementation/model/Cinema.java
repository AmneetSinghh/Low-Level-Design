package MachineCoding_HLD.BookMyShow.implementation.model;

import java.util.List;

/*
Service layer will feed the data into it.
*/

public class Cinema {
    private int id;
    private String name;
    private Location location;
    private List<Hall> hallList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public List<Hall> getHallList() {
        return hallList;
    }

    public void setHallList(List<Hall> hallList) {
        this.hallList = hallList;
    }



}