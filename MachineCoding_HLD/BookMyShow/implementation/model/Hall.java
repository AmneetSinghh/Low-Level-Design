package MachineCoding_HLD.BookMyShow.implementation.model;

/*
 * All information about this hall.
 */

public class Hall {

    private int id;
    private int hallNo;
    private int totalSeats;     // decouple from show
    private boolean isActive;


    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }


    public void init(int no){
        setId(no);
        setHallNo(no);
        setActive(true);

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

}
