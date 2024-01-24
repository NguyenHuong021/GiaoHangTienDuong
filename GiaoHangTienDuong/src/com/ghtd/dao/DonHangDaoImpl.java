package com.ghtd.dao;

import com.ghtd.model.DonHang;
import com.ghtd.model.TaiKhoan;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

public class DonHangDaoImpl implements DonHangDao{
    @Override
    public List<DonHang> getList(TaiKhoan taiKhoan){
        Connection cons = DBConnect.getConnection();
        String sql = "SELECT * FROM DONHANG WHERE maKH = ?";
        try{
            PreparedStatement ps = (PreparedStatement) cons.prepareStatement(sql);
            ps.setInt(1, taiKhoan.getMaND());
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                DonHang donHang = new DonHang();
                donHang.setMaDH(rs.getInt("maDH"));
                donHang.setDiaChiNhan(rs.getString("diaChiNhan"));
                donHang.setDiaChiGui(rs.getString("diaChiGui"));
                donHang.setTenSP(rs.getString("tenSP"));
                donHang.setPhiVanChuyen(rs.getInt("phiVanChuyen"));
                donHang.setTrangThaiGuiNhan(rs.getString("trangThaiGuiNhan"));
            }
            ps.close();
            cons.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
