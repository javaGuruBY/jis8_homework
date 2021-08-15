package github.kaydunovdenis.service.product_validator;

import github.kaydunovdenis.bean.Product;
import github.kaydunovdenis.bean.ProductConstants;

public class DiscountValidator implements Validity {

    @Override
    public boolean validate(final Product product) {
        return isDiscountAvailable(product)
                && product.getDiscount().doubleValue() >= ProductConstants.MIN_DISCOUNT
                && product.getDiscount().doubleValue() <= ProductConstants.MAX_DISCOUNT;
    }

    public boolean isDiscountAvailable(Product product) {
        return product.getPrice().doubleValue() > ProductConstants.MIN_PRICE_WITH_DISCOUNT_AVAILABLE;
    }
}
