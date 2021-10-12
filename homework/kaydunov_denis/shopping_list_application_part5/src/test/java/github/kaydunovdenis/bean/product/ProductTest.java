package github.kaydunovdenis.bean.product;

import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.Test;
import org.meanbean.test.BeanTester;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

/**
 * About the discount:
 * value variable 1 = view 100,00%
 * value variable 0.2 = view 20,00%
 */
public class ProductTest {
    private Product product;

    @Test
    public void getName() {
        assertEquals("Notebook Acer 9302V-1", TestProductProvider.getTestProduct().getName());
    }

    @Test
    public void getId() {
        assertEquals(0, TestProductProvider.getTestProduct().getId().compareTo(1L));
    }

    @Test
    public void getPrice() {
        assertEquals(0, TestProductProvider.getTestProduct().getPrice().compareTo(new BigDecimal("1000.00")));
    }

    @Test
    public void getProductCategory() {
        assertEquals(ProductCategory.NOTEBOOK, TestProductProvider.getTestProduct().getProductCategory());
    }

    @Test
    public void getDiscount() {
        assertEquals(0, TestProductProvider.getTestProduct().getDiscount().compareTo(new BigDecimal(TestProductProvider.DEFAULT_DISCOUNT)));
    }

    @Test
    public void getDescription() {
        assertEquals("Not description", TestProductProvider.getTestProduct().getDescription());
    }

    @Test
    public void setName() {
        product = TestProductProvider.getTestProduct();
        var expect = "Name is change";
        product.setName(expect);
        assertEquals(expect, product.getName());
    }

    @Test
    public void setId() {
        product = TestProductProvider.getTestProduct();
        var expect = 2L;
        product.setId(expect);
        assertEquals(0, product.getId().compareTo(expect));
    }

    @Test
    public void setPrice() {
        product = TestProductProvider.getTestProduct();
        var expect = new BigDecimal("2000.00");
        product.setPrice(expect);
        assertEquals(0, product.getPrice().compareTo(expect));
    }

    @Test
    public void setProductCategory() {
        product = TestProductProvider.getTestProduct();
        var expect = ProductCategory.COMPUTER;
        product.setProductCategory(expect);
        assertEquals(expect, product.getProductCategory());
    }

    @Test
    public void setDiscount() {
        product = TestProductProvider.getTestProduct();
        var expect = new BigDecimal(TestProductProvider.DEFAULT_DISCOUNT);
        product.setDiscount(expect);
        assertEquals(0, product.getDiscount().compareTo(expect));
    }

    @Test
    public void setDescription() {
        product = TestProductProvider.getTestProduct();
        var expect = "Description is change";
        product.setDescription(expect);
        assertEquals(expect, product.getDescription());
    }

    @Test
    public void testToString() {
        var expect = String.format("Product{id=1, name='Notebook Acer 9302V-1', price=1000.00, productCategory=NOTEBOOK," +
                " discount=%s, description='Not description'}", TestProductProvider.DEFAULT_PERCENTAGE_DISCOUNT);
        assertEquals(expect, TestProductProvider.getTestProduct().toString());
    }

    @Test
    public void testEqualsAndHashCode() {
        assertEquals(TestProductProvider.getTestProduct(), TestProductProvider.getTestProduct());
        EqualsVerifier.simple().forClass(Product.class).verify();
    }

    @Test
    public void testBuilder() {
        var resultProduct = new Product().builder().build();
        assertEquals(new Product(), resultProduct);
    }

    @Test
    public void annotationDataShouldFunctionCorrectly() {
        new BeanTester().testBean(Product.class);
    }
}
