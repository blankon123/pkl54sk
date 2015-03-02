/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import sp.dao.B1Dao;
import sp.dao.B2Dao;
import sp.dao.B3Dao;
import sp.dao.B4Dao;
import sp.form.FixedQuest;
import sp.form.TablePane;
import sp.model.B1;
import sp.model.B2;
import sp.model.B3;
import sp.model.B4;
import sp.util.UserControl;

/**
 *
 * @author Ristika Nugraha [12.7350]
 */
public class UpdateController implements ActionListener{

    B1 data1;
    B2 data2;
    B3 data3;
    B4 data4;
    private static FixedQuest quesioner;
    private static TablePane table;

    public void readDatabase() {
        try {
            String nim = UserControl.getNim();
            List<Object> results = B1Dao.getInstance().getBy("B1.findByNim", "nim", nim);
            List<B1> data = new ArrayList<B1>();
            int count = results.size();
            for (int i = 0; i < count; i++) {
                data.add((B1) results.get(i));
            }
            table.getModel().setData(data);
        } catch (NullPointerException ep) {
            System.out.println(ep.getMessage());
        }
    }

    public void loadData() {
        int baris = table.getTabelUpdate().getSelectedRow();
        try {
            if (baris > -1) {
                B1 kues = table.getModel().get(baris);
                String key = kues.getNks();
                B1 data1 = B1Dao.getInstance().getByID(key);
                B2 data2 = B2Dao.getInstance().getByID(key);
                B3 data3 = B3Dao.getInstance().getByID(key);
                B4 data4 = B4Dao.getInstance().getByID(key);
                quesioner.getHal12().setFieldHal1(data1, data2);
                quesioner.getHal21().setFieldHal2(data3, data4);
                quesioner.getHal31().setFieldHal3(data4);
                quesioner.getHal41().setFieldHal4(data4);
                quesioner.getHal51().setFieldHal5(data4);
                quesioner.getHal61().setFieldHal6(data4);
            }
        } catch (NullPointerException npe) {
            System.out.println(npe.getMessage());
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equalsIgnoreCase("refresh")){
            readDatabase();
        } else if (e.getActionCommand().equalsIgnoreCase("load")){
            loadData();
        } else if (e.getActionCommand().equalsIgnoreCase("update")){
            updateData();
        }
    }

    private void updateData() {
        
    }
}
