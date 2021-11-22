package com.tutrit.java.quickstart.dao;

import com.tutrit.java.quickstart.bean.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.security.PublicKey;
import java.sql.*;
import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

import static com.tutrit.java.quickstart.config.JisAtLocalhost.getConnection;

public class UserDao {
    private static Logger log = LoggerFactory.getLogger(UserDao.class);

    public List<User> findAll() {
        try (Statement st = getConnection().createStatement();
             ResultSet rs = st.executeQuery(Query.SELECT_ALL_USERS)) {

            return readRs(rs);

        } catch (Exception ex) {
            log.error("cannot execute {}", Query.SELECT_ALL_USERS, ex);
            return Collections.emptyList();
        }
    }

    public Optional<User> findById(int id) {
        try (Statement st = getConnection().createStatement();
             ResultSet rs = st.executeQuery(Query.SELECT_USER_BY_ID.formatted(id))) {
            List<User> usersResult = readRs(rs);
            if (usersResult.size() == 1) {
                return Optional.of(usersResult.get(0));
            } else if (usersResult.size() > 1) {
                throw new SQLException(String.format("Expected only 1 row in result, but got %s", usersResult.size()));
            }
            return Optional.empty();
        } catch (Exception ex) {
            log.error("cannot execute {}", Query.SELECT_USER_BY_ID, ex);
            return Optional.empty();
        }
    }

    public Optional<User> findByIdOnPreparedSt(int id) {
        try (Connection cn = getConnection();
             PreparedStatement pst = cn.prepareStatement("SELECT * FROM user WHERE id = ?")) {
            pst.setInt(1, id);
            ResultSet rs = pst.executeQuery();
            List<User> usersResult = readRs(rs);
            if (usersResult.size() == 1) {
                return Optional.of(usersResult.get(0));
            } else if (usersResult.size() > 1) {
                throw new SQLException(String.format("Expected only 1 row in result, but got %s", usersResult.size()));
            }
            return Optional.empty();
        } catch (Exception ex) {
            log.error("cannot execute {}", Query.SELECT_USER_BY_ID, ex);
            return Optional.empty();
        }
    }

    public Optional<User> findByIdForSqlInjection(String id) {
        String query = Query.SELECT_USER_BY_ID.formatted(id);
        try (Statement st = getConnection().createStatement();
             ResultSet rs = st.executeQuery(query)) {
            List<User> usersResult = readRs(rs);
            if (usersResult.size() == 1) {
                return Optional.of(usersResult.get(0));
            } else if (usersResult.size() > 1) {
                throw new SQLException(String.format("Expected only 1 row in result, but got %s", usersResult.size()));
            }
            return Optional.empty();
        } catch (Exception ex) {
            log.error("cannot execute {}", Query.SELECT_USER_BY_ID, ex);
            return Optional.empty();
        }
    }

    /**
     * Ex: if query SELECT * FROM Users WHERE login ="UserLogin" AND password ="userPassword"
     * returns at least 1 row, then user with such login=password exist, then user can be authenticated
     */
    public String authenticateForSqlInjection(String login, String password) {
        String query = "SELECT * FROM user WHERE login =%s AND name =%s".formatted(login, password);
        try (Statement st = getConnection().createStatement();
             ResultSet rs = st.executeQuery(query)) {
            List<User> usersResult = readRs(rs);
            if (usersResult.size() > 1) { //second assumption: at least 1 row over exactly 1 row
                return "User Authenticated! Logged as " + login;
            }
            return "Wrong username or password";
        } catch (Exception ex) {
            log.error("cannot execute {}", Query.SELECT_USER_BY_ID, ex);
            return null;
        }
    }

    public Optional<User> findByIdOnPreparedStSqlInjection(String id) {
        try (Connection cn = getConnection();
             PreparedStatement pst = cn.prepareStatement("SELECT * FROM user WHERE id = ?")) {
            pst.setString(1, id);
            ResultSet rs = pst.executeQuery();
            List<User> usersResult = readRs(rs);
            if (usersResult.size() == 1) {
                return Optional.of(usersResult.get(0));
            } else if (usersResult.size() > 1) {
                throw new SQLException(String.format("Expected only 1 row in result, but got %s", usersResult.size()));
            }
            return Optional.empty();
        } catch (Exception ex) {
            log.error("cannot execute {}", Query.SELECT_USER_BY_ID, ex);
            return Optional.empty();
        }
    }

    public int[] batchUpdateUser(List<Integer> ids) {
        int[] result;
        try (Connection cn = getConnection();
             PreparedStatement updSt = cn.prepareStatement(Query.UPDATE_GENDER_BY_ID)) {

            for (int i : ids) {
                updSt.setString(1, "F");
                updSt.setInt(2, i);
                updSt.addBatch();
            }

            result = updSt.executeBatch();
        } catch (Exception ex) {
            log.error("cannot execute {}", Query.SELECT_USER_BY_ID, ex);
            result = new int[0];
        }
        return result;
    }

    public List<User> findAllAsCall() {
        try (CallableStatement st = getConnection().prepareCall(Query.SELECT_ALL_USERS_PROCEDURE)) {
            ResultSet rs = st.executeQuery();
            return readRs(rs);
        } catch (Exception ex) {
            log.error("cannot execute {}", Query.SELECT_ALL_USERS, ex);
            return Collections.emptyList();
        }
    }

    public void transactionalExecution(String gend) {
        try (Connection connection = getConnection()) {
            connection.setAutoCommit(false); //!!!

            try (PreparedStatement updSt = connection.prepareStatement(Query.UPDATE_GENDER_BY_ID)) {

                updSt.setString(1, gend);
                updSt.setInt(2, 1);
                updSt.executeUpdate();
                System.out.println("1 vadin updated");

                if(new Random().nextBoolean()) {
                    System.out.println("[exception thrown]");
                    throw new Exception("I'm out!");
                }

                updSt.setString(1, gend);
                updSt.setInt(2, 2);
                updSt.executeUpdate();
                System.out.println("2 mikas updated");

                connection.commit();

            } catch (Exception ex) {
                ex.printStackTrace();
                System.out.println("{rollback}");
                connection.rollback();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
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