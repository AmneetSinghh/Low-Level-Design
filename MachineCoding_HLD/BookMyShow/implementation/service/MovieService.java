package MachineCoding_HLD.BookMyShow.implementation.service;

import MachineCoding_HLD.BookMyShow.implementation.model.Movie;

import java.util.List;

public interface MovieService {
    void add(int id);
    Movie getById(int id);
    List<Movie> getAll();
}
