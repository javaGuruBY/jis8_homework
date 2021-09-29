package com.tutrit.java.quickstart.util;

import com.tutrit.java.quickstart.bean.Product;
import java.util.function.Supplier;

public class MyOptional<T> {

  T product;

  private MyOptional(T product) {
    this.product = product;
  }

  public boolean isPresent() {
    return product != null;
  }

  public T get() {
    return product;
  }

  public <T extends Product> T getOrElse(T elseProduct) {
    return this.product != null ? (T) this.product : elseProduct;
  }

  public <T extends Product> T getOrElseGet(Supplier<T> elseGetProduct) {
    return this.product != null ? (T) this.product : elseGetProduct.get();
  }

  public static <T> MyOptional ofNullable(T product) {
    return new MyOptional(product);
  }
}
