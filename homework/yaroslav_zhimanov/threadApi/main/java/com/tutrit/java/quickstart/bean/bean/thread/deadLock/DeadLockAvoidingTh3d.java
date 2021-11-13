package com.tutrit.java.quickstart.bean.bean.thread.deadLock;

import lombok.SneakyThrows;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DeadLockAvoidingTh3d {

    String one = " one";
    String two = " two";
    String three = " three";

    Logger log = LoggerFactory.getLogger("ThreadState");


    @SneakyThrows
    public void perform(){
        Thread oneTwo = new Thread(this::oneTwo1);
        Thread twoOne = new Thread(this::twoOne2);

        oneTwo.start();
        twoOne.start();

        oneTwo.join();
        twoOne.join();
    }

    @SneakyThrows
    public void oneTwo1()  {
        for (int i = 0 ; i<1000000; i++){
            synchronized (three){
            synchronized (one) {
                log.info("Lock one");
                Thread.sleep(100);
                synchronized (two) {
                    log.info("Lock two");
                }
            }
            }
        }
    }

    @SneakyThrows
    public void twoOne2() {
        for (int i = 0 ; i<1000000; i++){
            synchronized (three){
            synchronized (two) {
                log.info("Lock two");
                Thread.sleep(100);
                synchronized (one) {
                    log.info("Lock one");
                }
            }
            }
        }
    }
}
