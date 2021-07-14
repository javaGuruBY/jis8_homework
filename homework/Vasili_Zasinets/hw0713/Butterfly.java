package com.tutrit.java.quickstart;

public class Butterfly {
    public static void main(String[] args) {
        int[][] butterfly = {{1, 1, 1, 1, 1, 1, 1}, {0, 1, 1, 1, 1, 1, 0}, {0, 0, 1, 1, 1, 0, 0},
                {0, 0, 0, 1, 0, 0, 0}, {0, 0, 1, 1, 1, 0, 0}, {0, 1, 1, 1, 1, 1, 0}, {1, 1, 1, 1, 1, 1, 1}};
        int i;
        int k;
        for (k = 0; k < butterfly.length; k++) {
            for (i = 0; i < butterfly.length; i++) {
                System.out.print(butterfly[k][i]);
            }
            System.out.println();
        }
    }
}
