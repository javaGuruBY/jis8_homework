package github.kaydunovdenis.service;

import github.kaydunovdenis.bean.Product;
import github.kaydunovdenis.bean.ProductTest;
import github.kaydunovdenis.service.product_validator.ProductNameValidator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProductNameValidatorTest {
    private ProductNameValidator productNameValidator;
    private Product product;

    @Before
    public void setUp() {
        productNameValidator = new ProductNameValidator();
        product = ProductTest.getDefaultProduct();
    }

    @Test
    public void validate() {
        product.setName("2_");
        Assert.assertFalse(productNameValidator.validate(product));

        product.setName("3__");
        Assert.assertTrue(productNameValidator.validate(product));

        product.setName("5____");
        Assert.assertTrue(productNameValidator.validate(product));

        product.setName("Name 32 simbols_________________");
        assertTrue(productNameValidator.validate(product));

        product.setName("Name 33_simbols__________________");
        assertFalse(productNameValidator.validate(product));
    }
}
