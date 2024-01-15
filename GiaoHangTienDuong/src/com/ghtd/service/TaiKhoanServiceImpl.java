package com.ghtd.service;

import com.ghtd.dao.TaiKhoanDao;
import com.ghtd.dao.TaiKhoanDaoImpl;
import com.ghtd.model.TaiKhoan;

public class TaiKhoanServiceImpl implements TaiKhoanService {

    private TaiKhoanDao taiKhoanDAO = null;

    public TaiKhoanServiceImpl() {
        taiKhoanDAO = new TaiKhoanDaoImpl();
    }

    @Override
    public TaiKhoan login(String account, String password){
        return taiKhoanDAO.login(account, password);
    }
}
