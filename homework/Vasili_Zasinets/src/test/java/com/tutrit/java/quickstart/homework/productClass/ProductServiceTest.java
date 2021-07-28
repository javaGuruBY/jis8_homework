package com.tutrit.java.quickstart.homework.productClass;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ProductServiceTest {
    Product product;
    ProductService productService;

    @Before
    public void setUp() {
        this.product = new Product("Cola");
        this.productService = new ProductService();
    }

    @Test
    public void actualPrice() {
        double regularPrice = 100;
        double discount = 27;
        Assert.assertEquals(73, productService.actualPrice(regularPrice, discount), 0.0);
    }
}