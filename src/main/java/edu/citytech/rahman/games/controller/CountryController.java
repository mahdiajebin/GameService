package edu.citytech.rahman.games.controller;



import edu.citytech.rahman.games.jdbc.Country;
import edu.citytech.rahman.games.jdbc.CountryDAO;
import edu.citytech.rahman.games.spring.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CountryController {

    @Autowired
    CountryRepository repository;

    @GetMapping("/participation/countries")


    public Iterable<Country> getAllCountries(){

        var countries = repository.findAll();
        return countries;
    }



}
