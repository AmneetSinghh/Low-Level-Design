package MachineCoding_HLD.BookMyShow.implementation.model.dto;

import MachineCoding_HLD.BookMyShow.implementation.model.Seat;
import MachineCoding_HLD.BookMyShow.implementation.model.Show;
import MachineCoding_HLD.BookMyShow.implementation.model.user.Customer;

import java.util.List;

public class BookingRequestDto {
    private Show show;
    private Customer customer;
    private List<Integer> SeatNo;


    public Show getShow() {
        return show;
    }

    public void setShow(Show show) {
        this.show = show;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Integer> getSeatNo() {
        return SeatNo;
    }

    public void setSeatNo(List<Integer> seatNo) {
        SeatNo = seatNo;
    }
}
