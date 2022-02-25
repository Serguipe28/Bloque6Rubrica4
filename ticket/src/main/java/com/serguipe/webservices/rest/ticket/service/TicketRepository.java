package com.serguipe.webservices.rest.ticket.service;

import com.serguipe.webservices.rest.ticket.domain.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, Long>{
}
