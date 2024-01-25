package com.ghtd.dao;

import com.ghtd.model.TaiKhoan;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TaiKhoanDaoImpl implements TaiKhoanDao{
    private static String DB_URL = "jdbc:mysql://localhost:3306/giaohangtienduong";
    private static String USER_NAME = "root";
    private static String PASSWORD = "123456789";
    @Override
    public TaiKhoan login(String account, String password){
        Connection conn = getConnection(DB_URL, USER_NAME, PASSWORD);
        String sql = "SELECT * FROM TAIKHOAN WHERE account LIKE ? AND password LIKE ?";
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
                taiKhoan.setLoaiND(rs.getString("loaiND"));
                taiKhoan.setMaND(rs.getInt("maND"));
                System.out.println(taiKhoan.getAccount());
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return taiKhoan;
    }

    public static Connection getConnection(String dbURL, String userName,
                                           String password) {
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(dbURL, userName, password);
            System.out.println("connect successfully!");
        } catch (Exception ex) {
            System.out.println("connect failure!");
            ex.printStackTrace();
        }
        return conn;
    }
}
