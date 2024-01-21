package MachineCoding_HLD.BookMyShow.implementation.service;

import MachineCoding_HLD.BookMyShow.implementation.model.Movie;

public interface MovieSearch {
    Movie searchByTitle(String title);
    Movie searchByLanguage(String language);
    Movie searchByGenre(String genre);
    Movie searchByReleaseDate(String releaseDate);
    Movie searchByCity(String city);
}