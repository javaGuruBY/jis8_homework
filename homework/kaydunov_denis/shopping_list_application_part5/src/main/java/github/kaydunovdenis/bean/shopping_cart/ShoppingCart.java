package github.kaydunovdenis.bean.shopping_cart;

import github.kaydunovdenis.bean.Entity;
import github.kaydunovdenis.bean.product.Product;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Data
public class ShoppingCart implements Entity {
    private String name;
    private List<Product> productList;

    public ShoppingCart() {
        this.productList = new ArrayList<>();
    }

    public ShoppingCart(String name) {
        this.name = name;
        this.productList = new ArrayList<>();
    }

    public ShoppingCart(String name, List<Product> productList) {
        this.name = name;
        this.productList = productList;
    }
}
