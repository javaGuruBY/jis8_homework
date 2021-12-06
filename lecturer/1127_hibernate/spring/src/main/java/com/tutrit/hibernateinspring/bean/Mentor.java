package com.tutrit.hibernateinspring.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString(callSuper = true, includeFieldNames = false)
public class Mentor extends Human {
    Double salary;
    @OneToMany(fetch = FetchType.EAGER)
    List<Student> student = new ArrayList<>();
    @ManyToMany
    List<Alumnus> alumnusList = new ArrayList<>();

    public Mentor(Double salary) {
        this.salary = salary;
    }

    public List<Student> getStudent() {
        return student == null ? new ArrayList<>() : student;
    }

    public Mentor(Double salary, List<Student> student) {
        this.salary = salary;
        this.student = student;
    }
}
