package com.tutrit.hibernateinspring.bean;

import lombok.*;

import javax.persistence.*;

@Setter
@Getter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class AlumnusPIIData {
    @Id
    Long id;
    String data;

    @MapsId
    @OneToOne
    Alumnus alumnus;

    public AlumnusPIIData(Long id, String data) {
        this.id = id;
        this.data = data;
    }
}
