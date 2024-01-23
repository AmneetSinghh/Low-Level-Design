package MachineCoding_HLD.BookMyShow.implementation.service.impl;

import MachineCoding_HLD.BookMyShow.implementation.data.Repository;
import MachineCoding_HLD.BookMyShow.implementation.model.Cinema;
import MachineCoding_HLD.BookMyShow.implementation.model.Hall;
import MachineCoding_HLD.BookMyShow.implementation.model.Seat;
import MachineCoding_HLD.BookMyShow.implementation.model.Show;
import MachineCoding_HLD.BookMyShow.implementation.service.CinemaService;
import MachineCoding_HLD.BookMyShow.implementation.service.SeatService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CinemaServiceImpl implements CinemaService {

    /*
     * Separate service for hall is needed.
     */

    Repository repository = Repository.getInstance();
    SeatService seatService;
    public CinemaServiceImpl(SeatService seatService){
        this.seatService = seatService;
    }

    @Override
    public List<Hall> getHallsList() {
        return null;
    }

    @Override
    public List<Cinema> getCinemaList() {
        return null;
    }

    @Override
    public void addCinema() {
        Cinema cinema = new Cinema();
        cinema.setId(1);
        cinema.setName("Mockk_cinema_");
        addHall(1);
        addHall(2);
        cinema.setHallList(new ArrayList<>(Arrays.asList(getHallById(1),getHallById(2))));
        repository.add(cinema);
    }


    @Override
    public void addHall(int no) {
        Hall hall = new Hall();
        hall.init(no);
        hall.setTotalSeats(100);// total seats.
        repository.add(hall);
    }

    @Override
    public Hall getHallById(int id) {
        return repository.getByHallId(id);
    }

    @Override
    public Cinema getCinemaById(int id) {
        return repository.getByCinemaId(id);
    }

    @Override
    public int getSeatPrice(Show show) {
        return 0;
    }

}
