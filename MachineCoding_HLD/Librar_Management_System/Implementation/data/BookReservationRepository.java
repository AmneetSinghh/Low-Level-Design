package MachineCoding_HLD.Librar_Management_System.Implementation.data;

import MachineCoding_HLD.Librar_Management_System.Implementation.model.BookItem;
import MachineCoding_HLD.Librar_Management_System.Implementation.model.Member;
import MachineCoding_HLD.Librar_Management_System.Implementation.model.lending.BookReservation;

import java.util.List;

public interface BookReservationRepository {
    void reserveBook(BookReservation reservation);
    BookReservation getReservationDetails(Member member, BookItem bookItem);
    List<BookReservation> getAllBooksReservationDetails(Member member);
    BookReservation getReservationDetailsByBook(BookItem bookItem);
}
