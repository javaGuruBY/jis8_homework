package com.tutrit.java.iterator.service;

import com.tutrit.java.iterator.bean.MenuItem;
import com.tutrit.java.iterator.myiterators.GuruSteakMenuIterator;
import com.tutrit.java.iterator.myiterators.MyIterator;
import com.tutrit.java.iterator.myiterators.SteakHouseMenuIterator;
import java.util.Iterator;

public class GuruSteakMenuService {
    static final int MAX_ITEMS = 4;
    int numberofItems = 0;
    MenuItem[] menuItems;

    public Iterator<MenuItem> iterator() {
        return new GuruSteakMenuIterator(menuItems);
    }

    public GuruSteakMenuService() {
        menuItems = new MenuItem[MAX_ITEMS];
        addItem("SIRLOIN STEAK", "Sirloin is one of the most popular steaks ", false, 9.45);
        addItem("NEW YORK STRIP", "A New York Strip steak is a particular cut of Top Sirloin", false, 10.45);
        addItem("ROUND STEAK", "steak from well-exercised muscles and consequently quite lean", false, 8.99);
        addItem("FLAT IRON STEAK", "a popular cut with near-perfect marbling that makes it second only to filet mignon in tenderness", false, 1.88);

    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        if(numberofItems >= MAX_ITEMS) {
            System.out.println("No more items could be added to menu. Please, remove one");
        } else {
            menuItems[numberofItems] = new MenuItem(name, description, vegetarian, price);
            numberofItems++;
        }
    }
    public MenuItem[] getMenu() {
        return menuItems;
    }
}
