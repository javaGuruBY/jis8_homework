package com.tutrit.java.quickstart.decorator.step2.bean;

public class Water extends CondimentDecorator {
  Beverage beverage;

  public Water(Beverage beverage) {
    this.beverage = beverage;
  }
  @Override
  public double getCost() {
    return beverage.getCost() + 0.01;
  }
}
