package edu.citytech.rahman.games.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class TryWithResources_Example {
   public static void main(String args[]) {
      //Getting the connection
     final String mysqlUrl = "jdbc:mysql://localhost:3306/world";
      System.out.println("Connection established......");
      final String SQL = "SELECT id, name, countryCode, population FROM world.city";
      //Registering the Driver
      try(Connection con = DriverManager.getConnection(mysqlUrl, "root", "password1234");
      Statement stmt = con.createStatement(); ResultSet rs = stmt.executeQuery(SQL);) {

            //Retrieving the data
            while(rs.next()) {
               System.out.print(rs.getInt("ID")+", ");
               System.out.print(rs.getString("Name")+", ");
               System.out.print(rs.getString("CountryCode")+", ");
               System.out.print(rs.getLong("population")+", ");

               System.out.println();
            }

      } catch (SQLException e) {
            e.printStackTrace();
      }
   }

}