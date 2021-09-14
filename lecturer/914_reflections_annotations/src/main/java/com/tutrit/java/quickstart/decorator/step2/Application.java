package com.tutrit.java.quickstart.decorator.step2;

import com.tutrit.java.quickstart.decorator.step2.bean.Cappuccino;
import com.tutrit.java.quickstart.decorator.step2.bean.CoconutSirop;
import com.tutrit.java.quickstart.decorator.step2.bean.CondimentDecorator;
import com.tutrit.java.quickstart.decorator.step2.bean.Milk;
import com.tutrit.java.quickstart.decorator.step2.bean.Sugar;
import com.tutrit.java.quickstart.decorator.step2.bean.Water;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Application {
    private static Logger log = LoggerFactory.getLogger("coffee");

    public static void main(String[] args) {
        CondimentDecorator coffee =
            new CoconutSirop(new Sugar(new Sugar(new Water(new Milk(new Cappuccino())))));

        new BufferedReader(
            new InputStreamReader(
                new DataInputStream(
                    InputStream.nullInputStream())));

        log.info("{}: cost {}", coffee.getClass().getSimpleName(), coffee.getCost());
    }
}
