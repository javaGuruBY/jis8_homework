package github.kaydunovdenis.service.validator;

import github.kaydunovdenis.bean.product.Product;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class ProductValidatorService {
    @Getter
    private final List<Validity> list;

    @Autowired
    public ProductValidatorService(List<Validity> list) {
        this.list = list;
    }

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
