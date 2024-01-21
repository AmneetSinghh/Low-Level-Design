package MachineCoding_HLD.Librar_Management_System.Implementation.controller;

import MachineCoding_HLD.Librar_Management_System.Implementation.data.*;
import MachineCoding_HLD.Librar_Management_System.Implementation.data.impl.*;
import MachineCoding_HLD.Librar_Management_System.Implementation.model.BookItem;
import MachineCoding_HLD.Librar_Management_System.Implementation.model.lending.BookLending;
import MachineCoding_HLD.Librar_Management_System.Implementation.model.Member;
import MachineCoding_HLD.Librar_Management_System.Implementation.service.*;
import MachineCoding_HLD.Librar_Management_System.Implementation.service.impl.BookSearchImpl;

import java.util.List;
import java.util.UUID;

public class LibraryRunner {


    public static void main(String args[]){
        /*
         * Repository
         */
        BookRepository bookRepository = new BookRepositoryImpl();
        BookReservationRepository bookReservationRepository = new BookReservationRepositoryImpl();
        BookLendingRepository bookLendingRepository = new BookLendingRepositoryImpl();
        FineRepository fineRepository = new FineRepositoryImpl();
        MemberRepository memberRepository = new MemberRepositoryImpl();


        /*
         * Services
         */
        FineService fineService = new FineService(fineRepository);
        BookSearch bookSearch = new BookSearchImpl(bookRepository);
        LibraryService libraryService = new LibraryService(memberRepository);
        BookService bookService = new BookService(bookSearch,bookRepository);
        BookLendingService bookLendingService = new BookLendingService(bookLendingRepository,fineService);


        for(int i=1;i<=5;i++){
            libraryService.addMember(i);
            bookService.add(i,2, UUID.randomUUID().toString());
        }

        for(int i=1;i<=5;i++){
            Member member = libraryService.getMemberById(i);
            BookItem bookItem = bookService.getById(i);
            bookLendingService.checkoutBook(member,bookItem);
            BookLending bookLending = bookLendingService.getLendingDetails(member,bookItem);
            BookLending bookLendingByBook = bookLendingService.getLendingDetailsByBook(bookItem);
            List<BookLending> allByMember = bookLendingService.getAllBooksLendingDetails(member);
            System.out.println("Done");
        }

        for(int i=1;i<=5;i++){
            Member member = libraryService.getMemberById(i);
            BookItem bookItem = bookService.getById(i);
            bookLendingService.checkoutBook(member,bookItem);
            BookLending bookLending = bookLendingService.getLendingDetails(member,bookItem);
            BookLending bookLendingByBook = bookLendingService.getLendingDetailsByBook(bookItem);
            List<BookLending> allByMember = bookLendingService.getAllBooksLendingDetails(member);
            System.out.println("Done");
        }




    }

}


/*
 Do also think design patterns that you can apply. learn some new pattern as well.
*/