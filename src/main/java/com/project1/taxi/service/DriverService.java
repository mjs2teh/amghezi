package com.project1.taxi.service;

import com.project1.taxi.model.Drivers;
import com.project1.taxi.repository.DriverRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DriverService {

    private final DriverRepository driverRepository;

    public DriverService(DriverRepository driverRepository) {
        this.driverRepository = driverRepository;
    }

    public List<Drivers> list() {
        return driverRepository.findAll();
    }

    public String add(Drivers drivers) {
        driverRepository.save(drivers);
        return "Ok";
    }

}
