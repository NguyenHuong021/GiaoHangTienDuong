package com.ghtd.service;

import com.ghtd.dao.NguoiDungDao;
import com.ghtd.dao.NguoiDungDaoImpl;
import com.ghtd.model.TaiKhoan;

public class NguoiDungServiceImpl implements NguoiDungService{
    private NguoiDungDao nguoiDungDao = null;
    public NguoiDungServiceImpl(){this.nguoiDungDao = new NguoiDungDaoImpl();}
    @Override
    public Object thonTinNguoiDung(TaiKhoan taiKhoan) {
        return nguoiDungDao.thonTinNguoiDung(taiKhoan);
    }
}
