package com.tutrit.java.quickstart.homework.Vasili_Zasinets.hw0713;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Butterfly {
    public static void main(String[] args) {

       Logger log = LoggerFactory.getLogger("");

        int[][] butterfly = {{1, 1, 1, 1, 1, 1, 1}, {0, 1, 1, 1, 1, 1, 0}, {0, 0, 1, 1, 1, 0, 0},
                {0, 0, 0, 1, 0, 0, 0}, {0, 0, 1, 1, 1, 0, 0}, {0, 1, 1, 1, 1, 1, 0}, {1, 1, 1, 1, 1, 1, 1}};


        for (int k = 0; k < butterfly.length; k++) {
           // for (int i = 0; i < butterfly.length; i++) {
               log.info("butterfly: {} " + butterfly[k][0] + butterfly[k][1]+ butterfly[k][2]+ butterfly[k][3]+
                       butterfly[k][4] + butterfly[k][5]+ butterfly[k][6]);
            }
            System.out.println();
        }
    }

