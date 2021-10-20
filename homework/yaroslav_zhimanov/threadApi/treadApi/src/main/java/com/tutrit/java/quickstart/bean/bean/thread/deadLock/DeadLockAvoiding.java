package com.tutrit.java.quickstart.bean.bean.thread.deadLock;

import lombok.SneakyThrows;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DeadLockAvoiding {

    String one = " one";
    String two = " two";

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
            synchronized (one) {
                log.info("Lock one");
                Thread.sleep(100);
                synchronized (two){
                    log.info("Lock two");
                }
            }
        }
    }

    @SneakyThrows
    public void twoOne2() {
        for (int i = 0 ; i<1000000; i++){
            synchronized (one) {
                log.info("Lock two");
                Thread.sleep(100);
                synchronized (two){
                    log.info("Lock one");
                }
            }
        }
    }
}
