package com.tutrit.java.quickstart.dao;

import com.tutrit.java.quickstart.bean.Boy;
import com.tutrit.java.quickstart.service.HibernateUtil;
import org.hibernate.Session;

public class BoyDao {

    public static void save(Boy boy) {
        System.out.println("Maven + Hibernate + MySQL");
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();
        session.save(boy);
        session.getTransaction().commit();
        session.close();
    }
}
