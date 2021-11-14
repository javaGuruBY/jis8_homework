package com.tutrit.java.quickstart.dao;

import com.tutrit.java.quickstart.bean.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.sql.Date;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import static com.tutrit.java.quickstart.config.JisAtLocalhost.getConnection;

public class UserDao {
    private static Logger log = LoggerFactory.getLogger(UserDao.class);

    public List<User> findAll() {
        try (Statement st = getConnection().createStatement();
             ResultSet rs = st.executeQuery(Query.SELECT_ALL_USERS)) {

            return readRs(rs);

        } catch (Exception ex) {
            log.error("cannot execute {}", Query.CREATE_JBOYS, ex);
            return Collections.emptyList();
        }
    }

    private List<User> readRs(ResultSet rs) throws SQLException {
        List<User> users = new ArrayList<>();
        while (rs.next()) {
            try {
                int rowNumber = rs.getRow();
                log.info("rs.getRow() = {}", rowNumber);

                User user = User.builder()
                        .id(rs.getInt("id"))
                        .login(rs.getString("login"))
                        .name(rs.getString("name"))
                        .bio(rs.getString("bio"))
                        .birth(LocalDate.parse(Optional.ofNullable(rs.getDate("birth")).orElse(Date.valueOf("1970-01-01")).toString()))
                        .registered(rs.getObject("registered", LocalDateTime.class))
                        .updated(rs.getObject("updated", LocalDateTime.class))
                        .gender(rs.getString("gender").charAt(0))
                        .likes(rs.getInt("likes"))
                        .credit(rs.getDouble("credit"))
                        .active(rs.getBoolean("active"))
                        .build();
                log.info("user = {}" + user);
                users.add(user);
            } catch (Exception e) {
                log.error("Exception on reading object at row", e);
            }
        }
        return users;
    }

    private void printRs(ResultSet rs) throws SQLException {
        while (rs.next()) {
            System.out.println("\nrs.getRow() = " + rs.getRow());
            System.out.println("\t | \t" + rs.getString(1));
            System.out.println("\t | \t" + rs.getString(2));
            System.out.println("\t | \t" + rs.getString(3));
            System.out.println("\t | \t" + rs.getString(4));
            System.out.println("\t | \t" + rs.getString(5));
            System.out.println("\t | \t" + rs.getString(6));
            System.out.println("\t | \t" + rs.getString(7));
            System.out.println("\t | \t" + rs.getString(8));
            System.out.println("\t | \t" + rs.getString(9));
            System.out.println("\t | \t" + rs.getString(10));
            System.out.println("\t | \t" + rs.getString(11));
            System.out.println("\t | \t" + rs.getString(12));
        }
    }
}