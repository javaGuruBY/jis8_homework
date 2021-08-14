package github.kaydunovdenis.bean;

import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.Assert;
import org.junit.Before;
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
    private Product product;
    private static final Logger LOG = LoggerFactory.getLogger(ProductTest.class.getSimpleName());

    @Before
    public void setUp() {
        product = getDefaultProduct();
    }

    @Test
    public void testGetName() {
        String expect = "Notebook Acer 9302V-1";
        String result = product.getName();
        Assert.assertEquals(expect, result);
    }

    @Test
    public void testGetId() {
        Long expect = 1L;
        Long result = product.getId();
        Assert.assertEquals(expect, result);
    }

    @Test
    public void testGetPrice() {
        BigDecimal expect = new BigDecimal("1000.00");
        BigDecimal result = product.getPrice();
        Assert.assertEquals(expect, result);
    }

    @Test
    public void testGetProductCategory() {
        Category expect = Category.NOTEBOOK;
        Category result = product.getProductCategory();
        Assert.assertEquals(expect, result);
    }

    @Test
    public void testGetDiscount() {
        Double expect = new BigDecimal(DEFAULT_DISCOUNT).doubleValue();
        Double result = product.getDiscount().doubleValue();
        Assert.assertEquals(expect, result);
    }

    @Test
    public void testGetDescription() {
        String expect = "Not description";
        String result = product.getDescription();
        Assert.assertEquals(expect, result);
    }

    @Test
    public void testSetName() {
        String expect = "Name is change";
        product.setName(expect);
        String result = product.getName();
        Assert.assertEquals(expect, result);
    }

    @Test
    public void testSetId() {
        Long expect = 2L;
        product.setId(expect);
        Long result = product.getId();
        Assert.assertEquals(expect, result);
    }

    @Test
    public void testSetPrice() {
        BigDecimal expect = new BigDecimal("2000.00");
        product.setPrice(expect);
        BigDecimal result = product.getPrice();
        Assert.assertEquals(expect, result);
    }

    @Test
    public void testSetProductCategory() {
        Category expect = Category.COMPUTER;
        product.setProductCategory(expect);
        Category result = product.getProductCategory();
        Assert.assertEquals(expect, result);
    }

    @Test
    public void testSetDiscount() {
        BigDecimal expect = new BigDecimal(DEFAULT_DISCOUNT);
        product.setDiscount(expect);
        BigDecimal result = product.getDiscount();
        Assert.assertEquals(expect, result);
    }

    @Test
    public void testSetDescription() {
        String expect = "Description is change";
        product.setDescription(expect);
        String result = product.getDescription();
        Assert.assertEquals(expect, result);
    }

    @Test
    public void testToString() {
        String expect = String.format("Product{id=1, name='Notebook Acer 9302V-1', price=1000.00, productCategory=NOTEBOOK," +
                " discount=%s, description='Not description'}", DEFAULT_PERCENTAGE_DISCOUNT);
        LOG.info("Expect:\n {}",expect);
        LOG.info("Result:\n {}", product.toString());
        Assert.assertEquals(expect, product.toString());
    }

    @Test
    public void testEquals() {
        Product secondProduct = getDefaultProduct();
        Assert.assertEquals(secondProduct, product);
    }

    @Test
    public void testHashCode() {
        EqualsVerifier.simple().forClass(Product.class).verify();
    }

    public static Product getDefaultProduct() {
        return new Product(1L,
                "Notebook Acer 9302V-1",
                new BigDecimal("1000.00"),
                Category.NOTEBOOK,
                new BigDecimal(DEFAULT_DISCOUNT),
                "Not description");
    }
}
