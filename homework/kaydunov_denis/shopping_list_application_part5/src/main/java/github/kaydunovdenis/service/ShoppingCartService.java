package github.kaydunovdenis.service;

import github.kaydunovdenis.bean.product.Product;
import github.kaydunovdenis.bean.shopping_cart.ShoppingCart;
import github.kaydunovdenis.service.validator.ProductValidator;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
@Data
public class ShoppingCartService {
    private final ProductService productService;
    private final ProductValidator productValidator;

    @Autowired
    public ShoppingCartService(ProductService productService, ProductValidator productValidator) {
        this.productService = productService;
        this.productValidator = productValidator;
    }

    public void addProduct(final ShoppingCart shoppingCart, final Product product) {
        shoppingCart.getProductList().add(product);
    }

    public BigDecimal calculateTotalPriceShoppingCart(final ShoppingCart shoppingCart) {
        var totalPrice = new BigDecimal("0.00");
        for (var product : shoppingCart.getProductList()) {
            var productPrice = productService.getPriceWithDiscount(product);
            totalPrice = totalPrice.add(productPrice);
        }
        return totalPrice;
    }
}
