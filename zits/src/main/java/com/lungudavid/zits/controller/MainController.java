package com.lungudavid.zits.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {
    @GetMapping("/login")
    public String showLogin(){
        return "login";
    }

    @PostMapping("/login")
    public String loginToHome(Model model){
        return "index";
    }
    @GetMapping("/about")
    public String showAboutDev(){
        return "about_us";
    }

}
