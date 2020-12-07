package edu.citytech.rahman.games.springRepository;


import edu.citytech.rahman.games.jpa.model.Country;
import org.springframework.data.repository.CrudRepository;

public interface CountryRepository extends CrudRepository<Country, Integer> {
}
