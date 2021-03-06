package com.project1.taxi.controller;

import com.project1.taxi.data.CustomerList;
import com.project1.taxi.model.Customers;
import com.project1.taxi.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Random;

@RestController
public class CustomersController {
    public final CustomerList customerList;
    private final CustomerService customerService;

    @Autowired
    public CustomersController(CustomerList customerList, CustomerService customerService) {
        this.customerList = customerList;
        this.customerService = customerService;
    }

    @PostMapping("/customer/{name}/{cellPhone}")
    public CustomerList RegisterCustomer(@PathVariable("name") String name,@PathVariable("cellPhone") String cellPhone){
        Customers customer = new Customers();
        Random rand = new Random();
        customer.setName(name);
        customer.setCellPhone(cellPhone);
        customer = customerService.add(customer);
        //customer.setId(Integer.toString(rand.nextInt(100)));
        customerList.Enqueue(customer);
        return customerList;
    }
}
