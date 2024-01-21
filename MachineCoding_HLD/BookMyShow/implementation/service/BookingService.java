package MachineCoding_HLD.BookMyShow.implementation.service;
import MachineCoding_HLD.BookMyShow.implementation.model.Booking;
import MachineCoding_HLD.BookMyShow.implementation.model.Show;
import MachineCoding_HLD.BookMyShow.implementation.model.dto.BookingRequestDto;
import MachineCoding_HLD.BookMyShow.implementation.model.user.Customer;
import MachineCoding_HLD.BookMyShow.implementation.service.bookingChargeDecorator.BaseBookingCharge;

public interface BookingService {
    Booking create(BookingRequestDto bookingRequestDto); // seat booking one by one.

    Booking edit(BookingRequestDto bookingRequestDto);// edit booking.

    void cancel(Booking booking);// process refund.

    Booking getBookingByCustomer(Customer customer);

    Booking getBookingById(int id);

    BaseBookingCharge calculateChargeDecorator(Show show, int seatNo, int hallNo);
}

/*
pricing based on ticket type & show type.


*/