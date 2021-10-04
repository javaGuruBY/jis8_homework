package github.kaydunovdenis.service.product_validator;

import github.kaydunovdenis.bean.product.Product;
import github.kaydunovdenis.bean.product.ProductConstants;
import org.springframework.stereotype.Component;

@Component
public class DiscountValidator implements Validity {

    @Override
    public boolean validate(final Product product) {
        return isDiscountAvailable(product)
                && product.getDiscount().doubleValue() >= ProductConstants.MIN_DISCOUNT
                && product.getDiscount().doubleValue() <= ProductConstants.MAX_DISCOUNT;
    }

    public boolean isDiscountAvailable(final Product product) {
        return product.getPrice().doubleValue() > ProductConstants.MIN_PRICE_WITH_DISCOUNT_AVAILABLE;
    }
}
