package LLD.MANAGEMENT_SYSTEMS.Librar_Management_System.Implementation.service;
import LLD.MANAGEMENT_SYSTEMS.Librar_Management_System.Implementation.data.BookReservationRepository;
import LLD.MANAGEMENT_SYSTEMS.Librar_Management_System.Implementation.enums.BookStatus;
import LLD.MANAGEMENT_SYSTEMS.Librar_Management_System.Implementation.model.BookItem;
import LLD.MANAGEMENT_SYSTEMS.Librar_Management_System.Implementation.model.lending.BookReservation;
import LLD.MANAGEMENT_SYSTEMS.Librar_Management_System.Implementation.model.Member;

import java.util.List;

public class BookReservationService {
    BookReservationRepository bookRepository;

    public BookReservationService(BookReservationRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    public void reserve(Member member, BookItem bookItem){
        if(bookItem.getStatus().equals(BookStatus.AVAILABLE)){
            BookReservation bookReservation = new BookReservation();
            bookReservation.init(member,bookItem);
            bookRepository.reserveBook(bookReservation);
            bookItem.setStatus(BookStatus.RESERVED);
        }
        else{
            System.out.println("Book not available for reservation id: "+ bookItem.getId()+"  Status: "+ bookItem.getStatus().toString());
        }
    }

    public BookReservation getReservationDetails(Member member, BookItem bookItem){
        return bookRepository.getReservationDetails(member,bookItem);
    }

    public List<BookReservation> getAllBooksReservationDetails(Member member){
        return bookRepository.getAllBooksReservationDetails(member);
    }
}
