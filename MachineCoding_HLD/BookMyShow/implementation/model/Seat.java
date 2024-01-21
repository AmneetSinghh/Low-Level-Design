package MachineCoding_HLD.BookMyShow.implementation.model;

import MachineCoding_HLD.BookMyShow.implementation.enums.SeatStatus;
import MachineCoding_HLD.BookMyShow.implementation.enums.SeatType;

public class Seat {

    private Hall hall; // hallId.
    private int id;
    private int row;
    private int col;
    private SeatType seatType;
    private SeatStatus seatStatus;

    public Hall getHall() {
        return hall;
    }

    public void setHall(Hall hall) {
        this.hall = hall;
    }

    public Seat(int id, int row, int col, SeatType seatType, SeatStatus seatStatus, Hall hall) {
        this.id = id;
        this.row = row;
        this.col = col;
        this.seatType = seatType;
        this.seatStatus = seatStatus;
        this.hall = hall;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public SeatType getSeatType() {
        return seatType;
    }

    public void setSeatType(SeatType seatType) {
        this.seatType = seatType;
    }

    public SeatStatus getSeatStatus() {
        return seatStatus;
    }

    public void setSeatStatus(SeatStatus seatStatus) {
        this.seatStatus = seatStatus;
    }

}
