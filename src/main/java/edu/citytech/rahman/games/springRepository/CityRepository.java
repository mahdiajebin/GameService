package edu.citytech.rahman.games.springRepository;


import edu.citytech.rahman.games.jpa.model.City;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

//crud create read update delete
public interface CityRepository extends CrudRepository<City, Integer> {
//nameing convention has to be using find ModelName By  variablename in the model spell exactly same
    List<City> findCityByCountryCode(String countryCode);

    //JPQL - going after the model not database u = alias
    // ?1 is one parameter
    //weither all or which ever country code user puts
    @Query("SELECT u FROM City u WHERE (u.countryCode = ?1 OR 'All' = ?1) AND u.population > ?2  ORDER BY u.population DESC")
    List<City> selectCity(String countryCode, long population);

}
