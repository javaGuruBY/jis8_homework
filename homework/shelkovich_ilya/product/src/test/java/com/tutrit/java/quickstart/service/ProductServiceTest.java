package com.tutrit.java.quickstart.service;

import com.tutrit.java.quickstart.bean.Product;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ProductServiceTest {

    Product product;
    ProductService productService;
    double regularPrice;
    double discount;

    @Before
    public void setUp() {
        this.product = new Product("test");
        this.productService = new ProductService();
        this.regularPrice = 10;
        this.discount = 0.4;
    }

    @Test
    public void actualPrice() {
        double expected = 4;
        double actual = productService.actualPrice(regularPrice, discount);
        double delta = 0;
        Assert.assertEquals(expected, actual, delta);
    }
}
