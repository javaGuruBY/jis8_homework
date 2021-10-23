package com.tutrit.mm.webboot.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

public class PersonDto {
    String name;
    String age;
    String time;

    public PersonDto(String name, String age, String time) {
        this.name = name;
        this.age = age;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
