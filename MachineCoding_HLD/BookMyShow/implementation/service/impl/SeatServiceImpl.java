package MachineCoding_HLD.BookMyShow.implementation.service.impl;

import MachineCoding_HLD.BookMyShow.implementation.data.Repository;
import MachineCoding_HLD.BookMyShow.implementation.enums.SeatStatus;
import MachineCoding_HLD.BookMyShow.implementation.enums.SeatType;
import MachineCoding_HLD.BookMyShow.implementation.model.Hall;
import MachineCoding_HLD.BookMyShow.implementation.model.Seat;
import MachineCoding_HLD.BookMyShow.implementation.service.SeatService;
import MachineCoding_HLD.BookMyShow.implementation.service.seatConcurrency.SeatConcurrency;

import java.util.List;

/*
 * seats will have group id. for pricing.
 */
public class SeatServiceImpl implements SeatService {
    public SeatServiceImpl(SeatConcurrency seatConcurrency){
        this.seatConcurrency = seatConcurrency;
    }

    Repository repository = Repository.getInstance();
    SeatConcurrency seatConcurrency;

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




    /*
     * ways to handle concurrency :
     * centralized locking : Redis-> lock on seatNo_hallNo for 3 minutes with expiry :
     *
     *
     */

    @Override
    public Boolean assignSeat(int seatNo, int hallNo) throws Exception {
        Seat seat = getByIdAndHallNo(seatNo,hallNo);
        if(seat.getSeatStatus().equals(SeatStatus.BOOKED) || seat.getSeatStatus().equals(SeatStatus.NOT_AVAILABLE)){
            throw new Exception("Seats already booked");
        }

        /*
         * locking
         */
        if(seatConcurrency.lock(seatNo,hallNo)){
            System.out.println("Seat no: "+ seatNo+" Locking by Thread-> "+ Thread.currentThread().getName());
            seat.setSeatStatus(SeatStatus.BOOKED);
            System.out.println("Seat no: "+ seatNo+" UnLocking by Thread-> "+ Thread.currentThread().getName());
            seatConcurrency.unLock(seatNo,hallNo);
            return true;
        }
        throw new Exception("Not able to assign seat"+ Thread.currentThread().getName());
    }

    @Override
    public void withhold(Seat seat) {
        /*
         * locking
         */
        seat.setSeatStatus(SeatStatus.AVAILABLE);
    }

}
