package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@lombok.Data
@Entity
@Table(name = "ticket")
public class Ticket {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "assignee")
    private String assignee;

    @Column(name = "reporter")
    private String reporter;

    @Column(name = "status")
    private String status;

    @Column(name = "priority")
    private String priority;

    @Column(name = "spent")
    private Double spent;

    @Column(name = "estimated")
    private Double estimated;

    @Column(name = "creat_on")
    private Date creatOn;

    @Enumerated(EnumType.STRING)
    @Column(name = "ticket_type")
    TicketType ticketType;
}