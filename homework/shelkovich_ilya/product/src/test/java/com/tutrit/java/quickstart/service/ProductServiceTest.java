package com.tutrit.java.quickstart.service;

import com.tutrit.java.quickstart.bean.Product;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ProductServiceTest {

    ProductService productService;

    @Before
    public void setUp() {
        this.productService = new ProductService();
    }

    @Test
    public void actualPrice() {
        Product product = new Product("water");
        product.setRegularPrice(10);
        product.setDiscount(40);
        double expected = 6;
        double actual = productService.actualPrice(product);
        Assert.assertEquals(expected, actual, 0.0);
    }
}
