/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp.controller;

import sp.form.Hal6;
import sp.form.Hal5;
import sp.form.Hal3;
import sp.form.Hal1;
import sp.form.Hal2;
import sp.form.Hal4;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import sp.component.TextField;
import sp.model.B1;
import sp.model.B2;
import sp.dao.B1Dao;
import sp.dao.B2Dao;
import sp.dao.B3Dao;
import sp.dao.B4Dao;
import sp.model.B3;
import sp.model.B4;
import sp.util.ErrorControl;
import sp.util.FormControl;
import sp.util.LogMessage;
import sp.validasi.*;

/**
 *
 * @author StephenCN
 */
public class UpdatingController implements ActionListener {

    private B1Controller b1Controller;
    private B2Controller b2Controller;
    private B3Controller b3Controller;
    private B4Controller b4Controller;
    private Hal1 b1view;
    private Hal2 b2view;
    private Hal3 b3view;
    private Hal4 b4view;
    private Hal5 b5view;
    private Hal6 b6view;
    private B1 b1;
    private B2 b2;
    private B3 b3;
    private B4 b4;
    private JPanel mainPanel;
    private JTable tab;
    private ValidasiB1 validB1;
    private ValidasiB2 validB2;
    private ValidasiB3 validB3;
    private ValidasiB4 validB4;

    public UpdatingController(B1 b1, B2 b2, B3 b3, B4 b4, Hal1 b1view, Hal2 b2view, Hal3 b3view, Hal4 b4view, Hal5 b5view, Hal6 b6view, JPanel tq, JTable tab) {
        this.b1 = b1;
        this.b2 = b2;
        this.b3 = b3;
        this.b4 = b4;
        this.b1view = b1view;
        this.b2view = b2view;
        this.b3view = b3view;
        this.b4view = b4view;
        this.b5view = b5view;
        this.b6view = b6view;
        this.mainPanel = tq;
        this.tab = tab;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        b1Controller = new B1Controller(b1, b1view);
        b2Controller = new B2Controller(b2, b1, b1view);
        b3Controller = new B3Controller(b3, b1, b2view);
        b4Controller = new B4Controller(b4, b1, b3view, b4view, b5view, b6view);

        b1 = b1Controller.B1hasil();
        b2 = b2Controller.B2hasil();
        b3 = b3Controller.B3hasil();
        b4 = b4Controller.B4hasil();

        validB1 = new ValidasiB1(b1);
        validB2 = new ValidasiB2(b2);
        validB3 = new ValidasiB3(b3, b2view);
        validB4 = new ValidasiB4(b4);

        Validate(b1, b2, b3, b4);

        if (validNotNull()) {
            if ((validB1.cek() && validB2.cek() && validB4.cek()) && validB3.cek().isEmpty()) {
                b1.setFlag("0");
                try {
                    updatingDB();
                    showSuccessDB();
                } catch (Exception ex) {
                    showErrorDB();
                }
            } else {
                ErrorControl.resetErr();
                String err = "";
                if (!validB1.cek()) {
                    err += "\nB1";
                }
                if (!validB2.cek()) {
                    err += "\nB2";
                }
                if (!validB3.cek().isEmpty()) {
                    err += "\nB3";
                    ErrorControl.addErr(validB3.cek());
                }
                if (!validB4.cek()) {
                    err += "\nB4";
                }
                b1.setFlag("1");
                tab.setModel(ErrorControl.getTableRow());
                int ss = JOptionPane.showConfirmDialog(FormControl.getParent().getParent(),
                        "Apakah Anda Yakin Update DB ?\n" + "Anda Memiliki Error di Blok : \n" + err,
                        "Apakah Anda Yakin Update DB ?",
                        JOptionPane.YES_NO_OPTION);
                if (ss == JOptionPane.YES_OPTION) {
                    try {
                        updatingDB();
                    } catch (Exception ex) {
                        showErrorDB();
                    }
                }
            }
        } else {
            showNullError();
        }
    }

    public void Validate(B1 b1, B2 b2, B3 b3, B4 b4) {
        ValidasiB1 validb1 = new ValidasiB1(b1);
        ValidasiB2 validb2 = new ValidasiB2(b2);
        ValidasiB3 validb3 = new ValidasiB3(b3, b2view);
        ValidasiB4 validb4 = new ValidasiB4(b4);
        if (validb1.cek2() != null) {
            ErrorControl.addErr(validb1.cek2());
        }
        if (validb3.cek() != null) {
            ErrorControl.addErr(validb3.cek());
        }
    }

    public boolean validNotNull() {
        boolean valid = true;
        ArrayList<TextField> arr;

        arr = b1view.getListTextField();
        for (TextField arr1 : arr) {
            if ("".equals(arr1.getText())) {
                valid = false;
                break;
            }
        }
        arr = b2view.getListTextField();
        for (TextField arr1 : arr) {
            if ("".equals(arr1.getText())) {
                valid = false;
                break;
            }
        }
        arr = b3view.getListTextField();
        for (TextField arr1 : arr) {
            if ("".equals(arr1.getText())) {
                valid = false;
                break;
            }
        }
        arr = b4view.getListTextField();
        for (TextField arr1 : arr) {
            if ("".equals(arr1.getText())) {
                valid = false;
                break;
            }
        }
        arr = b5view.getListTextField();
        for (TextField arr1 : arr) {
            if ("".equals(arr1.getText())) {
                valid = false;
                break;
            }
        }
        arr = b6view.getListTextField();
        for (TextField arr1 : arr) {
            if ("".equals(arr1.getText())) {
                valid = false;
                break;
            }
        }
        return valid;
    }

    private void updatingDB() {
        B1Dao.getInstance().update(b1);
        B2Dao.getInstance().update(b2);
        B3Dao.getInstance().update(b3);
        B4Dao.getInstance().update(b4);
    }

    private void showSuccessDB() {
        int ss = JOptionPane.showConfirmDialog(mainPanel,
                "Sukses Update Dengan NKK=" + b1.getNks(),
                "Sukses",
                JOptionPane.CLOSED_OPTION);
    }

    private void showErrorDB() {
        int ss = JOptionPane.showConfirmDialog(mainPanel,
                "Kesalahan Pada SQL Syntax",
                "Database Error",
                JOptionPane.WARNING_MESSAGE);
    }

    private void showNullError() {
        int ss = JOptionPane.showConfirmDialog(mainPanel,
                "Semua Isian Harus Terisi",
                "Field Kosong",
                JOptionPane.WARNING_MESSAGE);
    }
}
