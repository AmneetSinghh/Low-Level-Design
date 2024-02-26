package MachineCoding_HLD.BookMyShow.implementation.data;
import MachineCoding_HLD.BookMyShow.implementation.model.*;
import MachineCoding_HLD.BookMyShow.implementation.model.user.Customer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
* For time constraint, we will have only 1 repository which acts as database.
* with double locking only once lock will get acquired, only first time instance is created.
* singleton.
 */
public class Repository {
    private static Repository uniqueInstance;
    private static final Lock lock = new ReentrantLock(); // Create a ReentrantLock
    private Repository(){}
    public static Repository getInstance(){
        if(uniqueInstance == null){
            lock.lock();
            if(uniqueInstance == null){
                uniqueInstance = new Repository();
            }
            lock.unlock();
            return uniqueInstance;
        }
        return uniqueInstance;
    }

    List<Customer> customerList = new ArrayList<>();                // it is a customer table.
    List<Seat> seatList = new ArrayList<>();
    List<Hall> hallList = new ArrayList<>();
    List<Cinema> cinemaList = new ArrayList<>();//
    List<Movie> movieList = new ArrayList<>();
    List<Show> showList = new ArrayList<>();
    List<Booking> bookingList = new ArrayList<>();

    public void add(Customer customer){
        customerList.add(customer);
    }

    public Customer getById(int id){
        for(Customer customer : customerList){
            if(customer.getId() == id){
                return customer;
            }
        }
        return null;
    }

    public void add(Seat seat){
        seatList.add(seat);
    }

    public Seat getByIdAndShowSlot(int id, int showSlotId){
        for(Seat seat : seatList){
            if(seat.getId() == id && showSlotId == seat.getShowSlot().getId()){
                return seat;
            }
        }
        return null;
    }

    public List<Seat> getAllSeatsByShowSlot(int showSlotId){
        List<Seat> seats = new ArrayList<>();
        for(Seat seat : seatList){
            if(showSlotId == seat.getShowSlot().getId()){
                seats.add(seat);
            }
        }
        return seats;
    }


    public void add(Hall hall){
        hallList.add(hall);
    }

    public Hall getByHallId(int id){
        for(Hall hall : hallList){
            if(hall.getId() == id){
                return hall;
            }
        }
        return null;
    }

    public void add(Cinema cinema){
        cinemaList.add(cinema);
    }

    public Cinema getByCinemaId(int id){
        for(Cinema cinema : cinemaList){
            if(cinema.getId() == id){
                return cinema;
            }
        }
        return null;
    }

    public void add(Movie movie){
        movieList.add(movie);
    }

    public Movie getMovieById(int id){
        for(Movie movie : movieList){
            if(movie.getId() == id){
                return movie;
            }
        }
        return null;
    }

    public List<Movie> getAllMovies(){
        return movieList;
    }


    public void add(Show show){
        showList.add(show);
    }

    public Show getShowById(int id){
        for(Show show : showList){
            if(show.getId() == id){
                return show;
            }
        }
        return null;
    }

    public List<Show> getShowByMovie(int id){
        List<Show> shows = new ArrayList<>();
        for(Show show : showList){
            if(show.getMovie().getId() == id){
                shows.add(show);
            }
        }
        return shows;
    }

    public void add(Booking booking){
        bookingList.add(booking);
    }



}
