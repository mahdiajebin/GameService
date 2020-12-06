package edu.citytech.rahman.games.jdbc;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

//pojo
@Entity
public class City {
//mapping the data from database  to java
    //id, name, countryCode, population
    @Id //pk
    private int id;
    private  String name;
    //dont convert
    @Column(name = "countrycode")
    private String countryCode;
    private long population;
//default constructor
    public City (){}

    public City(int id, String name, String countryCode, long population) {
        this.id = id;
        this.name = name;
        this.countryCode = countryCode;
        this.population = population;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }


    //overriding tostring for testing purposes
    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", countryCode='" + countryCode + '\'' +
                ", population=" + population +
                '}';
    }
}
