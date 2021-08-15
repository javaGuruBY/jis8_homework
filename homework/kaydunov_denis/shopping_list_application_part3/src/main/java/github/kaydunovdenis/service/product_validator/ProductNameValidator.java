package github.kaydunovdenis.service.product_validator;

import github.kaydunovdenis.bean.Product;
import github.kaydunovdenis.repository.ProductRepositoryHashMap;

import static github.kaydunovdenis.bean.ProductConstants.MAX_LENGTH_NAME;
import static github.kaydunovdenis.bean.ProductConstants.MIN_LENGTH_NAME;

public class ProductNameValidator implements Validable {
    @Override
    public boolean validate(Product product) {
        int lengthName = product.getName().length();
        return lengthName >= MIN_LENGTH_NAME
                && lengthName <= MAX_LENGTH_NAME
                && isNameUnique(product);
    }

    //TODO Тут я не уверен с архитектурой расположения и взаимодействия этого метода
    //TODO HashMap  здесь костыль временный
    public boolean isNameUnique(Product product) {
        return !ProductRepositoryHashMap.containsProduct(product);
    }
}
