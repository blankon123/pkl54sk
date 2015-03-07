/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp.validasi;

import java.awt.Color;
import java.util.ArrayList;
import sp.component.TextField;
import sp.form.Hal1;
import sp.model.B1;
import sp.model.Error;

/**
 *
 * @author Thosan Girisona S
 */
public class ValidasiB1 {

    ArrayList<TextField> arr;
    B1 b1;
    Hal1 b1view;
    TextField dummy;
    private ArrayList<Error> b1listerr;

    public ValidasiB1(B1 b1,Hal1 biveiw) {
        this.b1 = b1;
        this.b1view = biveiw;
    }

    public ArrayList<Error> cek() {
        b1listerr = new ArrayList<>();

        cekR2();
        cekR3();
        cekR5();
        cekR6();

        return b1listerr;
    }

    private TextField getError(TextField tx) {
        tx.setBackground(Color.red);
        return tx;
    }

    private void cekR2() {
        if (b1.getB1r2().length() < 3) {
            dummy = getError(b1view.getB1r2());
            b1view.setB1r2(dummy);
            b1listerr.add(b1listerr.size(), new Error("b1r2", "Kesalahan Panjang Kode", 1));
        }
    }

    private void cekR3() {
        if (b1.getB1r3().length() < 3) {
            dummy = getError(b1view.getB1r3());
            b1view.setB1r3(dummy);
            b1listerr.add(b1listerr.size(), new Error("b1r3", "Kesalahan Panjang Kode", 1));
        }
    }

    private void cekR5() {
        if(b1.getB1r5().length()<3){
            dummy = getError(b1view.getB1r5());
            b1view.setB1r5(dummy);
            b1listerr.add(b1listerr.size(), new Error("b1r5", "Kesalahan Panjang Kode", 1));
        }
    }

    private void cekR6() {
        if(b1.getB1r6().length()<2){
            dummy = getError(b1view.getB1r6());
            b1view.setB1r6(dummy);
            b1listerr.add(b1listerr.size(), new Error("b1r6", "Kesalahan Panjang Kode", 1));
        }
    }

}
