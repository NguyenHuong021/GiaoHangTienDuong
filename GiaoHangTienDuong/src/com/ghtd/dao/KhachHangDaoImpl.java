package com.ghtd.dao;

import com.ghtd.model.KhachHang;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class KhachHangDaoImpl implements KhachHangDao{
    @Override
    public KhachHang addKhachHang(KhachHang khachHang) {
        Connection cons = DBConnect.getConnection();
        String sql = "INSERT INTO KHACHHANG (tenKH, SDT, CCCD, diaChiGuiHang, ngayThangNamSinh) VALUES (?, ?, ?, ?, ?)";
        try{
            PreparedStatement ps = (PreparedStatement) cons.prepareStatement(sql);
            ps.setString(1, khachHang.getTenKH());
            ps.setInt(2, khachHang.getSDT());
            ps.setInt(3, khachHang.getCCCD());
            ps.setString(4, khachHang.getDiaChiGuiHang());
            ps.setDate(5, khachHang.getNgayThangNamSinh());
            int affectedRows = ps.executeUpdate();
            if (affectedRows > 0) {
                System.out.println("Đã thêm dữ liệu khách hàng thành công!");
            } else {
                System.out.println("Lưu dữ liệu khác hàng không thành công!");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return khachHang;
    }

    @Override
    public KhachHang updateKhachHang(KhachHang khachHang) {
        Connection cons = DBConnect.getConnection();
        String sql = "UPDATE KHACHHANG SET tenKH=?, SDT=?, CCCD=?, diaChiGuiHang=?, ngayThangNamSinh=? WHERE maKH=?";
        try{
            PreparedStatement ps = (PreparedStatement) cons.prepareStatement(sql);
            ps.setString(1, khachHang.getTenKH());
            ps.setInt(2, khachHang.getSDT());
            ps.setInt(3, khachHang.getCCCD());
            ps.setString(4, khachHang.getDiaChiGuiHang());
            ps.setDate(5, khachHang.getNgayThangNamSinh());
            ps.setInt(6, khachHang.getMaKH());
            int affectedRows = ps.executeUpdate();
            if (affectedRows > 0) {
                System.out.println("ma khách hàng : " + khachHang.getMaKH());
                System.out.println("Đã update khách hàng thành công!");
            } else {
                System.out.println("update dữ liệu khác hàng không thành công!");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }


}
