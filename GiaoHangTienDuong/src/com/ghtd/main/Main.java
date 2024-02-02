package com.ghtd.main;

import static com.ghtd.dao.DBConnect.getConnection;
import com.ghtd.view.LoginJPanel;
import com.ghtd.view.MainJFrameGiaoHang;
import com.ghtd.view.MainJFrameKhachHang;
import com.ghtd.view.MainJFrameQTV;

// *
// * @author Asus
// */
public class Main {
    public static LoginJPanel loginJPanel = new LoginJPanel();
            
    public static void main(String[] args) {
        getConnection();
        System.out.println("Running main frame");
        //new MainJFrame().setVisible(true);
        //new LoginJPanel().setVisible(true);
        loginJPanel.setVisible(true);
    }

    public static void handleLoginSuccess() {
        System.out.println("Handling login success");
        // Hiển thị MainJFrame sau khi đăng nhập thành công
        //LoginJPanel loginJPanel = new LoginJPanel();
        //loginJPanel.setVisible(false);
        MainJFrameKhachHang mainJFrameKhachHang = new MainJFrameKhachHang();
        loginJPanel.setVisible(false);
        mainJFrameKhachHang.setVisible(true);
    }

    public static void handleLoginShipper(){
        System.out.println("Handling login shipper");
        MainJFrameGiaoHang mainJFrameShipper = new MainJFrameGiaoHang();
        loginJPanel.setVisible(false);
        mainJFrameShipper.setVisible(true);
    }
    
    public static void handleLoginQTV() {
        System.out.println("Handling login QTV");
        MainJFrameQTV mainJFrameQTV = new MainJFrameQTV();
        loginJPanel.setVisible(false);
        mainJFrameQTV.setVisible(true);
    }
}
