package MachineCoding_HLD.BookMyShow.implementation.service;

import MachineCoding_HLD.BookMyShow.implementation.model.Cinema;
import MachineCoding_HLD.BookMyShow.implementation.model.Movie;
import MachineCoding_HLD.BookMyShow.implementation.model.Show;

import java.util.List;
import java.util.Map;

public interface ShowService {
    void add(int id, int movieId); // we need to check hall is empty for that slot or not ->  then add a show.
    void delete(Show show);
    void edit(Show show);
    List<Show> getAll();
    Map<Cinema,List<Show>> getShowsByMovie(Movie movie);// show1, show2, show3,,   group by cinema.

    // show beautiful information same as bookMyShow.
}
