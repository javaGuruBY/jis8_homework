package com.tutrit.java.quickstart;

import com.tutrit.java.quickstart.bean.Humanity;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Printer {

    public <T extends Humanity> void print(
            Supplier<T> supplier,
            Consumer<T> consumer
    ) {
        T object = supplier.get();
        consumer.accept(object);
    }
}
