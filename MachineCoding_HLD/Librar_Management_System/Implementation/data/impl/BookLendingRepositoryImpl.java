package MachineCoding_HLD.Librar_Management_System.Implementation.data.impl;

import MachineCoding_HLD.Librar_Management_System.Implementation.data.BookLendingRepository;
import MachineCoding_HLD.Librar_Management_System.Implementation.model.Book;
import MachineCoding_HLD.Librar_Management_System.Implementation.model.BookItem;
import MachineCoding_HLD.Librar_Management_System.Implementation.model.Member;
import MachineCoding_HLD.Librar_Management_System.Implementation.model.lending.BookLending;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookLendingRepositoryImpl implements BookLendingRepository {

    // lending
    Map<Member,List<BookLending>> bookLendingMemberMap = new HashMap<>();
    Map<Book,BookLending> bookLendingMap = new HashMap<>();

    @Override
    public void checkoutBook(BookLending bookLending) {
        if(bookLendingMemberMap.containsKey(bookLending.getMember())){
            bookLendingMemberMap.get(bookLending.getMember()).add(bookLending);
        }
        else{
            bookLendingMemberMap.computeIfAbsent(bookLending.getMember(), k-> new ArrayList<>()).add(bookLending);
        }
        bookLendingMap.put(bookLending.getBookItem(),bookLending);
    }

    @Override
    public void deleteLending(BookLending lending) { // delete it.
        List<BookLending> lendingList = bookLendingMemberMap.get(lending.getMember());
        for(BookLending lending1 : lendingList){
            if(lending1.getId() == lending.getId()){
                lendingList.remove(lending1);
                break;
            }
        }
        bookLendingMap.remove(lending.getBookItem());
    }

    @Override
    public BookLending getLendingDetails(Member member, BookItem bookItem) {
        List<BookLending> lendingList = bookLendingMemberMap.get(member);
        for(BookLending bookLending : lendingList){
            if(bookItem.getId() == bookLending.getBookItem().getId()){
                return bookLending;
            }
        }
        return null;
    }

    @Override
    public BookLending getLendingDetailsByBook(BookItem bookItem){
        return bookLendingMap.get(bookItem);
    }


    @Override
    public List<BookLending> getAllBooksLendingDetails(Member member) {
        return bookLendingMemberMap.get(member);
    }
}
