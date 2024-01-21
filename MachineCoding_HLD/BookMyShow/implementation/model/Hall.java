package MachineCoding_HLD.BookMyShow.implementation.model;

import MachineCoding_HLD.BookMyShow.implementation.enums.HallStatus;

import java.util.List;

public class Hall {
    private int id;
    private int hallNo;
    private int totalSeats;
    private List<Seat> seats; // this is just a model. we can't store seats in hall.
    private HallStatus status; // only get hall if its available.
    private Show currentShow;

    public void init(int no){
        setId(no);
        setHallNo(no);
        setStatus(HallStatus.AVAILABLE);

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHallNo() {
        return hallNo;
    }

    public void setHallNo(int hallNo) {
        this.hallNo = hallNo;
    }

    public int getTotalSeats() {
        return totalSeats;
    }

    public void setTotalSeats(int totalSeats) {
        this.totalSeats = totalSeats;
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public void setSeats(List<Seat> seats) {
        this.seats = seats;
    }

    public HallStatus getStatus() {
        return status;
    }

    public void setStatus(HallStatus status) {
        this.status = status;
    }

    public Show getCurrentShow() {
        return currentShow;
    }

    public void setCurrentShow(Show currentShow) {
        this.currentShow = currentShow;
    }
}
