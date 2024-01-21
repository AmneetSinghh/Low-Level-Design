package MachineCoding_HLD.BookMyShow.implementation.service;

import MachineCoding_HLD.BookMyShow.implementation.enums.SearchType;
import MachineCoding_HLD.BookMyShow.implementation.model.Movie;

public interface MovieSearchContract {
    Movie search(String value, SearchType type) throws Exception;
}
