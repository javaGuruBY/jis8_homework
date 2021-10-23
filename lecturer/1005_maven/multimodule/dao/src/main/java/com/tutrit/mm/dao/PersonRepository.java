package com.tutrit.mm.dao;

import com.tutrit.mm.bean.Person;
import com.tutrit.mm.dao.gateway.PersonRepositoryInterface;
import com.tutrit.mm.db.gateway.PersonPersistInterface;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Configuration
@ComponentScan({"com.tutrit.mm.db","com.tutrit.mm.db.gateway"})
public class PersonRepository implements PersonRepositoryInterface {
    private final PersonPersistInterface personPersist;

    public PersonRepository(PersonPersistInterface personPersist) {
        this.personPersist = personPersist;
    }

    @Override
    public void save(Person person) {
        personPersist.getPeople().add(person);
    }

    @Override
    public List<Person> findAll() {
        return personPersist.getPeople();
    }
}
