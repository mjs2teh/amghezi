package com.project1.taxi.model;


import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Component
@Getter
@Setter
@Entity
@Table
public class Drivers {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    //@Generated
    private Long id;
    @Column
    private String name;
    @Column
    private String carNumber;

//    @OneToOne(mappedBy = "driverId")
//    private Orders orders;

    public Drivers() {
//        this.id = id;
//        this.name = name;
//        this.carNumber = carNumber;
    }

    public Drivers(Long id, String name, String carNumber) {
        this.id = id;
        this.name = name;
        this.carNumber = carNumber;
    }
//    public String getId() {
//        return id;
//    }
//
//    public void setId(String id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getCarNumber() {
//        return carNumber;
//    }
//
//    public void setCarNumber(String carNumber) {
//        this.carNumber = carNumber;
//    }

//نمتسیبلخذ بلذ سیمنب سمنیبلذمنسیب ذمنتسیذ تمنی

}
