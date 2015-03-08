/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp.controller;

import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;
import sp.component.TextFieldListing;
import sp.dao.*;
import sp.form.*;
import sp.model.*;
import sp.util.*;
import sp.validasi.*;

/**
 *
 * @author Ristika Nugraha [12.7350]
 */
public class SaveCtrlListing implements ActionListener {

    private B1Controller b1Controller;
    private B2Controller b2Controller;
    private B3Controller b3Controller;
    private B4Controller b4Controller;
    private final Hal1Listing b1view;
    private final Hal2Listing b2view;

    private Dsartb1 b1;
    private Dsartb2 b2;
    private Dsartb3 b3;
    private Dsartb4[] b4;

    private final JTable tab;
    private ValListB1 validB1;
    private ValListB2 validB2;
    private ValListB3 validB3;
    private ValListB4 validB4;
    private final JPanel mainPanel;

    public SaveCtrlListing(Dsartb1 b1, Dsartb2 b2, Dsartb3 b3, Dsartb4[] b4, Hal1Listing b1view, Hal2Listing b2view, JPanel tq, JTable tab) {
        this.b1 = b1;
        this.b2 = b2;
        this.b3 = b3;
        this.b4 = b4;
        this.b1view = b1view;
        this.b2view = b2view;

        this.tab = tab;
        this.mainPanel = tq;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        DsartB1Controller b1Controller = new DsartB1Controller(b1, b1view);
        DsartB2Controller b2Controller = new DsartB2Controller(b2, b1, b1view);
        DsartB3Controller b3Controller = new DsartB3Controller(b3, b1, b1view);
        DsartB4Controller b4Controller = new DsartB4Controller(b4, b1, b2view);

        b1 = b1Controller.B1hasil();
        b2 = b2Controller.B2hasil();
        b3 = b3Controller.B3hasil();
        b4 = b4Controller.B4hasil();
         
        validB1 = new ValListB1(b1, b1view);
        validB2 = new ValListB2(b2, b1view);
        validB3 = new ValListB3(b3);
        validB4 = new ValListB4(b4);

        if (validNotNull()) {
            Validate(b1, b2, b3);
            if (validB1.cek().isEmpty() && validB2.cek().isEmpty() && validB3.cek() && validB4.cek()) {
                b1.setFlag("0");
                try {
                    saveToDB();
                    showSuccesDB();
                    toDefault();
                } catch (Exception ex) {
                    showErrorDB();
                }
            } else {
                ErrorControl.resetErr();
                String err = "";
                if (!validB1.cek().isEmpty()) {
                    err += "\nB1";
                    ErrorControl.addErr(validB1.cek());
                }
                if (!validB2.cek().isEmpty()) {
                    err += "\nB2";
                    ErrorControl.addErr(validB2.cek());
                }
                if (!validB3.cek()) {
                    err += "\nB3";
                }
                if (!validB4.cek()) {
                    err += "\nB4";
                }
                b1.setFlag("1");
                tab.setModel(ErrorControl.getTableRow());
                int ss = JOptionPane.showConfirmDialog(mainPanel,
                        "Apakah Anda Yakin Save Ke DB ?\n" + "Anda Memiliki Error di Blok : \n" + err,
                        "Apakah Anda Yakin Save Ke DB ?",
                        JOptionPane.YES_NO_OPTION);
                if (ss == JOptionPane.YES_OPTION) {
                    try {
                        saveToDB();
                    } catch (Exception ex) {
                        showErrorDB();
                    }
                }
                
            }
        } else {
            showNullError();
        }
    }

    public void Validate(Dsartb1 db1, Dsartb2 db2, Dsartb3 db3) {
        ValListB1 validb1 = new ValListB1(db1, b1view);
        ValListB2 validb2 = new ValListB2(b2, b1view);
        ValListB3 validb3 = new ValListB3(b3);
        ValListB4 validb4 = new ValListB4(b4);
        if (validb1.cek() != null) {
            ErrorControl.addErr(validb1.cek());
        }
        if (validb2.cek() != null) {
            ErrorControl.addErr(validb2.cek());
        }
    }

    public boolean validNotNull() {
        boolean valid = true;
        ArrayList<TextFieldListing> arr;

        arr = b1view.getListTextFieldListing();
        for (TextFieldListing arr1 : arr) {
            if ("".equals(arr1.getText())) {
                valid = false;
                break;
            }
        }
        arr = b2view.getListTextFieldListing();
        for (TextFieldListing arr2 : arr) {
            if ("".equals(arr2.getText())) {
                valid = false;
                break;
            }
        }
        return valid;
    }

    private void saveToDB() {
        DsartB1Dao.getInstance().save(b1);
        DsartB2Dao.getInstance().save(b2);
        DsartB3Dao.getInstance().save(b3);
        for(Dsartb4 a : b4){
            DsartB4Dao.getInstance().save(b4);
        }
    }

    private void showErrorDB() {
        int ss = JOptionPane.showConfirmDialog(mainPanel,
                "Kesalahan Pada SQL Syntax",
                "Database Error",
                JOptionPane.WARNING_MESSAGE);
    }

    private void showSuccesDB() {
        int ss = JOptionPane.showConfirmDialog(mainPanel,
                "Sukses Input Dengan NKK=" + b1.getNbs(),
                "Sukses",
                JOptionPane.CLOSED_OPTION);
    }

    private void showNullError() {
        int ss = JOptionPane.showConfirmDialog(mainPanel,
                "Semua Isian Harus Terisi",
                "Field Kosong",
                JOptionPane.WARNING_MESSAGE);
    }

    private void toDefault() {
        FormControl.clearAll();
        FormControl.getController().first();
    }
    
    public String getString(int angka) {
        String no = Integer.toString(angka);
        while(no.length()<3){
            no = "0" + no;
        }
        return no;
    }
}