package com.github.kaydunovdenis.myThirdWeb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.time.Instant;

@Controller
public class MyController {

    @GetMapping("/home")
    public ModelAndView openHome() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("home");
        modelAndView.addObject("time", Instant.now());
        return modelAndView;
    }
}
