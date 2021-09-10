package com.tutrit.java.quickstart;

import com.tutrit.java.iterator.bean.MenuItem;
import com.tutrit.java.iterator.service.CommonMenu;
import com.tutrit.java.quickstart.service.OuterClass;
import com.tutrit.java.quickstart.service.OuterClass.StaticNestedClass;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeMap;

public class Application {


    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        outerClass.new CardDto();

        StaticNestedClass staticClass = new StaticNestedClass();

        OuterClass.CardDto dataDto = outerClass.getFullNameAndAge();
        outerClass.printCard(outerClass.getFullNameAndAge(), args[0]);

        new ArrayList<>().iterator();
        new LinkedList<>().iterator();
        new TreeMap<>().values().iterator();

        Iterable<MenuItem> menu = new ArrayList<>();
        menu.forEach(System.out::println);
        Iterator<MenuItem> iterator = menu.iterator();
        while (iterator.hasNext()) {
            iterator.next();
        }
        for (MenuItem menuitem : menu) {
            System.out.println("menuitem = " + menuitem);
        }
    }
}
