package github.kaydunovdenis.service.product_validator;

import github.kaydunovdenis.bean.product.Product;

public interface Validity {
    boolean validate(final Product product);
}
