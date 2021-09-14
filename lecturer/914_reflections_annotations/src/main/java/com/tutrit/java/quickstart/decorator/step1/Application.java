package com.tutrit.java.quickstart.decorator.step1;

import com.tutrit.java.quickstart.decorator.step1.bean.Beverage;
import com.tutrit.java.quickstart.decorator.step1.bean.Cappuccino;
import com.tutrit.java.quickstart.decorator.step1.bean.Espresso;
import java.util.function.Function;;
import java.util.stream.IntStream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Application {
    private static Logger log = LoggerFactory.getLogger("coffee");

    public static void main(String[] args) {
        Beverage cappuccino = new Cappuccino();
        cappuccino.coffee = "coffee";
        cappuccino.milk = "milk";
        Beverage espresso = new Espresso();
        espresso.coffee = "coffee";
        espresso.water = "water";

        log.info("{}: cost {}", cappuccino.getClass().getSimpleName(), cappuccino.getCost());
        log.info("{}: cost {}", espresso.getClass().getSimpleName(), espresso.getCost());

    }
}
