package com.ghtd.common;

import com.ghtd.model.TaiKhoan;

public class TaiKhoanSingleton {
    private static TaiKhoanSingleton instance;
    private TaiKhoan taiKhoan;

    private TaiKhoanSingleton() {
        // Khởi tạo đối tượng TaiKhoan ở đây
        taiKhoan = new TaiKhoan();
    }

    public static synchronized TaiKhoanSingleton getInstance() {
        if (instance == null) {
            instance = new TaiKhoanSingleton();
        }
        return instance;
    }

    public void setTaiKhoan(TaiKhoan taiKhoan) {
        this.taiKhoan = taiKhoan;
    }

    public TaiKhoan getTaiKhoan() {
        return taiKhoan;
    }
}


