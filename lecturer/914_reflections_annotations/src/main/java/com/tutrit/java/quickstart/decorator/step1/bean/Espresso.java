package com.tutrit.java.quickstart.decorator.step1.bean;

public class Espresso extends Beverage {
  @Override
  public double getCost() {
    return coffee.length() + water.length();
  }
}
