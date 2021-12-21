package github.kaydunovdenis.service.validator.impls;

import github.kaydunovdenis.bean.product.Product;
import github.kaydunovdenis.bean.product.ProductConstants;
import github.kaydunovdenis.service.validator.ProductValidationException;
import github.kaydunovdenis.service.validator.Validity;
import org.jetbrains.annotations.NotNull;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class DiscountValidator implements Validity {
    @Override
    public boolean validate(final Product product) throws ProductValidationException {
        checkAvailable(product);
        checkMin(product);
        checkMax(product);
        return true;
    }

    private void checkMax(final @NotNull Product product) throws ProductValidationException{
        if (product.getDiscount().doubleValue() > ProductConstants.MAX_DISCOUNT)
            throw new ProductValidationException("Discount can't be more than " + ProductConstants.MAX_DISCOUNT);
    }

    private void checkMin(final @NotNull Product product) throws ProductValidationException {
        if (product.getDiscount().doubleValue() < ProductConstants.MIN_DISCOUNT)
            throw new ProductValidationException("Discount can't be less than " + ProductConstants.MIN_DISCOUNT);
    }

    /**
     * Discount must be zero if product have price less than
     * @see ProductConstants
     */
    private void checkAvailable(final @NotNull Product product) throws ProductValidationException {
        if (product.getPrice().doubleValue() < ProductConstants.MIN_PRICE_FOR_DISCOUNT_AVAILABLE) {
            throw new ProductValidationException("Discount must be zero if product have price less than "
                    + ProductConstants.MIN_PRICE_FOR_DISCOUNT_AVAILABLE);
        }
    }
}
