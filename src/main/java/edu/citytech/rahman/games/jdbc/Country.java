package edu.citytech.rahman.games.jdbc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Country {
    //SELECT code, Name, population, indepYear FROM world.country;

@Id
private String code;
private String name;

private long population;
//has to be lowercase so java dont put an _ inside
@Column(name = "indepyear")
private Integer yearOfIndependence;

    public Country() {}

    public Country(String code, String name, long population, Integer yearOfIndependence) {
        this.code = code;
        this.name = name;
        this.population = population;
        this.yearOfIndependence = yearOfIndependence;

    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public Integer getYearOfIndependence() {
        return yearOfIndependence;
    }

    public void setYearOfIndependence(Integer yearOfIndependence) {
        this.yearOfIndependence = yearOfIndependence;
    }

    @Override
    public String toString() {
        return "Country{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", population=" + population +
                ", yearOfIndependence=" + yearOfIndependence +
                '}';
    }
}
