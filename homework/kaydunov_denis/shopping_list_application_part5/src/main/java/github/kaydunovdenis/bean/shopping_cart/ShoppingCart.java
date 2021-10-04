package github.kaydunovdenis.bean.shopping_cart;

import github.kaydunovdenis.bean.product.Product;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@Data
public class ShoppingCart {
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

    @PostConstruct
    public void postContract() {
        log.info("Initial shoppingCart.");
    }

    @PreDestroy
    public void preDestroy() {
        log.info("Destroy shoppingCart");
    }
}
