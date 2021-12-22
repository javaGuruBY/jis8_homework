package github.kaydunovdenis.service;

import github.kaydunovdenis.bean.product.Product;
import github.kaydunovdenis.bean.shopping_cart.ShoppingCart;
import github.kaydunovdenis.service.validator.ProductValidatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class ShoppingCartService {
    private final ProductService productService;
    private final ProductValidatorService productValidatorService;

    @Autowired
    public ShoppingCartService(ProductService productService, ProductValidatorService productValidatorService) {
        this.productService = productService;
        this.productValidatorService = productValidatorService;
    }

    public void addProduct(final ShoppingCart shoppingCart, final Product product) {
        productValidatorService.validate(product);
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
