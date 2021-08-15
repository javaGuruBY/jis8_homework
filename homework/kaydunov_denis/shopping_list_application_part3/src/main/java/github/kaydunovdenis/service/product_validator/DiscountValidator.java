package github.kaydunovdenis.service.product_validator;

import github.kaydunovdenis.bean.Product;
import github.kaydunovdenis.bean.ProductConstants;

public class DiscountValidator implements Validable {

    @Override
    public boolean validate(Product product) {
        return isDiscountAvailable(product)
                && product.getDiscount().doubleValue() >= ProductConstants.MIN_DISCOUNT
                && product.getDiscount().doubleValue() <= ProductConstants.MAX_DISCOUNT;
    }

    public boolean isDiscountAvailable(Product product) {
        return product.getPrice().doubleValue() > ProductConstants.MIN_PRICE_WITH_DISCOUNT_AVAILABLE;
    }
}
