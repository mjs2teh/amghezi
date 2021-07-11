package com.project1.taxi.model;

import lombok.Getter;
import lombok.Setter;
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
    private Long id;
    //@Column
    @Column(name = "driver_id")
    private  Long driverId;
    //@Column
    @Column(name = "customer_id")
    private Long customerId;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "driver_id", referencedColumnName = "id",updatable = false,insertable = false)       //(name="id")
    private Drivers driver;

    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "customer_id", referencedColumnName = "id",updatable = false,insertable = false)
    private Customers customer;

    public Orders() {
    }

    public Orders(Drivers driver, Customers customer) {
        this.driverId = driver.getId();
        this.customerId = customer.getId();
    }
//    public Orders(Long driverId, Long customerId) {
//        //this.id = id;
//        this.driverId.setId(driverId);
//        this.customerId.setId(customerId);
//    }

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
