package com.project1.taxi.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DriversController {

    @RequestMapping(value = "/driver/{name}/{carNumber}",method = RequestMethod.POST)
    public String RegisterDriver(@PathVariable("name") String name,@PathVariable("carNumber") String carNumber){
        return "ok"+name+carNumber;
    }
}
