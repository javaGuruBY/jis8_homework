package github.kaydunovdenis.service.product_validator.validityImpl;

import github.kaydunovdenis.bean.product.Product;
import github.kaydunovdenis.bean.product.ProductCategory;
import github.kaydunovdenis.service.product_validator.ProductValidationException;
import github.kaydunovdenis.service.product_validator.Validity;

public class ProductCategoryValidator implements Validity {
    @Override
    public void validate(Product product) throws ProductValidationException {
        if (!ProductCategory.contain(product.getProductCategory())) {
             throw new ProductValidationException("Product have invalid category");
        }
    }
}
