package com.ghtd.model;

public class NguoiNhan {
    private int maNN;

    private String tenNN;

    private int SDT;

    private int CCCD;

    private String diahChiNhanHang;

    public NguoiNhan() {
    }

    public NguoiNhan(String tenNN, int SDT, int CCCD, String diahChiNhanHang) {
        this.tenNN = tenNN;
        this.SDT = SDT;
        this.CCCD = CCCD;
        this.diahChiNhanHang = diahChiNhanHang;
    }

    public int getMaNN() {
        return maNN;
    }

    public String getTenNN() {
        return tenNN;
    }

    public int getSDT() {
        return SDT;
    }

    public int getCCCD() {
        return CCCD;
    }

    public String getDiahChiNhanHang() {
        return diahChiNhanHang;
    }

    public void setMaNN(int maNN) {
        this.maNN = maNN;
    }

    public void setTenNN(String tenNN) {
        this.tenNN = tenNN;
    }

    public void setSDT(int SDT) {
        this.SDT = SDT;
    }

    public void setCCCD(int CCCD) {
        this.CCCD = CCCD;
    }

    public void setDiahChiNhanHang(String diahChiNhanHang) {
        this.diahChiNhanHang = diahChiNhanHang;
    }
}
