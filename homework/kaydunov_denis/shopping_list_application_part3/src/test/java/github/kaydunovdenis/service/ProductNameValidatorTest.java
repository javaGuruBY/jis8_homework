package github.kaydunovdenis.service;

import github.kaydunovdenis.bean.Product;
import github.kaydunovdenis.service.product_validator.ProductNameValidator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static github.kaydunovdenis.bean.ProductTest.getDefaultProduct;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ProductNameValidatorTest {
    private ProductNameValidator productNameValidator;

    @Before
    public void setUp() {
        productNameValidator = new ProductNameValidator();
    }

    @Test
    public void validatePositiveScenario() {
        Product product = getDefaultProduct();
        product.setName("3__");
        Assert.assertTrue(productNameValidator.validate(product));

        product.setName("5____");
        Assert.assertTrue(productNameValidator.validate(product));

        product.setName("Name 32 simbols_________________");
        assertTrue(productNameValidator.validate(product));
    }

    @Test
    public void validateNegativeScenario() {
        Product product = getDefaultProduct();
        product.setName("2_");
        Assert.assertFalse(productNameValidator.validate(product));

        product.setName("Name 33_symbols__________________");
        assertFalse(productNameValidator.validate(product));
    }
}
