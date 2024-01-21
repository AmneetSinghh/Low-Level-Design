package MachineCoding_HLD.Librar_Management_System.Implementation.service;

import MachineCoding_HLD.Librar_Management_System.Implementation.model.BookItem;

public interface BookSearchTypes {
    BookItem searchByAuthor(String author);
    BookItem searchByTitle(String title);
    BookItem searchBySubject(String subject);
    BookItem searchByPublicationDate(String publicationDate);
}
