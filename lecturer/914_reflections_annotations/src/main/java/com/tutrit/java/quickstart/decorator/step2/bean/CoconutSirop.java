package com.tutrit.java.quickstart.decorator.step2.bean;

public class CoconutSirop extends CondimentDecorator {
  Beverage beverage;

  public CoconutSirop(Beverage beverage) {
    this.beverage = beverage;
  }
  @Override
  public double getCost() {
    return beverage.getCost() + 0.50;
  }
}
