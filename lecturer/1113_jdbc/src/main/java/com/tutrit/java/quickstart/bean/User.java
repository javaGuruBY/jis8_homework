package com.tutrit.java.quickstart.bean;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Builder
public class User {

    private Integer id;
    private String login;
    private String name;
    private String bio;
    private Byte[] image;
    private LocalDate birth;
    private LocalDateTime registered;
    private LocalDateTime updated;
    private Character gender;
    private Double credit;
    private Boolean active;
    private Integer likes;
}
