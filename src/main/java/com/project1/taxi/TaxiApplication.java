package com.project1.taxi;

import com.project1.taxi.data.Queue;
import com.project1.taxi.model.Customers;
import com.project1.taxi.model.Drivers;
import com.project1.taxi.model.Orders;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;

@SpringBootApplication
public class TaxiApplication {

    public static void main(String[] args) {
        Queue<Drivers> driversQueue = new Queue<>();
        Queue<Customers> customersQueue = new Queue<>();
        ArrayList<Orders> ordersArrayList = new ArrayList<>();
        SpringApplication.run(TaxiApplication.class, args);
    }

}


