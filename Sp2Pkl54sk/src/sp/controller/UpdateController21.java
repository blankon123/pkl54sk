/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import sp.dao.*;
import sp.form.YPane;
import sp.model.*;
import sp.model.TableErrorModel;
import sp.util.ErrorControl;
import sp.util.LogMessage;
import sp.util.UserControl;

/**
 *
 * @author Ristika Nugraha [12.7350]
 */
public class UpdateController21 implements ActionListener {

    private final YPane quesioner;

    public UpdateController21(YPane quesioner) {
        this.quesioner = quesioner;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equalsIgnoreCase("refresh")) {
            readDb();
        } else if (e.getActionCommand().equalsIgnoreCase("load")) {
            loadData();
        } else if (e.getActionCommand().equalsIgnoreCase("update")) {
            updateDb();
        }
    }

    private void readDb() {
        String refreshTxt = "";
        try {
            String nim = UserControl.getNim();
            if (nim != null) {
                List<Object> results = B1Dao.getInstance().getBy("B1.findByNim", "nim", nim);
                if (results.isEmpty()) {
                    JOptionPane.showMessageDialog(quesioner, nim + ", Anda belum melakukan Entry Data");
                } else {
                    JOptionPane.showMessageDialog(quesioner, "Ditemukan " + results.size() + " data");
                    List<B1> data = new ArrayList<>();
                    int count = results.size();
                    for (int i = 0; i < count; i++) {
                        data.add((B1) results.get(i));
                    }
                    quesioner.getTablePane1().getModel().setData(data);
                }
                refreshTxt = "Updating table loaded. Found " + results.size() + " data";
                quesioner.getTablePane1().getLoad().setEnabled(true);
            } else {
                JOptionPane.showMessageDialog(quesioner, "Please login first");
            }
        } catch (NullPointerException ep) {
            refreshTxt = "Failed to load updating table" + ep.getMessage();
            System.out.println(refreshTxt);
        }
        try {
            LogMessage.write(refreshTxt);
        } catch (IOException ex) {
            Logger.getLogger(UpdateController21.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void loadData() {
        String flag;
        String loadData;
        int baris = quesioner.getTablePane1().getTabelUpdate().getSelectedRow();
        ErrorControl.resetErr();
        TableModel mode = new TableErrorModel();
        quesioner.getjTable1().setModel(mode);
        if (baris > -1) {
            B1 kues;
            kues = quesioner.getTablePane1().getModel().get(baris);
            String key = kues.getNks();
            B1 data1 = B1Dao.getInstance().getByID(key);
            B2 data2 = B2Dao.getInstance().getByID(key);
            B3 data3 = B3Dao.getInstance().getByID(key);
            B4 data4 = B4Dao.getInstance().getByID(key);
            quesioner.getFixedQuest1().getHal12().setFieldHal1(data1, data2);
            quesioner.getFixedQuest1().getHal21().setFieldHal2(data3, data4);
            quesioner.getFixedQuest1().getHal31().setFieldHal3(data4);
            quesioner.getFixedQuest1().getHal41().setFieldHal4(data4);
            quesioner.getFixedQuest1().getHal51().setFieldHal5(data4);
            quesioner.getFixedQuest1().getHal61().setFieldHal6(data4);

            if (data1.getFlag().equals("1")) {

                SaveController a = new SaveController(data1, data2, data3, data4, quesioner.getFixedQuest1().getHal12(), quesioner.getFixedQuest1().getHal21(), quesioner.getFixedQuest1().getHal31(), quesioner.getFixedQuest1().getHal41(), quesioner.getFixedQuest1().getHal51(), quesioner.getFixedQuest1().getHal61(), quesioner);
                a.Validate(data1, data2, data3, data4);
                try {
                    quesioner.getjTable1().setModel(ErrorControl.getTableRow());
                } catch (Exception e) {
                    System.out.println("ASD");
                }
            }
            loadData = "Data of " + key + " has been displayed on quesioner successfully";
            try {
                LogMessage.write(loadData);
            } catch (IOException ex) {
                Logger.getLogger(UpdateController21.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private void updateDb() {
        B1 b1 = new B1();
        B2 b2 = new B2();
        B3 b3 = new B3();
        B4 b4 = new B4();
        String update = "";
        B1Controller b1con = new B1Controller(b1, quesioner.getFixedQuest1().getHal12());
        B2Controller b2con = new B2Controller(b2, b1, quesioner.getFixedQuest1().getHal12());
        B3Controller b3con = new B3Controller(b3, b1, quesioner.getFixedQuest1().getHal21());
        B4Controller b4con = new B4Controller(b4, b1, quesioner.getFixedQuest1().getHal21(),
                quesioner.getFixedQuest1().getHal31(), quesioner.getFixedQuest1().getHal41(),
                quesioner.getFixedQuest1().getHal51(), quesioner.getFixedQuest1().getHal61());

    }
}
