package com.tutrit.hibernateinspring.bean;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Setter
@Getter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString(callSuper=true, includeFieldNames=false)
public class Student extends Human {
    String gitHub;
    @ManyToOne
    Mentor mentor;

    public Student(String gitHub) {
        this.gitHub = gitHub;
    }


}