package com.tutrit.java.quickstart;

import com.tutrit.java.quickstart.bean.Person;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.junit.Test;

public class ReflectionApi {

  @Test
  public void getClassObject() {
    Person person = new Person();
    Class<? extends Person> getClassForPerson = person.getClass();
    Class<Person> personClass = Person.class;
    Class<?> classForPerson = null;
    try {
      classForPerson = Class.forName("com.tutrit.java.quickstart.bean.Person");
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }
    System.out.println(classForPerson);
  }

  @Test
  public void getObjectFromClass() throws NoSuchFieldException, NoSuchMethodException {
    Class<Person> c = Person.class;
    c.getName(); // полное имя с пакетом
    c.getSimpleName(); // краткое имя
    c.getModifiers(); // модификаторы доступа
    c.getSuperclass(); // получить от родителя
    c.getInterfaces(); // получить интерфейсы, но не получит интрефейсы супер класса

    c.getFields(); // только публичные
    c.getDeclaredFields(); // и приватные, но только текущего класса
    c.getField("name");  // взять конкретное поле

    Class[] paramTypes = new Class[] {String.class, int.class};

    c.getMethods();
    c.getDeclaredMethods();
    c.getMethod("setData", paramTypes); //String.class

    c.getConstructors();
    c.getDeclaredConstructors();
    c.getConstructor(paramTypes);
  }

  @Test
  public void createObjectFromClass() {
    Class<Person> personClass = Person.class;
    try {
      Person person = personClass.newInstance();
    } catch (InstantiationException e) {
      e.printStackTrace();
    } catch (IllegalAccessException e) {
      e.printStackTrace();
    }

    try {
      Class[] paramTypes = new Class[] {String.class, int.class};
      Constructor<Person> personConstructor = personClass.getConstructor();
      Constructor<Person> personConstructorWithParams = personClass.getConstructor(paramTypes);
      Person person = personConstructor.newInstance();
      Person person2 = personConstructorWithParams.newInstance("", 34);
    } catch (InvocationTargetException e) {
      e.printStackTrace();
    } catch (InstantiationException e) {
      e.printStackTrace();
    } catch (IllegalAccessException e) {
      e.printStackTrace();
    } catch (NoSuchMethodException e) {
      e.printStackTrace();
    }
  }

  @Test
  public void callClassMethod() {
    Class[] paramTypes = new Class[] {String.class, int.class};
    Class<Person> personClass = Person.class;
    try {
      Method getName = personClass.getMethod("getName");
      Method getAge = personClass.getMethod("getAge");
      Method setData = personClass.getMethod("setData", paramTypes);
      Object name = getName.invoke(new Person());
      Object age = getAge.invoke(new Person("max", 43));

      var person = new Person("max", 43);
      setData.invoke(person, "bax", 27);
    } catch (NoSuchMethodException e) {
      e.printStackTrace();
    } catch (InvocationTargetException e) {
      e.printStackTrace();
    } catch (IllegalAccessException e) {
      e.printStackTrace();
    }
  }

  @Test
  public void privateAccess()
      throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
    var person = new Person();
    try {
      person.getClass().getField("secret");
    } catch (NoSuchFieldException e) {
      e.printStackTrace();
    }
    Field secretField = person.getClass().getDeclaredField("secret");
    secretField.setAccessible(true);
    Object secret = secretField.get(person);

    Method secretMethod = person.getClass().getDeclaredMethod("getSecret");
    Object secretFromMethod = secretMethod.invoke(person);
  }
}
