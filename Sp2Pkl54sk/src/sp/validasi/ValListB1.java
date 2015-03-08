/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp.validasi;

import java.awt.Color;
import java.util.ArrayList;
import sp.component.TextFieldListing;
import sp.form.Hal1Listing;
import sp.model.Dsartb1;
import sp.model.Error;

/**
 *
 * @author Ristika Nugraha [12.7350]
 */
public class ValListB1 {
    ArrayList<TextFieldListing> arr;
    Dsartb1 db1;
    Hal1Listing b1view;
    TextFieldListing dummy;
    private ArrayList<Error> b1listerr;

    public ValListB1(Dsartb1 db1,Hal1Listing b1view) {
        this.db1 = db1;
        this.b1view = b1view;
    }

    public ArrayList<Error> cek() {
        b1listerr = new ArrayList<>();

        cekR2();
        cekR3();
        cekR4();
        cekR5();

        return b1listerr;
    }

    private TextFieldListing getError(TextFieldListing tx) {
        tx.setBackground(Color.red);
        return tx;
    }

    private void cekR2() {
        if (db1.getB1r2().length() < 3) {
            dummy = getError(b1view.getB1r2());
            b1view.setB1r2(dummy);
            b1listerr.add(b1listerr.size(), new Error("b1r2", "Kesalahan Panjang Kode", 1));
        }
    }

    private void cekR3() {
        if (db1.getB1r3().length() < 3) {
            dummy = getError(b1view.getB1r3());
            b1view.setB1r3(dummy);
            b1listerr.add(b1listerr.size(), new Error("b1r3", "Kesalahan Panjang Kode", 1));
        }
    }

    private void cekR4() {
        if(db1.getB1r4().length()<3){
            dummy = getError(b1view.getB1r4());
            b1view.setB1r4(dummy);
            b1listerr.add(b1listerr.size(), new Error("b1r4", "Kesalahan Panjang Kode", 1));
        }
    }

    private void cekR5() {
        if(db1.getB1r5().length()<3){
            dummy = getError(b1view.getB1r5());
            b1view.setB1r5(dummy);
            b1listerr.add(b1listerr.size(), new Error("b1r5", "Kesalahan Panjang Kode", 1));
        }
    }

}
