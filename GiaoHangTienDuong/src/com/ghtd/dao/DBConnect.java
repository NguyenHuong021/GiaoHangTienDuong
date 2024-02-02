package com.ghtd.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Asus
 */

public class DBConnect {
    
    // Tự sửa connection string theo CSDL lưu ở máy
    public static final String URL = "jdbc:mysql://localhost:3306/giaohangtienduong";
    public static final String DB_USERNAME = "root"; 
    public static final String DB_PASSWORD = "123456789";
    
    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection cons = DriverManager.getConnection(URL, DB_USERNAME, DB_PASSWORD);
            System.out.println("Connect succesfully");
            return cons;
        } catch (Exception e) {
            System.out.println("Connect failure");
            e.printStackTrace();
        }
        return null;
    }
    
    public static void main(String[] args) throws SQLException {
        System.out.println(getConnection());
    }
}
