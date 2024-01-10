package com.ghtd.model;

import java.sql.Date;

/**
 *
 * @author Asus
 */
public class NhanVienGiaoHang {
    
    private int maNV;
    private String tenNV;
    private int SDT;
    private int CCCD;
    private String diaChiThuongTru;
    private Date ngayThangNamSinh;
    private int maQTV;

    public int getMaNV() {
        return maNV;
    }

    public void setMaNV(int maNV) {
        this.maNV = maNV;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public int getSDT() {
        return SDT;
    }

    public void setSDT(int SDT) {
        this.SDT = SDT;
    }

    public int getCCCD() {
        return CCCD;
    }

    public void setCCCD(int CCCD) {
        this.CCCD = CCCD;
    }

    public String getDiaChiThuongTru() {
        return diaChiThuongTru;
    }

    public void setDiaChiThuongTru(String diaChiThuongTru) {
        this.diaChiThuongTru = diaChiThuongTru;
    }

    public Date getNgayThangNamSinh() {
        return ngayThangNamSinh;
    }

    public void setNgayThangNamSinh(Date ngayThangNamSinh) {
        this.ngayThangNamSinh = ngayThangNamSinh;
    }

    public int getMaQTV() {
        return maQTV;
    }

    public void setMaQTV(int maQTV) {
        this.maQTV = maQTV;
    }
    
}
