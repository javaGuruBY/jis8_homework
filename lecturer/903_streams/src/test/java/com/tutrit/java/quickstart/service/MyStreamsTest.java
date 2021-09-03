package com.tutrit.java.quickstart.service;

import com.tutrit.java.quickstart.bean.Human;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import org.junit.Test;

public class MyStreamsTest {

    @Test
    public void stream() {
        new MyStreams().stream();
    }

    @Test
    public void statistic() {
        List<Human> humans = IntStream.range(0, 5)
                .boxed()
                .map(i -> new Human("vlad", 20))
                .collect(Collectors.toList());

        Double result = new MyStreams().statistic(humans);
        System.out.println(result);
    }
}