package com.ghtd.util;

import com.ghtd.model.DonHang;

import javax.swing.table.DefaultTableModel;
import java.util.List;

public class DonHangTable {
    public DefaultTableModel setTableDonHang(List<DonHang> listItem, String[] listColumn) {
        int columns = listColumn.length;
        DefaultTableModel dtm = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false;
            }

            @Override
            public Class<?> getColumnClass(int columnIndex) {
                return columnIndex == 5 ? String.class : String.class;
            }
        };
        dtm.setColumnIdentifiers(listColumn);
        Object[] obj;
        int num = listItem.size();
        DonHang donHang = null;
        for (int i = 0; i < num; i++) {
            donHang = listItem.get(i);
            obj = new Object[columns];
            obj[0] = donHang.getMaDH();
            obj[1] = donHang.getDiaChiGui();
            obj[2] = donHang.getDiaChiNhan();
            obj[3] = donHang.getTenSP();
            obj[4] = donHang.getPhiVanChuyen();
            obj[5] = donHang.getTrangThaiGuiNhan();
            dtm.addRow(obj);
        }
        return dtm;
    }
}
