package MachineCoding_HLD.BookMyShow.implementation.service;
import MachineCoding_HLD.BookMyShow.implementation.model.Seat;
import MachineCoding_HLD.BookMyShow.implementation.model.ShowSlot;

import java.util.List;

public interface SeatService {
    void addAll(ShowSlot showSlot);
    Boolean assignSeat(int seatNo, int showSlotId) throws Exception;
    void withhold(Seat seat);
    Seat getByIdAndHallNo(int id, int showSlotId);
    List<Seat> getAllSeatByShowSlot(int showSlotId);
}