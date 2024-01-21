package MachineCoding_HLD.Librar_Management_System.Implementation.service;

import MachineCoding_HLD.Librar_Management_System.Implementation.enums.BookSearchType;
import MachineCoding_HLD.Librar_Management_System.Implementation.model.BookItem;

public interface BookSearch {
    BookItem search(BookSearchType type, String value) throws Exception;
}