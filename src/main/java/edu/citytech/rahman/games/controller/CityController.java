package edu.citytech.rahman.games.controller;



import edu.citytech.rahman.games.jpa.model.City;
import edu.citytech.rahman.games.springRepository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CityController {

    @Autowired
    CityRepository repository;


//handle parameters
    @GetMapping("/participation/cities")

    public Iterable<City> getAllCities(@RequestParam(defaultValue = "All" )String countryCode,
                                       @RequestParam(defaultValue = "0" )long population){


        //System.out.println("countryCode: " + countryCode);

        var cities = repository.selectCity(countryCode,population);//.findCityByCountryCode(countryCode);

        return cities;
    }


}
