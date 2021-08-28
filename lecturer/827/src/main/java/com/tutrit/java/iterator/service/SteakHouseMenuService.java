package com.tutrit.java.iterator.service;

import com.tutrit.java.iterator.bean.MenuItem;
import com.tutrit.java.iterator.myiterators.SteakHouseMenuIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class SteakHouseMenuService {
    private List<MenuItem> menuItemList = new ArrayList<>();

    public Iterator<MenuItem> iterator() {
        return new SteakHouseMenuIterator(menuItemList);
    }

    public SteakHouseMenuService() {
        menuItemList.addAll(
                Arrays.asList(new MenuItem("FILET MIGNON", "beef tenderloin or filet mignon is the most tender cut of beef", false, 5.45),
                        new MenuItem("RIBEYE", "beauty steak or scotch fillet, rib eye is one of the most prized steaks", false, 5.09),
                        new MenuItem("TOMAHAWK", "a cut of beef ribeye that has the whole rib bone attached, and it’s sometimes called a cowboy steak or bone-in ribeye", false, 6.45),
                        new MenuItem("CHUCK EYE", "located very close to rib eye steaks and therefore shares many characteristics of a rib eye", false, 3.45))
        );
    }

    public List<MenuItem> getMenu() {
        return this.menuItemList;
    }
    public void addMenuItem(String name, String description, boolean vegetarian, double price) {
        menuItemList.add(new MenuItem(name, description, vegetarian, price));
    }
}
