package com.tutrit.java.quickstart;


import org.junit.Test;

public class AppTest {

    @Test(timeout = 1000)
    public void main() {
        Integer k = 0;
        for (int i = 0; i < 1000; i++) {
            for (int y = 0; y < 100; y++) {
                for (int l = 0; l < 100; l++) {
                    k += i;
                }
            }
        }
        System.out.println(k);
    }
}
