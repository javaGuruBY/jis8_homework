package com.tutrit.java.quickstart.dao;

import com.tutrit.java.quickstart.bean.Boy;
import org.junit.Test;

import static org.junit.Assert.*;

public class BoyDaoTest {

    @Test
    public void save() {
        Boy boy = new Boy();
        boy.setBoy("Mikass");
        BoyDao.save(boy);

    }
}