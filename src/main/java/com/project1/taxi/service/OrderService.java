package com.project1.taxi.service;

import com.project1.taxi.model.Orders;
import com.project1.taxi.repository.OrderRepository;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.criterion.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class OrderService {
    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public List<Orders> list() {
        return orderRepository.findAll();
    }
    public String add(Orders orders){
        try {
            orderRepository.save(orders);
            return "Order saved";
        }
        catch (Exception e){
            e.printStackTrace();
            log.info("ajaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab {} {}","ok",e.getStackTrace());
            return e.toString();
        }
    }
}
