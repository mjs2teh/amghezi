package com.project1.taxi.controller;

import com.project1.taxi.data.CustomerList;
import com.project1.taxi.data.DriverList;
import com.project1.taxi.data.OrderList;
import com.project1.taxi.model.Customers;
import com.project1.taxi.model.Drivers;
import com.project1.taxi.model.Orders;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Logger;

@Component
@Slf4j
public class OrdersController {
    public final DriverList driverList;
    public final CustomerList customerList;
    public final OrderList orderList;
    @Autowired
    public OrdersController(DriverList driverList, CustomerList customerList, OrderList orderList) {
        this.driverList = driverList;
        this.customerList = customerList;
        this.orderList = orderList;
    }

    @Scheduled(fixedRate = 20000)
    public void SetDriverToCustomer(){
        if (driverList.size()>= customerList.size() && customerList.size()>=1){
            ArrayList<Customers> cus = new ArrayList<>(customerList.getList()); ;
            for (Customers to : cus) {
                log.info(to.getId());

                System.out.println(to.getId());
                System.out.println(driverList.getList());

                //if (driverList.size() >= 1) {
                    Random rand = new Random();
                    Orders order = new Orders(driverList.Dequeue().getId(), customerList.Dequeue().getId()); //Integer.toString(rand.nextInt(100))

                    orderList.Enqueue(order);
               // }
            }
        }
        else if (customerList.size()>= driverList.size() && driverList.size()>= 1){
            ArrayList<Drivers> dri = new ArrayList<>(driverList.getList());
            for (Drivers to : dri) {
                log.info(to.getId());
                System.out.println(to.getId());
                System.out.println(customerList.getList());

                //if (driverList.size() >= 1) {
                    Random rand = new Random();
                    Orders order = new Orders(driverList.Dequeue().getId(), customerList.Dequeue().getId()); //Integer.toString(rand.nextInt(100)),

                    orderList.Enqueue(order);
                //}
            }
        }
//        if (customerList.size()>=1) {
//
           System.out.println("end");
//        }

    }
}