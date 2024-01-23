package MachineCoding_HLD.BookMyShow.implementation.model;
import MachineCoding_HLD.BookMyShow.implementation.enums.ShowType;

import java.util.List;

/*
show : show_id, hall_1, 'animal', 'cinema_1', 2_d,
*/

/*
 * select on movie.
 * input (city, date, movie) -> output ->   Map<Cinema, List<Show>>
 * select cinema which close to your location.
 * query: select * from shows where movie = :movie & startAt< :date & cinema = :cinema  join show_slot.
 */


//cinema 1 : 1 show and 5 slots. so 1 to many mapping.

/*

*/

public class Show {
    private int id;     // x movie == x show, 1 movie is only 1 show, because its on different slot.
    private Movie movie;
    private Cinema cinema;
    private ShowType showType;
    private long duration;
    private long createdAt;
    private long endAt;
    private List<ShowSlot> showSlotList;


    public List<ShowSlot> getShowSlotList() {
        return showSlotList;
    }

    public void setShowSlotList(List<ShowSlot> showSlotList) {
        this.showSlotList = showSlotList;
    }

    public long getDuration() {
        return duration;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }

    public long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Cinema getCinema() {
        return cinema;
    }

    public void setCinema(Cinema cinema) {
        this.cinema = cinema;
    }

    public ShowType getShowType() {
        return showType;
    }

    public void setShowType(ShowType showType) {
        this.showType = showType;
    }


    public long getEndAt() {
        return endAt;
    }

    public void setEndAt(long endAt) {
        this.endAt = endAt;
    }

}
