package MachineCoding_HLD.BookMyShow.implementation.service.impl;

import MachineCoding_HLD.BookMyShow.implementation.data.Repository;
import MachineCoding_HLD.BookMyShow.implementation.enums.BookingStatus;
import MachineCoding_HLD.BookMyShow.implementation.model.Booking;
import MachineCoding_HLD.BookMyShow.implementation.model.Show;
import MachineCoding_HLD.BookMyShow.implementation.model.Ticket;
import MachineCoding_HLD.BookMyShow.implementation.model.dto.BookingRequestDto;
import MachineCoding_HLD.BookMyShow.implementation.model.user.Customer;
import MachineCoding_HLD.BookMyShow.implementation.service.*;
import MachineCoding_HLD.BookMyShow.implementation.service.bookingChargeDecorator.BaseBookingCharge;
import MachineCoding_HLD.BookMyShow.implementation.service.bookingChargeDecorator.BaseBookingChargeImpl;
import MachineCoding_HLD.BookMyShow.implementation.service.bookingChargeDecorator.SeatTypeCharge;
import MachineCoding_HLD.BookMyShow.implementation.service.bookingChargeDecorator.ShowTypeCharge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class BookingServiceImpl implements BookingService {
    public BookingServiceImpl(SeatService seatService, PaymentService paymentService, TicketService ticketService, CinemaService cinemaService){
        this.seatService = seatService;
        this.paymentService = paymentService;
        this.ticketService = ticketService;
        this.cinemaService = cinemaService;
    }

    Repository repository = Repository.getInstance();
    SeatService seatService;
    PaymentService paymentService;
    TicketService ticketService;
    CinemaService cinemaService;

    @Override
    public Booking create(BookingRequestDto bookingRequestDto) {
        try{
            Collections.sort(bookingRequestDto.getSeatNo());
            Booking booking = new Booking();
            booking.setId(1);
            booking.setCustomer(bookingRequestDto.getCustomer());
            booking.setStatus(BookingStatus.PENDING);
            List<Ticket> ticketList = new ArrayList<>();
            int charge = 0;
            for(Integer seatNo : bookingRequestDto.getSeatNo()){
                /*
                 * Assign seat
                 */
                int hallNo = bookingRequestDto.getShow().getHall().getHallNo();
                seatService.assignSeat(seatNo,hallNo);

                /*
                 * make ticket
                 */
                Ticket ticket = ticketService.createTicket(seatNo,hallNo);
                /*
                 * calculate charges
                 */
                booking.setBaseBookingCharge(calculateChargeDecorator(bookingRequestDto.getShow(),seatNo,hallNo));
                charge += booking.getBaseBookingCharge().calculateAmount(bookingRequestDto.getShow(),seatNo,hallNo);
                ticketList.add(ticket);
            }
            // calculate amount.
            paymentService.processPayment(charge);
            booking.setTickets(ticketList);
            booking.setStatus(BookingStatus.COMPLETED);
            repository.add(booking);
            return booking;
        } catch(Exception e){
            System.out.println("Exception : "+ e);
            return null;
        }
    }

    @Override
    public Booking edit(BookingRequestDto bookingRequestDto) {
        return null;
    }

    @Override
    public void cancel(Booking booking) {

    }

    @Override
    public Booking getBookingByCustomer(Customer customer) {
        return null;
    }

    @Override
    public Booking getBookingById(int id) {
        return null;
    }

    private BaseBookingCharge calculateChargeDecorator(Show show, int seatNo, int hallNo) {
        /*
         * Used decorator pattern.
         */
        BaseBookingCharge baseBookingCharge = new BaseBookingChargeImpl();
        baseBookingCharge = new SeatTypeCharge(baseBookingCharge,seatService);
        baseBookingCharge = new ShowTypeCharge(baseBookingCharge);
        return baseBookingCharge;
    }

}
