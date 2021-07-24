package com.tutrit.java.quickstart.homework.shop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.Map;

public class Shop {
    Logger log = LoggerFactory.getLogger("Shop ");
    Map<String, BigDecimal> myShop = new LinkedHashMap<>();
    Product myProduct;
    ProductRepository bank;

    void addProduct(Product product) {
        myShop.put(product.getName(), product.getPrice());

    }

    void deleteProduct(Product product) {
        myShop.remove(product.getName());
    }

    void searchProductOfName(String name) {
        log.info("Product: {}, price{}", name, myShop.get(name));
    }


    void findProduct(BigDecimal minPriceRange, BigDecimal maxPriceRange) {
        for (Map.Entry<String, BigDecimal> entry : myShop.entrySet()) {
            String k = entry.getKey();
            BigDecimal v = entry.getValue();
            if (v.compareTo(maxPriceRange) <= 0 && v.compareTo(minPriceRange) >= 0) {
                log.info("Product : {}, price {}", k ,myShop.get(k));

            }
        }
    }

    @Override
    public String toString() {
        return " " +
                "shop =" + myShop +
                '}';
    }
}

