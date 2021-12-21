package github.kaydunovdenis.service.validator;

import github.kaydunovdenis.bean.product.Product;
import github.kaydunovdenis.service.validator.impls.DiscountValidator;
import github.kaydunovdenis.service.validator.impls.NullProductValidator;
import github.kaydunovdenis.service.validator.impls.PriceValidator;
import github.kaydunovdenis.service.validator.impls.ProductNameValidator;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Slf4j
@Service
public class ProductValidatorService {
    @Getter
    private List<Validity> list;

    @Autowired
    public ProductValidatorService(List<Validity> list) {
        this.list = list;
    }

//    public ProductValidatorService() {
//
//        list.add(new NullProductValidator());
//        list.add(new DiscountValidator());
//        list.add(new ProductNameValidator());
//        list.add(new PriceValidator());
//        //TODO как избавиться от null валидатора? сперва должна быть проверка на null
//        // потом все остальное
//
//        //TODO написать метод который будет искать все классы реализующие интерфейс
//        // Validity и добавлять их инстанс в list
//    }

    public boolean validate(final Product product) {
        try {
            list.forEach(validator -> validator.validate(product));
            return true;
        } catch (ProductValidationException e) {
            log.info(e.getMessage());
            return false;
        }
    }
}
