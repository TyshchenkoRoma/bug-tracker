package com.example.demo.api;

import com.example.demo.repository.AbstractRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TicketController {

    @Autowired
    AbstractRespository abstractRespository;
}
