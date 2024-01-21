package MachineCoding_HLD.Librar_Management_System.Implementation.service.impl;

import MachineCoding_HLD.Librar_Management_System.Implementation.data.BookRepository;
import MachineCoding_HLD.Librar_Management_System.Implementation.enums.BookSearchType;
import MachineCoding_HLD.Librar_Management_System.Implementation.model.BookItem;
import MachineCoding_HLD.Librar_Management_System.Implementation.service.BookSearch;
import MachineCoding_HLD.Librar_Management_System.Implementation.service.BookSearchTypes;

public class BookSearchImpl implements BookSearch, BookSearchTypes {

    BookRepository bookRepository;

    public BookSearchImpl(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    @Override
    public BookItem search(BookSearchType type, String value) throws Exception {
        switch (type) {
            case TITLE : {
                return searchByTitle(value);
            }
            case AUTHOR : {
                return searchByAuthor(value);
            }
            case SUBJECT : {
                return searchBySubject(value);
            }
            case PUBLICATION_DATE : {
                return searchByPublicationDate(value);
            }
            default : throw new Exception("Search not available by :" + type.toString());
        }
    }

    @Override
    public BookItem searchByAuthor(String author) {
        return bookRepository.getByAuthor(author);
    }

    @Override
    public BookItem searchByTitle(String title) {
        return bookRepository.getByTitle(title);
    }

    @Override
    public BookItem searchBySubject(String subject) {
        return bookRepository.getBySubject(subject);
    }

    @Override
    public BookItem searchByPublicationDate(String publicationDate) {
        return bookRepository.getByPublicationDate(publicationDate);
    }
}
