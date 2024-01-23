package MachineCoding_HLD.BookMyShow.implementation.service.impl;
import MachineCoding_HLD.BookMyShow.implementation.data.Repository;
import MachineCoding_HLD.BookMyShow.implementation.enums.BookingStatus;
import MachineCoding_HLD.BookMyShow.implementation.model.Booking;
import MachineCoding_HLD.BookMyShow.implementation.model.Seat;
import MachineCoding_HLD.BookMyShow.implementation.model.Ticket;
import MachineCoding_HLD.BookMyShow.implementation.model.dto.BookingRequestDto;
import MachineCoding_HLD.BookMyShow.implementation.model.user.Customer;
import MachineCoding_HLD.BookMyShow.implementation.service.*;
import MachineCoding_HLD.BookMyShow.implementation.service.bookingChargeDecorator.BaseBookingCharge;
import MachineCoding_HLD.BookMyShow.implementation.service.bookingChargeDecorator.BaseBookingChargeImpl;
import MachineCoding_HLD.BookMyShow.implementation.service.bookingChargeDecorator.SeatTypeCharge;
import MachineCoding_HLD.BookMyShow.implementation.service.bookingChargeDecorator.ShowTypeCharge;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class BookingServiceImpl implements BookingService {
    public BookingServiceImpl(SeatService seatService, PaymentService paymentService, TicketService ticketService, CinemaService cinemaService, RefundService refundService){
        this.seatService = seatService;
        this.paymentService = paymentService;
        this.ticketService = ticketService;
        this.cinemaService = cinemaService;
        this.refundService = refundService;
    }

    Repository repository = Repository.getInstance();
    SeatService seatService;
    PaymentService paymentService;
    TicketService ticketService;
    CinemaService cinemaService;
    RefundService refundService;

    @Override
    public Booking create(BookingRequestDto bookingRequestDto) {
        try{
            bookingRequestDto.getSeatNo().sort(new BookingSeatComparator());// important if thread-1 seats:[0,1],  thread-2 seats: [1,0]
            // sort based on seatNo.
            Booking booking = new Booking();
            booking.setId(1);
            booking.setCustomer(bookingRequestDto.getCustomer());
            booking.setStatus(BookingStatus.PENDING);
            List<Ticket> ticketList = new ArrayList<>();
            int charge = 0;
            for(Seat seatNo : bookingRequestDto.getSeatNo()){
                /*
                 * Assign seat
                 */
                seatService.assignSeat(seatNo.getId(),seatNo.getShowSlot().getId());

                /*
                 * make ticket
                 */
                Ticket ticket = ticketService.createTicket(seatNo.getId(),seatNo.getShowSlot().getId());
                /*
                 * calculate charges
                 */
                booking.setBaseBookingCharge(calculateChargeDecorator());
                charge += booking.getBaseBookingCharge().calculateAmount(seatNo);
                ticketList.add(ticket);
            }
            // calculate amount.
            paymentService.processPayment(charge);
            booking.setTickets(ticketList);
            booking.setStatus(BookingStatus.COMPLETED);
            booking.setAmount(charge);
            repository.add(booking);
            return booking;
        } catch(Exception e){
            System.out.println("Exception : "+ e);
            return null;
        }
    }

    @Override
    public Booking edit(BookingRequestDto bookingRequestDto){return null;}

    @Override
    public void cancel(Booking booking) {
        for(Ticket ticket : booking.getTickets()){
            // withHold seat
            seatService.withhold(ticket.getSeat());
        }
        booking.setStatus(BookingStatus.FAILED);
        refundService.processRefund(booking);
    }

    @Override
    public Booking getBookingByCustomer(Customer customer) {
        return null;
    }

    @Override
    public Booking getBookingById(int id) {
        return null;
    }

    private BaseBookingCharge calculateChargeDecorator() {
        /*
         * Used decorator pattern.
         */
        BaseBookingCharge baseBookingCharge = new BaseBookingChargeImpl();
        baseBookingCharge = new SeatTypeCharge(baseBookingCharge,seatService);
        baseBookingCharge = new ShowTypeCharge(baseBookingCharge);
        return baseBookingCharge;
    }


    public static class BookingSeatComparator implements Comparator<Seat>{

        @Override
        public int compare(Seat o1, Seat o2) {
            return Integer.compare(o1.getId(),o2.getId());
        }
    }

}
