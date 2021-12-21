package github.kaydunovdenis.service.validator;

import github.kaydunovdenis.bean.product.Product;

@FunctionalInterface
public interface Validity {
    boolean validate(final Product product) throws ProductValidationException;
}
