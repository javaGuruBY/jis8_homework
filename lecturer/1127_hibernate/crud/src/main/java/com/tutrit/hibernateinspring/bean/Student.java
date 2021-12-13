package com.tutrit.hibernateinspring.bean;

import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.experimental.FieldNameConstants;

import javax.persistence.*;
import java.util.List;

@Setter
@Getter
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@FieldNameConstants
@EqualsAndHashCode
public class Student {
    @Id
    @GeneratedValue
    @Column(name = "student_id")
    Long studentId;
    String gitHub;
    @ManyToMany(mappedBy = "studentList")
    List<Mentor> mentor;
    @ManyToOne
    @JoinColumn(name = "projectId", referencedColumnName = "project_id")
    Project project;
}