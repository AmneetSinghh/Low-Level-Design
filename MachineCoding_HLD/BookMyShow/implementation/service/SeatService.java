package MachineCoding_HLD.BookMyShow.implementation.service;
import MachineCoding_HLD.BookMyShow.implementation.model.Hall;
import MachineCoding_HLD.BookMyShow.implementation.model.Seat;
import MachineCoding_HLD.BookMyShow.implementation.model.Show;

import java.util.List;

public interface SeatService {
    void addAll(Hall hall);
    void assignSeat(int seatNo, int hallNo) throws Exception;
    void withhold(Seat seat);
    Seat getByIdAndHallNo(int id, int hallNo);
    List<Seat> getAllSeatByHallNo(int hallNo);
}