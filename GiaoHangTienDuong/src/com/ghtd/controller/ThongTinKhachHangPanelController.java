package com.ghtd.controller;

import com.ghtd.common.TaiKhoanSingleton;
import com.ghtd.model.KhachHang;
import com.ghtd.model.TaiKhoan;
import com.ghtd.service.NguoiDungService;
import com.ghtd.service.NguoiDungServiceImpl;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.time.format.DateTimeFormatter;
import javax.swing.*;


public class ThongTinKhachHangPanelController {
    private JButton editButton;
    private JButton deleteButton;
    private JTextField maKhachHang;
    private JTextField ngaySinh;
    private JTextField soDienThoai;
    private JTextField tenKhachHang;
    private JTextField CCCD;
    private JTextField diaChiGuiHang;
    private NguoiDungService nguoiDungService = null;
    public ThongTinKhachHangPanelController(JButton editButton, JButton deleteButton,
                                            JTextField maKhachHang, JTextField ngaySinh,
                                            JTextField soDienThoai, JTextField tenKhachHang,
                                            JTextField CCCD, JTextField diaChiGuiHang) {
        this.editButton = editButton;
        this.deleteButton = deleteButton;
        this.nguoiDungService = new NguoiDungServiceImpl();
    }
    public void thongTinKhachHang(JTextField maKhachHang, JTextField ngaySinh,
                                  JTextField soDienThoai, JTextField tenKhachHang,
                                  JTextField CCCD, JTextField diaChiGuiHang){
        TaiKhoan taiKhoan = TaiKhoanSingleton.getInstance().getTaiKhoan();
        KhachHang khachHang = (KhachHang) nguoiDungService.thonTinNguoiDung(taiKhoan);
        maKhachHang.setText(String.valueOf(khachHang.getMaKH()));
        maKhachHang.setEditable(false);

        ngaySinh.setText(khachHang.getNgayThangNamSinh().toString());
        ngaySinh.setEditable(false);

        soDienThoai.setText(String.valueOf(khachHang.getSDT()));
        soDienThoai.setEditable(false);

        tenKhachHang.setText(khachHang.getTenKH());
        tenKhachHang.setEditable(false);

        CCCD.setText(String.valueOf(khachHang.getCCCD()));
        CCCD.setEditable(false);

        diaChiGuiHang.setText(khachHang.getDiaChiGuiHang());
        diaChiGuiHang.setEditable(false);
    }
    public void popUpEditer(JButton editButton) {
        TaiKhoan taiKhoan = TaiKhoanSingleton.getInstance().getTaiKhoan();
        editButton.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e) {
                JTextField maKhachHangField = new JTextField();
                JTextField tenField = new JTextField();
                JTextField sdtField = new JTextField();
                JTextField cccdField = new JTextField();
                JTextField diaChiGuiHangField = new JTextField();
                JTextField ngaySinhField = new JTextField();

                maKhachHangField.setText("MaKH00");
                maKhachHangField.setEditable(false);

                JPanel popupEdit = new JPanel();
                popupEdit.setLayout(new GridBagLayout());
                GridBagConstraints gbc = new GridBagConstraints();
                gbc.insets = new Insets(4, 4, 4, 4);
                                
                // gridx = column, gridy = row
                gbc.gridx = 0;
                gbc.gridy = 0;
                gbc.anchor = GridBagConstraints.WEST;
                popupEdit.add(new JLabel("Mã khách hàng"), gbc);
                
                gbc.gridx = 1;
                gbc.gridy = 0;
                gbc.anchor = GridBagConstraints.EAST;
                maKhachHangField.setPreferredSize(new Dimension(200, 40));
                popupEdit.add(maKhachHangField, gbc);
                
                gbc.gridx = 0;
                gbc.gridy = 1;
                gbc.anchor = GridBagConstraints.WEST;
                popupEdit.add(new JLabel("Họ và tên"), gbc);
                
                gbc.gridx = 1;
                gbc.gridy = 1;
                gbc.anchor = GridBagConstraints.EAST;
                tenField.setPreferredSize(new Dimension(200, 40));
                popupEdit.add(tenField, gbc);
                
                gbc.gridx = 0;
                gbc.gridy = 2;
                gbc.anchor = GridBagConstraints.WEST;
                popupEdit.add(new JLabel("Ngày sinh"), gbc);
                
                gbc.gridx = 1;
                gbc.gridy = 2;
                gbc.anchor = GridBagConstraints.EAST;
                ngaySinhField.setPreferredSize(new Dimension(200, 40));
                popupEdit.add(ngaySinhField, gbc);
                
                gbc.gridx = 0;
                gbc.gridy = 3;
                gbc.anchor = GridBagConstraints.WEST;
                popupEdit.add(new JLabel("CCCD"), gbc);
                
                gbc.gridx = 1;
                gbc.gridy = 3;
                gbc.anchor = GridBagConstraints.EAST;
                cccdField.setPreferredSize(new Dimension(200, 40));
                popupEdit.add(cccdField, gbc);
                
                gbc.gridx = 0;
                gbc.gridy = 4;
                gbc.anchor = GridBagConstraints.WEST;
                popupEdit.add(new JLabel("Số điện thoại"), gbc);
                
                gbc.gridx = 1;
                gbc.gridy = 4;
                gbc.anchor = GridBagConstraints.EAST;
                sdtField.setPreferredSize(new Dimension(200, 40));
                popupEdit.add(sdtField, gbc);
                
                gbc.gridx = 0;
                gbc.gridy = 5;
                gbc.anchor = GridBagConstraints.WEST;
                popupEdit.add(new JLabel("Địa chỉ gửi hàng"), gbc);
                
                gbc.gridx = 1;
                gbc.gridy = 5;
                gbc.anchor = GridBagConstraints.EAST;
                diaChiGuiHangField.setPreferredSize(new Dimension(200, 40));
                popupEdit.add(diaChiGuiHangField, gbc);

                JOptionPane.showConfirmDialog(null, popupEdit, "Nhập thông tin mới", JOptionPane.OK_CANCEL_OPTION);
            }
        });
    }
    
    public void deleteAccountConfirm(JButton deleteButton) {
        deleteButton.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                JPanel popupDelete = new JPanel();
                popupDelete.add(new JLabel("Bạn có chắc muốn xóa tài khoản này không?"));
                JOptionPane.showConfirmDialog(null, popupDelete, "Vui lòng xác nhận", JOptionPane.OK_CANCEL_OPTION);
            }
        });
    }
    
}
