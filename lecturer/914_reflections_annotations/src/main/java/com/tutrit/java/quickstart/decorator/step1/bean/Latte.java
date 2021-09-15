package com.tutrit.java.quickstart.decorator.step1.bean;

public class Latte extends Beverage {
  @Override
  public double getCost() {
    return coffee.length() + water.length() + milk.length();
  }
}
