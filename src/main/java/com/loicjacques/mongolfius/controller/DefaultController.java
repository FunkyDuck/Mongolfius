package com.loicjacques.mongolfius.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DefaultController {
    @GetMapping("")
    public String displayIndex(){
        return "index";
    }

    @GetMapping("login")
    public String displayLogin() { return "login"; }

    @GetMapping("register")
    public String displayRegister() { return "register"; }
}
