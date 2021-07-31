package com.tutrit.java.quickstart.service;

import com.tutrit.java.quickstart.bean.MyInteger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MethodService {
    Logger log = LoggerFactory.getLogger(MethodService.class);

    public void modifyInt(int i) {
        i += 1;
        log.info("method: value i is {}", i);
    }

    public void modifyInt(MyInteger i) {
        i.increment();
        log.info("method: value i is {}", i);
    }

    public MyInteger modifyAndReturnInt1(MyInteger i) {
        i.increment();
        log.info("method: value i is {}", i);
        return new MyInteger(i.getInteger());
    }

    public MyInteger modifyAndReturnInt2(MyInteger i) {
        i = new MyInteger(i.getInteger());
        i.increment();
        log.info("method: value i is {}", i);
        return i;
    }

    public void modifyInt(Integer i) {
        i++;
        log.info("method: value i is {}", i);
    }
}
