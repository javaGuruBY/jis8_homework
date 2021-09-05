package github.kaydunovdenis.service.product_validator;

import github.kaydunovdenis.bean.product.Product;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static github.kaydunovdenis.bean.product.ProductConstants.MIN_PRICE_WITH_DISCOUNT_AVAILABLE;
import static github.kaydunovdenis.bean.product.ProductTest.getDefaultProduct;

public class DiscountValidatorTest {
    private DiscountValidator discountValidator;
    private Product product;

    @Before
    public void setUp() {
        discountValidator = new DiscountValidator();
        product = getDefaultProduct();
    }

    @Test
    public void validate() {
        validatePositiveScenario();
        validateNegativeScenario();
        checkNotAvailableDiscount();
    }

    @Test
    public void isDiscountAvailable() {
        Assert.assertTrue(discountValidator.isDiscountAvailable(product));

        product.setPrice(new BigDecimal(MIN_PRICE_WITH_DISCOUNT_AVAILABLE - 1));
        Assert.assertFalse(discountValidator.isDiscountAvailable(product));
    }

    @Test
    public void checkNotAvailableDiscount() {
        product.setPrice(new BigDecimal(MIN_PRICE_WITH_DISCOUNT_AVAILABLE - 1));
        product.setDiscount(new BigDecimal("11.32"));
        Assert.assertFalse(discountValidator.validate(product));
    }

    @Test
    public void validatePositiveScenario() {
        product.setDiscount(new BigDecimal("0.0"));
        Assert.assertTrue(discountValidator.validate(product));

        product.setDiscount(new BigDecimal("11.32"));
        Assert.assertTrue(discountValidator.validate(product));

        product.setDiscount(new BigDecimal("100.0"));
        Assert.assertTrue(discountValidator.validate(product));
    }

    @Test
    public void validateNegativeScenario() {
        product.setDiscount(new BigDecimal("-12.3"));
        Assert.assertFalse(discountValidator.validate(product));

        product.setDiscount(new BigDecimal("111.32"));
        Assert.assertFalse(discountValidator.validate(product));
    }
}
