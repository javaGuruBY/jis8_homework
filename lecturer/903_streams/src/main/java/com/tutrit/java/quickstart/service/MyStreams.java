package com.tutrit.java.quickstart.service;

import static java.util.stream.Collectors.summarizingInt;
import static java.util.stream.Collectors.summingInt;

import com.tutrit.java.quickstart.bean.Country;
import com.tutrit.java.quickstart.bean.Human;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Spliterator;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;
import java.util.stream.BaseStream;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class MyStreams {
    Consumer<String> nameConsumer = (s) -> System.out.println(s);
    BiConsumer<String, Integer> nameMapConsumer = (k, v) -> System.out.println(k + v);

    public void stream() {
        List<String> names = List.of("Yaroslav", "Vasiliy", "Maksim");
        names.stream().forEach(System.out::println);
        names.forEach(System.out::println);

        Map<String, Integer> namesMap = Map.of("Yaroslav", 100, "Vasiliy", 200, "Maksim", 5500);
        namesMap.keySet().stream().forEach(System.out::println);
        namesMap.values().stream().forEach(System.out::println);
        namesMap.entrySet().stream().forEach(System.out::println);
        namesMap.forEach((k, v) -> System.out.println(k + v));
    }

    public void mapping() {
        List<Human> result = Map.of("Yaroslav", 34, "Vasiliy", 23, "Maksim", 37).entrySet().stream()
                .map(entry -> new Human(entry.getKey(), entry.getValue()))
                .collect(Collectors.toList());

        final int yearsPassed = 3;

        result.stream()
                .forEach(h -> addAge(h, yearsPassed));

        result.stream().forEach(addAge);
        result.stream().forEach((h) -> h.setAge(h.getAge() + 2));
        result.stream().forEach((h) -> addExacAge.accept(h, yearsPassed));

        result.stream()
                .map(addAgeF)
                .filter(isOld)
                .collect(Collectors.toList());

        result.stream()
                .map(h -> addAge(h, 34))
                .filter(isOld)
                .collect(Collectors.toList());

        Map<String, Integer> mapResult = result.stream()
                .collect(Collectors.toMap(Human::getName, Human::getAge, (existed, newH) -> newH));

        Map<Integer, Human> myHumans = result.stream()
                .collect(Collectors.toMap(Human::getId, Function.identity()));

        Map<Boolean, List<Human>> grouped = result.stream()
                .collect(Collectors.groupingBy(h -> h.getAge() > 15));

        Map<String, List<Human>> grouppedByName = result.stream()
                .collect(Collectors.groupingBy(h -> h.getName()));

        List<Human> humans = grouppedByName.entrySet().stream()
                .filter(isPresentInBlackList)
                .flatMap(entry -> entry.getValue().stream())
                .collect(Collectors.toList());
    }

    private Predicate<Map.Entry<String, List<Human>>> isPresentInBlackList = entry -> {
        final List<String> names = List.of("Yaroslav", "Vasiliy", "Maksim");
        return names.contains(entry.getKey());
    };


    private Human addAge(Human human, Integer age) {
        human.setAge(human.getAge() + age);
        return human;
    }

    private boolean isOld(Human human) {
        return human.getAge() > 27;
    }

    private Consumer<? super Human> addAge = (human) -> human.setAge(human.getAge() + human.getAge());
    private Function<? super Human, ? extends Human> addAgeF = (human) -> {
        human.setAge(human.getAge() + 2);
        return human;
    };

    private Predicate<Human> isOld = (human) -> human.getAge() > 27;

    private BiConsumer<? super Human, ? super Integer> addExacAge = (human, age) -> human.setAge(human.getAge() + age);

    public List<String> names = List.of("Muhhamed", "NewMhhamed", "Abdul");
    public Map<String, Integer> rawData = Map.of("Yaroslav", 34, "Abdul", 23, "Maksim", 37);
    public List<Human> humanList = rawData.entrySet()
            .stream()
            .map((set) -> new Human(set.getKey(), set.getValue()))
            .collect(Collectors.toList());

    public void compareOperation() {
        Map<String, Human> myMap = humanList.stream()
                .collect(Collectors.toMap(Human::getName, Function.identity()));
        names.forEach(h -> putToPrison(myMap.get(h)));

        rawData.entrySet().stream().map((set) -> new Human(set.getKey(), set.getValue()))
                .filter(h -> names.contains(h.getName()))
                .forEach(h -> putToPrison(h));

        names.stream()
                .map(el -> create())
                .map(el -> 42)
                .collect(Collectors.toList());
    }

    public void putToPrison(Human human) {

    }

    public Object create() {
        return new Object();
    }



    public Human findById(List<Human> humanList, int id) {
        for (Human human : humanList) {
            if (human.getId() == id) {
                return human;
            }
        }
        return null;
    }

    public Human findById(int id, List<Human> humanList) {
        return humanList.stream()
                .collect(Collectors.toMap(Human::getId, Function.identity()))
                .get(id);
    }

    public void arrayAsStream() {
        int[] arrayInt = {1, 2, 3, 4, 5, 6};
        Arrays.stream(arrayInt).boxed().collect(Collectors.toList());
        IntStream.of(1, 2, 3, 4, 5, 6).boxed().collect(Collectors.toList());
        IntStream.rangeClosed(0, 9)
                .forEach(System.out::println);

        int[] array1 = new int[10];
        int[] array2 = new int[10];
        int[] sum = new int[10];

        for (int i = 0; i < array1.length; i++) {
            sum[i] = array1[i] + array2[i];
        }

        int[] result = IntStream.range(0, array1.length)
                .map(i -> array1[i] + array2[i])
                .toArray();
    }

    private void flatMap() {
        IntStream.range(0, 100)
                .boxed()
                .map(i -> new Country())

                .flatMap(c -> c.getPeoples().stream())

                .filter(h -> h.getAge() < 14)
                .map(Human::getName)
                .collect(Collectors.toList());
    }

    public Double statistic(final List<Human> humanList) {
        return humanList.stream()
                .map(Human::getAge)
                .collect(summarizingInt(Integer::intValue))
                .getAverage();
    }

    public void sortEx(List<Human> humanList) {
        humanList.stream()
                .sorted(Comparator.comparing(Human::getName)
                        .thenComparing(Human::getAge))
                .collect(Collectors.toList());
    }
}
