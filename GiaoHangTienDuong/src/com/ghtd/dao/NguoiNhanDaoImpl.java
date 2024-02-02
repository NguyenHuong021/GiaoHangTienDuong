package com.ghtd.dao;

import com.ghtd.model.NguoiNhan;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class NguoiNhanDaoImpl implements NguoiNhanDao{
    @Override
    public NguoiNhan addNguoiNhan(NguoiNhan nguoiNhan) {
        Connection cons = DBConnect.getConnection();
        String sql = "INSERT INTO NGUOINHAN (tenNN, SDT, CCCD, diaChiNhanHang) VALUES (?, ?, ?, ?)";
        try{
            PreparedStatement ps = (PreparedStatement) cons.prepareStatement(sql);
            ps.setString(1, nguoiNhan.getTenNN());
            ps.setInt(2, nguoiNhan.getSDT());
            ps.setInt(3, nguoiNhan.getCCCD());
            ps.setString(4, nguoiNhan.getDiahChiNhanHang());
            int affectedRows = ps.executeUpdate();
            if (affectedRows > 0) {
                System.out.println("Đã thêm dữ liệu người nhận thành công!");
            } else {
                System.out.println("Lưu dữ liệu người nhận không thành công!");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return nguoiNhan;
    }
}
