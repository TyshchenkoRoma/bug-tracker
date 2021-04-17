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

//    Добавить контроллеры для сущности Ticket, которые следуют соглашению REST.
//        Реализовать:
//
//        Добавление нового тикета через контроллер
//        Получить все тикеты в системе через контроллер
//        Получить один тикет по его id в базе
//        Удалить тикет по его id в базе (методом soft delete, то есть нужно установить статус у тикета DELETED, физически не удаляем запись)
//
//        Привести все классы 3-tiered architecure:
//        https://openclassrooms.com/en/courses/5684146-create-web-applications-efficiently-with-the-spring-boot-mvc-framework/6156961-organize-your-application-code-in-three-tier-architecture
//
//        Controller --> Service --> Repository
//        НЕ ИСПОЛЬЗОВАТЬ КЛАССЫ ModelAndView, Model etc. все что относится к Spring MVC.


