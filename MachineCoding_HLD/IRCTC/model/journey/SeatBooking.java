package MachineCoding_HLD.IRCTC.model.journey;



// in that train only 50 seats are present but can be empty or non empty for some stations.

import MachineCoding_HLD.IRCTC.enums.SeatBookingStatus;
import MachineCoding_HLD.IRCTC.model.transport.Seat;
import MachineCoding_HLD.StockTrading.implementation.model.User;

public class SeatBooking {
    private int seatBookingId;
    private User bookedBy;// user booked.
    private Seat seat;// seatNumber
    private TrainJourneyRoute source;// chandigarh   distanceFromOrigin
    private TrainJourneyRoute destination; // panipath.    - distanceFromOrigin.
    private SeatBookingStatus status;
    private long createdAt;
}



/*
assign seats randomly

....seat1
phillaur to chandigarh  seat1

select * from seatBooking where
(source<=c & des>c) || (source >=c && source<p);
&& seat = s;
    c - p



panipath to gurgoan.    seat1


select * from seats where category = general && sb.source.distanceFromSource<chandigarh &&
inner join seat booking s on sb.seatid = s.seatid


 */



// seat1. no bro. we need to assign random.