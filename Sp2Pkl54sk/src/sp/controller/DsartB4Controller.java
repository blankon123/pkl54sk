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

    private ArrayList<Dsartb4> db4;
    private Dsartb4 dsb4;
    private DsartoptionB4r4 optionb4;
    private Hal2Listing halL2;
    private Dsartb1 db1;

    public DsartB4Controller(ArrayList<Dsartb4> db4, Dsartb1 db1, Hal2Listing halL2) {
        this.db4 = db4;
        this.halL2 = halL2;
        this.db1 = db1;
    }

    public ArrayList<Dsartb4> B4hasil() {
        int j =0;
        db4 = new ArrayList<Dsartb4>();
        ArrayList<TextFieldListing> dummy = halL2.getListTextFieldListing();
        for (int i = 0; i < dummy.size(); i+=7) {
            dsb4 = new Dsartb4();
            dsb4.setB4r1(getString(j));
            dsb4.setNuart(db1.getNbs()+dsb4.getB4r1());
            dsb4.setB4r2s1(dummy.get(i).getText());
            dsb4.setB4r2s2(dummy.get(i+1).getText());
            dsb4.setB4r2s3(dummy.get(i+2).getText());
            dsb4.setB4r3(dummy.get(i+3).getText());
            dsb4.setB4r4(new DsartoptionB4r4(dummy.get(i+4).getText()));
            dsb4.setB4r5(dummy.get(i+5).getText());
            dsb4.setB4r6(dummy.get(i+6).getText());
            db4.add(j, dsb4);
            j++;
        }
        System.out.println(halL2.getListTextFieldListing().size());
        System.out.println(j);
        
//        Dsartb4[] arr;
//        arr = new Dsartb4[20];
//        int j = 0;
//        halL2.addListTextfield();
//
//        arr[0] = new Dsartb4(db1.getNbs(), 
//                db1.getNbs() + "01", "01", 
//                halL2.getAb4r2s1().getText(), 
//                halL2.getAb4r2s2().getText(), 
//                halL2.getAb4r2s3().getText(), 
//                halL2.getAb4r3().getText(), 
//                halL2.getAb4r5().getText(), 
//                halL2.getAb4r6().getText());
//        arr[1] = new Dsartb4(db1.getNbs(), db1.getNbs() + "02", "02", halL2.getBb4r2s1().getText(), halL2.getBb4r2s2().getText(), halL2.getBb4r2s3().getText(), halL2.getBb4r3().getText(), halL2.getBb4r5().getText(), halL2.getBb4r6().getText());
//        arr[2] = new Dsartb4(db1.getNbs(), db1.getNbs() + "02", "02", halL2.getCb4r2s1().getText(), halL2.getBb4r2s2().getText(), halL2.getBb4r2s3().getText(), halL2.getBb4r3().getText(), halL2.getBb4r5().getText(), halL2.getBb4r6().getText());
//        arr[3] = new Dsartb4(db1.getNbs(), db1.getNbs() + "02", "02", halL2.getDb4r2s1().getText(), halL2.getBb4r2s2().getText(), halL2.getBb4r2s3().getText(), halL2.getBb4r3().getText(), halL2.getBb4r5().getText(), halL2.getBb4r6().getText());
//        arr[4] = new Dsartb4(db1.getNbs(), db1.getNbs() + "02", "02", halL2.getEb4r2s1().getText(), halL2.getBb4r2s2().getText(), halL2.getBb4r2s3().getText(), halL2.getBb4r3().getText(), halL2.getBb4r5().getText(), halL2.getBb4r6().getText());
//        arr[5] = new Dsartb4(db1.getNbs(), db1.getNbs() + "02", "02", halL2.getFb4r2s1().getText(), halL2.getBb4r2s2().getText(), halL2.getBb4r2s3().getText(), halL2.getBb4r3().getText(), halL2.getBb4r5().getText(), halL2.getBb4r6().getText());
//        arr[6] = new Dsartb4(db1.getNbs(), db1.getNbs() + "02", "02", halL2.getGb4r2s1().getText(), halL2.getBb4r2s2().getText(), halL2.getBb4r2s3().getText(), halL2.getBb4r3().getText(), halL2.getBb4r5().getText(), halL2.getBb4r6().getText());
//        arr[7] = new Dsartb4(db1.getNbs(), db1.getNbs() + "02", "02", halL2.getHb4r2s1().getText(), halL2.getBb4r2s2().getText(), halL2.getBb4r2s3().getText(), halL2.getBb4r3().getText(), halL2.getBb4r5().getText(), halL2.getBb4r6().getText());
//        arr[8] = new Dsartb4(db1.getNbs(), db1.getNbs() + "02", "02", halL2.getIb4r2s1().getText(), halL2.getBb4r2s2().getText(), halL2.getBb4r2s3().getText(), halL2.getBb4r3().getText(), halL2.getBb4r5().getText(), halL2.getBb4r6().getText());
//        arr[9] = new Dsartb4(db1.getNbs(), db1.getNbs() + "02", "02", halL2.getJb4r2s1().getText(), halL2.getBb4r2s2().getText(), halL2.getBb4r2s3().getText(), halL2.getBb4r3().getText(), halL2.getBb4r5().getText(), halL2.getBb4r6().getText());
//        arr[10] = new Dsartb4(db1.getNbs(), db1.getNbs() + "02", "02", halL2.getKb4r2s1().getText(), halL2.getBb4r2s2().getText(), halL2.getBb4r2s3().getText(), halL2.getBb4r3().getText(), halL2.getBb4r5().getText(), halL2.getBb4r6().getText());
//        arr[11] = new Dsartb4(db1.getNbs(), db1.getNbs() + "01", "01", halL2.getLb4r2s1().getText(), halL2.getAb4r2s2().getText(), halL2.getAb4r2s3().getText(), halL2.getAb4r3().getText(), halL2.getAb4r5().getText(), halL2.getAb4r6().getText());
//        arr[12] = new Dsartb4(db1.getNbs(), db1.getNbs() + "02", "02", halL2.getMb4r2s1().getText(), halL2.getBb4r2s2().getText(), halL2.getBb4r2s3().getText(), halL2.getBb4r3().getText(), halL2.getBb4r5().getText(), halL2.getBb4r6().getText());
//        arr[13] = new Dsartb4(db1.getNbs(), db1.getNbs() + "02", "02", halL2.getNb4r2s1().getText(), halL2.getBb4r2s2().getText(), halL2.getBb4r2s3().getText(), halL2.getBb4r3().getText(), halL2.getBb4r5().getText(), halL2.getBb4r6().getText());
//        arr[14] = new Dsartb4(db1.getNbs(), db1.getNbs() + "02", "02", halL2.getOb4r2s1().getText(), halL2.getBb4r2s2().getText(), halL2.getBb4r2s3().getText(), halL2.getBb4r3().getText(), halL2.getBb4r5().getText(), halL2.getBb4r6().getText());
//        arr[15] = new Dsartb4(db1.getNbs(), db1.getNbs() + "02", "02", halL2.getPb4r2s1().getText(), halL2.getBb4r2s2().getText(), halL2.getBb4r2s3().getText(), halL2.getBb4r3().getText(), halL2.getBb4r5().getText(), halL2.getBb4r6().getText());
//        arr[16] = new Dsartb4(db1.getNbs(), db1.getNbs() + "02", "02", halL2.getQb4r2s1().getText(), halL2.getBb4r2s2().getText(), halL2.getBb4r2s3().getText(), halL2.getBb4r3().getText(), halL2.getBb4r5().getText(), halL2.getBb4r6().getText());
//        arr[17] = new Dsartb4(db1.getNbs(), db1.getNbs() + "02", "02", halL2.getRb4r2s1().getText(), halL2.getBb4r2s2().getText(), halL2.getBb4r2s3().getText(), halL2.getBb4r3().getText(), halL2.getBb4r5().getText(), halL2.getBb4r6().getText());
//        arr[18] = new Dsartb4(db1.getNbs(), db1.getNbs() + "02", "02", halL2.getSb4r2s1().getText(), halL2.getBb4r2s2().getText(), halL2.getBb4r2s3().getText(), halL2.getBb4r3().getText(), halL2.getBb4r5().getText(), halL2.getBb4r6().getText());
//        arr[19] = new Dsartb4(db1.getNbs(), db1.getNbs() + "02", "02", halL2.getTb4r2s1().getText(), halL2.getBb4r2s2().getText(), halL2.getBb4r2s3().getText(), halL2.getBb4r3().getText(), halL2.getBb4r5().getText(), halL2.getBb4r6().getText());
//
//        for (int i = 0; i < 20; i++) {
//            arr[i].setB4r4(new DsartoptionB4r4("p"));
//        }

        return db4;
    }

    public String getString(int angka) {
        String no = Integer.toString(angka);
        while (no.length() < 2) {
            no = "0" + no;
        }
        return no;
    }
}
