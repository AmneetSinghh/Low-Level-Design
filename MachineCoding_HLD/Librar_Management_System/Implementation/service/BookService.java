package MachineCoding_HLD.Librar_Management_System.Implementation.service;

import MachineCoding_HLD.Librar_Management_System.Implementation.data.BookRepository;
import MachineCoding_HLD.Librar_Management_System.Implementation.enums.BookSearchType;
import MachineCoding_HLD.Librar_Management_System.Implementation.model.Book;
import MachineCoding_HLD.Librar_Management_System.Implementation.model.BookItem;


/*
serve as orchestrator for books
*/

public class BookService implements BookSearch{

    BookRepository bookRepository;
    BookSearch bookSearch;

    public BookService(BookSearch bookSearch,BookRepository bookRepository){
        this.bookSearch = bookSearch;
        this.bookRepository = bookRepository;
    }

    public void add(int id, int noOfCopies, String uniqueBarcode){
        Book book = new Book();
        book.init(uniqueBarcode);
        /*
         * barcode will be same for all copies of book.
         */
        for(int i=1;i<=noOfCopies;i++){
            BookItem bookItem = new BookItem();
            bookItem.init(i,book);
            bookRepository.add(bookItem);
        }


    }

    public void delete(BookItem bookItem){
        bookRepository.delete(bookItem);
    }

    public BookItem getById(int id){
        return bookRepository.getById(id);
    }

    @Override
    public BookItem search(BookSearchType type, String value) throws Exception {
        return bookSearch.search(type,value);
    }
}
