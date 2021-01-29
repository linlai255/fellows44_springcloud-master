package com.weichuang.ticket.service;

import org.springframework.stereotype.Service;

@Service
public class TicketServiceImpl implements TicketService{


    public String getTicket(){
        System.out.println("端口号8082");
        return "《西虹市首富》";
    }
}
