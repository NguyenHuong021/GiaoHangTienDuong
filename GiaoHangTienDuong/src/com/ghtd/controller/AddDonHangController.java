package com.ghtd.controller;

import com.ghtd.model.DonHang;
import com.ghtd.service.DonHangService;
import com.ghtd.service.DonHangServiceImpl;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Date;
import java.sql.Timestamp;

public class AddDonHangController {
    private javax.swing.JTextField canNang;
    private javax.swing.JButton datDonButton;
    private javax.swing.JTextField diaChiGui;
    private javax.swing.JTextField diaChiNhan;
    private javax.swing.JTextField giaTien;
    private javax.swing.JTextField loaiSanPham;
    private javax.swing.JTextField tenSanPham;

    private DonHangService donHangService = null;
    public AddDonHangController() {
    }

    public AddDonHangController(JTextField canNang, JButton datDonButton, JTextField diaChiGui, JTextField diaChiNhan, JTextField giaTien, JTextField loaiSanPham, JTextField tenSanPham) {
        this.canNang = canNang;                 // ex7
        this.datDonButton = datDonButton;
        this.diaChiGui = diaChiGui;             // ex2
        this.diaChiNhan = diaChiNhan;           // ex1
        this.giaTien = giaTien;
        this.loaiSanPham = loaiSanPham;         // ex5
        this.tenSanPham = tenSanPham;           // ex6
        this.donHangService = new DonHangServiceImpl();
        // ngay nhan, ngay giao, tien COD, trang thai gui nhan, maKH.
    }

    public void addDonHang(){
        datDonButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                DonHang donHang = new DonHang();
                donHang.setNgayNhan(Date.valueOf(java.time.LocalDate.now()));
                donHang.setThoiGianGiao(Timestamp.valueOf(java.time.LocalDateTime.now()));
                donHang.setTienCOD(300);
                donHang.setTrangThaiGuiNhan("Chờ xác nhận");
                donHang.setMaKH(1);
                //write code here :
                donHang.setCanNang(Float.parseFloat(canNang.getText()));
                donHang.setDiaChiGui(diaChiGui.getText());
                donHang.setDiaChiNhan(diaChiNhan.getText());
                donHang.setPhiVanChuyen(Integer.parseInt(giaTien.getText()));
                donHang.setLoaiHang(loaiSanPham.getText());
                donHang.setTenSP(tenSanPham.getText());
                donHangService.addDonHang(donHang);
                //write load jpanel view here :

            }
        });
    }
}
