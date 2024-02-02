package com.ghtd.controller;

import com.ghtd.bean.DanhMucBean;
import com.ghtd.view.AccountEditKhachHangJPanelQTV;
import com.ghtd.view.AccountEditNhanVienJPanelQTV;
import com.ghtd.view.AllOrderJPanelQTV;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.util.List;
/**
 *
 * @author Asus
 */
public class ChuyenManHinhControllerQTV {
    
    private JPanel root;
    private String kindSelected = "";
    
    private List<DanhMucBean> listItem = null;

    public ChuyenManHinhControllerQTV(JPanel jpnRoot) {
        this.root = jpnRoot;
    }
    
    public void setView(JPanel jpnItem, JLabel jlbItem) {
        kindSelected = "AllOrderQTV";
        jpnItem.setBackground(new Color (173, 56, 56));
        jlbItem.setBackground(new Color (173, 56, 56));
        
        root.removeAll();
        root.setLayout(new BorderLayout());
        root.add(new AllOrderJPanelQTV());
        root.validate();
        root.repaint();
    }
    
    public void setEvent(List<DanhMucBean> listItem) {
        this.listItem = listItem;
        for(DanhMucBean item : listItem) {
            item.getJlb().addMouseListener(new LabelEvent(item.getKind(), item.getJpn(), item.getJlb()));
        }
    }

    // LabelEvent là sự kiện tác động lên các nút của mình.
    class LabelEvent implements MouseListener {
        
        private JPanel node;
        
        private String kind;
        private JPanel jpnItem;
        private JLabel jlbItem;

        public LabelEvent(String kind, JPanel jpnItem, JLabel jlbItem) {
            this.kind = kind;
            this.jpnItem = jpnItem;
            this.jlbItem = jlbItem;
        }
        
        @Override
        public void mouseClicked(MouseEvent e) {
            switch(kind) {
                case "AccountEditKhachHang":
                    node = new AccountEditKhachHangJPanelQTV();
                    break;
                case "AccountEditNhanVien":
                    node = new AccountEditNhanVienJPanelQTV();
                    break;
                case "AllOrderQTV":
                    node = new AllOrderJPanelQTV();
                    break;    
                default:
                    break;
            }
            root.removeAll();
            root.setLayout(new BorderLayout());
            root.add(node);
            root.validate();
            root.repaint();
            setChangeBackground(kind);
        }

        @Override
        public void mousePressed(MouseEvent e) {
            kindSelected = kind;
            jpnItem.setBackground(new Color (173, 56, 56));
            jlbItem.setBackground(new Color (173, 56, 56));
        }

        @Override
        public void mouseReleased(MouseEvent e) {
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            jpnItem.setBackground(new Color (173, 56, 56));
            jlbItem.setBackground(new Color (173, 56, 56));
        }

        @Override
        public void mouseExited(MouseEvent e) {
            if(!kindSelected.equalsIgnoreCase(kind)){
                jpnItem.setBackground(new Color (255, 102, 102));
                jlbItem.setBackground(new Color (255, 102, 102));
            }
        }
        
    }
    
    private void setChangeBackground(String kind) {
        for(DanhMucBean item : listItem) {
            if(item.getKind().equalsIgnoreCase(kind)) {
                item.getJpn().setBackground(new Color (173, 56, 56));
                item.getJlb().setBackground(new Color (173, 56, 56));
            } else {
                item.getJpn().setBackground(new Color (255, 102, 102));
                item.getJlb().setBackground(new Color (255, 102, 102));
            }
        }
    }
    
}
