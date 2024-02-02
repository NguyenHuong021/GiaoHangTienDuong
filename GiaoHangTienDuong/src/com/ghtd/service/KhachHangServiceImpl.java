package com.ghtd.service;

import com.ghtd.dao.KhachHangDao;
import com.ghtd.dao.KhachHangDaoImpl;
import com.ghtd.model.KhachHang;

public class KhachHangServiceImpl implements KhachHangService{
    private KhachHangDao khachHangDao = null;

    public KhachHangServiceImpl() {
        this.khachHangDao = new KhachHangDaoImpl();
    }

    @Override
    public KhachHang addKhachHang(KhachHang khachHang) {
        return khachHangDao.addKhachHang(khachHang);
    }

    @Override
    public KhachHang updateKhachHang(KhachHang khachHang) {
        return khachHangDao.updateKhachHang(khachHang);
    }
}
