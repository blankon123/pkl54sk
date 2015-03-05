/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp.controller;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import javax.swing.table.TableModel;
import sp.dao.*;
import sp.model.*;
import sp.model.TableErrorModel;
import sp.panelcomponent.EntryFormQuestTest;
import sp.panelcomponent.UpdateQuest;
import sp.util.ErrorControl;
import sp.util.LogMessage;

/**
 *
 * @author Ristika Nugraha [12.7350]
 */
public class UpdateController21 implements ActionListener {

    private JPanel MainPanel = null;
    private EntryFormQuestTest entryForm = null;
    private UpdateQuest updateQuest = null;
    private CardLayoutController clc;

    public UpdateController21(JPanel mp, EntryFormQuestTest efq, UpdateQuest uq) {
        this.MainPanel = mp;
        this.entryForm = efq;
        this.updateQuest = uq;
        clc = new CardLayoutController();
        clc.setParentCard(MainPanel);
        clc.setCardLayout((CardLayout) MainPanel.getLayout());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equalsIgnoreCase("load")) {
            loadData();
        } else if (e.getActionCommand().equalsIgnoreCase("update")) {
            updateDb();
        }
    }

    private void loadData() {
        int baris = updateQuest.getTableUpdate1().getTabelUpdate().getSelectedRow();
        ErrorControl.resetErr();
        TableModel mode = new TableErrorModel();
        entryForm.getErrorTable1().getTabelError().setModel(mode);
        if (baris > -1) {
            B1 kues;
            kues = updateQuest.getTableUpdate1().getModel().get(baris);
            String key = kues.getNks();
            B1 data1 = B1Dao.getInstance().getByID(key);
            B2 data2 = B2Dao.getInstance().getByID(key);
            B3 data3 = B3Dao.getInstance().getByID(key);
            B4 data4 = B4Dao.getInstance().getByID(key);

            setAllField(data1, data2, data3, data4);
            validAllField(data1, data2, data3, data4);
            writeToTxt(key);
        }
    }

    private void updateDb() {
        B1 b1 = new B1();
        B2 b2 = new B2();
        B3 b3 = new B3();
        B4 b4 = new B4();
        String update = "";
        B1Controller b1con = new B1Controller(b1, entryForm.getHal11());
        B2Controller b2con = new B2Controller(b2, b1, entryForm.getHal11());
        B3Controller b3con = new B3Controller(b3, b1, entryForm.getHal21());
        B4Controller b4con = new B4Controller(b4, b1,
                entryForm.getHal31(), entryForm.getHal41(),
                entryForm.getHal51(), entryForm.getHal61());

    }

    private void setAllField(B1 data1, B2 data2, B3 data3, B4 data4) {
        entryForm.getHal11().setFieldHal1(data1, data2);
        entryForm.getHal21().setFieldHal2(data3, data4);
        entryForm.getHal31().setFieldHal3(data4);
        entryForm.getHal41().setFieldHal4(data4);
        entryForm.getHal51().setFieldHal5(data4);
        entryForm.getHal61().setFieldHal6(data4);
    }

    private void validAllField(B1 data1, B2 data2, B3 data3, B4 data4) {
        SaveController a = new SaveController(data1, data2, data3, data4,
                entryForm.getHal11(),
                entryForm.getHal21(),
                entryForm.getHal31(),
                entryForm.getHal41(),
                entryForm.getHal51(),
                entryForm.getHal61(),
                entryForm,
                entryForm.getErrorTable1().getTabelError());
        a.Validate(data1, data2, data3, data4);
    }

    private void writeToTxt(String key) {
        String loadData = "";
        try {
            entryForm.getErrorTable1().getTabelError().setModel(ErrorControl.getTableRow());
        } catch (Exception e) {
            loadData = e.getMessage();
        }

        loadData += " Data of " + key + " has been displayed on quesioner successfully";
        clc.show("entryquest");
        try {
            LogMessage.write(loadData);
        } catch (IOException ex) {
            Logger.getLogger(UpdateController21.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
