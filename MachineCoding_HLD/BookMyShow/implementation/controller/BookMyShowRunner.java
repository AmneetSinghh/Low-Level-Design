package MachineCoding_HLD.BookMyShow.implementation.controller;

/*
DB SCHEMA:

- (audi - show)
- many to many relationship.
- audi can have many shows
- shows can have many audi's.

tables  lets consider later.
- audi
- show
- seats
- audi_shows
- audi_seats
- seat_info

 */



/*
- Do proper exception handling after building.
- design patterns :
    - factory
    - strategy
    - decorator
    - observer - in-progress [ for notifications ]
    - Singleton


 - easily extendable to Event Booking service lets design on separate module.


- determine time for each ML & LLD, set it on your calender in 1 week 2 LLD.

*/


import MachineCoding_HLD.BookMyShow.implementation.model.*;
import MachineCoding_HLD.BookMyShow.implementation.model.dto.BookingRequestDto;
import MachineCoding_HLD.BookMyShow.implementation.service.*;
import MachineCoding_HLD.BookMyShow.implementation.service.impl.*;
import MachineCoding_HLD.BookMyShow.implementation.service.seatConcurrency.SeatConcurrencyImpl;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class BookMyShowRunner {
    public static void main(String[] args){
        SeatService seatService = new SeatServiceImpl(new SeatConcurrencyImpl());
        CinemaService cinemaService = new CinemaServiceImpl(seatService);
        PaymentService paymentService = new PaymentServiceImpl();
        RefundService refundService = new RefundServiceImpl(paymentService);
        BookingService bookingService = new BookingServiceImpl(seatService,paymentService,new TicketServiceImpl(seatService),cinemaService,refundService);
        CustomerService customerService = new CustomerServiceImpl();
        MovieService movieService = new MovieServiceImpl();
        ShowService showService = new ShowServiceImpl(movieService,cinemaService);

        for(int i=1;i<=2;i++){
            customerService.add(i);
            cinemaService.addCinema();
            movieService.add(i);
            showService.add(i,i);

            Movie movie = movieService.getById(i);
            Map<Cinema, List<Show>> shows = showService.getShowsByMovie(movie);
            for(Map.Entry<Cinema, List<Show>> show : shows.entrySet()){
                System.out.println("For cinema -> "+ show.getKey());
            }
        }
        customerService.add(3);

        /*
         * Concurrency booking two seats.
         */


        /*
         * no one will be able to book seat, as we are setting individually.
         */
        List<Integer> seats = Arrays.asList(0, 1);
        List<Integer> seats_1 = Arrays.asList(1,0);
        /*
         Do in order for handling concurrency.
         */
        Thread booking_request_1 = new Thread(() -> {
            BookingRequestDto bookingRequestDto = new BookingRequestDto();
            bookingRequestDto.setShow(showService.getShowById(1));
            bookingRequestDto.setCustomer(customerService.getById(1));
            bookingRequestDto.setSeatNo(Arrays.asList(new Seat(), new Seat())); // create seats this is dummy.
            Booking booking = bookingService.create(bookingRequestDto);
            System.out.println(booking);
        });
        Thread booking_request_2 = new Thread(() -> {
            BookingRequestDto bookingRequestDto = new BookingRequestDto();
            bookingRequestDto.setShow(showService.getShowById(1));
            bookingRequestDto.setCustomer(customerService.getById(2));
            bookingRequestDto.setSeatNo(Arrays.asList(new Seat(), new Seat())); // create seats this is dummy.
            Booking booking = bookingService.create(bookingRequestDto);
            System.out.println(booking);
        });
        booking_request_1.start();
//        booking_request_2.start();


    }
}
