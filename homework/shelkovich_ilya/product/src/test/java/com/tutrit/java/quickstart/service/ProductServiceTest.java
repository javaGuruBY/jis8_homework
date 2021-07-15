package com.tutrit.java.quickstart.service;

import com.tutrit.java.quickstart.bean.Product;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ProductServiceTest {

    Product product;
    ProductService productService;

    @Before
    public void setUp() {
        this.product = new Product("water");
        this.productService = new ProductService();
    }

    @Test
    public void actualPrice() {
        double regularPrice = 10;
        double discount = 40;
        double expected = 6;
        double actual = productService.actualPrice(regularPrice, discount);
        Assert.assertEquals(expected, actual, 0.0);
    }
}
