package com.tutrit.java.quickstart.decorator.step2.bean;

public class Mokochino extends Beverage {
  public Mokochino() {
    description = "Mokochino";
  }
  @Override
  public double getCost() {
    return 5.0;
  }
}
