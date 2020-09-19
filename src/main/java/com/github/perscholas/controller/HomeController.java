package com.github.perscholas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
//Test
@Controller
@RequestMapping("/OnlineShopping")
public class HomeController {
    @GetMapping
    String getView(Model model) {
        model.addAttribute("message", "Some Message");
        return "welcome";
    }
}