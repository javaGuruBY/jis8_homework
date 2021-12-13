package com.tutrit.hibernateinspring.bean;

import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.experimental.FieldNameConstants;

import javax.persistence.*;
import java.util.List;

@Setter
@Getter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@FieldNameConstants
@EqualsAndHashCode
public class Alumnus {
    @Id
    @GeneratedValue
    @Column(name = "alumnus_id")
    Long alumnusId;
    String name;
    @Enumerated(value = EnumType.STRING)
    PrimarySkill primarySkill;
    boolean hired;
    @ManyToMany(mappedBy = "alumnusList", cascade = CascadeType.ALL)
    List<Mentor> mentor;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "projectId", referencedColumnName = "project_id")
    Project project;
}