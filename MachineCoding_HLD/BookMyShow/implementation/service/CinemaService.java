package MachineCoding_HLD.BookMyShow.implementation.service;

import MachineCoding_HLD.BookMyShow.implementation.model.Cinema;
import MachineCoding_HLD.BookMyShow.implementation.model.Hall;
import MachineCoding_HLD.BookMyShow.implementation.model.Show;

import java.util.List;

public interface CinemaService {
    List<Hall> getHallsList();
    List<Cinema> getCinemaList();
    void addCinema();
    void addHall(int no);
    Hall getHallById(int id);
    Cinema getCinemaById(int id);
    int getSeatPrice(Show show);
}
