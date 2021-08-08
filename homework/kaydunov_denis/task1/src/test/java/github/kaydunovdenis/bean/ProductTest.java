package github.kaydunovdenis.bean;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;

public class ProductTest {
    private Product product;

    @Before
    public void setUp() {
        product = new Product(1L,
                "Notebook Acer 9302V-1",
                new BigDecimal("1000.00"),
                Category.NOTEBOOK,
                new BigDecimal("0"),
                "Not description");
    }

    @Test
    public void testTestGetName() {
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
        Double expect = new BigDecimal("0.00").doubleValue();
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
    public void testTestSetName() {
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
        BigDecimal expect = new BigDecimal("0.10");
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
    public void testTestToString() {
        Logger log = LoggerFactory.getLogger("main");
        log.info(product.toString());
        String expect = "Product{id=1, name='Notebook Acer 9302V-1', price=1000.00, productCategory=NOTEBOOK," +
                " discount=0, description='Not description'}";
        Assert.assertEquals(expect, product.toString());
    }
}