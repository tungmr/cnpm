/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlbh.view;

import com.qlbh.bean.DanhMucBean;
import com.qlbh.controller.ChuyenManHinhController;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HoangDucTung
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    public MainJFrame() {
        initComponents();
        List<DanhMucBean> listDanhMuc = new ArrayList<>();
        listDanhMuc.add(new DanhMucBean("TrangChinh", jPanelTrangChu, jLabelTrangChu));
        listDanhMuc.add(new DanhMucBean("SanPham", jPanelSanPham, jLabelSanPham));
        listDanhMuc.add(new DanhMucBean("NhaCungCap", jPanelNhaCungCap, jLabelNhaCungCap));
        listDanhMuc.add(new DanhMucBean("KhachHang", jPanelKhachHang, jLabelKhachHang));
        listDanhMuc.add(new DanhMucBean("BanHang", jPanelBanHang, jLabelBanHang));
        listDanhMuc.add(new DanhMucBean("NhanVien", jPanelNhanVien, jLabelNhanVien));
        listDanhMuc.add(new DanhMucBean("TimKiemThongKe", jPanelTimKiemThongKe, jLabelTimKiemThongKe));

        ChuyenManHinhController controller = new ChuyenManHinhController(jPanelXem);
        controller.setView(jPanelTrangChu, jLabelTrangChu);
        controller.setEvent(listDanhMuc);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelRoot = new javax.swing.JPanel();
        jPanelMenu = new javax.swing.JPanel();
        jPanelTitle = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanelTrangChu = new javax.swing.JPanel();
        jLabelTrangChu = new javax.swing.JLabel();
        jPanelSanPham = new javax.swing.JPanel();
        jLabelSanPham = new javax.swing.JLabel();
        jPanelNhaCungCap = new javax.swing.JPanel();
        jLabelNhaCungCap = new javax.swing.JLabel();
        jPanelKhachHang = new javax.swing.JPanel();
        jLabelKhachHang = new javax.swing.JLabel();
        jPanelBanHang = new javax.swing.JPanel();
        jLabelBanHang = new javax.swing.JLabel();
        jPanelNhanVien = new javax.swing.JPanel();
        jLabelNhanVien = new javax.swing.JLabel();
        jPanelTimKiemThongKe = new javax.swing.JPanel();
        jLabelTimKiemThongKe = new javax.swing.JLabel();
        jPanelXem = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản lí bán hàng");

        jPanelMenu.setBackground(new java.awt.Color(36, 123, 160));

        jPanelTitle.setBackground(new java.awt.Color(255, 22, 84));

        jLabel2.setBackground(new java.awt.Color(255, 22, 84));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlbh/images/customer-service.png"))); // NOI18N
        jLabel2.setText("QUẢN LÍ BÁN HÀNG");

        javax.swing.GroupLayout jPanelTitleLayout = new javax.swing.GroupLayout(jPanelTitle);
        jPanelTitle.setLayout(jPanelTitleLayout);
        jPanelTitleLayout.setHorizontalGroup(
            jPanelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTitleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelTitleLayout.setVerticalGroup(
            jPanelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTitleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanelTrangChu.setBackground(new java.awt.Color(112, 193, 179));

        jLabelTrangChu.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelTrangChu.setForeground(new java.awt.Color(255, 22, 84));
        jLabelTrangChu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlbh/images/homepage.png"))); // NOI18N
        jLabelTrangChu.setText("TRANG CHỦ");

        javax.swing.GroupLayout jPanelTrangChuLayout = new javax.swing.GroupLayout(jPanelTrangChu);
        jPanelTrangChu.setLayout(jPanelTrangChuLayout);
        jPanelTrangChuLayout.setHorizontalGroup(
            jPanelTrangChuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTrangChuLayout.createSequentialGroup()
                .addContainerGap(130, Short.MAX_VALUE)
                .addComponent(jLabelTrangChu, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );
        jPanelTrangChuLayout.setVerticalGroup(
            jPanelTrangChuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTrangChuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTrangChu, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanelSanPham.setBackground(new java.awt.Color(112, 193, 179));

        jLabelSanPham.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelSanPham.setForeground(new java.awt.Color(255, 22, 84));
        jLabelSanPham.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlbh/images/shopping-bag..png"))); // NOI18N
        jLabelSanPham.setText("SẢN PHẨM");

        javax.swing.GroupLayout jPanelSanPhamLayout = new javax.swing.GroupLayout(jPanelSanPham);
        jPanelSanPham.setLayout(jPanelSanPhamLayout);
        jPanelSanPhamLayout.setHorizontalGroup(
            jPanelSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSanPhamLayout.createSequentialGroup()
                .addContainerGap(130, Short.MAX_VALUE)
                .addComponent(jLabelSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );
        jPanelSanPhamLayout.setVerticalGroup(
            jPanelSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSanPhamLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelSanPham, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanelNhaCungCap.setBackground(new java.awt.Color(112, 193, 179));

        jLabelNhaCungCap.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelNhaCungCap.setForeground(new java.awt.Color(255, 22, 84));
        jLabelNhaCungCap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlbh/images/outsourcing.png"))); // NOI18N
        jLabelNhaCungCap.setText("NHÀ CUNG CẤP");

        javax.swing.GroupLayout jPanelNhaCungCapLayout = new javax.swing.GroupLayout(jPanelNhaCungCap);
        jPanelNhaCungCap.setLayout(jPanelNhaCungCapLayout);
        jPanelNhaCungCapLayout.setHorizontalGroup(
            jPanelNhaCungCapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelNhaCungCapLayout.createSequentialGroup()
                .addContainerGap(130, Short.MAX_VALUE)
                .addComponent(jLabelNhaCungCap, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );
        jPanelNhaCungCapLayout.setVerticalGroup(
            jPanelNhaCungCapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNhaCungCapLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelNhaCungCap, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanelKhachHang.setBackground(new java.awt.Color(112, 193, 179));

        jLabelKhachHang.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelKhachHang.setForeground(new java.awt.Color(255, 22, 84));
        jLabelKhachHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlbh/images/community .png"))); // NOI18N
        jLabelKhachHang.setText("KHÁCH HÀNG");

        javax.swing.GroupLayout jPanelKhachHangLayout = new javax.swing.GroupLayout(jPanelKhachHang);
        jPanelKhachHang.setLayout(jPanelKhachHangLayout);
        jPanelKhachHangLayout.setHorizontalGroup(
            jPanelKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelKhachHangLayout.createSequentialGroup()
                .addContainerGap(130, Short.MAX_VALUE)
                .addComponent(jLabelKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );
        jPanelKhachHangLayout.setVerticalGroup(
            jPanelKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelKhachHangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelKhachHang, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanelBanHang.setBackground(new java.awt.Color(112, 193, 179));

        jLabelBanHang.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelBanHang.setForeground(new java.awt.Color(255, 22, 84));
        jLabelBanHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlbh/images/commerce.png"))); // NOI18N
        jLabelBanHang.setText("BÁN HÀNG");

        javax.swing.GroupLayout jPanelBanHangLayout = new javax.swing.GroupLayout(jPanelBanHang);
        jPanelBanHang.setLayout(jPanelBanHangLayout);
        jPanelBanHangLayout.setHorizontalGroup(
            jPanelBanHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBanHangLayout.createSequentialGroup()
                .addContainerGap(130, Short.MAX_VALUE)
                .addComponent(jLabelBanHang, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );
        jPanelBanHangLayout.setVerticalGroup(
            jPanelBanHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBanHangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelBanHang, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanelNhanVien.setBackground(new java.awt.Color(112, 193, 179));

        jLabelNhanVien.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelNhanVien.setForeground(new java.awt.Color(255, 22, 84));
        jLabelNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlbh/images/employee.png"))); // NOI18N
        jLabelNhanVien.setText("NHÂN VIÊN");

        javax.swing.GroupLayout jPanelNhanVienLayout = new javax.swing.GroupLayout(jPanelNhanVien);
        jPanelNhanVien.setLayout(jPanelNhanVienLayout);
        jPanelNhanVienLayout.setHorizontalGroup(
            jPanelNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelNhanVienLayout.createSequentialGroup()
                .addContainerGap(130, Short.MAX_VALUE)
                .addComponent(jLabelNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );
        jPanelNhanVienLayout.setVerticalGroup(
            jPanelNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNhanVienLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanelTimKiemThongKe.setBackground(new java.awt.Color(112, 193, 179));

        jLabelTimKiemThongKe.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelTimKiemThongKe.setForeground(new java.awt.Color(255, 22, 84));
        jLabelTimKiemThongKe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlbh/images/seo.png"))); // NOI18N
        jLabelTimKiemThongKe.setText("TÌM KIÊM & THỐNG KÊ");

        javax.swing.GroupLayout jPanelTimKiemThongKeLayout = new javax.swing.GroupLayout(jPanelTimKiemThongKe);
        jPanelTimKiemThongKe.setLayout(jPanelTimKiemThongKeLayout);
        jPanelTimKiemThongKeLayout.setHorizontalGroup(
            jPanelTimKiemThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTimKiemThongKeLayout.createSequentialGroup()
                .addContainerGap(130, Short.MAX_VALUE)
                .addComponent(jLabelTimKiemThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );
        jPanelTimKiemThongKeLayout.setVerticalGroup(
            jPanelTimKiemThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTimKiemThongKeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTimKiemThongKe, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanelMenuLayout = new javax.swing.GroupLayout(jPanelMenu);
        jPanelMenu.setLayout(jPanelMenuLayout);
        jPanelMenuLayout.setHorizontalGroup(
            jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelTrangChu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelNhaCungCap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelBanHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelTimKiemThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanelMenuLayout.setVerticalGroup(
            jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMenuLayout.createSequentialGroup()
                .addComponent(jPanelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanelTrangChu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelSanPham, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelNhaCungCap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelKhachHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelBanHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelTimKiemThongKe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(33, 33, 33))
        );

        jPanelXem.setBackground(new java.awt.Color(243, 255, 189));

        javax.swing.GroupLayout jPanelXemLayout = new javax.swing.GroupLayout(jPanelXem);
        jPanelXem.setLayout(jPanelXemLayout);
        jPanelXemLayout.setHorizontalGroup(
            jPanelXemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1180, Short.MAX_VALUE)
        );
        jPanelXemLayout.setVerticalGroup(
            jPanelXemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanelRootLayout = new javax.swing.GroupLayout(jPanelRoot);
        jPanelRoot.setLayout(jPanelRootLayout);
        jPanelRootLayout.setHorizontalGroup(
            jPanelRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRootLayout.createSequentialGroup()
                .addComponent(jPanelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelXem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelRootLayout.setVerticalGroup(
            jPanelRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelXem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelRoot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelRoot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelBanHang;
    private javax.swing.JLabel jLabelKhachHang;
    private javax.swing.JLabel jLabelNhaCungCap;
    private javax.swing.JLabel jLabelNhanVien;
    private javax.swing.JLabel jLabelSanPham;
    private javax.swing.JLabel jLabelTimKiemThongKe;
    private javax.swing.JLabel jLabelTrangChu;
    private javax.swing.JPanel jPanelBanHang;
    private javax.swing.JPanel jPanelKhachHang;
    private javax.swing.JPanel jPanelMenu;
    private javax.swing.JPanel jPanelNhaCungCap;
    private javax.swing.JPanel jPanelNhanVien;
    private javax.swing.JPanel jPanelRoot;
    private javax.swing.JPanel jPanelSanPham;
    private javax.swing.JPanel jPanelTimKiemThongKe;
    private javax.swing.JPanel jPanelTitle;
    private javax.swing.JPanel jPanelTrangChu;
    private javax.swing.JPanel jPanelXem;
    // End of variables declaration//GEN-END:variables
}
