package com.tutrit.java.quickstart;

import static com.tutrit.java.quickstart.Application.log;

import com.tutrit.java.quickstart.bean.Product;
import com.tutrit.java.quickstart.service.ProductFabric;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.junit.Test;

public class OptionalSyntax {

  @Test
  public void syntax() {
    Optional.empty();
    Optional.of(new Object());
    Optional.ofNullable(new Product("totally random case: maybe or maybe not"));
    Optional.ofNullable(ProductFabric.randomNull());
  }

  @Test
  public void defaultObject() {
    Optional<Product> productOptional = Optional.ofNullable(ProductFabric.randomNull());
    //old style
    if (productOptional.isPresent()) {
      log.info(productOptional.get().name);
    } else {
      log.info("not present");
    }
    //new style
    Optional.ofNullable(ProductFabric.randomNull()).ifPresent(
        product -> log.info(product.name));
    //new style
    Optional.ofNullable(ProductFabric.randomNull()).ifPresentOrElse(
        product -> log.info(product.name),
        () -> log.info("not present"));

    Product product = Optional.ofNullable(ProductFabric.randomNull())
        .orElseGet(() -> new Product("default"));
    log.info(product.name);

    Product product2 = Optional.ofNullable(ProductFabric.randomNull())
        .orElse(new Product("default"));
    log.info(product2.name);

    Product productEx = Optional.ofNullable(ProductFabric.randomNull())
        .orElseThrow();
    log.info(productEx.name);

    Product productEx2 = Optional.ofNullable(ProductFabric.randomNull())
        .orElseThrow(() -> new RuntimeException("[ok] my custom exception") );
    log.info(productEx2.name);
  }

  @Test
  public void mapping() {
    String name = ProductFabric.getProduct()
        .map(product -> product.name)
        .orElseGet(() -> "default Name");
    log.info(name);

    List<Product> availableBonuses = Optional.ofNullable(ProductFabric.randomNull())
        .stream()
        .flatMap(product -> product.bonusProducts.stream())
        .filter(bonus -> bonus.name.length() < 5)
        .collect(Collectors.toList());

    log.info("{}", availableBonuses);
  }
}
