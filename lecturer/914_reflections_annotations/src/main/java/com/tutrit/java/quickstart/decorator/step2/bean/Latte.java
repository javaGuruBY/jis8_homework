package com.tutrit.java.quickstart.decorator.step2.bean;

public class Latte extends Beverage {
  public Latte() {
    description = "Latte";
  }
  @Override
  public double getCost() {
    return 9.0;
  }
}
