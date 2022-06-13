package com.tutrit.java.quickstart.junit;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User {

    private final int id;
    private final String name;
    private final int age;
}
