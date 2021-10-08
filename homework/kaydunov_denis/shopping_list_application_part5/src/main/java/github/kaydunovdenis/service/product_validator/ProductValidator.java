package github.kaydunovdenis.service.product_validator;

import github.kaydunovdenis.bean.product.Product;
import lombok.NonNull;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProductValidator {
    List<Validity> list = new ArrayList<>();

    public ProductValidator() {
        //TODO написать метод который будет искать все классы реализующие интерфейс
        // Validity и добавлять их инстанс в list
    }

    public void validate(@NonNull Product product) throws ProductValidationException {
        list.forEach(it -> validate(product));
    }
}
