package MachineCoding_HLD.BookMyShow.implementation.service.impl;

import MachineCoding_HLD.BookMyShow.implementation.data.Repository;
import MachineCoding_HLD.BookMyShow.implementation.model.Seat;
import MachineCoding_HLD.BookMyShow.implementation.model.Ticket;
import MachineCoding_HLD.BookMyShow.implementation.service.SeatService;
import MachineCoding_HLD.BookMyShow.implementation.service.TicketService;

public class TicketServiceImpl implements TicketService {
    public TicketServiceImpl(SeatService seatService){
        this.seatService = seatService;
    }
    SeatService seatService;

    @Override
    public Ticket createTicket(int seatNo, int showSlotId) {
        Seat seat = seatService.getByIdAndHallNo(seatNo,showSlotId);
        Ticket ticket = new Ticket(seatNo,seatNo,seat,"BAR_CODE");
        return ticket;

    }
}
