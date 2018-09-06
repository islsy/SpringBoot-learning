package com.lsy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

public class ControllerDemo {
    @Autowired
    private BookBean bookBean;
    @RequestMapping
    public String book(){
        return "Hello Spring Boot! The  BookName is "+bookBean.getName()+";and Book Author is "+bookBean.getAuthor()+";and The price is "+bookBean.getPrice();
    }
}
