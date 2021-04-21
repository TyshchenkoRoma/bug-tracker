package com.example.demo.api;

import com.example.demo.entity.Ticket;
import com.example.demo.services.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ticket")
public class TicketController {

    @Autowired
    TicketService ticketService;

    @GetMapping("/{id}")
    public Ticket getById(@PathVariable int id) {

        return ticketService.getById(id);
    }

    @GetMapping()
    public List<Ticket> getAllTickets() {

        return ticketService.getAllTickets();
    }

    @PostMapping
    public void create(@RequestBody Ticket ticket) {
        ticketService.create(ticket);
    }

    @DeleteMapping("/{id}")
    public void delete (@PathVariable int id) {
        ticketService.delete(id);
    }
}
