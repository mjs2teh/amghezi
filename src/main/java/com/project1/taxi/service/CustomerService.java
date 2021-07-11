package com.project1.taxi.service;

import com.project1.taxi.model.Customers;
import com.project1.taxi.repository.CustomerRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class CustomerService {
    private final CustomerRepository customerRepository;


    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<Customers> list() {
        try {
            return customerRepository.findAll();
        }
        catch (Exception e){
            log.info(e.toString());
            return null;
        }
    }
    public Customers add(Customers customers){
        try {
            return customerRepository.save(customers);
//            return "customer Saved in db";
        }
        catch (Exception e) {
            e.printStackTrace();
            return null;
        }


    }
}
