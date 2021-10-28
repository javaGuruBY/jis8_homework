package com.example.mysecondweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.time.Instant;

@Controller
public class MyHomeController {

    @GetMapping("/home")
    public ModelAndView openHome(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView modelAndView = new ModelAndView();
        System.out.println(request.getHeaderNames());
        modelAndView.setViewName("home");
        modelAndView.addObject("time", Instant.now());
        return modelAndView;
    }
}
