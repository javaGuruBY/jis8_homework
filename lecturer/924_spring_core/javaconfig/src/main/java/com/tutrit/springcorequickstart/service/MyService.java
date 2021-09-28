package com.tutrit.springcorequickstart.service;

import com.tutrit.springcorequickstart.bean.Developer;
import com.tutrit.springcorequickstart.bean.Project;
import com.tutrit.springcorequickstart.util.MyUtilita;
import org.springframework.stereotype.Component;

@Component
public class MyService {
  private final Project project;

  public MyService(Project project) {
    this.project = project;
  }

  public void run() {
    System.out.println("project.getJUNIOR() = " + project.getJUNIOR().getName());
  }
}
