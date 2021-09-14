package com.tutrit.java.quickstart.decorator.step2.bean;

public class Sugar extends CondimentDecorator {
  Beverage beverage;

  public Sugar(Beverage beverage) {
    this.beverage = beverage;
  }
  @Override
  public double getCost() {
    return beverage.getCost() + 0.10;
  }
}
