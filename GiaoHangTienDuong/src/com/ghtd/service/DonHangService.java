package com.ghtd.service;

import com.ghtd.model.DonHang;
import com.ghtd.model.TaiKhoan;

import java.util.List;

public interface DonHangService {
    public List<DonHang> getList(TaiKhoan taiKhoan);

    public DonHang addDonHang(DonHang donHang);
}
