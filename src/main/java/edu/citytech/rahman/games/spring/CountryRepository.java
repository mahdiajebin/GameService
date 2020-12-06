package edu.citytech.rahman.games.spring;

import edu.citytech.rahman.games.jdbc.Country;
import org.springframework.data.repository.CrudRepository;

public interface CountryRepository extends CrudRepository<Country, Integer> {
}
