package MachineCoding_HLD.BookMyShow.implementation.service.seatConcurrency;

public interface SeatConcurrency {
    Boolean lock(int seatNo, int showSlot);
    Boolean unLock(int seatNo, int showSlot);
}
