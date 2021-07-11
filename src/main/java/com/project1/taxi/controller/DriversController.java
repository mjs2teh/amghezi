package com.project1.taxi.controller;

import com.project1.taxi.data.DriverList;
import com.project1.taxi.model.Drivers;
import com.project1.taxi.service.DriverService;
import lombok.Generated;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;


@RestController
@Slf4j
public class DriversController {

    public final DriverList driverList;
    private final DriverService driverService;

    @Autowired
    public DriversController(DriverList driverLis, DriverService driverService) {
        this.driverList = driverLis;
        this.driverService = driverService;
    }


    @RequestMapping(value = "/driver/{name}/{carNumber}", method = {RequestMethod.POST, RequestMethod.GET})

    public DriverList RegisterDriver(@PathVariable("name") String name, @PathVariable("carNumber") String carNumber) {
        Drivers driver = new Drivers();
        //Random rand = new Random();
        //driver.setId(Integer.toString(rand.nextInt(100)));
        //driver.setId(driver.);
        try {
            driver.setName(name);
            driver.setCarNumber(carNumber);
            driver = driverService.add(driver);
            driverList.Enqueue(driver);
            log.info("Driver Inserted");

            return driverList; //Integer.toString(driverLis.size());
        } catch (Exception e) {
            //System.out.println(e.toString());
            log.info(e.toString());
            return driverList;
        }

    }
}
