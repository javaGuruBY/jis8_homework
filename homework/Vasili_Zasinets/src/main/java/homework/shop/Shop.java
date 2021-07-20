package homework.shop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;
import java.util.LinkedHashMap;

public class Shop {
    Logger log = LoggerFactory.getLogger(" ");
    LinkedHashMap<String, BigDecimal> myShop = new LinkedHashMap<>();
    Product myProduct;

    @Override
    public String toString() {
        return " " +
                "shop =" + myShop +
                '}';
    }

    void addProduct(String name, BigDecimal price) {
        myShop.put(name, price);

    }

    void deleteProduct(String name) {
        myShop.remove(name);
    }

    void shProduct(String name) {
        log.info("Product: {}", name + ", price: " + myShop.get(name));
    }

    void findProduct(BigDecimal minPriceRange, BigDecimal maxPriceRange) {

        // in progress

    }
}


