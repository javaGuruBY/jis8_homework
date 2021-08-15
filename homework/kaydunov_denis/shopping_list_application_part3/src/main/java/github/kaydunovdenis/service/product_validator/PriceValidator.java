package github.kaydunovdenis.service.product_validator;

import github.kaydunovdenis.bean.ProductConstants;
import github.kaydunovdenis.bean.Product;

public class PriceValidator implements Validity {
    @Override
    public boolean validate(final Product product) {
        return product.getPrice().doubleValue() > ProductConstants.ZERO;
    }
}
