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
import sp.model.Dsartb2;

/**
 *
 * @author Ristika Nugraha [12.7350]
 */
public class ValListB2 {

    ArrayList<TextFieldListing> arr;
    Dsartb2 db2;
    Hal1Listing b1view;
    TextFieldListing dummy;
    private ArrayList<sp.model.Error> b2listerr;

    public ValListB2(Dsartb2 db2, Hal1Listing b1view) {
        this.db2 = db2;
        this.b1view = b1view;
    }

    public ArrayList<sp.model.Error> cek() {
        b2listerr = new ArrayList<>();

        cekR1();
        cekR2();
        cekR3a();
        cekR3b();
        cekR3c();
        cekR3d();

        return b2listerr;
    }

    private TextFieldListing getError(TextFieldListing tx) {
        tx.setBackground(Color.red);
        return tx;
    }

    private void cekR1() {
        if (b1view.getString(db2.getB2r1()).length() < 3) {
            dummy = getError(b1view.getB2r1());
            b2listerr.add(b2listerr.size(), new sp.model.Error("b2r1", "Kesalahan Panjang Kode", 1));
        }
    }

    private void cekR2() {
//        if (b1view.getString(db2.getB2r2()).length() < 4) {
//            dummy = getError(b1view.getB2r2());
//            b1view.setB2r2(dummy);
//            b2listerr.add(b2listerr.size(), new sp.model.Error("b2r2", "Kesalahan Panjang Kode", 1));
//        }
    }

    private void cekR3a() {
        if (b1view.getString(db2.getB2r3s1()).length() < 3) {
            dummy = getError(b1view.getB1r3());
            b1view.setB2r3s1(dummy);
            b2listerr.add(b2listerr.size(), new sp.model.Error("B2r3s1", "Kesalahan Panjang Kode", 1));
        }
    }

    private void cekR3b() {
        if (b1view.getString(db2.getB2r3s2()).length() < 3) {
            dummy = getError(b1view.getB1r4());
            b1view.setB2r3s2(dummy);
            b2listerr.add(b2listerr.size(), new sp.model.Error("B2r3s1", "Kesalahan Panjang Kode", 1));
        }
    }

    private void cekR3c() {
        if (b1view.getString(db2.getB2r3s3()).length() < 3) {
            dummy = getError(b1view.getB1r5());
            b1view.setB2r3s3(dummy);
            b2listerr.add(b2listerr.size(), new sp.model.Error("b2r3s1", "Kesalahan Panjang Kode", 1));
        }
    }

    private void cekR3d() {
        if (b1view.getString(db2.getB2r3s4()).length() < 3) {
            dummy = getError(b1view.getB1r5());
            b1view.setB2r3s4(dummy);
            b2listerr.add(b2listerr.size(), new sp.model.Error("b2r3s4", "Kesalahan Panjang Kode", 1));

            int jml = db2.getB2r3s1() + db2.getB2r3s2() + db2.getB2r3s3();
            if (jml != db2.getB2r3s4()) {
                b1view.setB2r3s1(dummy);
                b1view.setB2r3s2(dummy);
                b1view.setB2r3s3(dummy);
                b1view.setB2r3s4(dummy);
                b2listerr.add(b2listerr.size(), new sp.model.Error("b2r3s4", "Kesalahan hubungan antar b2r3", 1));
            }
        }
    }
}
