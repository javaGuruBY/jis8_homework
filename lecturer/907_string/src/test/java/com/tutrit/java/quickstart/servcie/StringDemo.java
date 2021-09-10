package com.tutrit.java.quickstart.servcie;

import com.tutrit.java.quickstart.Person;
import com.tutrit.java.quickstart.bean.Human;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StringDemo {
    Person human;

    @Test
    public void byteArrayToString() {
        byte[] result = {77, 97, 120};
        IntStream.range(0, result.length)
                .boxed()
                .map(i -> result[i])
                .map(aByte -> (char) aByte.byteValue())
                .forEach(System.out::print);
    }

    @Test
    public void StringConcat() {
        String a = "hello";
        String b = "world";
        String n = null;
        String c = "The world is mine";

        String result =
                new StringBuffer().append(a).append(b).append(n).append(c).toString();
        System.out.println(result);

        String result2 = Stream.of(a, b, n, c)
                .filter(val -> val != null)
                .map(val -> val.toUpperCase(Locale.ROOT))
                .collect(Collectors.joining(" ", "{", "}"));
        System.out.println(result2);
    }

    @Test
    public void immutability() {
//        Person firstPerson = new Person("Mikas");
//        firstPerson.setMutableName("Mikas");
//        Person secondPerson = firstPerson;
//        Person thirdPerson = secondPerson;
//        thirdPerson.setMutableName("Maksim");
//
//        System.out.println("firstPerson = " + firstPerson);
//        System.out.println("secondPerson = " + secondPerson);
//        System.out.println("thirdPerson = " + thirdPerson);

        String firstPerson = new String("Mikas");
        String secondPerson = firstPerson;
        String thirdPerson = secondPerson;
        thirdPerson.concat("Maksim");

        System.out.println("firstPerson = " + firstPerson);
        System.out.println("secondPerson = " + secondPerson);
        System.out.println("thirdPerson = " + thirdPerson);

        secondPerson = thirdPerson.concat(" _Maksim_");
        System.out.println("secondPerson = " + secondPerson);
    }

    @Test
    public void mutabilityOfCollection() {
        String name = "max";
        Person person = new Person("Maksim Shelkovich", List.of(name));
        System.out.println("person = " + person);

        name.concat(" shelkovich");
        System.out.println("person = " + person);

        StringBuffer newName = mutateName(new StringBuffer(name));
        System.out.println("person = " + person);

        newName.append(" adds at new Name");
        System.out.println("person = " + person);
    }

    private StringBuffer mutateName(StringBuffer name) {
        name.append(" from Method");
        return name;
    }

    @Test
    public void searchAndReplace() {
//        0 1 2 3 4 5 6 7 8 9 10 11 12 12 14 15 16
//        M A K S I M   S H E L  K  O  V  I  C  H

        String s = "MAKSIM SHELKOVICH";
        System.out.println("s.length() = " + s.length());
        System.out.println("s.charAt(3) = " + s.charAt(3));
        System.out.println("s.substring(7, 17) = " + s.substring(7, 17));
        System.out.println("s.trim() = " + s.trim());
        System.out.println("s = " + s);
        System.out.println("s.toLowerCase() = " + s.toLowerCase());
        System.out.println("s.compareToIgnoreCase(\"Maksim Shelkovich\") = " + s.compareToIgnoreCase("Maksim Shelkovich"));
        System.out.println("s.contains(\"MAKSIM\") = " + s.contains("MAKSIM"));
        System.out.println("s.indexOf(\"M\") = " + s.indexOf("M"));
        System.out.println("s.indexOf(\"M\", 1) = " + s.indexOf("M", 1));
        System.out.println("s.replaceFirst(\"S\", \"SS\") = " + s.replaceFirst("S", "SS"));
        System.out.println("s.replaceAll(\"S\", \"SS\") = " + s.replaceAll("S", "SS")); //s.replace(...)
        System.out.println("s.startsWith(\"Maksim\") = " + s.startsWith("Maksim"));
        System.out.println("s.endsWith(\"h\") = " + s.endsWith("h"));
        System.out.println("s.toUpperCase().startsWith(\"Maksim\".toUpperCase()) = " + s.toUpperCase().startsWith("Maksim".toUpperCase()));

        String hello = " hello ";
        System.out.println("hello =:" + hello + ":");
        System.out.println("hello.strip() =:" + hello.strip() + ":");
        System.out.println("hello.stripLeading() =:" + hello.stripLeading() + ":");
        System.out.println("hello.stripTrailing() =:" + hello.stripTrailing() + ":");
        System.out.println("hello.trim() =:" + hello.trim() + ":");
    }

    @Test
    public void emptyBlank() {
        String s = "";
        System.out.println("s = :" + s + ":");
        System.out.println("s.isEmpty() = " + s.isEmpty());
        System.out.println("s.isBlank() = " + s.isBlank());

        s = " ";
        System.out.println("s = :" + s + ":");
        System.out.println("s.isEmpty() = " + s.isEmpty());
        System.out.println("s.isBlank() = " + s.isBlank());

        s = null;
        System.out.println("s = :" + s + ":");
        System.out.println("s.isEmpty() = " + s.isEmpty());
        System.out.println("s.isBlank() = " + s.isBlank());
    }

    @Test
    public void compare() {
        String newLeft = new String("hello");
        String left = "hello";
        String right = "HellO";
        System.out.println("left.equals(right) = " + left.equals(right));
        System.out.println("left.equalsIgnoreCase(right) = " + left.equalsIgnoreCase(right));

        String leftInPool = "hello";
        System.out.println("left == leftInPool = " + (left == leftInPool));
        System.out.println("newLeft == leftInPool = " + (newLeft == leftInPool));
    }

    @Test
    public void stringFormat() {
        String hello = "Hello, World!";

        System.out.println("String.format(\"|%s|\",  hello) = " + String.format("|%s|", hello));  //whole string
        System.out.println("String.format(\"|%30s|\",  hello) = " + String.format("|%30s|", hello)); //with width fixed
        System.out.println("String.format(\"|%3s|\",  hello) = " + String.format("|%3s|", hello)); //with width fixed if string wider
        System.out.println("String.format(\"|%3s|\",  h) = " + String.format("|%3s|", "h")); //with width fixed if string wider
        System.out.println("String.format(\"|%.3s|\",  hello) = " + String.format("|%.3s|", hello)); //Maximum number of chars
        System.out.println("String.format(\"|%3.3s|\",  hello) = " + String.format("|%.3s|", hello)); //with width fixed & maximum number of chars
        System.out.println("String.format(\"|%-30s|\",  hello) = " + String.format("|%-30s|", hello));  //with justification

        System.out.println("String.format(\"My name is: %2$s\", \"first\", \"second\") = " + String.format("My name is: %2$s", "first", "second")); //with argument position in string (%2$)

        System.out.println("String.format(\"|%+-20.3f|\", 99.00) = " + String.format("|%+-20.3f|", 99.00));  //with leading +\- left align fixed 20 width floating and 3 digits precision
    }

    @Test
    public void dateFormatting() {
        var date = LocalDateTime.now();
        System.out.println("String.format(\"Today is %tA\", date) = " + String.format("Today is %tA", date));
        System.out.println("String.format(\"Today is %ta\", date) = " + String.format("Today is %ta", date));
        System.out.println("String.format(\"Today is %tB\", date) = " + String.format("Today is %tB", date));
        System.out.println("String.format(\"Today is %tb\", date) = " + String.format("Today is %tb", date));
        System.out.println("String.format(\"Today is %tC\", date) = " + String.format("Today is %tC", date));
//        String.format("Today is %tc", date);
        System.out.println("String.format(\"Today is %tD\", date) = " + String.format("Today is %tD", date));
        System.out.println("String.format(\"Today is %td\", date) = " + String.format("Today is %td", date));
//        String.format("Today is %tE", date);
        System.out.println("String.format(\"Today is %te\", date) = " + String.format("Today is %te", date));
        System.out.println("String.format(\"Today is %tF\", date) = " + String.format("Today is %tF", date));
//        String.format("Today is %tf", date);
//        String.format("Today is %tg", date);
//        String.format("Today is %tG", date);
        System.out.println("String.format(\"Today is %tH\", date) = " + String.format("Today is %tH", date));
        System.out.println("String.format(\"Today is %th\", date) = " + String.format("Today is %th", date));
        System.out.println("String.format(\"Today is %tI\", date) = " + String.format("Today is %tI", date));
//        String.format("Today is %ti", date);
//        String.format("Today is %tJ", date);
        System.out.println("String.format(\"Today is %tj\", date) = " + String.format("Today is %tj", date));
//        String.format("Today is %tK", date);
        System.out.println("String.format(\"Today is %tk\", date) = " + String.format("Today is %tk", date));
        System.out.println("String.format(\"Today is %tL\", date) = " + String.format("Today is %tL", date));
        System.out.println("String.format(\"Today is %tl\", date) = " + String.format("Today is %tl", date));
        System.out.println("String.format(\"Today is %tM\", date) = " + String.format("Today is %tM", date));
        System.out.println("String.format(\"Today is %tm\", date) = " + String.format("Today is %tm", date));
        System.out.println("String.format(\"Today is %tN\", date) = " + String.format("Today is %tN", date));
//        String.format("Today is %tn", date);
//        String.format("Today is %tP", date);
        System.out.println("String.format(\"Today is %tp\", date) = " + String.format("Today is %tp", date));
//        String.format("Today is %tQ", date);
//        String.format("Today is %tq", date);
        System.out.println("String.format(\"Today is %tR\", date) = " + String.format("Today is %tR", date));
        System.out.println("String.format(\"Today is %tr\", date) = " + String.format("Today is %tr", date));
        System.out.println("String.format(\"Today is %tS\", date) = " + String.format("Today is %tS", date));
//        String.format("Today is %ts", date);
        System.out.println("String.format(\"Today is %tT\", date) = " + String.format("Today is %tT", date));
//        String.format("Today is %tt", date);
//        String.format("Today is %tX", date);
//        String.format("Today is %tx", date);
        System.out.println("String.format(\"Today is %tY\", date) = " + String.format("Today is %tY", date));
        System.out.println("String.format(\"Today is %ty\", date) = " + String.format("Today is %ty", date));
//        String.format("Today is %tZ", date);
//        String.format("Today is %tz", date);
    }

    @Test
    public void formatWithLocale() {
        Locale.setDefault(Locale.CHINA);
        printDates();
        Locale.setDefault(Locale.UK);
        printDates();
        Locale.setDefault(new Locale("ru"));
        printDates();
        Locale.setDefault(new Locale("be"));
        printDates();
    }

    public void printDates() {
//        var locale = new Locale("ru");

        var date = LocalDateTime.now();
        System.out.println("String.format(\"Today is %tA\", date) = " + String.format(Locale.getDefault(), "Today is %tA", date));
        System.out.println("String.format(\"Today is %ta\", date) = " + String.format(Locale.getDefault(), "Today is %ta", date));
        System.out.println("String.format(\"Today is %tB\", date) = " + String.format(Locale.getDefault(), "Today is %tB", date));
        System.out.println("String.format(\"Today is %tb\", date) = " + String.format(Locale.getDefault(), "Today is %tb", date));
        System.out.println("String.format(\"Today is %tC\", date) = " + String.format(Locale.getDefault(), "Today is %tC", date));
        System.out.println("String.format(\"Today is %tD\", date) = " + String.format(Locale.getDefault(), "Today is %tD", date));
        System.out.println("String.format(\"Today is %td\", date) = " + String.format(Locale.getDefault(), "Today is %td", date));
        System.out.println("String.format(\"Today is %te\", date) = " + String.format(Locale.getDefault(), "Today is %te", date));
        System.out.println("String.format(\"Today is %tF\", date) = " + String.format(Locale.getDefault(), "Today is %tF", date));
        System.out.println("String.format(\"Today is %tH\", date) = " + String.format(Locale.getDefault(), "Today is %tH", date));
        System.out.println("String.format(\"Today is %th\", date) = " + String.format(Locale.getDefault(), "Today is %th", date));
        System.out.println("String.format(\"Today is %tI\", date) = " + String.format(Locale.getDefault(), "Today is %tI", date));
        System.out.println("String.format(\"Today is %tj\", date) = " + String.format(Locale.getDefault(), "Today is %tj", date));
        System.out.println("String.format(\"Today is %tk\", date) = " + String.format(Locale.getDefault(), "Today is %tk", date));
        System.out.println("String.format(\"Today is %tL\", date) = " + String.format(Locale.getDefault(), "Today is %tL", date));
        System.out.println("String.format(\"Today is %tl\", date) = " + String.format(Locale.getDefault(), "Today is %tl", date));
        System.out.println("String.format(\"Today is %tM\", date) = " + String.format(Locale.getDefault(), "Today is %tM", date));
        System.out.println("String.format(\"Today is %tm\", date) = " + String.format(Locale.getDefault(), "Today is %tm", date));
        System.out.println("String.format(\"Today is %tN\", date) = " + String.format(Locale.getDefault(), "Today is %tN", date));
        System.out.println("String.format(\"Today is %tp\", date) = " + String.format(Locale.getDefault(), "Today is %tp", date));
        System.out.println("String.format(\"Today is %tR\", date) = " + String.format(Locale.getDefault(), "Today is %tR", date));
        System.out.println("String.format(\"Today is %tr\", date) = " + String.format(Locale.getDefault(), "Today is %tr", date));
        System.out.println("String.format(\"Today is %tS\", date) = " + String.format(Locale.getDefault(), "Today is %tS", date));
        System.out.println("String.format(\"Today is %tT\", date) = " + String.format(Locale.getDefault(), "Today is %tT", date));
        System.out.println("String.format(\"Today is %tY\", date) = " + String.format(Locale.getDefault(), "Today is %tY", date));
        System.out.println("String.format(\"Today is %ty\", date) = " + String.format(Locale.getDefault(), "Today is %ty", date));

        String dateFormatted = "%ty%tY%tr%tM%tA%tC%tL";
        String resultDate = String.format(Locale.getDefault(),
                "Today is "+dateFormatted,
                IntStream.range(0, dateFormatted.length()/3)
                        .mapToObj(i -> date)
                        .toArray());

        System.out.println("resultDate = " + resultDate);
    }

    @Test
    public void useCase() {
        Logger logger = LoggerFactory.getLogger("useCase");
        logger.info("message {} {}", new Human(""), new Person(""));

        System.out.println(String.format("message %s %s", new Human(""), new Person("")));
        System.out.println("message " + new Human("") + " " + new Person(""));

        String template = "My message %s is %s";
        System.out.println(template.formatted(new Human(""), new Person("")));
        template.formatted(new Human(""), new Person(""));

        System.out.println("template.transform(s -> new Person(s.split(\" \")[1])) = "
                + template.transform(s -> new Person(s.split(" ")[1])));
    }
}
