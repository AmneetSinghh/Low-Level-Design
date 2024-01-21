package MachineCoding_HLD.Librar_Management_System.Implementation.service;

import MachineCoding_HLD.Librar_Management_System.Implementation.data.BookLendingRepository;
import MachineCoding_HLD.Librar_Management_System.Implementation.enums.BookStatus;
import MachineCoding_HLD.Librar_Management_System.Implementation.model.BookItem;
import MachineCoding_HLD.Librar_Management_System.Implementation.model.lending.BookLending;
import MachineCoding_HLD.Librar_Management_System.Implementation.model.Member;

import java.util.List;


public class BookLendingService {

    BookLendingRepository bookLendingRepository;
    FineService fineService;

    public BookLendingService(BookLendingRepository bookLendingRepository,FineService fineService){
        this.bookLendingRepository = bookLendingRepository;
        this.fineService = fineService;
    }

    public void checkoutBook(Member member, BookItem bookItem){
        if(bookItem.getStatus().equals(BookStatus.AVAILABLE)){
            BookLending bookLending = new BookLending();
            bookLending.init(member,bookItem);
            bookLendingRepository.checkoutBook(bookLending);
            member.setTotalBooksCheckout(member.getTotalBooksCheckout()+1);
            bookItem.setStatus(BookStatus.LENT);
        }
        else{
            System.out.println("Book not available for Lent id: "+ bookItem.getId()+"  Status: "+ bookItem.getStatus().toString());
        }
    }

    public BookLending getLendingDetails(Member member, BookItem bookItem){
        return bookLendingRepository.getLendingDetails(member,bookItem);
    }

    public List<BookLending> getAllBooksLendingDetails(Member member){
        return bookLendingRepository.getAllBooksLendingDetails(member);
    }

    public BookLending getLendingDetailsByBook(BookItem bookItem){
        return bookLendingRepository.getLendingDetailsByBook(bookItem);
    }

    public void returnBook(Member member, BookItem bookItem){
        BookLending lending = bookLendingRepository.getLendingDetailsByBook(bookItem);
        fineService.collectFine(member,bookItem,lending);
        lending.setReturnedAt(System.currentTimeMillis());
        member.setTotalBooksCheckout(member.getTotalBooksCheckout()-1);
        bookItem.setStatus(BookStatus.AVAILABLE);
        bookLendingRepository.deleteLending(lending);
    }

}
