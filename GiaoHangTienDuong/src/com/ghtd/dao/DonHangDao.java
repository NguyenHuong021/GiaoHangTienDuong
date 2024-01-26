package com.ghtd.dao;

import com.ghtd.model.DonHang;
import com.ghtd.model.TaiKhoan;

import java.util.List;

public interface DonHangDao {
    public List<DonHang> getList(TaiKhoan taiKhoan);

    public DonHang addDonHang(DonHang donHang);
}
