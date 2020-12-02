package edu.citytech.rahman.games.jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

//data acces object //data layer //data repository
public class CountryDAO {
    //pojo City
   public List<Country> findAll() {

     List<Country> countries = new ArrayList<Country>();

      //Getting the connection
     final String mysqlUrl = "jdbc:mysql://localhost:3306/world";
      System.out.println("Connection established......");
      final String SQL = " SELECT code, name, population, indepYear FROM world.country; ";
//              + " WHERE CountryCode = 'USA' ";

      //Registering the Driver
      try(Connection con = DriverManager.getConnection(mysqlUrl, "root", "password1234");
      Statement stmt = con.createStatement(); ResultSet rs = stmt.executeQuery(SQL);) {

            //Retrieving the data
            while(rs.next()) {


                String code = rs.getString("code");
                String name = rs.getString("name");
                long population= rs.getLong("population");
                int yearOfIndependence= rs.getInt("indepYear");
                var country = new Country(code, name, population, yearOfIndependence);
                countries.add(country);
            }

            return countries;

      } catch (SQLException e) {
            e.printStackTrace();

      }
      return new ArrayList<Country>();
   }

}