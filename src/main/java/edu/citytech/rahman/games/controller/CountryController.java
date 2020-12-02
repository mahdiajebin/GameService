package edu.citytech.rahman.games.controller;



import edu.citytech.rahman.games.jdbc.Country;
import edu.citytech.rahman.games.jdbc.CountryDAO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CountryController {

    @GetMapping("/participation/countries")

    public List<Country> getAllCountries(){

        var countries = new CountryDAO().findAll();
        return countries;
    }



}
