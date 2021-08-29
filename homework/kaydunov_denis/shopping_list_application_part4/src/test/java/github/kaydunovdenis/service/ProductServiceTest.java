package github.kaydunovdenis.service;

import github.kaydunovdenis.bean.Product;
import github.kaydunovdenis.bean.ProductConstants;
import github.kaydunovdenis.bean.ProductTest;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class ProductServiceTest {

    @Test
    public void getPriceWithDiscount() {
        ProductService productService = new ProductService();
        Product product = ProductTest.getDefaultProduct();
        product.setPrice(new BigDecimal("100"));
        product.setDiscount(new BigDecimal("20"));
        BigDecimal actual = productService.getPriceWithDiscount(product);
        Assert.assertEquals(new BigDecimal("80.00"), actual);
    }
}