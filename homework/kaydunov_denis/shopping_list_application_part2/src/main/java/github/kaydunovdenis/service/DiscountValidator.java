package github.kaydunovdenis.service;

import github.kaydunovdenis.bean.ProductConstants;
import github.kaydunovdenis.bean.Product;

public class DiscountValidator implements Validable{

    @Override
    public boolean validate(Product product) {
        return product.getDiscount().doubleValue() >= ProductConstants.MIN_DISCOUNT
                && product.getDiscount().doubleValue() <= ProductConstants.MAX_DISCOUNT;
    }
}
