package com.ghtd.service;

import com.ghtd.dao.NguoiNhanDao;
import com.ghtd.dao.NguoiNhanDaoImpl;
import com.ghtd.model.NguoiNhan;

public class NguoiNhanServiceImpl implements NguoiNhanService{
    private NguoiNhanDao nguoiNhanDao = null;

    public NguoiNhanServiceImpl(){this.nguoiNhanDao = new NguoiNhanDaoImpl();}
    @Override
    public NguoiNhan addNguoiNhan(NguoiNhan nguoiNhan) {
        return nguoiNhanDao.addNguoiNhan(nguoiNhan);
    }
}
