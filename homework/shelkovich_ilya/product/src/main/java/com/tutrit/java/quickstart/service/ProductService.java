package com.tutrit.java.quickstart.service;

import com.tutrit.java.quickstart.bean.Product;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ProductService {

    Logger log = LoggerFactory.getLogger("ProductService");

    public double actualPrice(double regularPrice, double discount) {
        return regularPrice - (regularPrice * discount / 100);
    }

    public void printInformation(Product product) {
        log.info("Product name: {}, regular price: {}, discount: {}%, actual price: {}",
                product.getName(), product.getRegularPrice(), product.getDiscount(),
                actualPrice(product.getRegularPrice(), product.getDiscount()));
    }
}
