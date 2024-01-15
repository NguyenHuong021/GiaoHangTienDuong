package com.ghtd.dao;

import com.ghtd.model.TaiKhoan;

public interface TaiKhoanDao {
    public TaiKhoan login(String account, String password);
}
