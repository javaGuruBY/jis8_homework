package github.kaydunovdenis.service.validator.impls;

import github.kaydunovdenis.bean.product.Product;
import github.kaydunovdenis.service.validator.ProductValidationException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.math.BigDecimal;

import static github.kaydunovdenis.bean.product.TestProductProvider.getTestProduct;
import static org.junit.Assert.*;

class PriceValidatorTest {
    private PriceValidator priceValidator;
    private Product product;

    @BeforeEach
    @Before
    public void setUp() {
        priceValidator = new PriceValidator();
        product = getTestProduct();
    }

    @Test
    public void testPositive() {
        product.setPrice(new BigDecimal("10.032"));
        priceValidator.validate(product);
    }

    @ParameterizedTest
    @ValueSource(strings = {"-12.3", "0"})
    void testNegative(String arg) {
        product.setPrice(new BigDecimal(arg));
        assertThrows(ProductValidationException.class,
                () -> priceValidator.validate(product));
    }
}
