package com.ghtd.main;

import com.ghtd.view.LoginJPanel;
import com.ghtd.view.MainJFrame;
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
        MainJFrame mainFrame = new MainJFrame();
        loginJPanel.setVisible(false);
        mainFrame.setVisible(true);
    }
}
