package com.project1.taxi.controller;

import com.project1.taxi.data.DriverList;
import com.project1.taxi.model.Drivers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.Random;


@RestController
public class DriversController {
    public final DriverList driverLis;

    @Autowired
    public DriversController(DriverList driverLis) {
        this.driverLis = driverLis;
    }

    @RequestMapping(value = "/driver/{name}/{carNumber}",method = {RequestMethod.POST,RequestMethod.GET})

    public DriverList RegisterDriver(@PathVariable("name") String name,@PathVariable("carNumber") String carNumber){
        Drivers driver =new Drivers();
        Random rand = new Random();
        driver.setId(Integer.toString(rand.nextInt(100)));
        driver.setName(name);
        driver.setCarNumber(carNumber);
        driverLis.Enqueue(driver);
        return driverLis; //Integer.toString(driverLis.size());
    }
}
