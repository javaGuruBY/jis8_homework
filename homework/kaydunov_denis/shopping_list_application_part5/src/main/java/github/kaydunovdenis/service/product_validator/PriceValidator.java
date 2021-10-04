package github.kaydunovdenis.service.product_validator;

import github.kaydunovdenis.bean.product.ProductConstants;
import github.kaydunovdenis.bean.product.Product;
import lombok.extern.apachecommons.CommonsLog;
import org.springframework.stereotype.Component;

@Component
public class PriceValidator implements Validity {
    @Override
    public boolean validate(final Product product) {
        return product.getPrice().doubleValue() > ProductConstants.ZERO;
    }
}
