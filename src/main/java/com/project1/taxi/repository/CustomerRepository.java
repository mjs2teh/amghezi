package com.project1.taxi.repository;

import com.project1.taxi.model.Customers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customers,Long> {
}
