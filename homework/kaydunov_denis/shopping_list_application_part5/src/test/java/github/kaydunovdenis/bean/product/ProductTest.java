package github.kaydunovdenis.bean.product;

import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;

/**
 * About the discount:
 * value variable 1 = view 100,00%
 * value variable 0.2 = view 20,00%
 */
public class ProductTest {
    private static final String DEFAULT_DISCOUNT = "0.2";
    public static final String DEFAULT_PERCENTAGE_DISCOUNT = "20,00%";
    private static final Logger LOG = LoggerFactory.getLogger(ProductTest.class.getSimpleName());
    private Product product;

    @Test
    public void getName() {
        Assert.assertEquals("Notebook Acer 9302V-1", getDefaultProduct().getName());
    }

    @Test
    public void getId() {
        Assert.assertEquals(0, getDefaultProduct().getId().compareTo(1L));
    }

    @Test
    public void getPrice() {
        Assert.assertEquals(0, getDefaultProduct().getPrice().compareTo(new BigDecimal("1000.00")));
    }

    @Test
    public void getProductCategory() {
        Assert.assertEquals(ProductCategory.NOTEBOOK, getDefaultProduct().getProductCategory());
    }

    @Test
    public void getDiscount() {
        Assert.assertEquals(0, getDefaultProduct().getDiscount().compareTo(new BigDecimal(DEFAULT_DISCOUNT)));
    }

    @Test
    public void getDescription() {
        Assert.assertEquals("Not description", getDefaultProduct().getDescription());
    }

    @Test
    public void setName() {
        product = getDefaultProduct();
        var expect = "Name is change";
        product.setName(expect);
        Assert.assertEquals(expect, product.getName());
    }

    @Test
    public void setId() {
        product = getDefaultProduct();
        var expect = 2L;
        product.setId(expect);
        Assert.assertEquals(0, product.getId().compareTo(expect));
    }

    @Test
    public void setPrice() {
        product = getDefaultProduct();
        var expect = new BigDecimal("2000.00");
        product.setPrice(expect);
        Assert.assertEquals(0, product.getPrice().compareTo(expect));
    }

    @Test
    public void setProductCategory() {
        product = getDefaultProduct();
        var expect = ProductCategory.COMPUTER;
        product.setProductCategory(expect);
        Assert.assertEquals(expect, product.getProductCategory());
    }

    @Test
    public void setDiscount() {
        product = getDefaultProduct();
        var expect = new BigDecimal(DEFAULT_DISCOUNT);
        product.setDiscount(expect);
        Assert.assertEquals(0, product.getDiscount().compareTo(expect));
    }

    @Test
    public void setDescription() {
        product = getDefaultProduct();
        var expect = "Description is change";
        product.setDescription(expect);
        Assert.assertEquals(expect, product.getDescription());
    }

    @Test
    public void testToString() {
        var expect = String.format("Product{id=1, name='Notebook Acer 9302V-1', price=1000.00, productCategory=NOTEBOOK," +
                " discount=%s, description='Not description'}", DEFAULT_PERCENTAGE_DISCOUNT);
        Assert.assertEquals(expect, getDefaultProduct().toString());
    }

    @Test
    public void testEqualsAndHashCode() {
        Assert.assertEquals(getDefaultProduct(), getDefaultProduct());
        EqualsVerifier.simple().forClass(Product.class).verify();
    }

    @Test
    public void testBuilder() {
        var resultProduct = new Product().builder().build();
        Assert.assertEquals(new Product(), resultProduct);
    }

    public static Product getDefaultProduct() {
        return new Product(1L,
                "Notebook Acer 9302V-1",
                new BigDecimal("1000.00"),
                ProductCategory.NOTEBOOK,
                new BigDecimal(DEFAULT_DISCOUNT),
                "Not description");
    }
}
