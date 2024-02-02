package com.ghtd.controller;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;


public class ThongTinNhanVienPanelController {
    private JButton editButton;
    private JButton deleteButton;
    
    public ThongTinNhanVienPanelController(JButton editButton, JButton deleteButton) {
        this.editButton = editButton;
        this.deleteButton = deleteButton;
    }
    
    public void popUpEditer(JButton editButton) {
        editButton.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e) {
                JTextField maNVField = new JTextField();
                JTextField tenField = new JTextField();
                JTextField sdtField = new JTextField();
                JTextField cccdField = new JTextField();
                JTextField diaChiThuongTruField = new JTextField();
                JTextField ngaySinhField = new JTextField();
                JTextField maQTVField = new JTextField();

                maNVField.setText("MaNV00");
                maNVField.setEditable(false);
                maQTVField.setText("MaQTV00");

                JPanel popupEdit = new JPanel();
                popupEdit.setLayout(new GridBagLayout());
                GridBagConstraints gbc = new GridBagConstraints();
                gbc.insets = new Insets(4, 4, 4, 4);
                                
                // gridx = column, gridy = row
                gbc.gridx = 0;
                gbc.gridy = 0;
                gbc.anchor = GridBagConstraints.WEST;
                popupEdit.add(new JLabel("Mã nhân viên"), gbc);
                
                gbc.gridx = 1;
                gbc.gridy = 0;
                gbc.anchor = GridBagConstraints.EAST;
                maNVField.setPreferredSize(new Dimension(200, 40));
                popupEdit.add(maNVField, gbc);
                
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
                popupEdit.add(new JLabel("Địa chỉ thường trú"), gbc);
                
                gbc.gridx = 1;
                gbc.gridy = 5;
                gbc.anchor = GridBagConstraints.EAST;
                diaChiThuongTruField.setPreferredSize(new Dimension(200, 40));
                popupEdit.add(diaChiThuongTruField, gbc);
                
                gbc.gridx = 0;
                gbc.gridy = 6;
                gbc.anchor = GridBagConstraints.WEST;
                popupEdit.add(new JLabel("Mã Quản trị viên"), gbc);
                
                gbc.gridx = 1;
                gbc.gridy = 6;
                gbc.anchor = GridBagConstraints.EAST;
                maQTVField.setPreferredSize(new Dimension(200, 40));
                popupEdit.add(maQTVField, gbc);

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
