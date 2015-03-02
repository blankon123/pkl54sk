/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp.validasi;

import java.util.ArrayList;
import sp.component.TextField;
import sp.model.B1;

/**
 *
 * @author Thosan Girisona S
 */
public class ValidasiB1 {

    ArrayList<TextField> arr;
    B1 b1;

    public ValidasiB1(B1 b1) {
        this.b1 = b1;
    }

    public boolean cek() {
        boolean valid = true;
        if ("".equals(b1.getNim()) || b1.getNim()==null) {
            valid = false;
        }
        return valid;
    }
    
    public ArrayList<sp.model.Error> cek2(){
        ArrayList<sp.model.Error> b1listerr = new ArrayList<>();
        if ("".equals(b1.getNim()) || b1.getNim()==null) {
            b1listerr.add(b1listerr.size(),new sp.model.Error("nim", "Kesalahan pengisian NIM", 1));
        }
        return b1listerr;
    }

}
