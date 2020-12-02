package edu.citytech.rahman.games.controller;


import edu.citytech.rahman.games.jdbc.City;
import edu.citytech.rahman.games.jdbc.CityDAO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CityController {

    @GetMapping("/participation/cities")

    public List<City> getAllCities(){

        var cities = new CityDAO().findAll();
        return cities;
    }



}
