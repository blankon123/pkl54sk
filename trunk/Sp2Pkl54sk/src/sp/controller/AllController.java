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
import javax.swing.JPanel;
import sp.model.B1;
import sp.model.B2;
import sp.dao.B1Dao;
import sp.dao.B2Dao;
import sp.dao.B3Dao;
import sp.dao.B4Dao;
import sp.form.TesQuest;
import sp.model.B3;
import sp.model.B4;
import sp.validasi.*;

/**
 *
 * @author StephenCN
 */
public class AllController implements ActionListener {

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
    private JPanel tq;
    private ValidasiB1 validB1;
    private ValidasiB2 validB2;
    private ValidasiB3 validB3;
    private ValidasiB4 validB4;

    public AllController(B1 b1, B2 b2, B3 b3, B4 b4, Hal1 b1view, Hal2 b2view, Hal3 b3view, Hal4 b4view, Hal5 b5view, Hal6 b6view, JPanel tq) {
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
        this.tq = tq;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        String[] msg = new String[5];
        
        try {
            b1Controller = new B1Controller(b1, b1view);
            b1 = b1Controller.B1hasil();
            ((TesQuest) tq).addLogText("Koneksi Database...\n");
            B1Dao.getInstance().save(b1);
            msg[0] = ("SuksesB1\n");
        } catch (Exception e) {
            msg[0] = ("B1 :" + e.getMessage() + "\n");
        }
        ((TesQuest) tq).addLogText(msg[0]);

        try {
            b2Controller = new B2Controller(b2, b1, b1view);
            b2 = b2Controller.B2hasil();
            B2Dao.getInstance().save(b2);

            msg[1] = ("SuksesB2\n");
        } catch (Exception e) {
            msg[1] = ("B2 :" + e.getMessage() + "\n");
        }
        ((TesQuest) tq).addLogText(msg[1]);

        try {
            b3Controller = new B3Controller(b3, b1, b2view);
            b3 = b3Controller.B3hasil();
            B3Dao.getInstance().save(b3);

            msg[2] = ("SuksesB3\n");
        } catch (Exception e) {
            msg[2] = ("B3 :" + e.getMessage() + "\n");
        }
        ((TesQuest) tq).addLogText(msg[2]);

        try {
            b4Controller = new B4Controller(b4, b1, b2view, b3view, b4view, b5view, b6view);
            b4 = b4Controller.B4hasil();
            B4Dao.getInstance().save(b4);

            msg[3] = ("SuksesB4\n");
        } catch (Exception e) {
            msg[3] = ("B4 :" + e.getMessage() + "\n");
        }
        ((TesQuest) tq).addLogText(msg[3]);
    }

}
