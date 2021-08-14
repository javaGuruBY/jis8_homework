package github.kaydunovdenis.service;

import github.kaydunovdenis.bean.ProductConstants;
import github.kaydunovdenis.bean.Product;

public class PriceValidator implements Validable {
    @Override
    public boolean validate(Product product) {
        return product.getPrice().doubleValue() > ProductConstants.ZERO;
    }
}
