package com.tutrit.hibernateinspring.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Data
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@AllArgsConstructor
@NoArgsConstructor
@ToString(callSuper=true, includeFieldNames=false)
public class Human {
    @Id
    @GeneratedValue //delete and see the difference
    Long id;
    String name;
}
