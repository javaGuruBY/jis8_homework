package github.kaydunovdenis.service.validator;

import github.kaydunovdenis.bean.product.Product;

@FunctionalInterface
public interface Validity {
    void validate(final Product product) throws ProductValidationException;
}
