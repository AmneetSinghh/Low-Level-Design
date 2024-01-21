package MachineCoding_HLD.BookMyShow.implementation.service.impl;

import MachineCoding_HLD.BookMyShow.implementation.data.Repository;
import MachineCoding_HLD.BookMyShow.implementation.enums.SeatStatus;
import MachineCoding_HLD.BookMyShow.implementation.enums.SeatType;
import MachineCoding_HLD.BookMyShow.implementation.model.Hall;
import MachineCoding_HLD.BookMyShow.implementation.model.Seat;
import MachineCoding_HLD.BookMyShow.implementation.service.SeatService;
import java.util.List;

public class SeatServiceImpl implements SeatService {

    Repository repository = Repository.getInstance();

    @Override
    public void addAll(Hall hall) {
        int id=0;
        for(int i=1;i<=30;i++){
            for(int j=1;j<=20;j++){
                Seat seat = new Seat(id,i,j, SeatType.STANDARD, SeatStatus.AVAILABLE,hall);
                repository.add(seat);
                id++;
            }
        }
    }

    @Override
    public Seat getByIdAndHallNo(int id, int hallNo) {
        return repository.getByIdAndHallNo(id,hallNo);
    }

    @Override
    public List<Seat> getAllSeatByHallNo(int hallNo) {
        return repository.getAllSeatsByHallNo(hallNo);
    }

    // seats will have group id. for pricing.


    /*
     * How to handle concurrency.
     */
    @Override
    public void assignSeat(int seatNo, int hallNo) throws Exception {
        /*
         * locking
         */
        Seat seat = getByIdAndHallNo(seatNo,hallNo);
        if(seat.getSeatStatus().equals(SeatStatus.BOOKED) || seat.getSeatStatus().equals(SeatStatus.NOT_AVAILABLE)){
            throw new Exception("Seats already booked");
        }
        seat.setSeatStatus(SeatStatus.BOOKED);
    }

    @Override
    public void withhold(Seat seat) {
        /*
         * locking
         */
        seat.setSeatStatus(SeatStatus.AVAILABLE);
    }

}
