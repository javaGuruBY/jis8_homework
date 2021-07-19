package com.tutrit.java.quickstart;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Application {

    public static void main(String[] args) {
        Logger log = LoggerFactory.getLogger("");

        int[][] butterfly = {
                {1, 1, 1, 1, 1, 1, 1},
                {0, 1, 1, 1, 1, 1, 0},
                {0, 0, 1, 1, 1, 0, 0},
                {0, 0, 0, 1, 0, 0, 0},
                {0, 0, 1, 1, 1, 0, 0},
                {0, 1, 1, 1, 1, 1, 0},
                {1, 1, 1, 1, 1, 1, 1}
        };


        for (int[] ints : butterfly) {
            log.info("butterfly: {} {} {} {} {} {} {}", ints[0], ints[1], ints[2], ints[3],
                    ints[4], ints[5], ints[6]);
        }
    }
}



