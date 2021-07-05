package com.project1.taxi;

import com.project1.taxi.model.Drivers;
import com.project1.taxi.repository.DriverRepository;
import com.project1.taxi.service.DriverService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class TaxiApplicationTests {
    @Autowired
    private DriverService driverService;

    @Test
    void contextLoads() {
        List<Drivers> drivers= driverService.list();

    }

}
