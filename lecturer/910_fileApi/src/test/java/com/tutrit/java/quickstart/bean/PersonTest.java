package com.tutrit.java.quickstart.bean;

import static org.junit.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import org.junit.Test;

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
    public void tryWithResources() throws IOException, ClassNotFoundException {
        try (ObjectInputStream fis = new ObjectInputStream(new FileInputStream("max.srl"))) {
            assertEquals(makePerson(), fis.readObject());
        }
    }

    public Person makePerson() {
        return new Person("max", 37);
    }
}
