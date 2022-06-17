package com.loicjacques.mongolfius.controller;

import com.loicjacques.mongolfius.models.entity.UserGeneric;
import com.loicjacques.mongolfius.service.UserGenericService;
import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
    private final UserGenericService service;

    public UserController(UserGenericService service){ this.service = service; }

    @GetMapping("/connected")
    public String getUser(Authentication authentication, Model model){
        System.out.println("bouh");
        UserGeneric usx = (UserGeneric) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        System.out.println(usx.getUsername());
        System.out.println(usx);

        System.out.println("***** PRINCIPAL *****");
        System.out.println(SecurityContextHolder.getContext().getAuthentication().getPrincipal());
        System.out.println("***** CREDENTIALS *****");
        System.out.println(SecurityContextHolder.getContext().getAuthentication().getCredentials());
        System.out.println("***** AUTHORITIES *****");
        System.out.println(SecurityContextHolder.getContext().getAuthentication().getAuthorities());
        System.out.println("***** DETAILS *****");
        System.out.println(SecurityContextHolder.getContext().getAuthentication().getDetails());

        // getAUthorities()
        // getDetails()

        model.addAttribute("auth",usx);
        return "user/index";
    }

}
