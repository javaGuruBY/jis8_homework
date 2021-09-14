package com.tutrit.java.quickstart.decorator.step1.bean;

public class Cappuccino extends Beverage {
  @Override
  public double getCost() {
    return coffee.length() + milk.length();
  }
}
