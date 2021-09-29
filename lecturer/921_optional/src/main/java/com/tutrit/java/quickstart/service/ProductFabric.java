package com.tutrit.java.quickstart.service;

import com.tutrit.java.quickstart.bean.Product;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.ThreadLocalRandom;

public class ProductFabric {

  public static Optional<Product> getProduct() {
    if(ThreadLocalRandom.current().nextBoolean()) {
      return Optional.of(new Product("Macbook Pro"));
    }
    return Optional.empty();
  }

  public static Product emptyObject() {
    if(ThreadLocalRandom.current().nextBoolean()) {
      return new Product("Macbook Pro");
    }
    return new Product();
  }

  public static Product randomNull() {
    if(ThreadLocalRandom.current().nextBoolean()) {
      return new Product("Macbook Pro", List.of(
          new Product("mouse"),
          new Product("box"),
          new Product("airpods")
      ));
    }
    return null;
  }


  public static List<Product> emptyObjectList() {
    if(ThreadLocalRandom.current().nextBoolean()) {
      return List.of(new Product("Macbook Pro"));
    }
    return Collections.EMPTY_LIST;
  }
}
