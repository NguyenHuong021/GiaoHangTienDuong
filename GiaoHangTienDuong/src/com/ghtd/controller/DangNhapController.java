package com.ghtd.controller;

import com.ghtd.common.TaiKhoanSingleton;
import com.ghtd.main.Main;
import com.ghtd.model.TaiKhoan;
import com.ghtd.service.TaiKhoanService;
import com.ghtd.service.TaiKhoanServiceImpl;
import com.ghtd.view.LoginJPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class DangNhapController {
    private JFrame dialog;
    private JButton btnSubmit;
    private JTextField jtfTenDangNhap;
    private JTextField jtfMatKhau;
    private JLabel jlbMsg;

    private TaiKhoanService taiKhoanService = null;

    public DangNhapController(JFrame dialog, JButton btnSubmit,
                              JTextField jtfTenDangNhap, JTextField jtfMatKhau, JLabel jlbMsg) {
        this.dialog = dialog;
        this.btnSubmit = btnSubmit;
        this.jtfTenDangNhap = jtfTenDangNhap;
        this.jtfMatKhau = jtfMatKhau;
        this.jlbMsg = jlbMsg;
        taiKhoanService = new TaiKhoanServiceImpl();
    }

    public void setEvent() {
        btnSubmit.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    if (jtfTenDangNhap.getText().length() == 0
                            || jtfMatKhau.getText().length() == 0) {
                        jlbMsg.setText("Vui lòng nhập dữ liệu bắt buộc!");
                    } else {
                        TaiKhoan taiKhoan = taiKhoanService.login(jtfTenDangNhap.getText(), jtfMatKhau.getText());
                        if (taiKhoan == null) {
                            jlbMsg.setText("Tên đăng nhập và mật khẩu không đúng!");
                        } else{
                            System.out.println("loại nguời dùng : " + taiKhoan.getLoaiND());
                            // Khách hàng thì sẽ để là KH, Shippper thì sẽ để là GH
                            if(taiKhoan.getLoaiND().equals("KH")){
                                // Gọi hàm để thông báo cho Main rằng đăng nhập đã thành công :
                                System.out.println("KH");
                                TaiKhoanSingleton.getInstance().setTaiKhoan(taiKhoan);
                                System.out.println(taiKhoan.getMaND());
                                notifyLoginSuccess();
                            }
                            if(taiKhoan.getLoaiND().equals("GH")){
                                System.out.println("GH");
                                TaiKhoanSingleton.getInstance().setTaiKhoan(taiKhoan);
                                System.out.println(taiKhoan.getMaND());
                                notifyShipperLoginSuccess();
                            }
                            if(taiKhoan.getLoaiND().equals("QTV")){
                                System.out.println("QTV");
                                TaiKhoanSingleton.getInstance().setTaiKhoan(taiKhoan);
                                System.out.println(taiKhoan.getMaND());
                                notifyQTVLoginSuccess();
                            }
                        }
                    }
                    // Đóng cửa sổ đăng nhập
                    //this.dispose();
                } catch (Exception ex) {
                    jlbMsg.setText(ex.toString());
                }
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                btnSubmit.setBackground(new Color(0, 200, 83));
            }
            @Override
            public void mouseExited(MouseEvent e) {
                btnSubmit.setBackground(new Color(100, 221, 23));
            }
        });
    }
    private void notifyLoginSuccess() {
        // Gọi phương thức static trong Main để thông báo đăng nhập thành công
        Main.handleLoginSuccess();
    }

    private void notifyShipperLoginSuccess(){
        Main.handleLoginShipper();
    }
    
    private void notifyQTVLoginSuccess() {
        Main.handleLoginQTV();
    }
}
