package com.tutrit.java.quickstart;

import com.tutrit.java.quickstart.bean.Individual;
import com.tutrit.java.quickstart.bean.Person;
import org.junit.Test;

public class PrinterTest {

    @Test
    public void print() {
        Printer printer = new Printer();
        printer.print(
                () -> new Individual("Maksim Shelkovich", 37),
                (humanity) -> System.out.println("humanity = " + humanity)
        );

        printer.print(
                () -> new Person("max", 24),
                (p) -> System.out.println(p)
        );
    }

}