package com.example.myfirstweb.controller;

import java.time.Instant;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyHomeController {

  @GetMapping("/home")
  public ModelAndView openHome(HttpServletRequest req, HttpServletResponse resp) {
    ModelAndView modelAndView = new ModelAndView();
    System.out.println(req.getHeaderNames());
    modelAndView.setViewName("home");
    modelAndView.addObject("time", Instant.now());
    return modelAndView;
  }
}
