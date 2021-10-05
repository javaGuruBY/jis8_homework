package com.tutrit.mm.db.gateway;

import com.tutrit.mm.bean.Person;

import java.util.List;

public interface PersonPersistInterface {
    List<Person> getPeople();
}
