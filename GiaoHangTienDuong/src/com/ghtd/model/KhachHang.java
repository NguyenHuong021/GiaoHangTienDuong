package com.ghtd.model;

import java.sql.Date;

/**
 *
 * @author Asus
 */
public class KhachHang {
    private int maKH;
    private String tenKH;
    private int SDT;
    private int CCCD;
    private String diaChiGuiHang;
    private Date ngayThangNamSinh;
    private String yeuCauDacBiet;

    public int getMaKH() {
        return maKH;
    }

    public void setMaKH(int maKH) {
        this.maKH = maKH;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
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

    public String getDiaChiGuiHang() {
        return diaChiGuiHang;
    }

    public void setDiaChiGuiHang(String diaChiGuiHang) {
        this.diaChiGuiHang = diaChiGuiHang;
    }

    public Date getNgayThangNamSinh() {
        return ngayThangNamSinh;
    }

    public void setNgayThangNamSinh(Date ngayThangNamSinh) {
        this.ngayThangNamSinh = ngayThangNamSinh;
    }

    public String getYeuCauDacBiet() {
        return yeuCauDacBiet;
    }

    public void setYeuCauDacBiet(String yeuCauDacBiet) {
        this.yeuCauDacBiet = yeuCauDacBiet;
    }
    
}
