package com.tutrit.java.quickstart.bean;

import java.util.List;

public class Product {
  public String name;
  public List<Product> bonusProducts;

  public Product() {
  }

  public Product(String name) {
    this.name = name;
  }

  public Product(String name, List<Product> bonusProducts) {
    this.name = name;
    this.bonusProducts = bonusProducts;
  }

  @Override
  public String toString() {
    return "Product{" +
        "name='" + name + '\'' +
        ", bonusProducts=" + bonusProducts +
        '}';
  }
}
