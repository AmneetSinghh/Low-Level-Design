package LLD.MANAGEMENT_SYSTEMS.Librar_Management_System.Implementation.data;

import LLD.MANAGEMENT_SYSTEMS.Librar_Management_System.Implementation.model.*;
import LLD.MANAGEMENT_SYSTEMS.Librar_Management_System.Implementation.model.lending.BookLending;
import LLD.MANAGEMENT_SYSTEMS.Librar_Management_System.Implementation.model.lending.BookReservation;

import java.util.List;

/*
Central class which act like DATABASE
*/

public interface BookRepository {
    void add(BookItem bookItem);
    void delete(BookItem bookItem);
    BookItem getById(int id);
    BookItem getByAuthor(String author);
    BookItem getByTitle(String title);
    BookItem getBySubject(String subject);
    BookItem getByPublicationDate(String publicationDate);
}
