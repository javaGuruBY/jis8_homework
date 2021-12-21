package github.kaydunovdenis;

import github.kaydunovdenis.service.validator.Validity;
import github.kaydunovdenis.service.validator.impls.DiscountValidator;
import github.kaydunovdenis.service.validator.impls.PriceValidator;
import github.kaydunovdenis.service.validator.impls.ProductNameValidator;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import java.util.List;

import static org.junit.Assert.assertTrue;

@SpringBootTest
public class ShoppingListApplicationTest {
    @Autowired
    private ApplicationContext context;

    @Ignore("redundant")
    @Test
    public void main() {
        assertTrue(true);
    }

    @Test
    public void initialContextTest() {
        assertTrue(context.getBeanDefinitionCount() > 0);
    }

    @Test
    public void createValidity() {
        DiscountValidator discountValidator = context.getBean(DiscountValidator.class);
        PriceValidator priceValidator = context.getBean(PriceValidator.class);
        ProductNameValidator productNameValidator = context.getBean(ProductNameValidator.class);
        List<Validity> validityList = List.of(discountValidator, priceValidator, productNameValidator);
        validityList.forEach(Assert::assertNotNull);
    }
}