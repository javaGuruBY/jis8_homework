package com.tutrit.java.iterator.myiterators;

import com.tutrit.java.iterator.bean.MenuItem;
import java.util.Iterator;
import java.util.List;

public class SteakHouseMenuIterator implements Iterator<MenuItem> {
    List<MenuItem> items;
    int position = 0;

    public SteakHouseMenuIterator(List<MenuItem> items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if (items != null || items.get(position) != null) {
            return position < items.size();
        }
        return false;
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = items.get(position);
        position++;
        return menuItem;
    }
}
