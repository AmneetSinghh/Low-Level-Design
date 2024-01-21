package MachineCoding_HLD.BookMyShow.implementation.service;

import MachineCoding_HLD.BookMyShow.implementation.model.Ticket;

public interface TicketService {
    Ticket createTicket(int seatNo, int hallNo);
}
