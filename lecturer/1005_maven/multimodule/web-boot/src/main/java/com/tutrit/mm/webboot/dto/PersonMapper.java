package com.tutrit.mm.webboot.dto;

import com.tutrit.mm.bean.Person;

public class PersonMapper {

    public static PersonDto map(Person person) {
        return new PersonDto(person.getName(), person.getAge(),
                person.getTime().toString());
    }
}
