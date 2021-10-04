package github.kaydunovdenis.bean.shopping_cart;

import github.kaydunovdenis.bean.product.Product;
import lombok.extern.slf4j.Slf4j;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Slf4j
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ShoppingCart that = (ShoppingCart) o;

        if (!Objects.equals(name, that.name)) return false;
        return Objects.equals(productList, that.productList);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (productList != null ? productList.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "name='" + name + '\'' +
                ", productList=" + productList +
                '}';
    }
}
