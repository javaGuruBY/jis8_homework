package github.kaydunovdenis.service.validator.impls;

import github.kaydunovdenis.bean.product.Product;
import github.kaydunovdenis.service.validator.ProductValidationException;
import github.kaydunovdenis.service.validator.Validity;
import org.springframework.stereotype.Component;

@Component
public class NullProductValidator implements Validity {

    @Override
    public void validate(Product product) throws ProductValidationException {
        if (product == null) {
            throw new ProductValidationException("Product must be not null");
        }
    }
}
