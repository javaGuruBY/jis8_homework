package com.tutrit.hibernateinspring.dao;

import com.tutrit.hibernateinspring.bean.Alumnus;
import com.tutrit.hibernateinspring.bean.AlumnusPIIData;
import com.tutrit.hibernateinspring.bean.Human;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class AlumnusDaoTest {

    @Autowired
    AlumnusDao alumnusDao;
    @Autowired
    AlumnusPIIDataDao alumnusPIIDataDao;

    @Test
    void save() {
        Alumnus alumnus = new Alumnus(false, new AlumnusPIIData(null, "PiiData"));
        alumnusDao.save(alumnus);
    }

    @Test
    void save_2Dao() {
        AlumnusPIIData alumnusPIIData = new AlumnusPIIData(null, "PiiData");
        Alumnus alumnus = new Alumnus(false, null);
        alumnus.setAlumnusPIIData(alumnusPIIData);
        alumnusPIIData.setAlumnus(alumnus);
        alumnusDao.save(alumnus);
    }

    @Test
    public void findAll() {
        List<Alumnus> alumnusList = alumnusDao.findAll();
        assertNotNull(alumnusList);
    }

    @Test
    void delete() {
        Alumnus alumnus = new Alumnus();
        alumnus.setId(29L);
        alumnusDao.delete(alumnus);
        System.out.println();
    }
}