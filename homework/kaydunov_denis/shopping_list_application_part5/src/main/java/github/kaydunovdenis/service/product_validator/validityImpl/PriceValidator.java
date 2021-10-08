package github.kaydunovdenis.service.product_validator.validityImpl;

import github.kaydunovdenis.bean.product.Product;
import github.kaydunovdenis.bean.product.ProductConstants;
import github.kaydunovdenis.service.product_validator.ProductValidationException;
import github.kaydunovdenis.service.product_validator.Validity;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Component;

@Component
public class PriceValidator implements Validity {
    @Override
    public void validate(final @NotNull Product product) {
        if (product.getPrice().doubleValue() <= ProductConstants.ZERO) {
            throw new ProductValidationException("Product price must be greater than " + ProductConstants.ZERO);
        }
    }
}
