package github.kaydunovdenis.service.validator.impls;

import github.kaydunovdenis.bean.product.Product;
import github.kaydunovdenis.service.validator.ProductValidationException;
import github.kaydunovdenis.service.validator.Validity;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Component;

import static github.kaydunovdenis.bean.product.ProductConstants.MAX_LENGTH_NAME;
import static github.kaydunovdenis.bean.product.ProductConstants.MIN_LENGTH_NAME;

@Component
public class ProductNameValidator implements Validity {

    @Override
    public void validate(final @NotNull Product product) throws ProductValidationException {
        checkNotNull(product);
        checkMinLength(product);
        checkMaxLength(product);
    }

    private void checkNotNull(final Product product) throws ProductValidationException {
        if (product.getName() == null) {
            throw new ProductValidationException("Name of product shouldn't be null");
        }
    }

    private void checkMaxLength(final Product product) {
        if (product.getName().length() > MAX_LENGTH_NAME) {
            throw new ProductValidationException("Name of product should be less than "+ MAX_LENGTH_NAME);
        }
    }

    private void checkMinLength(final Product product) {
        if (product.getName().length() < MIN_LENGTH_NAME) {
            throw new ProductValidationException("Name of product should be more than "+ MIN_LENGTH_NAME);
        }
    }
}
