package com.project1.taxi.controller;

import com.project1.taxi.data.CustomerList;
import com.project1.taxi.data.DriverList;
import com.project1.taxi.data.OrderList;
import com.project1.taxi.model.Customers;
import com.project1.taxi.model.Orders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import java.util.Random;
@Component

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
        if (customerList.size()>=1) {
            for (Customers to : customerList.getList()) {
                System.out.println(to.getId());
                System.out.println(driverList.getList());

                if (driverList.size() >= 1) {
                    Random rand = new Random();
                    Orders order = new Orders(Integer.toString(rand.nextInt(100)), driverList.Dequeue().getId(), customerList.Dequeue().getId());

                    orderList.Enqueue(order);
                }
            }
        }

    }
}