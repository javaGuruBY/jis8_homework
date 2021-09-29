package com.tutrit.java.quickstart;

import com.tutrit.java.quickstart.bean.Product;
import com.tutrit.java.quickstart.service.ProductFabric;
import com.tutrit.java.quickstart.util.MyOptional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Application {

  public static Logger log = LoggerFactory.getLogger(Application.class);

  public static void main(String[] args) {
    String name = MyOptional.ofNullable(ProductFabric.getProduct()).getOrElseGet(Product::new).name;
    log.info("name is {}", name);
  }
}
