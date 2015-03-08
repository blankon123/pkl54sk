/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp.controller;

import java.util.ArrayList;
import sp.component.TextFieldListing;
import sp.form.Hal2Listing;
import sp.model.Dsartb1;
import sp.model.Dsartb4;
import sp.model.DsartoptionB4r4;

/**
 *
 * @author StephenCN
 */
public class DsartB4Controller {

    private Dsartb4[] db4;
    private DsartoptionB4r4 optionb4;
    private Hal2Listing halL2;
    private Dsartb1 db1;

    public DsartB4Controller(Dsartb4[] db4, Dsartb1 db1, Hal2Listing halL2) {
        this.db4 = db4;
        this.halL2 = halL2;
        this.db1 = db1;
    }

    public Dsartb4[] B4hasil() {

//        //b3.setNbs3(b1view.getB1r5().getText());
//        b4.setB4r1(b4view.getB3r1().getText());
//        b3.setB3r2(b3view.getB3r2().getText());
//        b3.setB3r3(b3view.getB3r3().getText());
//        int j =0;
//        b4view.addListTextfield();
//        ArrayList<TextFieldListing> dummy = b4view.getListTextFieldListing();
//        for (int i = 0; i < dummy.size(); i+=7) {
//            b4[i].setDsartb1(db1);
//            b4[i].setNbs(db1.getNbs());
//            b4[i].setNuart(b4[i].getNbs()+b4[i].getB4r1());
//            b4[i].setB4r1(getString(i+1));
//            b4[j].setB4r2s1(dummy.get(i+1).getText());
//            b4[j].setB4r2s2(dummy.get(i+2).getText());
//            b4[j].setB4r2s3(dummy.get(i+3).getText());
//            b4[j].setB4r3(dummy.get(i+4).getText());
//            b4[j].setB4r4(new DsartoptionB4r4(dummy.get(i+5).getText()));
//            b4[j].setB4r5(dummy.get(i+6).getText());
//            b4[j].setB4r6(dummy.get(i+7).getText());
//            j++;
//        }
        Dsartb4[] arr;
        arr = new Dsartb4[21];
        int j = 0;
        halL2.addListTextfield();

        arr[0] = new Dsartb4(db1.getNbs(), db1.getNbs() + "01", "01", halL2.getAb4r2s1().getText(), halL2.getAb4r2s2().getText(), halL2.getAb4r2s3().getText(), halL2.getAb4r3().getText(), halL2.getAb4r5().getText(), halL2.getAb4r6().getText());
        arr[1] = new Dsartb4(db1.getNbs(), db1.getNbs() + "02", "02", halL2.getBb4r2s1().getText(), halL2.getBb4r2s2().getText(), halL2.getBb4r2s3().getText(), halL2.getBb4r3().getText(), halL2.getBb4r5().getText(), halL2.getBb4r6().getText());
        arr[2] = new Dsartb4(db1.getNbs(), db1.getNbs() + "02", "02", halL2.getCb4r2s1().getText(), halL2.getBb4r2s2().getText(), halL2.getBb4r2s3().getText(), halL2.getBb4r3().getText(), halL2.getBb4r5().getText(), halL2.getBb4r6().getText());
        arr[3] = new Dsartb4(db1.getNbs(), db1.getNbs() + "02", "02", halL2.getDb4r2s1().getText(), halL2.getBb4r2s2().getText(), halL2.getBb4r2s3().getText(), halL2.getBb4r3().getText(), halL2.getBb4r5().getText(), halL2.getBb4r6().getText());
        arr[4] = new Dsartb4(db1.getNbs(), db1.getNbs() + "02", "02", halL2.getEb4r2s1().getText(), halL2.getBb4r2s2().getText(), halL2.getBb4r2s3().getText(), halL2.getBb4r3().getText(), halL2.getBb4r5().getText(), halL2.getBb4r6().getText());
        arr[5] = new Dsartb4(db1.getNbs(), db1.getNbs() + "02", "02", halL2.getFb4r2s1().getText(), halL2.getBb4r2s2().getText(), halL2.getBb4r2s3().getText(), halL2.getBb4r3().getText(), halL2.getBb4r5().getText(), halL2.getBb4r6().getText());
        arr[6] = new Dsartb4(db1.getNbs(), db1.getNbs() + "02", "02", halL2.getGb4r2s1().getText(), halL2.getBb4r2s2().getText(), halL2.getBb4r2s3().getText(), halL2.getBb4r3().getText(), halL2.getBb4r5().getText(), halL2.getBb4r6().getText());
        arr[7] = new Dsartb4(db1.getNbs(), db1.getNbs() + "02", "02", halL2.getHb4r2s1().getText(), halL2.getBb4r2s2().getText(), halL2.getBb4r2s3().getText(), halL2.getBb4r3().getText(), halL2.getBb4r5().getText(), halL2.getBb4r6().getText());
        arr[8] = new Dsartb4(db1.getNbs(), db1.getNbs() + "02", "02", halL2.getIb4r2s1().getText(), halL2.getBb4r2s2().getText(), halL2.getBb4r2s3().getText(), halL2.getBb4r3().getText(), halL2.getBb4r5().getText(), halL2.getBb4r6().getText());
        arr[9] = new Dsartb4(db1.getNbs(), db1.getNbs() + "02", "02", halL2.getJb4r2s1().getText(), halL2.getBb4r2s2().getText(), halL2.getBb4r2s3().getText(), halL2.getBb4r3().getText(), halL2.getBb4r5().getText(), halL2.getBb4r6().getText());
        arr[10] = new Dsartb4(db1.getNbs(), db1.getNbs() + "02", "02", halL2.getKb4r2s1().getText(), halL2.getBb4r2s2().getText(), halL2.getBb4r2s3().getText(), halL2.getBb4r3().getText(), halL2.getBb4r5().getText(), halL2.getBb4r6().getText());
        arr[11] = new Dsartb4(db1.getNbs(), db1.getNbs() + "01", "01", halL2.getLb4r2s1().getText(), halL2.getAb4r2s2().getText(), halL2.getAb4r2s3().getText(), halL2.getAb4r3().getText(), halL2.getAb4r5().getText(), halL2.getAb4r6().getText());
        arr[12] = new Dsartb4(db1.getNbs(), db1.getNbs() + "02", "02", halL2.getMb4r2s1().getText(), halL2.getBb4r2s2().getText(), halL2.getBb4r2s3().getText(), halL2.getBb4r3().getText(), halL2.getBb4r5().getText(), halL2.getBb4r6().getText());
        arr[13] = new Dsartb4(db1.getNbs(), db1.getNbs() + "02", "02", halL2.getNb4r2s1().getText(), halL2.getBb4r2s2().getText(), halL2.getBb4r2s3().getText(), halL2.getBb4r3().getText(), halL2.getBb4r5().getText(), halL2.getBb4r6().getText());
        arr[14] = new Dsartb4(db1.getNbs(), db1.getNbs() + "02", "02", halL2.getOb4r2s1().getText(), halL2.getBb4r2s2().getText(), halL2.getBb4r2s3().getText(), halL2.getBb4r3().getText(), halL2.getBb4r5().getText(), halL2.getBb4r6().getText());
        arr[15] = new Dsartb4(db1.getNbs(), db1.getNbs() + "02", "02", halL2.getPb4r2s1().getText(), halL2.getBb4r2s2().getText(), halL2.getBb4r2s3().getText(), halL2.getBb4r3().getText(), halL2.getBb4r5().getText(), halL2.getBb4r6().getText());
        arr[16] = new Dsartb4(db1.getNbs(), db1.getNbs() + "02", "02", halL2.getQb4r2s1().getText(), halL2.getBb4r2s2().getText(), halL2.getBb4r2s3().getText(), halL2.getBb4r3().getText(), halL2.getBb4r5().getText(), halL2.getBb4r6().getText());
        arr[17] = new Dsartb4(db1.getNbs(), db1.getNbs() + "02", "02", halL2.getRb4r2s1().getText(), halL2.getBb4r2s2().getText(), halL2.getBb4r2s3().getText(), halL2.getBb4r3().getText(), halL2.getBb4r5().getText(), halL2.getBb4r6().getText());
        arr[18] = new Dsartb4(db1.getNbs(), db1.getNbs() + "02", "02", halL2.getSb4r2s1().getText(), halL2.getBb4r2s2().getText(), halL2.getBb4r2s3().getText(), halL2.getBb4r3().getText(), halL2.getBb4r5().getText(), halL2.getBb4r6().getText());
        arr[19] = new Dsartb4(db1.getNbs(), db1.getNbs() + "02", "02", halL2.getTb4r2s1().getText(), halL2.getBb4r2s2().getText(), halL2.getBb4r2s3().getText(), halL2.getBb4r3().getText(), halL2.getBb4r5().getText(), halL2.getBb4r6().getText());

        for (int i = 0; i < 20; i++) {
            arr[i].setB4r4(new DsartoptionB4r4("p"));
        }

        return arr;
    }

    public String getString(int angka) {
        String no = Integer.toString(angka);
        while (no.length() < 3) {
            no = "0" + no;
        }
        return no;
    }
}
