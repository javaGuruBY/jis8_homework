package com.tutrit.java.quickstart;


import static org.junit.Assert.assertEquals;

import com.tutrit.java.quickstart.bean.Student;
import org.junit.Test;

public class ApplicationTest {

    @Test
    public void main() {
    }

    @Test
    public void objectLifeCycle() {
        var studentOksana = new Student(18, "Oksana");
        Student.staticField = "Changed";
        var studentTatjana = new Student("Tatjana");

        assertEquals("Changed", Student.staticField);
    }
}
