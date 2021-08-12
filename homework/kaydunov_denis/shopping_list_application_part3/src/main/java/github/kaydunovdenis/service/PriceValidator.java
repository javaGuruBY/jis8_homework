package github.kaydunovdenis.service;

import github.kaydunovdenis.Constant;
import github.kaydunovdenis.bean.Product;

public class PriceValidator implements Validable {
    @Override
    public boolean validate(Product product) {
        return product.getPrice().doubleValue() > Constant.ZERO;
    }
}
