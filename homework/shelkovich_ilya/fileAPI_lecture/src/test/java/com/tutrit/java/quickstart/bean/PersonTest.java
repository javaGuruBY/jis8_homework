package com.tutrit.java.quickstart.bean;

import org.junit.Test;

import java.io.*;

import static org.junit.Assert.*;

public class PersonTest {

    @Test
    public void writePerson() throws Exception {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("max.srl"));
        oos.writeObject(makePerson());
        oos.flush();
        oos.close();
    }

    @Test
    public void readPerson() throws Exception {
        ObjectInputStream fis = new ObjectInputStream(new FileInputStream("max.srl"));
        assertEquals(makePerson(), fis.readObject());
        fis.close();
    }

    @Test
    public void tryWithResources(){
        try(ObjectInputStream fis  = new ObjectInputStream(new FileInputStream("max.srl"))) {
            assertEquals(makePerson(), fis.readObject());
        } catch (Exception e){    //можно без блока catch. блок файнали если необходимо закрыть ресурсы.
            e.printStackTrace();
        }
    }

    public Person makePerson(){
        return new Person("max", 37);
    }
}
