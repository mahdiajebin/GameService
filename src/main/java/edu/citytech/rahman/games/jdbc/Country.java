package edu.citytech.rahman.games.jdbc;

public class Country {
    //SELECT code, Name, population, indepYear FROM world.country;
private String code;
private String name;
private long population;
private int yearOfIndependence;

    public Country(String code, String name, long population, int yearOfIndependence) {
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

    public int getYearOfIndependence() {
        return yearOfIndependence;
    }

    public void setYearOfIndependence(int yearOfIndependence) {
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
