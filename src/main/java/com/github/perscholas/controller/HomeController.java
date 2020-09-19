package com.github.perscholas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
//Test
@Controller

public class HomeController {
    @RequestMapping("/OnlineShopping")
    public String welcome(){
        return "welcome";
    }
}