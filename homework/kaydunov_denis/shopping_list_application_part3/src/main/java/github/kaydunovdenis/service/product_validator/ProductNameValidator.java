package github.kaydunovdenis.service.product_validator;

import github.kaydunovdenis.bean.Product;

import static github.kaydunovdenis.Constant.MAX_LENGTH_NAME;
import static github.kaydunovdenis.Constant.MIN_LENGTH_NAME;

public class ProductNameValidator implements Validable {
    @Override
    public boolean validate(Product product) {
        int lengthName = product.getName().length();
        return lengthName >= MIN_LENGTH_NAME
                && lengthName <= MAX_LENGTH_NAME;
    }
}
