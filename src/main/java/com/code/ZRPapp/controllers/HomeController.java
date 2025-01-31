package com.code.ZRPapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @GetMapping("/")
    public ModelAndView home() {
        ModelAndView mv = new ModelAndView("index");
        return mv;
    }
    @GetMapping("/login")
    public ModelAndView login(){
        ModelAndView mv = new ModelAndView("login");
        return mv;
    }
}
