/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atm;

/**
 *
 * @author Victus
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    public  static Connection getConnection() {
        String url = "jdbc:mysql://localhost:3306/atm";
        String un = "root";
        String pwd= "";
        
        Connection connection = null;

        try {
            connection = DriverManager.getConnection(url, un, pwd);
           // System.out.println("Connected to the database");
        } catch (SQLException e) {
            System.err.println("Error connecting to the database: " + e.getMessage());
        }

        return connection;
    }
}
