package com.project1.taxi.repository;

import com.project1.taxi.model.Drivers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DriverRepository extends JpaRepository<Drivers,Long> {
}
