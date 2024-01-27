package com.ghtd.controller;

import com.ghtd.common.TaiKhoanSingleton;
import com.ghtd.model.DonHang;
import com.ghtd.model.TaiKhoan;
import com.ghtd.service.DonHangService;
import com.ghtd.service.DonHangServiceImpl;
import com.ghtd.util.DonHangTable;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import java.awt.*;
import java.util.List;

public class DonHangController {
    private JPanel jpnView;
    private JButton btnAdd;
    private JTextField jtfSearch;

    private DonHangTable classTableModel = null;

    private final String[] COLUMNS = {"Mã Đơn Hàng", "Địa chỉ gửi", "Địa chỉ nhận", "Tên Sản Phẩm",
            "Phí vận chuyển", "Trạng thái gửi nhận"};

    private DonHangService donHangService = null;

    private TableRowSorter<TableModel> rowSorter = null;

    public DonHangController(){};

    public DonHangController(JPanel jpnView, JButton btnAdd, JTextField jtfSearch) {
        this.jpnView = jpnView;
        this.btnAdd = btnAdd;
        this.jtfSearch = jtfSearch;
        this.classTableModel = new DonHangTable();
        this.donHangService = new DonHangServiceImpl();
    }

    public void setDataToTable() {
        // Lay Thong tin tai khoan o day
        TaiKhoan taiKhoan = TaiKhoanSingleton.getInstance().getTaiKhoan();
        List<DonHang> listItem = donHangService.getList(taiKhoan);
        DefaultTableModel model = classTableModel.setTableDonHang(listItem, COLUMNS);
        JTable table = new JTable(model);

        rowSorter = new TableRowSorter<>(table.getModel());
        table.setRowSorter(rowSorter);

        jtfSearch.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                String text = jtfSearch.getText();
                if (text.trim().length() == 0) {
                    rowSorter.setRowFilter(null);
                } else {
                    rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                String text = jtfSearch.getText();
                if (text.trim().length() == 0) {
                    rowSorter.setRowFilter(null);
                } else {
                    rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
                }
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
            }
        });

        // design
        table.getTableHeader().setFont(new Font("Arial", Font.BOLD, 14));
        table.getTableHeader().setPreferredSize(new Dimension(100, 50));
        table.setRowHeight(50);
        table.validate();
        table.repaint();

        JScrollPane scroll = new JScrollPane();
        scroll.getViewport().add(table);
        scroll.setPreferredSize(new Dimension(1350, 400));
        jpnView.removeAll();
        jpnView.setLayout(new CardLayout());
        jpnView.add(scroll);
        jpnView.validate();
        jpnView.repaint();
    }


}
