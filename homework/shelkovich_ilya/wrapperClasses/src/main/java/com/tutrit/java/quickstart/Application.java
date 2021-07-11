package com.tutrit.java.quickstart;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Application {

    static Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        Integer intByLiteral = 100;
        Integer.valueOf(4);
        Integer.parseInt("4");


        // Не понял как продемонстрировать разницу присвоения по ссылке и методом valueOf

        Integer x = intByLiteral;
        Integer.valueOf(intByLiteral);

        log.info(Integer.toBinaryString(intByLiteral));
        log.info(Integer.toHexString(intByLiteral));
        log.info(Integer.toString(intByLiteral));

        //  Сравните передаваемые разными способами значения, используя "==" и equals().

        Integer a = 20;
        Integer b = 20;

        boolean result = a == b;
        boolean resultByEquals = a.equals(b);

        log.info("result {} ", result);
        log.info("resultByEquals {} ", resultByEquals);

        //  Используйте пограничные и экстремальные значения
        //  (нижний предел, ниже нижнего предела, верхний предел, выше верхнего предела).

        Integer c = 200;
        Integer d = 200;

        boolean resultRightBorderCache = c == d;
        boolean resultRightBorderCacheByEquals = c.equals(d);

        log.info("result Right Border {} ", resultRightBorderCache);
        log.info("resultByEquals Right Border {} ", resultRightBorderCacheByEquals);

        Integer i = -200;
        Integer j = -200;

        boolean resultLeftBorderCache = i == j;
        boolean resultLeftBorderCacheByEquals = i.equals(j);

        log.info("result Left Border {} ", resultLeftBorderCache);
        log.info("resultByEquals Left Border {} ", resultLeftBorderCacheByEquals);

        Integer e = 127;
        Integer f = 127;

        boolean resultInRightBorder = e == f;
        boolean resultInRightBorderByEquals = e.equals(f);

        log.info("result In Right Border{} ", resultInRightBorder);
        log.info("resultByEquals In Right Border{} ", resultInRightBorderByEquals);

        Integer q = -128;
        Integer w = -128;

        boolean resultInLeftBorder = q == w;
        boolean resultInLeftBorderByEquals = q.equals(w);

        log.info("result In Left Border {} ", resultInLeftBorder);
        log.info("resultByEquals Int left Border {} ", resultInLeftBorderByEquals);
    }
}

