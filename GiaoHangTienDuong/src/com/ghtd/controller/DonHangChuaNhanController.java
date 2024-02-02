package com.ghtd.controller;

import com.ghtd.common.TaiKhoanSingleton;
import com.ghtd.model.DonHang;
import com.ghtd.model.TaiKhoan;
import com.ghtd.service.DonHangService;
import com.ghtd.service.DonHangServiceImpl;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class DonHangChuaNhanController{
    private JPanel allOrderPanel;
    private DonHangService donHangService = null;

    public DonHangChuaNhanController(JPanel allOrderPanel){
        this.allOrderPanel = allOrderPanel;
        donHangService = new DonHangServiceImpl();
    }
    public void taoBang(JPanel allOrderPanel){
        TaiKhoan taiKhoan = TaiKhoanSingleton.getInstance().getTaiKhoan();
        List<DonHang> listItem = donHangService.getList(taiKhoan);
        JScrollPane scroll = new JScrollPane();
        JPanel table = new JPanel();
        JTextField maDH = new JTextField();
        JTextField diaChiGui = new JTextField();
        JTextField diaChiNhan = new JTextField();
        JTextField tenSP = new JTextField();
        JTextField phiVanChuyen = new JTextField();
        JTextField trangThaiGuiNhan = new JTextField();
        //"Mã Đơn Hàng", "Địa chỉ gửi", "Địa chỉ nhận", "Tên Sản Phẩm",
        //            "Phí vận chuyển", "Trạng thái gửi nhận"
        table.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.gridy = 0;
        gbc.gridx = 0;
        table.add(new JLabel("Mã Đơn Hàng"), gbc);

        gbc.gridx = 1;
        table.add(new JLabel("Địa chỉ gửi"), gbc);

        gbc.gridx = 2;
        table.add(new JLabel("Địa chỉ nhận"), gbc);

        gbc.gridx = 3;
        table.add(new JLabel("Tên Sản Phẩm"), gbc);

        gbc.gridx = 4;
        table.add(new JLabel("Phí vận chuyển"), gbc);

        gbc.gridx = 5;
        table.add(new JLabel("Trạng thái gửi nhận"), gbc);

        gbc.gridx = 6;
        table.add(new JLabel("Action"), gbc);

        for(int i = 1; i < listItem.size(); i++){
            JButton button = new JButton();
            gbc.gridy = i;
            gbc.gridx = 0;
            maDH.setText(String.valueOf(listItem.get(i - 1).getMaDH()));

            gbc.gridx = 1;
            diaChiGui.setText(String.valueOf(listItem.get(i - 1).getDiaChiGui()));

            gbc.gridx = 2;
            diaChiNhan.setText(String.valueOf(listItem.get(i - 1).getDiaChiNhan()));

            gbc.gridx = 3;
            tenSP.setText(String.valueOf(listItem.get(i - 1).getTenSP()));

            gbc.gridx = 4;
            phiVanChuyen.setText(String.valueOf(listItem.get(i - 1).getPhiVanChuyen()));

            gbc.gridx = 5;
            trangThaiGuiNhan.setText(String.valueOf(listItem.get(i - 1).getTrangThaiGuiNhan()));

            gbc.gridx = 6;
            button.setText(String.valueOf(i - 1));

            table.add(maDH, gbc);
            table.add(diaChiGui, gbc);
            table.add(diaChiNhan, gbc);
            table.add(tenSP, gbc);
            table.add(phiVanChuyen, gbc);
            table.add(trangThaiGuiNhan, gbc);
            table.add(button, gbc);
        }
        allOrderPanel.add(table);
    }
}
