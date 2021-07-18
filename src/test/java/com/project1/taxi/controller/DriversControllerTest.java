package com.project1.taxi.controller;

import com.project1.taxi.model.Drivers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DriversControllerTest {

    @Test
    public void registerDriver() {
        Drivers drivers = new Drivers(Integer.toUnsignedLong(121323),"jdfsw","oihjdf9");
        Assertions.assertNotNull(drivers,"test driver ok bod");

    }
}