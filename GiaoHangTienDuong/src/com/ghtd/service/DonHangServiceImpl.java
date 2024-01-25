package com.ghtd.service;

import com.ghtd.dao.DonHangDao;
import com.ghtd.dao.DonHangDaoImpl;
import com.ghtd.model.DonHang;
import com.ghtd.model.TaiKhoan;

import java.util.List;

public class DonHangServiceImpl implements DonHangService{
    private DonHangDao donHangDao;

    public DonHangServiceImpl(){
        this.donHangDao = new DonHangDaoImpl();
    }
    @Override
    public List<DonHang> getList(TaiKhoan taiKhoan) {
        return donHangDao.getList(taiKhoan);
    }
}
