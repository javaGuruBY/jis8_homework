package com.tutrit.java.quickstart.decorator.step2.bean;

public class Milk extends CondimentDecorator {
  Beverage beverage;

  public Milk(Beverage beverage) {
    this.beverage = beverage;
  }
  @Override
  public double getCost() {
    return beverage.getCost() + 0.15;
  }
}
