package com.ghtd.controller;

import com.ghtd.view.AccountInfoJPanel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;


public class SuaThongTinKhachHangController {
    private JButton editButton;
    
    public SuaThongTinKhachHangController() {
        this.editButton = editButton;
    }
     
    
    public void popUpEditer() {
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
                popupEdit.add(new JLabel("Mã khách hàng"));
                popupEdit.add(maKhachHangField);
                popupEdit.add(Box.createHorizontalStrut(15)); // a spacer

                popupEdit.add(new JLabel("Họ và tên"));
                popupEdit.add(tenField);
                popupEdit.add(Box.createHorizontalStrut(15)); // a spacer

                popupEdit.add(new JLabel("Ngày sinh"));
                popupEdit.add(ngaySinhField);
                popupEdit.add(Box.createHorizontalStrut(15)); // a spacer

                popupEdit.add(new JLabel("CCCD"));
                popupEdit.add(cccdField);
                popupEdit.add(Box.createHorizontalStrut(15)); // a spacer

                popupEdit.add(new JLabel("Số điện thoại"));
                popupEdit.add(sdtField);
                popupEdit.add(Box.createHorizontalStrut(15)); // a spacer

                popupEdit.add(new JLabel("Địa chỉ gửi hàng"));
                popupEdit.add(diaChiGuiHangField);

                JOptionPane.showConfirmDialog(null, popupEdit, "Nhập thông tin mới", JOptionPane.OK_CANCEL_OPTION);
            }
        });
    }
}
