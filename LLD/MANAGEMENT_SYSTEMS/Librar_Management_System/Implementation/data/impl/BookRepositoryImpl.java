package LLD.MANAGEMENT_SYSTEMS.Librar_Management_System.Implementation.data.impl;
import LLD.MANAGEMENT_SYSTEMS.Librar_Management_System.Implementation.data.BookRepository;
import LLD.MANAGEMENT_SYSTEMS.Librar_Management_System.Implementation.model.*;
import LLD.MANAGEMENT_SYSTEMS.Librar_Management_System.Implementation.model.lending.BookLending;
import LLD.MANAGEMENT_SYSTEMS.Librar_Management_System.Implementation.model.lending.BookReservation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class BookRepositoryImpl implements BookRepository {

    // books
    List<BookItem> bookItemList = new ArrayList<>();
    Map<String,BookItem> bookAuthorIndex = new HashMap<>();
    Map<String,BookItem> bookTitleIndex = new HashMap<>();
    Map<String,BookItem> bookSubjectIndex = new HashMap<>();
    Map<String,BookItem> bookPublicationDateIndex = new HashMap<>();



    @Override
    public void add(BookItem bookItem) {
        bookItemList.add(bookItem);
    }

    @Override
    public void delete(BookItem bookItem) {
        /*
         * delete only if book not reserved, lent and available.
         */
        bookItemList.remove(bookItem);
    }

    @Override
    public BookItem getById(int id) {
        for(BookItem bookItem : bookItemList){
            if(bookItem.getId() == id){
                return bookItem;
            }
        }
        return null;
    }

    @Override
    public BookItem getByAuthor(String author) {
        return bookAuthorIndex.get(author);
    }

    @Override
    public BookItem getByTitle(String title) {
        return bookTitleIndex.get(title);
    }

    @Override
    public BookItem getBySubject(String subject) {
        return bookSubjectIndex.get(subject);
    }

    @Override
    public BookItem getByPublicationDate(String publicationDate) {
        return bookPublicationDateIndex.get(publicationDate);
    }



}
