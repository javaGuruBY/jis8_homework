package com.tutrit.java.quickstart.homework.shop;

import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;

public class ShopTest {
    ProductRepository bank;

    Shop myTestShop = new Shop();
    Logger log = LoggerFactory.getLogger("Test ");

    @Before
    public void setUp() {
        this.bank = new ProductRepository();
        myTestShop.addProduct(bank.milk);
        myTestShop.addProduct(bank.water);
        myTestShop.addProduct(bank.bread);
        myTestShop.addProduct(bank.cola);
        myTestShop.addProduct(bank.meal);

    }

    @Test
    public void addProduct() {
        myTestShop.addProduct(bank.pepsi);
        log.info("Product in shop : {}", myTestShop);
    }

    @Test
    public void deleteProduct() {
        myTestShop.deleteProduct(bank.water);
        log.info("Product  : {}", myTestShop);
    }

    @Test
    public void searchProductOfName() {
        myTestShop.searchProductOfName("bread");
    }

    @Test
    public void findProduct() {
        myTestShop.findProduct(BigDecimal.valueOf(2), BigDecimal.valueOf(16));

    }
}