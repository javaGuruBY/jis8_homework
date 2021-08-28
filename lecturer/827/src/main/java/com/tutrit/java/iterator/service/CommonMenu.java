package com.tutrit.java.iterator.service;

import com.tutrit.java.iterator.bean.MenuItem;
import com.tutrit.java.iterator.myiterators.MyIterator;
import java.util.Iterator;
import java.util.List;

public class CommonMenu {
    public static void printMenu() {
        List.of(
                new GuruSteakMenuService().iterator(),
                new SteakHouseMenuService().iterator()
        ).forEach(CommonMenu::print);
    }

    private static void print(Iterator<MenuItem> guruSteakMenu) {
        while (guruSteakMenu.hasNext()) {
            System.out.println(guruSteakMenu.next());
        }
    }
}