package com.tutrit.java.quickstart.database;

import com.tutrit.mm.dao.PersonPersistInterface;
import com.tutrit.java.quickstart.model.Person;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PersonPersist implements PersonPersistInterface {
    private static List<Person> people = new ArrayList<>();

    public List<Person> getPeople() {
        return people;
    }
}
