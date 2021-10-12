package github.kaydunovdenis.service.validator;

import github.kaydunovdenis.bean.product.Product;
import github.kaydunovdenis.service.validator.impls.DiscountValidator;
import github.kaydunovdenis.service.validator.impls.NullProductValidator;
import github.kaydunovdenis.service.validator.impls.PriceValidator;
import github.kaydunovdenis.service.validator.impls.ProductNameValidator;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Slf4j
public class ProductValidator {
    @Getter
    private final List<Validity> list = new ArrayList<>();

    public ProductValidator() {
        list.add(new DiscountValidator());
        list.add(new ProductNameValidator());
        list.add(new PriceValidator());
        //TODO как избавиться от null валидатора? сперва должна быть проверка на null
        // потом все остальное

        //TODO написать метод который будет искать все классы реализующие интерфейс
        // Validity и добавлять их инстанс в list
    }

    public boolean validate(final Product product) {
        try {
            new NullProductValidator().validate(product);
            list.forEach(validator -> validator.validate(product));
            return true;
        } catch (ProductValidationException e) {
            log.info(e.getMessage());
            return false;
        }
    }
}
