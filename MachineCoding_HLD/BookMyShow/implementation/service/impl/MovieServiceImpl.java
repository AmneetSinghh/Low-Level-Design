package MachineCoding_HLD.BookMyShow.implementation.service.impl;

import MachineCoding_HLD.BookMyShow.implementation.data.Repository;
import MachineCoding_HLD.BookMyShow.implementation.model.Movie;
import MachineCoding_HLD.BookMyShow.implementation.service.MovieService;

import java.util.List;

public class MovieServiceImpl implements MovieService {

    Repository repository = Repository.getInstance();

    @Override
    public void add(int id) {
        Movie movie = new Movie();
        movie.init(id);
        repository.add(movie);
    }

    @Override
    public Movie getById(int id) {
        return repository.getMovieById(id);
    }

    @Override
    public List<Movie> getAll() {
        return repository.getAllMovies();
    }
}
