package com.tutrit.hibernateinspring.bean;

import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.experimental.FieldNameConstants;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@FieldNameConstants
@EqualsAndHashCode
public class Project {
    @Id
    @GeneratedValue
    @Column(name = "project_id")
    Long projectId;
    String projectName;
    @OneToOne
    @JoinColumn(name = "mentor_id")
    Mentor mentorOnProject;
    @OneToMany(mappedBy = "project", cascade = CascadeType.ALL)
//    @OneToMany(mappedBy = "project", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER) //switch to get application context error
    List<Student> studentsOnProject;
    @OneToMany(mappedBy = "project", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER) //EAGER for test purposes.
//    @OneToMany(mappedBy = "project", cascade = CascadeType.ALL, orphanRemoval = true)
    List<Alumnus> alumnusOnProject;
}
