package com.project1.taxi.model;

import lombok.Generated;
import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Component
@Getter
@Setter
@Entity
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    //@Generated
    private String id;
    @Column
    private String driverId;
    @Column
    private String customerId;

    public Orders() {
    }

    public Orders(String driverId, String customerId) {
        //this.id = id;
        this.driverId = driverId;
        this.customerId = customerId;
    }

    //    public Orders() {
//        this.id = id;
//        this.driverId = driverId;
//        this.customerId = customerId;
//    }

//    public String getId() {
//        return id;
//    }
//
//    public void setId(String id) {
//        this.id = id;
//    }
//
//    public String getDriverId() {
//        return driverId;
//    }
//
//    public void setDriverId(String driverId) {
//        this.driverId = driverId;
//    }
//
//    public String getCustomerId() {
//        return customerId;
//    }
//
//    public void setCustomerId(String customerId) {
//        this.customerId = customerId;
//    }


}
