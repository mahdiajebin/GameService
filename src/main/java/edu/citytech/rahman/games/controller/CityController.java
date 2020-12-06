package edu.citytech.rahman.games.controller;


import edu.citytech.rahman.games.jdbc.City;
import edu.citytech.rahman.games.jdbc.CityDAO;
import edu.citytech.rahman.games.spring.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CityController {

    @Autowired
    CityRepository repository;

    @GetMapping("/participation/cities")

    public Iterable<City> getAllCities(){

        var cities = repository.findAll();
        return cities;
    }



}
