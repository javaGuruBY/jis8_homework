package com.tutrit.java.quickstart;

import com.tutrit.java.quickstart.bean.Person;
import java.util.function.Supplier;

public class PersonFabric implements Supplier<Person> {
    @Override
    public Person get() {

        Supplier<Person> personSupplier = () -> new Person("", 34);


        return new Person("", 34);



    }


}
