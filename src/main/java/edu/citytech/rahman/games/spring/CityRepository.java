package edu.citytech.rahman.games.spring;

import edu.citytech.rahman.games.jdbc.City;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.criteria.CriteriaBuilder;
//crud create read update delete
public interface CityRepository extends CrudRepository<City, Integer> {



}
