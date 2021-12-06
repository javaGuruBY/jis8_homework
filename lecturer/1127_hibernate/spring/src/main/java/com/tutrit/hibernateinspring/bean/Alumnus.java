package com.tutrit.hibernateinspring.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString(callSuper = true, includeFieldNames = false)
public class Alumnus extends Student {
    boolean isHired;
    @OneToOne
    AlumnusPIIData alumnusPIIData;
    @ManyToMany
    List<Mentor> mentorList = new ArrayList<>();

    public Alumnus(boolean isHired, AlumnusPIIData alumnusPIIData) {
        this.isHired = isHired;
        this.alumnusPIIData = alumnusPIIData;
    }

    public Alumnus(boolean isHired) {
        this.isHired = isHired;
    }
}