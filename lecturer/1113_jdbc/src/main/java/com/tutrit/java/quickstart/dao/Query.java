package com.tutrit.java.quickstart.dao;

public class Query {
    public static final String CREATE_JBOYS = "CREATE TABLE `j_boys` (" +
            "  `boy_id` int(2) NOT NULL AUTO_INCREMENT," +
            "  `boy` varchar(50) DEFAULT NULL," +
            "  PRIMARY KEY (`boy_id`)" +
            ");";
    public static final String DROP_JBOYS = "DROP TABLE j_boys";
    public static final String SELECT_ALL_USERS = "SELECT * FROM user";
    public static final String SELECT_USER_BY_ID = "SELECT * FROM user WHERE id = %s";
    public static final String UPDATE_GENDER_BY_ID = "UPDATE user SET gender=? WHERE id=?";
    public static final String SELECT_ALL_USERS_PROCEDURE = "call getAllDevs();";
}
