package com.tutrit.myaop.interfaces;

import com.tutrit.myaop.bean.Person;

public interface MyServiceI {
    String getMessage();

    Person getPerson(int age, String name, long id);

    Person getPersonAsParams(int age, String name);

    Person getPersonAsObject(Person person);

    Person getPersonWeb(String name,
                        Integer age,
                        Long id);

    Person getPersonAsParamsWeb(String name,
                                Integer age);
}
