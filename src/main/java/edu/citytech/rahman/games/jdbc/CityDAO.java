package edu.citytech.rahman.games.jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
//data acces object //data layer //data repository
public class CityDAO {   public List<City> findAll() {

     List<City> cities = new ArrayList<City>();

      //Getting the connection
     final String mysqlUrl = "jdbc:mysql://localhost:3306/world";
      System.out.println("Connection established......");
      final String SQL = " SELECT id, name, countryCode, population FROM world.city "
              + " WHERE CountryCode = 'USA' ";

      //Registering the Driver
      try(Connection con = DriverManager.getConnection(mysqlUrl, "root", "password1234");
      Statement stmt = con.createStatement(); ResultSet rs = stmt.executeQuery(SQL);) {

            //Retrieving the data
            while(rs.next()) {


                int id = rs.getInt("ID");
                String name = rs.getString("Name");
                String countryCode = rs.getString("countryCode");
                long population= rs.getLong("population");
                var city = new City(id, name, countryCode, population);
                cities.add(city);
            }

            return cities;

      } catch (SQLException e) {
            e.printStackTrace();

      }
      return new ArrayList<City>();
   }
    //pojo City


}