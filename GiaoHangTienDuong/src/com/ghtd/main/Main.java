package com.ghtd.main;

import com.ghtd.gui.DangNhapDialog;
import javax.swing.*;

/**
 *
 * @author Asus
 */
public class Main {
    
    public static void main(String[] args) {
        DangNhapDialog h = new DangNhapDialog();
        h.setContentPane(h.panelMain);
        h.setSize(300, 400);
        h.setVisible(true);
        h.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
