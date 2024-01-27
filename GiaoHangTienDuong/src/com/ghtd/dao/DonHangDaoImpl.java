package com.ghtd.dao;

import com.ghtd.model.DonHang;
import com.ghtd.model.TaiKhoan;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DonHangDaoImpl implements DonHangDao{
    @Override
    public List<DonHang> getList(TaiKhoan taiKhoan){
        Connection cons = DBConnect.getConnection();
        String sql = "SELECT * FROM DONHANG WHERE maKH = ?";
        List<DonHang> list = new ArrayList<>();
        //System.out.println(taiKhoan.getMaND());
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
                list.add(donHang);
                System.out.println(donHang);
            }
            ps.close();
            cons.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public DonHang addDonHang(DonHang donHang){
        Connection cons = DBConnect.getConnection();
        /***
         INSERT INTO DONHANG (
         diaChiNhan,     			//data ex1
         diaChiGui,	    			//data ex2
         ngayNhan,      			//data ex3
         thoiGianGiao,  			//data ex4
         loaiHang,				    //data ex5
         tenSP,				        //data ex6
         canNang,				    //data ex7
         phiVanChuyen,			    //data ex8
         tienCOD,				    //data ex9
         trangThaiGuiNhan,			//data ex10
         maKH				        //data ex11
         ) VALUES (
         ?, // data ex1 : '123 Đường ABC, Quận 1, TP.HCM',
         ?, // data ex2 : '456 Đường XYZ, Quận 2, TP.HCM',
         ?, // data ex3 : '2024-01-26',
         ?, // data ex4 : '2024-01-26 12:00:00',
         ?, // data ex5 : 'H',
         ?, // data ex6 : 'Sản phẩm A',
         ?, // data ex7 : 2.5,
         ?, // data ex8 : 50000,
         ?, // data ex9 : 100000,
         ?, // data ex10:'Chờ xác nhận',
         ?, // data ex11: 1 -- MaKH (Mã Khách hàng) - Thay thế bằng mã khách hàng thực tế
         );
        ***/
        String sql = "INSERT INTO DONHANG (\n" +
                "    diaChiNhan,     \t\t\t\n" +
                "    diaChiGui,\t    \t\t\t\n" +
                "    ngayNhan,      \t\t\t\n" +
                "    thoiGianGiao,  \t\t\t\n" +
                "    loaiHang,\t\t\t\t\n" +
                "    tenSP,\t\t\t\t\n" +
                "    canNang,\t\t\t\t\n" +
                "    phiVanChuyen,\t\t\t\n" +
                "    tienCOD,\t\t\t\t\n" +
                "    trangThaiGuiNhan,\t\t\t\n" +
                "    maKH\t\t\t\t\n" +
                ") VALUES (\n" +
                "    ?, \n" +
                "    ?,\n" +
                "    ?,\n" +
                "    ?,\n" +
                "    ?,\n" +
                "    ?,\n" +
                "    ?,\n" +
                "    ?,\n" +
                "    ?,\n" +
                "    ?,\n" +
                "    ?,\n" +
                ")";
        try{
            PreparedStatement ps = (PreparedStatement) cons.prepareStatement(sql);
            ps.setString(1, donHang.getDiaChiNhan());
            ps.setString(2, donHang.getDiaChiGui());
            ps.setString(3, donHang.getNgayNhan().toString());
            ps.setString(4, donHang.getThoiGianGiao().toString());
            ps.setString(5, donHang.getLoaiHang());
            ps.setString(6, donHang.getTenSP());
            ps.setFloat(7, donHang.getCanNang());
            ps.setInt(8, donHang.getPhiVanChuyen());
            ps.setInt(9, donHang.getTienCOD());
            ps.setString(10, donHang.getTrangThaiGuiNhan());
            ps.setInt(11, donHang.getMaKH());
            // Thực hiện lưu dữ liệu vào cơ sở dữ liệu
            int affectedRows = ps.executeUpdate();
            if (affectedRows > 0) {
                System.out.println("Đã thêm dữ liệu thành công!");
            } else {
                System.out.println("Lưu dữ liệu không thành công!");
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return donHang;
    }

}
