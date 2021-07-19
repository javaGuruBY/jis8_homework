package homework.ball;

import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MagicTest {
    Magic magic;
    Logger log = LoggerFactory.getLogger("Ball ");


    @Before
    public void setUp() {
        this.magic = new Magic();
    }

    @Test
    public void addPrediction() {
        magic.addPrediction();
        log.info("Test {}", magic);
    }

    @Test
    public void number() {
        log.info("Number {}", magic.number());
    }

    @Test
    public void prediction() {
        magic.addPrediction();
        magic.number();
        magic.prediction();
    }
}
