package github.kaydunovdenis.service;

import github.kaydunovdenis.bean.product.Product;
import github.kaydunovdenis.bean.shopping_cart.ShoppingCart;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
@Data
public class ShoppingCartService {
    private final ProductService productService;

    @Autowired
    public ShoppingCartService(ProductService productService) {
        this.productService = productService;
    }


    public void addProduct(final ShoppingCart shoppingCart, final Product product) {
        shoppingCart.getProductList().add(product);
    }

    public BigDecimal calculateTotalPrice(final ShoppingCart shoppingCart) {
        var totalPrice = new BigDecimal("0.00");
        for (var product : shoppingCart.getProductList()) {
            var productPrice = productService.getPriceWithDiscount(product);
            totalPrice = totalPrice.add(productPrice);
        }
        return totalPrice;
    }


}
