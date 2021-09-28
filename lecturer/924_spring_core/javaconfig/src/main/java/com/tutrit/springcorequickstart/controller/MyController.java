package com.tutrit.springcorequickstart.controller;

import com.tutrit.springcorequickstart.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class MyController {
  @Autowired
  private MyService myService;
  @Autowired
  private ApplicationContext context;
}
