package homework.shop;

import java.math.BigDecimal;

public class Product {

    final String name;
    final BigDecimal price;

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public Product(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }
}
