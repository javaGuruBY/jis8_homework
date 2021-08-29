package github.kaydunovdenis.service;

import github.kaydunovdenis.bean.Product;
import github.kaydunovdenis.bean.ShoppingCart;

import java.math.BigDecimal;

public class ShoppingCartService {

    public ShoppingCartService() {
    }

    public void addProduct(final ShoppingCart shoppingCart, final Product product) {
        shoppingCart.getProductList().add(product);
    }

    public BigDecimal calculateTotalPrice(final ShoppingCart shoppingCart) {
        ProductService productService = new ProductService();
        BigDecimal totalPrice = new BigDecimal("0.00");
        for (Product product : shoppingCart.getProductList()) {
            BigDecimal productPrice = productService.getPriceWithDiscount(product);
            totalPrice = totalPrice.add(productPrice);
        }
        return totalPrice;
    }
}
