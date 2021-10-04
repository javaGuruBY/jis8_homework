package github.kaydunovdenis.service.product_validator;

import github.kaydunovdenis.bean.product.Product;
import github.kaydunovdenis.repository.ProductRepositoryHashMap;
import org.springframework.stereotype.Component;

import static github.kaydunovdenis.bean.product.ProductConstants.MAX_LENGTH_NAME;
import static github.kaydunovdenis.bean.product.ProductConstants.MIN_LENGTH_NAME;

@Component
public class ProductNameValidator implements Validity {

    @Override
    public boolean validate(final Product product) {
        if (product == null) return false;
        int lengthName = product.getName().length();
        return lengthName >= MIN_LENGTH_NAME
                && lengthName <= MAX_LENGTH_NAME
                && isNameUnique(product);
    }

    private boolean isNameUnique(Product product) {
        return !ProductRepositoryHashMap.containsProduct(product);
    }
}
