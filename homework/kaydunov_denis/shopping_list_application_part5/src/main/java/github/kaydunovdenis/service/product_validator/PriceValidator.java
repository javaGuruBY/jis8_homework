package github.kaydunovdenis.service.product_validator;

import github.kaydunovdenis.bean.product.ProductConstants;
import github.kaydunovdenis.bean.product.Product;

public class PriceValidator implements Validity {
    @Override
    public boolean validate(final Product product) {
        return product.getPrice().doubleValue() > ProductConstants.ZERO;
    }
}
