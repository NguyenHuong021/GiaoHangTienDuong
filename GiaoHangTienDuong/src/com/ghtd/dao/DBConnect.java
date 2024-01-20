package com.ghtd.dao;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Asus
 */

public class DBConnect {
    
    // Tự sửa connection string theo CSDL lưu ở máy
    public static String URL = "jdbc:mysql://localhost:3306/giaohangtienduong";
    public static String DB_USERNAME = "root"; 
    public static String DB_PASSWORD = "123456789";
    
    public static Connection getConnection() {
        Connection cons = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cons = DriverManager.getConnection(URL, DB_USERNAME, DB_PASSWORD);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cons;
    }
    
    public static void main(String[] args) {
        System.out.println(getConnection());
    }
}
