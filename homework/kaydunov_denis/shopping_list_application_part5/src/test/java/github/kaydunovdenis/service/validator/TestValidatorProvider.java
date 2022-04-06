package github.kaydunovdenis.service.validator;

import github.kaydunovdenis.service.validator.impls.DiscountValidator;
import github.kaydunovdenis.service.validator.impls.NullProductValidator;
import github.kaydunovdenis.service.validator.impls.PriceValidator;
import github.kaydunovdenis.service.validator.impls.ProductNameValidator;

import java.util.ArrayList;

public class TestValidatorProvider {
    //TODO вот так вот создавать validators? это так не должно быть!
    final static public ProductValidatorService productValidatorService = new ProductValidatorService(new ArrayList<>() {
        {
            add(new DiscountValidator());
            add(new NullProductValidator());
            add(new ProductNameValidator());
            add(new PriceValidator());
        }
    });
}
