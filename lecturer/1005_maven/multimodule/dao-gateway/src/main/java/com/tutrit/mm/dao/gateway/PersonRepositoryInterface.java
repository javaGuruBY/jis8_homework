package com.tutrit.mm.dao.gateway;

import com.tutrit.mm.bean.Person;

import java.util.List;

public interface PersonRepositoryInterface {
    public void save(Person person);
    public List<Person> findAll();
}
