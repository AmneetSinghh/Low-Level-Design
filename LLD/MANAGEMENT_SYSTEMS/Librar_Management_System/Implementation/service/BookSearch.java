package LLD.MANAGEMENT_SYSTEMS.Librar_Management_System.Implementation.service;

import LLD.MANAGEMENT_SYSTEMS.Librar_Management_System.Implementation.enums.BookSearchType;
import LLD.MANAGEMENT_SYSTEMS.Librar_Management_System.Implementation.model.BookItem;

public interface BookSearch {
    BookItem search(BookSearchType type, String value) throws Exception;
}