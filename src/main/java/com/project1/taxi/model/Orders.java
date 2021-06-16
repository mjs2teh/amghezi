package com.project1.taxi.model;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;


public class Orders {

    private String id;
    private String driverId;
    private String customerId;


    public Orders(String id, String driverId, String customerId) {
        this.id = id;
        this.driverId = driverId;
        this.customerId = customerId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDriverId() {
        return driverId;
    }

    public void setDriverId(String driverId) {
        this.driverId = driverId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }


}
