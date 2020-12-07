package edu.citytech.rahman.games.controller;



import edu.citytech.rahman.games.jpa.model.Country;
import edu.citytech.rahman.games.springRepository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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
