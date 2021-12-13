package com.tutrit.java.quickstart.bean;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Boy {
    Integer id;
    String boy;
    LocalDateTime date;
}
