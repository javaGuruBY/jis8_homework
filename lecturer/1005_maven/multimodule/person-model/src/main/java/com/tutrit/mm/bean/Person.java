package com.tutrit.mm.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    private String name;
    private String age;
    LocalDateTime time = LocalDateTime.now();
}
