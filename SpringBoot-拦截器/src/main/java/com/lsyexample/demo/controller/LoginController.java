package com.lsyexample.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/user")
public class LoginController {

    @RequestMapping(value="/login")
    public String login(String username,String userpwd)
    {
        return "登录成功";
    }
}
