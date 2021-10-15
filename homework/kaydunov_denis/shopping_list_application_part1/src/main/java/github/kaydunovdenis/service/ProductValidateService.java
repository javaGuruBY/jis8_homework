package github.kaydunovdenis.service;

import java.math.BigDecimal;

public class ProductValidateService {
    private static final Double ZERO = 0.0;
    private static final Double MAX_DISCOUNT = 100.0;
    private static final int MIN_LENGTH_NAME = 3;
    private static final int MAX_LENGTH_NAME = 32;

    public boolean validatePrice(BigDecimal price) {
        return price.doubleValue() > ZERO;
    }

    public boolean validateDiscount(BigDecimal discount) {
        return discount.doubleValue() >= ZERO
                && discount.doubleValue() <= MAX_DISCOUNT;
    }

    public boolean validateProductName(String productName) {
        int lengthName = productName.length();
        return lengthName >= MIN_LENGTH_NAME
                && lengthName <= MAX_LENGTH_NAME;
    }
}
