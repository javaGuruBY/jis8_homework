package github.kaydunovdenis.service.validator.impls;

import github.kaydunovdenis.bean.product.Product;
import github.kaydunovdenis.service.validator.ProductValidationException;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.math.BigDecimal;

import static github.kaydunovdenis.bean.product.ProductConstants.MIN_PRICE_FOR_DISCOUNT_AVAILABLE;
import static github.kaydunovdenis.bean.product.TestProductProvider.getAnotherTestProduct;
import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class DiscountValidatorTest {
    private DiscountValidator discountValidator;
    private Product product;

    @BeforeEach
    @Before
    public void setUp() {
        discountValidator = new DiscountValidator();
        product = getAnotherTestProduct();
    }

    @Test
    public void testNegativeForCheckAvailableMethod() {
        product.setPrice(new BigDecimal(MIN_PRICE_FOR_DISCOUNT_AVAILABLE - 1));
        assertThrows(ProductValidationException.class,
                () -> discountValidator.validate(product));
    }

    @Test
    public void testPositiveForCheckAvailableMethod() {
        product.setPrice(new BigDecimal(MIN_PRICE_FOR_DISCOUNT_AVAILABLE));
        discountValidator.validate(product);
        assertTrue(true);
    }


    @ParameterizedTest
    @ValueSource(strings = {"0.0", "11.32", "100"})
    void testPositive(String arg) {
        product.setDiscount(new BigDecimal(arg));
        discountValidator.validate(product);
    }


    @ParameterizedTest()
    @ValueSource(strings = {"-12.3", "111.32"})
    void testNegative(String arg) {
        product.setDiscount(new BigDecimal(arg));
        assertThrows(ProductValidationException.class,
                () -> discountValidator.validate(product));
    }
}
