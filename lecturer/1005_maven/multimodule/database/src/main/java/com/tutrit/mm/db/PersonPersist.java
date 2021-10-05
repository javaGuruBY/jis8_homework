package com.tutrit.mm.db;

import com.tutrit.mm.bean.Person;
import com.tutrit.mm.db.gateway.PersonPersistInterface;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PersonPersist implements PersonPersistInterface {
    private static List<Person> people = new ArrayList<>();

    @Override
    public List<Person> getPeople() {
        return people;
    }
}
