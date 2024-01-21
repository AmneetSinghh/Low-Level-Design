package MachineCoding_HLD.Librar_Management_System.Implementation.data;

import MachineCoding_HLD.Librar_Management_System.Implementation.model.*;

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
