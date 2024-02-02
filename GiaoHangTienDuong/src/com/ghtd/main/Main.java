package com.ghtd.main;

import com.ghtd.view.LoginJPanel;
import com.ghtd.view.MainJFrameGiaoHang;
import com.ghtd.view.MainJFrameKhachHang;
import static com.ghtd.dao.DBConnect.getConnection;

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
        MainJFrameKhachHang mainFrame = new MainJFrameKhachHang();
        loginJPanel.setVisible(false);
        mainFrame.setVisible(true);
    }

    public static void handleLoginShipper(){
        System.out.println("Handling login shipper");
        MainJFrameGiaoHang mainJFrameShipper = new MainJFrameGiaoHang();
        loginJPanel.setVisible(false);
        mainJFrameShipper.setVisible(true);
    }
}
