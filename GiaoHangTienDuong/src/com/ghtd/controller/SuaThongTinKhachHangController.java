package com.ghtd.controller;

import com.ghtd.view.AccountInfoJPanel;
import javax.swing.*;


public class SuaThongTinKhachHangController {
    private JButton jbtnEdit;
    private JPanel jpnAccount;
    
    public SuaThongTinKhachHangController() {
        
    }
    
    public void popUpEditer() {
        JTextField maKhachHangField = new JTextField();
        JTextField tenField = new JTextField();
        JTextField sdtField = new JTextField();
        JTextField cccdField = new JTextField();
        JTextField diaChiGuiHangField = new JTextField();
        JTextField ngaySinhField = new JTextField();
        
        JPanel popupEdit = new JPanel();
        popupEdit.add(new JLabel("Ma Khach Hang"));
        popupEdit.add(maKhachHangField);
        popupEdit.add(Box.createHorizontalStrut(15)); // a spacer
        
        popupEdit.add(new JLabel("Ho va ten"));
        popupEdit.add(tenField);
        popupEdit.add(Box.createHorizontalStrut(15)); // a spacer
        
        popupEdit.add(new JLabel("Ma Khach Hang"));
        popupEdit.add(maKhachHangField);
        popupEdit.add(Box.createHorizontalStrut(15)); // a spacer
        
        popupEdit.add(new JLabel("Ma Khach Hang"));
        popupEdit.add(maKhachHangField);
        popupEdit.add(Box.createHorizontalStrut(15)); // a spacer
        
        popupEdit.add(new JLabel("Ma Khach Hang"));
        popupEdit.add(maKhachHangField);
        popupEdit.add(Box.createHorizontalStrut(15)); // a spacer
        
        popupEdit.add(new JLabel("Ma Khach Hang"));
        popupEdit.add(maKhachHangField);
        popupEdit.add(Box.createHorizontalStrut(15)); // a spacer
        
    }
}
