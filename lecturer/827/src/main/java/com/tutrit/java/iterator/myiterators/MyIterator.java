package com.tutrit.java.iterator.myiterators;

import com.tutrit.java.iterator.bean.MenuItem;

public interface MyIterator<T extends MenuItem> {
    boolean hasNext();
    T next();
}
