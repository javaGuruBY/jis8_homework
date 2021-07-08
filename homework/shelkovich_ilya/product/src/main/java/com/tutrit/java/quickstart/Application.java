package com.tutrit.java.quickstart;

import com.tutrit.java.quickstart.bean.Product;
import com.tutrit.java.quickstart.service.ProductService;

public class Application {

    public static void main(String[] args) {
        Product product = new Product("water");
        ProductService productService = new ProductService();

        product.setRegularPrice(10);
        product.setDiscount(0.8);

        double actualPrice = productService.actualPrice(product.getRegularPrice(), product.getDiscount());

        productService.printInformation(product, actualPrice);
    }
}

