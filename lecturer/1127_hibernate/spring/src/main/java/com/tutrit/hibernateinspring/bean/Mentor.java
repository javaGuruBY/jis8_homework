package com.tutrit.hibernateinspring.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString(callSuper=true, includeFieldNames=false)
public class Mentor extends Human {
    Double salary;
}
