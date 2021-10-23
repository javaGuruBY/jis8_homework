package com.tutrit.mm.dao;

import com.tutrit.java.quickstart.controller.PersonRepositoryInterface;
import com.tutrit.java.quickstart.model.Person;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class PersonRepository implements PersonRepositoryInterface {
    PersonPersistInterface personPersist;

    public void save(Person person) {
        personPersist.getPeople().add(person);
    }

    public List<Person> findAll() {
        return personPersist.getPeople();
    }
}
