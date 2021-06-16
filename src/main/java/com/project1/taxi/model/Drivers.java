package com.project1.taxi.model;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Component
public class Drivers {

    private String id;
    private String name;
    private String carNumber;

    public Drivers(String id, String name, String carNumber) {
        this.id = id;
        this.name = name;
        this.carNumber = carNumber;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }



}
