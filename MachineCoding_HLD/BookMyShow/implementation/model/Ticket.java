package MachineCoding_HLD.BookMyShow.implementation.model;

public class Ticket {
    private int id;
    private int ticketNo;
    private Seat seat;
    private String barcode;

    public Ticket(int id, int ticketNo, Seat seat, String barcode) {
        this.id = id;
        this.ticketNo = ticketNo;
        this.seat = seat;
        this.barcode = barcode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTicketNo() {
        return ticketNo;
    }

    public void setTicketNo(int ticketNo) {
        this.ticketNo = ticketNo;
    }

    public Seat getSeat() {
        return seat;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }
}
