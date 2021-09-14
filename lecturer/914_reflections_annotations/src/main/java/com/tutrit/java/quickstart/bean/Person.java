package com.tutrit.java.quickstart.bean;

import java.util.concurrent.ThreadLocalRandom;

public class Person {

  String name;
  int age;
  private int secret;
  {
    this.secret = ThreadLocalRandom.current().nextInt(1, 10);
  }

  public Person() {
  }

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public void setData(String name) {
    this.name = name;
  }

  public void setData(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  private int getSecret() {
    return this.secret;
  }

  private void setSecret(int secret) {
    this.secret = secret;
  }
}
