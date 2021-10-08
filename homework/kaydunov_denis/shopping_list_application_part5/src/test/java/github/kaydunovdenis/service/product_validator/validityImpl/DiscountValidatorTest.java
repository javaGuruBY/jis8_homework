package github.kaydunovdenis.service.product_validator.validityImpl;

import github.kaydunovdenis.bean.product.Product;
import github.kaydunovdenis.service.product_validator.ProductValidationException;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static github.kaydunovdenis.bean.product.ProductConstants.MIN_PRICE_WITH_DISCOUNT_AVAILABLE;
import static github.kaydunovdenis.bean.product.ProductTest.getTestProduct;

public class DiscountValidatorTest {
    private DiscountValidator discountValidator;
    private Product product;

    @Before
    public void setUp() {
        discountValidator = new DiscountValidator();
        product = getTestProduct();
    }

    @Test(expected = ProductValidationException.class)
    public void validateNotAvailableDiscount() {
        product.setPrice(new BigDecimal(MIN_PRICE_WITH_DISCOUNT_AVAILABLE - 1));
        product.setDiscount(new BigDecimal("11.32"));
        discountValidator.validate(product);
    }

    @Test
    public void validatePositiveChekDiscountEqualMin() {
        product.setDiscount(new BigDecimal("0.0"));
        discountValidator.validate(product);
    }

    @Test
    public void validatePositiveChekIncludedValue() {
        product.setDiscount(new BigDecimal("11.32"));
        discountValidator.validate(product);
    }

    @Test
    public void validatePositiveCheckDiscountEqualMax() {
        product.setDiscount(new BigDecimal("100.0"));
        discountValidator.validate(product);
    }

    @Test(expected = ProductValidationException.class)
    public void validateNegativeLessThenMin() {
        product.setDiscount(new BigDecimal("-12.3"));
        discountValidator.validate(product);
    }

    @Test(expected = ProductValidationException.class)
    public void validateNegativeDiscountMoreThenMax() {
        product.setDiscount(new BigDecimal("111.32"));
        discountValidator.validate(product);
    }
}
