package com.weichuang.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UserController {
    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/buyTicket")
    public String buyTicket(String name){
        System.out.println("buyTicket is called!!!");
        return name + "购买了" + restTemplate.getForObject("http://PROVIDER-TICKET/getTicket",String.class);
    }
}
