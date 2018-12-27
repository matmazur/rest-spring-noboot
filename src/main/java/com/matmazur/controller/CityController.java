package com.matmazur.controller;

import com.matmazur.model.City;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CityController {

    @RequestMapping("/city")
    public City getCity() {
        return new City("Gdansk", 200000L);
    }
}