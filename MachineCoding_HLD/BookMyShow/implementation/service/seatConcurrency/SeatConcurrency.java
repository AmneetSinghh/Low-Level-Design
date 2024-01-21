package MachineCoding_HLD.BookMyShow.implementation.service.seatConcurrency;

public interface SeatConcurrency {
    Boolean lock(int seatNo, int hallNo);
    Boolean unLock(int seatNo, int hallNo);
}
