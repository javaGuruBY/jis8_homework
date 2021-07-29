package com.tutrit.java.quickstart.homework.shop;

import java.math.BigDecimal;

public class ProductRepository {
    Product milk = new Product("Milk", BigDecimal.valueOf(15.89));
    Product water = new Product("water", BigDecimal.valueOf(1.01));
    Product bread = new Product("bread", BigDecimal.valueOf(0.19));
    Product meal = new Product("meal", BigDecimal.valueOf(2.19));
    Product cola = new Product("cola", BigDecimal.valueOf(4.59));
    Product pepsi = new Product("pepsi", BigDecimal.valueOf(1.99));
}
