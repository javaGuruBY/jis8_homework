package com.tutrit.java.iterator.myiterators;

import com.tutrit.java.iterator.bean.MenuItem;
import java.util.Iterator;

public class GuruSteakMenuIterator implements Iterator<MenuItem> {
    private final MenuItem[] items;
    private int position = 0;

    public GuruSteakMenuIterator(final MenuItem[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if (items != null || items[position] != null) {
            return position < items.length;
        }
        return false;
    }

    @Override
    public MenuItem next() {
        final MenuItem menuItem = items[position];
        position++;
        return menuItem;
    }
}
