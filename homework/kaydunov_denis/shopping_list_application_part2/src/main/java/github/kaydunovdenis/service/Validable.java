package github.kaydunovdenis.service;

import github.kaydunovdenis.bean.Product;

public interface Validable {
    boolean validate(Product product);
}
