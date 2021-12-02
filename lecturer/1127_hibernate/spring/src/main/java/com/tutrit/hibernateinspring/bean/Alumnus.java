package com.tutrit.hibernateinspring.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString(callSuper=true, includeFieldNames=false)
public class Alumnus extends Student {
    boolean isHired;
    @OneToOne
    AlumnusPIIData alumnusPIIData;
}