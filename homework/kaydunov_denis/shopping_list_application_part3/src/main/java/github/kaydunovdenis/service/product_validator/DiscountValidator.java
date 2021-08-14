package github.kaydunovdenis.service.product_validator;

import github.kaydunovdenis.Constant;
import github.kaydunovdenis.bean.Product;

public class DiscountValidator implements Validable{

    @Override
    public boolean validate(Product product) {
        return product.getDiscount().doubleValue() >= Constant.MIN_DISCOUNT
                && product.getDiscount().doubleValue() <= Constant.MAX_DISCOUNT;
    }
}
