package LLD.MANAGEMENT_SYSTEMS.Librar_Management_System.Implementation.data.impl;

import LLD.MANAGEMENT_SYSTEMS.Librar_Management_System.Implementation.data.BookReservationRepository;
import LLD.MANAGEMENT_SYSTEMS.Librar_Management_System.Implementation.model.Book;
import LLD.MANAGEMENT_SYSTEMS.Librar_Management_System.Implementation.model.BookItem;
import LLD.MANAGEMENT_SYSTEMS.Librar_Management_System.Implementation.model.Member;
import LLD.MANAGEMENT_SYSTEMS.Librar_Management_System.Implementation.model.lending.BookReservation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookReservationRepositoryImpl implements BookReservationRepository {

    // reservation
    Map<Member,List<BookReservation>> bookReservationMemberMap = new HashMap<>();
    Map<Book,BookReservation> bookReservationMap = new HashMap<>();

    @Override
    public BookReservation getReservationDetailsByBook(BookItem bookItem) {
        return bookReservationMap.get(bookItem);
    }


    @Override
    public void reserveBook(BookReservation bookReservation) {
        if (bookReservationMemberMap.containsKey(bookReservation.getMember())) {
            bookReservationMemberMap.get(bookReservation.getMember()).add(bookReservation);
        } else {
            bookReservationMemberMap.computeIfAbsent(bookReservation.getMember(), k -> new ArrayList<>()).add(bookReservation);
        }
        bookReservationMap.put(bookReservation.getBookItem(),bookReservation);
    }

    @Override
    public BookReservation getReservationDetails(Member member, BookItem bookItem) {
        List<BookReservation> reservationList = bookReservationMemberMap.get(member);
        for(BookReservation bookReservation : reservationList){
            if(bookItem.getId() == bookReservation.getBookItem().getId()){
                return bookReservation;
            }
        }
        return null;
    }

    @Override
    public List<BookReservation> getAllBooksReservationDetails(Member member) {
        return bookReservationMemberMap.get(member);
    }

}
