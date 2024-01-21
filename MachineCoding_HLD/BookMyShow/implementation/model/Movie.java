package MachineCoding_HLD.BookMyShow.implementation.model;

import MachineCoding_HLD.BookMyShow.implementation.enums.MovieCategory;

public class Movie {
    private int id;
    private String name;
    private String actor;
    private String actoress;
    private MovieCategory category;
    private long releaseDate;
    private long duratinInMin;

    public void init(int id){
        setId(id);
        setName("MOCKK_"+id);
        setDuratinInMin(120);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getActoress() {
        return actoress;
    }

    public void setActoress(String actoress) {
        this.actoress = actoress;
    }

    public MovieCategory getCategory() {
        return category;
    }

    public void setCategory(MovieCategory category) {
        this.category = category;
    }

    public long getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(long releaseDate) {
        this.releaseDate = releaseDate;
    }

    public long getDuratinInMin() {
        return duratinInMin;
    }

    public void setDuratinInMin(long duratinInMin) {
        this.duratinInMin = duratinInMin;
    }
}
