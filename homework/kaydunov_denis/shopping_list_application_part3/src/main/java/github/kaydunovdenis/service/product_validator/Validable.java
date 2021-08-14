package github.kaydunovdenis.service.product_validator;

import github.kaydunovdenis.bean.Product;

public interface Validable {
    boolean validate(Product product);
}
