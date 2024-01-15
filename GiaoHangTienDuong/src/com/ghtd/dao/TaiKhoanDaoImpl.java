package com.ghtd.dao;

import com.ghtd.model.TaiKhoan;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TaiKhoanDaoImpl implements TaiKhoanDao{
    private static String DB_URL = "jdbc:mysql://localhost:3306/testdb";
    private static String USER_NAME = "root";
    private static String PASSWORD = "1234567890";
    @Override
    public TaiKhoan login(String account, String password){

        Connection conn = getConnection(DB_URL, USER_NAME, PASSWORD);
        String sql = "SELECT * FROM tai_khoan WHERE ten_dang_nhap LIKE ? AND mat_khau LIKE ?";
        TaiKhoan taiKhoan = null;
        try{
            PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
            ps.setString(1, account);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                taiKhoan = new TaiKhoan();
                taiKhoan.setAccount(rs.getString("account"));
                taiKhoan.setPassword(rs.getString("password"));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    public static Connection getConnection(String dbURL, String userName,
                                           String password) {
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(dbURL, userName, password);
            System.out.println("connect successfully!");
        } catch (Exception ex) {
            System.out.println("connect failure!");
            ex.printStackTrace();
        }
        return conn;
    }
}
