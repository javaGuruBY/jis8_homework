package com.tutrit.hibernateinspring.dao;

import com.tutrit.hibernateinspring.bean.Alumnus;
import com.tutrit.hibernateinspring.bean.AlumnusPIIData;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AlumnusPIIDataDaoTest {

    @Autowired
    AlumnusPIIDataDao alumnusPIIDataDao;

    @Test
    void save() {
        AlumnusPIIData alumnusPIIData = new AlumnusPIIData(null, "PiiData");
        alumnusPIIDataDao.save(alumnusPIIData);
    }
}