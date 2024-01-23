package MachineCoding_HLD.BookMyShow.implementation.model;

import MachineCoding_HLD.BookMyShow.implementation.enums.HallSlotStatus;

/*
hall have fixed different slot for each day
*/

public class ShowSlot {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Show getShow() {
        return show;
    }

    public void setShow(Show show) {
        this.show = show;
    }

    public Hall getHall() {
        return hall;
    }

    public void setHall(Hall hall) {
        this.hall = hall;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public HallSlotStatus getHallSlotStatus() {
        return hallSlotStatus;
    }

    public void setHallSlotStatus(HallSlotStatus hallSlotStatus) {
        this.hallSlotStatus = hallSlotStatus;
    }

    private int id;
    private Show show; // showId;
    private Hall hall; // hallId.
    private long startTime;// slot start time
    private long endTime; // slot end time
    private HallSlotStatus hallSlotStatus;
}
