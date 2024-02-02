package com.ghtd.dao;

import com.ghtd.model.KhachHang;
import com.ghtd.model.TaiKhoan;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class NguoiDungDaoImpl implements NguoiDungDao{

    @Override
    public Object thonTinNguoiDung(TaiKhoan taiKhoan) {
        Connection cons = DBConnect.getConnection();
        if(taiKhoan.getLoaiND().equals("KH")){
            String sql = "SELECT * FROM KHACHHANG WHERE maKH LIKE ?";
            KhachHang khachHang = null;
            try{
                PreparedStatement ps = (PreparedStatement) cons.prepareStatement(sql);
                ps.setInt(1, taiKhoan.getMaND());
                ResultSet rs = ps.executeQuery();
                if (rs.next()) {
                    khachHang = new KhachHang();
                    khachHang.setMaKH(rs.getInt("maKH"));
                    khachHang.setTenKH(rs.getString("tenKH"));
                    khachHang.setSDT(rs.getInt("SDT"));
                    khachHang.setCCCD(rs.getInt("CCCD"));
                    khachHang.setDiaChiGuiHang(rs.getString("diaChiGuiHang"));
                    khachHang.setNgayThangNamSinh(rs.getDate("ngayThangNamSinh"));
                }
            }catch (Exception e){
                e.printStackTrace();
            }
            return khachHang;
        }
        if(taiKhoan.getLoaiND().equals("GH")){

        }
        return taiKhoan;
    }
}
