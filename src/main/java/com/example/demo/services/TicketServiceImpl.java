package com.example.demo.services;

import com.example.demo.entity.Ticket;
import com.example.demo.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketServiceImpl implements TicketService {

    @Autowired
    TicketRepository ticketRepository;

    @Override
    public Ticket getById(int id) {

        return ticketRepository.getById(id);
    }

    @Override
    public List<Ticket> getAllTickets() {
        return ticketRepository.getAllTickets();
    }

    @Override
    public void create(Ticket ticket) {
        ticketRepository.create(ticket);
    }

    @Override
    public void delete(int id) {
        ticketRepository.remove(id);
    }
}
