package com.tutrit.java.quickstart.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Statement;

import static com.tutrit.java.quickstart.config.JisAtLocalhost.getConnection;

public class JBoysDao {
    private static Logger log = LoggerFactory.getLogger(JBoysDao.class);

    public void createTableJBoys() {
        try (Statement st = getConnection().createStatement()) {
            st.execute(Query.CREATE_JBOYS);
        } catch (Exception ex) {
            log.error("cannot execute {}", Query.CREATE_JBOYS, ex);
        }
    }

    public void dropTableJBoys() {
        try (Statement st = getConnection().createStatement()) {
            st.execute(Query.DROP_JBOYS);
        } catch (Exception ex) {
            log.error("cannot execute {}", Query.DROP_JBOYS, ex);
        }
    }
}
