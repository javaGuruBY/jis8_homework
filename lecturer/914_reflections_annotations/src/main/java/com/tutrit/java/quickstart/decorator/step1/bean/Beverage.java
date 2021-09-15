package com.tutrit.java.quickstart.decorator.step1.bean;

public abstract class Beverage {

  public String name;
  public String description;
  public String soy;
  public String mocha;
  public String cacao;
  public String sugar;
  public String milk;
  public String coffee;
  public String water;

  public abstract double getCost();
}
