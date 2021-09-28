package com.tutrit.springcorequickstart.bean;

public class Project {
  private String name;
  private Developer JUNIOR;

  public Project(String name, Developer JUNIOR) {
    this.name = name;
    this.JUNIOR = JUNIOR;
  }

  public Project(Developer JUNIOR) {
    this.JUNIOR = JUNIOR;
  }

  public Project() {
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Developer getJUNIOR() {
    return JUNIOR;
  }

  public void setJUNIOR(Developer JUNIOR) {
    this.JUNIOR = JUNIOR;
  }

  @Override
  public String toString() {
    return "Project{" +
        "name='" + name + '\'' +
        ", teamLead=" + JUNIOR +
        '}';
  }
}
