package github.kaydunovdenis.service.validator.impls;

import github.kaydunovdenis.bean.product.Product;
import github.kaydunovdenis.bean.product.TestProductProvider;
import github.kaydunovdenis.service.validator.ProductValidationException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.math.BigDecimal;

import static github.kaydunovdenis.bean.product.ProductConstants.MIN_PRICE_FOR_DISCOUNT_AVAILABLE;

class DiscountValidatorTest {
    private DiscountValidator discountValidator;
    private Product product;

    @BeforeEach
    @Before
    public void setUp() {
        discountValidator = new DiscountValidator();
        product = new TestProductProvider().getTestProduct();
    }

    @Test()
    public void testNegativeForCheckAvailableMethod() {
        product.setPrice(new BigDecimal(MIN_PRICE_FOR_DISCOUNT_AVAILABLE - 1));
        Assert.assertThrows(ProductValidationException.class,
                () -> discountValidator.validate(product));
    }

    @ParameterizedTest()
    @ValueSource(strings = {"0.0", "11.32", "100"})
    void testPositive(String arg) {
        product.setDiscount(new BigDecimal(arg));
        discountValidator.validate(product);
    }


    @ParameterizedTest()
    @ValueSource(strings = {"-12.3", "111.32"})
    void testNegative(String arg) {
        product.setDiscount(new BigDecimal(arg));
        Assert.assertThrows(ProductValidationException.class,
                () -> discountValidator.validate(product));
    }
}
