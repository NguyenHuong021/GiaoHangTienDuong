package com.ghtd.model;

import java.sql.Timestamp;
import java.sql.Date;

/**
 *
 * @author Asus
 */
public class DonHang {
    
    private int maDH;
    private String diaChiNhan;
    private String diaChiGui;
    private Date ngayNhan;
    private Timestamp thoiGianGiao;
    private String loaiHang;
    private String tenSP;
    private float canNang;
    private int phiVanChuyen;
    private int tienCOD;
    private String trangThaiGuiNhan;
    private int maKH;
    private int maNN;
    private int maNV;
    private int maQTV;

    public int getMaDH() {
        return maDH;
    }

    public void setMaDH(int maDH) {
        this.maDH = maDH;
    }

    public String getDiaChiNhan() {
        return diaChiNhan;
    }

    public void setDiaChiNhan(String diaChiNhan) {
        this.diaChiNhan = diaChiNhan;
    }

    public String getDiaChiGui() {
        return diaChiGui;
    }

    public void setDiaChiGui(String diaChiGui) {
        this.diaChiGui = diaChiGui;
    }

    public Date getNgayNhan() {
        return ngayNhan;
    }

    public void setNgayNhan(Date ngayNhan) {
        this.ngayNhan = ngayNhan;
    }

    public Timestamp getThoiGianGiao() {
        return thoiGianGiao;
    }

    public void setThoiGianGiao(Timestamp thoiGianGiao) {
        this.thoiGianGiao = thoiGianGiao;
    }

    public String getLoaiHang() {
        return loaiHang;
    }

    public void setLoaiHang(String loaiHang) {
        this.loaiHang = loaiHang;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public float getCanNang() {
        return canNang;
    }

    public void setCanNang(float canNang) {
        this.canNang = canNang;
    }

    public int getPhiVanChuyen() {
        return phiVanChuyen;
    }

    public void setPhiVanChuyen(int phiVanChuyen) {
        this.phiVanChuyen = phiVanChuyen;
    }

    public int getTienCOD() {
        return tienCOD;
    }

    public void setTienCOD(int tienCOD) {
        this.tienCOD = tienCOD;
    }

    public String getTrangThaiGuiNhan() {
        return trangThaiGuiNhan;
    }

    public void setTrangThaiGuiNhan(String trangThaiGuiNhan) {
        this.trangThaiGuiNhan = trangThaiGuiNhan;
    }

    public int getMaKH() {
        return maKH;
    }

    public void setMaKH(int maKH) {
        this.maKH = maKH;
    }

    public int getMaNN() {
        return maNN;
    }

    public void setMaNN(int maNN) {
        this.maNN = maNN;
    }

    public int getMaNV() {
        return maNV;
    }

    public void setMaNV(int maNV) {
        this.maNV = maNV;
    }

    public int getMaQTV() {
        return maQTV;
    }

    public void setMaQTV(int maQTV) {
        this.maQTV = maQTV;
    }
    
}
