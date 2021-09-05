package github.kaydunovdenis.service;

import github.kaydunovdenis.bean.Product;
import github.kaydunovdenis.bean.ShoppingCart;

import java.math.BigDecimal;

public class ShoppingCartService {
    private ProductService productService;

    public ShoppingCartService() {
        this.productService = new ProductService();
    }

    public void addProduct(final ShoppingCart shoppingCart, final Product product) {
        shoppingCart.getProductList().add(product);
    }

    public BigDecimal calculateTotalPrice(final ShoppingCart shoppingCart) {
        var totalPrice = new BigDecimal("0.00");
        for (Product product : shoppingCart.getProductList()) {
            var productPrice = productService.getPriceWithDiscount(product);
            totalPrice = totalPrice.add(productPrice);
        }
        return totalPrice;
    }
}
