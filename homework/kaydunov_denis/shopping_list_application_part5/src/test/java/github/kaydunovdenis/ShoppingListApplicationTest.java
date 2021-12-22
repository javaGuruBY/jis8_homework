package github.kaydunovdenis;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.assertTrue;

@SpringBootTest
public class ShoppingListApplicationTest {

    //TODO fix coupling context there
//    @Autowired
//    private ProductService productService;
//    @Test
//    public void checkWhatContextLoaded() {
//        assertThat(productService).isNotNull();
//    }

    @Ignore("redundant")
    @Test
    public void main() {
        assertTrue(true);
    }
}