package MachineCoding_HLD.BookMyShow.implementation.service.impl;
import MachineCoding_HLD.BookMyShow.implementation.data.Repository;
import MachineCoding_HLD.BookMyShow.implementation.enums.ShowType;
import MachineCoding_HLD.BookMyShow.implementation.model.Cinema;
import MachineCoding_HLD.BookMyShow.implementation.model.Movie;
import MachineCoding_HLD.BookMyShow.implementation.model.Show;
import MachineCoding_HLD.BookMyShow.implementation.service.CinemaService;
import MachineCoding_HLD.BookMyShow.implementation.service.MovieService;
import MachineCoding_HLD.BookMyShow.implementation.service.ShowService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShowServiceImpl implements ShowService {
    public ShowServiceImpl(MovieService movieService,CinemaService cinemaService ){
        this.movieService = movieService;
        this.cinemaService = cinemaService;

    }
    Repository repository = Repository.getInstance();
    MovieService movieService ;
    CinemaService cinemaService ;

    @Override
    public void add(int id, int movieId) {
        Show show = new Show();
        show.setId(id);
        show.setShowType(ShowType.TWO_D);
        show.setEndAt(System.currentTimeMillis() + (2 * 60 * 60 * 1000));
        show.setMovie(movieService.getById(movieId));
        Cinema cinema = cinemaService.getCinemaById(1);
        show.setCinema(cinema);
        repository.add(show);
    }

    @Override
    public void delete(Show show) {}

    @Override
    public void edit(Show show) {}

    @Override
    public List<Show> getAll() {
        return null;
    }

    @Override
    public Map<Cinema, List<Show>> getShowsByMovie(Movie movie) {
        List<Show> showList = repository.getShowByMovie(movie.getId());
        Map<Cinema,List<Show>> cinemashowMap = new HashMap<>();
        for(Show show : showList){
            cinemashowMap.computeIfAbsent(show.getCinema(),k-> new ArrayList<>()).add(show);
        }
        return cinemashowMap;
    }

    @Override
    public Map<Long, List<Show>> getShowByDate() {
        return null;
    }

    public Show getShowById(int id){
        return repository.getShowById(id);
    }
}
