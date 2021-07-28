package com.tutrit.java.quickstart.homework.productClass;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ProductService {
    Logger log = LoggerFactory.getLogger("ProductService");

    double actualPrice(double regularPrice, double discount) {
        return regularPrice * ((100 - discount) / 100);
    }

    public void printInformation(Product product) {
        log.info("Product name: {}, regular price: {} EUR, discount: {}%, actual price: {} EUR",
                product.getName(), product.getRegularPrice(), product.getDiscount(),
                actualPrice(product.getRegularPrice(), product.getDiscount()));
    }
}
