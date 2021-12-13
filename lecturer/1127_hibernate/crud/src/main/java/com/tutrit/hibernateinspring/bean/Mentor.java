package com.tutrit.hibernateinspring.bean;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.List;

@Setter
@Getter
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@EqualsAndHashCode
public class Mentor {
    @Id
    @GeneratedValue
    @Column(name = "mentor_id")
    Long mentorId;
    String fullName;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "mentor_student",
            joinColumns = @JoinColumn(name = "mentor_id"),
            inverseJoinColumns = @JoinColumn(name = "student_id"))
    List<Student> studentList;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "mentor_alumnus",
            joinColumns = @JoinColumn(name = "mentor_id"),
            inverseJoinColumns = @JoinColumn(name = "alumnus_id"))
    List<Alumnus> alumnusList;
    @OneToOne(mappedBy = "mentorOnProject", cascade = CascadeType.ALL)
    Project project;
}
