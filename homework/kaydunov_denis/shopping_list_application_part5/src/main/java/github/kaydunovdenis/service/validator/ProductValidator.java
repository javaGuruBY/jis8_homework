package github.kaydunovdenis.service.validator;

import github.kaydunovdenis.bean.product.Product;
import github.kaydunovdenis.service.validator.impls.DiscountValidator;
import github.kaydunovdenis.service.validator.impls.NullProductValidator;
import github.kaydunovdenis.service.validator.impls.PriceValidator;
import github.kaydunovdenis.service.validator.impls.ProductNameValidator;
import lombok.Getter;
import lombok.NonNull;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProductValidator {
    @Getter
    private List<Validity> list = new ArrayList<>();

    public ProductValidator() {
        list.add(new DiscountValidator());
        list.add(new ProductNameValidator());
        list.add(new PriceValidator());
        list.add(new NullProductValidator());
        //TODO как избавиться от null валидатора? сперва должна быть проверка на null
        // потом все остальное

        //TODO написать метод который будет искать все классы реализующие интерфейс
        // Validity и добавлять их инстанс в list
    }

    public void validate(@NonNull Product product) throws ProductValidationException {
        list.forEach(it -> validate(product));
    }
}
