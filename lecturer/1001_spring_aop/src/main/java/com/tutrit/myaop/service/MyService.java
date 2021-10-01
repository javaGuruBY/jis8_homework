package com.tutrit.myaop.service;

import com.tutrit.myaop.bean.Person;
import com.tutrit.myaop.interfaces.MyServiceI;
import org.springframework.stereotype.Service;

@Service
public class MyService implements MyServiceI {

  @Override
  public String getMessage() {
    return "Max";
  }

  @Override
  public Person getPerson(int age, String name, long id) {
    var person = new Person();
    person.setAge(age);
    person.setName(name);
    person.setId(id);
    return person;
  }

  @Override
  public Person getPersonAsParams(int age, String name) {
    var person = new Person();
    person.setAge(age);
    person.setName(name);
    return person;
  }

  @Override
  public Person getPersonAsObject(Person person) {
    return person;
  }

  @Override
  public Person getPersonWeb(String name,
                             Integer age,
                             Long id) {
    var person = new Person();
    person.setAge(age);
    person.setName(name);
    person.setId(id);
    return person;
  }

  @Override
  public Person getPersonAsParamsWeb(String name,
                                     Integer age) {
    var person = new Person();
    person.setAge(age);
    person.setName(name);
    return person;
  }

}
