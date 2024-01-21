package MachineCoding_HLD.BookMyShow.implementation.service.impl;

import MachineCoding_HLD.BookMyShow.implementation.enums.SearchType;
import MachineCoding_HLD.BookMyShow.implementation.model.Movie;
import MachineCoding_HLD.BookMyShow.implementation.service.MovieSearch;
import MachineCoding_HLD.BookMyShow.implementation.service.MovieSearchContract;


public class MovieSearchImpl implements MovieSearch, MovieSearchContract {

    @Override
    public Movie searchByTitle(String title) {
        return null;
    }

    @Override
    public Movie searchByLanguage(String language) {
        return null;
    }

    @Override
    public Movie searchByGenre(String genre) {
        return null;
    }

    @Override
    public Movie searchByReleaseDate(String releaseDate) {
        return null;
    }

    @Override
    public Movie searchByCity(String city) {
        return null;
    }

    @Override
    public Movie search(String value, SearchType type) throws Exception {
        switch (type) {
            case CITY : {
                return searchByCity(value);
            }
            case GENRE : {
                return searchByGenre(value);
            }
            case TITLE : {
                return searchByTitle(value);
            }
            case RELEASE_DATE : {
                return searchByReleaseDate(value);
            }
            case LANGUAGE : {
                return searchByLanguage(value);
            }
            default : throw new Exception("Search not available by :" + type.toString());
        }
    }
}
