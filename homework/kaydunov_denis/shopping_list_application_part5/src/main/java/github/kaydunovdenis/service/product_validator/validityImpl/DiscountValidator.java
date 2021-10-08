package github.kaydunovdenis.service.product_validator.validityImpl;

import github.kaydunovdenis.bean.product.Product;
import github.kaydunovdenis.bean.product.ProductConstants;
import github.kaydunovdenis.service.product_validator.ProductValidationException;
import github.kaydunovdenis.service.product_validator.Validity;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Component;

@Component
public class DiscountValidator implements Validity {
    @Override
    public void validate(final Product product) throws ProductValidationException {
        checkAvailable(product);
        checkMin(product);
        checkMax(product);
    }

    private void checkMax(final @NotNull Product product) {
        if (product.getDiscount().doubleValue() > ProductConstants.MAX_DISCOUNT)
            throw new ProductValidationException("Discount can't be more than " + ProductConstants.MAX_DISCOUNT);
    }

    private void checkMin(final @NotNull Product product) {
        if (product.getDiscount().doubleValue() < ProductConstants.MIN_DISCOUNT)
            throw new ProductValidationException("Discount can't be less than " + ProductConstants.MIN_DISCOUNT);
    }

    private void checkAvailable(final @NotNull Product product) {
        if (product.getPrice().doubleValue() < ProductConstants.MIN_PRICE_WITH_DISCOUNT_AVAILABLE) {
            throw new ProductValidationException("Discount must be zero if product have price less then "
                    + ProductConstants.MIN_PRICE_WITH_DISCOUNT_AVAILABLE);
        }
    }
}
