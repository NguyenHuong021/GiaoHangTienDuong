package com.ghtd.gui;

import com.ghtd.controller.DangNhapController;

import javax.swing.*;
import java.awt.*;

public class DangNhapDialog {
    private Dialog dialog;
    private JButton btnSubmit;
    private JTextField jtfTenDangNhap;
    private JTextField jtfMatKhau;
    private JLabel jlbMsg;

    DangNhapController controller = new DangNhapController(dialog, btnSubmit,
            jtfTenDangNhap, jtfMatKhau, jlbMsg);
    // Can ve giao dien cua bang dang nhap vao day
    // controller.setEvent();
}
