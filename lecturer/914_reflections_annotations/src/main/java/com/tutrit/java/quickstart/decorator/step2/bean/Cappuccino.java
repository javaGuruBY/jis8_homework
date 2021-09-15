package com.tutrit.java.quickstart.decorator.step2.bean;

public class Cappuccino extends Beverage {
  public Cappuccino() {
    description = "Capuchino";
  }
  @Override
  public double getCost() {
    return 3.0;
  }
}
