package MachineCoding_HLD.Librar_Management_System.Implementation.data;

import MachineCoding_HLD.Librar_Management_System.Implementation.model.BookItem;
import MachineCoding_HLD.Librar_Management_System.Implementation.model.Member;
import MachineCoding_HLD.Librar_Management_System.Implementation.model.lending.BookLending;

import java.util.List;

public interface BookLendingRepository {
    void checkoutBook(BookLending bookLending);
    BookLending getLendingDetails(Member member, BookItem bookItem);
    void deleteLending(BookLending lending);
    BookLending getLendingDetailsByBook(BookItem bookItem);
    List<BookLending> getAllBooksLendingDetails(Member member);
}
