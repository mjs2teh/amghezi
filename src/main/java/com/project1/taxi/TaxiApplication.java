package com.project1.taxi;

import com.project1.taxi.data.Queue;
import com.project1.taxi.model.Customers;
import com.project1.taxi.model.Drivers;
import com.project1.taxi.model.Orders;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.util.ArrayList;

@SpringBootApplication
@EnableScheduling
public class TaxiApplication {

    public static void main(String[] args) {

        SpringApplication.run(TaxiApplication.class, args);
    }

}


