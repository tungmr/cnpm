/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlbh.bean;

import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author HoangDucTung
 */
public class DanhMucBean {
    private String Loai;
    private JPanel jPanel;
    private JLabel jLabel;

    public DanhMucBean() {
    }

    public DanhMucBean(String Loai, JPanel jPanel, JLabel jLabel) {
        this.Loai = Loai;
        this.jPanel = jPanel;
        this.jLabel = jLabel;
    }

    public String getLoai() {
        return Loai;
    }

    public void setLoai(String Loai) {
        this.Loai = Loai;
    }

    public JPanel getjPanel() {
        return jPanel;
    }

    public void setjPanel(JPanel jPanel) {
        this.jPanel = jPanel;
    }

    public JLabel getjLabel() {
        return jLabel;
    }

    public void setjLabel(JLabel jLabel) {
        this.jLabel = jLabel;
    }
    
    
}
