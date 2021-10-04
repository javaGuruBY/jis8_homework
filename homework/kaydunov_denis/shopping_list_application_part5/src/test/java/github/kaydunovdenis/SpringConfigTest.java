package github.kaydunovdenis;

import github.kaydunovdenis.bean.shopping_cart.ShoppingCart;
import github.kaydunovdenis.service.ShoppingCartService;
import github.kaydunovdenis.service.product_validator.DiscountValidator;
import github.kaydunovdenis.service.product_validator.PriceValidator;
import github.kaydunovdenis.service.product_validator.ProductNameValidator;
import github.kaydunovdenis.service.product_validator.Validity;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class SpringConfigTest {
    private static ApplicationContext context;

    @BeforeClass
    public static void setUp() {
        context = new AnnotationConfigApplicationContext(SpringConfig.class);
    }

    @Test
    public void initialContextTest() {
        Assert.assertTrue(context.getBeanDefinitionCount() > 0);
    }

    @Test
    public void createShoppingCartServiceTest() {
        ShoppingCartService shoppingCartService = context.getBean(ShoppingCartService.class);
        String expected = "ShoppingCartService(productService=ProductService())";
        Assert.assertEquals(expected, shoppingCartService.toString());
    }

    @Test
    public void createValidity() {
        DiscountValidator discountValidator = context.getBean(DiscountValidator.class);
        PriceValidator priceValidator = context.getBean(PriceValidator.class);
        ProductNameValidator productNameValidator = context.getBean(ProductNameValidator.class);
        List<Validity> validityList = List.of(discountValidator, priceValidator, productNameValidator);
        validityList.forEach(Assert::assertNotNull);
    }

    @Test
    public void shoppingCart1() {
        ShoppingCart shoppingCart1 = context.getBean(ShoppingCart.class);
        Assert.assertEquals("ShoppingCart{name='null', productList=[]}", shoppingCart1.toString());
    }
}
