/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp.validasi;

import java.awt.Color;
import java.util.ArrayList;
import sp.form.Hal2;
import sp.model.B3;
import sp.component.TextField;
import sp.model.Error;

/**
 *
 * @author Thosan Girisona S
 */
public class ValidasiB3 {

    ArrayList<TextField> arr;
    B3 b3;
    Hal2 b3view;
    TextField dummy;
    ArrayList<Error> b3listerr;

    public ValidasiB3(B3 b3, Hal2 b3view) {
        this.b3 = b3;
        this.b3view = b3view;
    }

    public ArrayList<Error> cek() {
        b3listerr = new ArrayList<>();

        cekB3R7();
        cekB3R9();
        cekB3R10();
        cekB3R11();
        cekB3R12();

        return b3listerr;
    }

    private TextField getError(TextField tx) {
        tx.setBackground(Color.red);
        return tx;
    }

    private void cekB3R7() {
        int umur = Integer.valueOf(b3.getB3r3());
        if (b3.getB3r7().getKode().equals("1") && umur < 5) {
            dummy = getError(b3view.getB3r7());
            b3view.setB3r7(dummy);
            b3listerr.add(b3listerr.size(), new Error("b3r7", "Kesalahan Korelasi dengan Umur", 2));
        }
        if (b3.getB3r7().getKode().equals("2") && umur < 10) {
            dummy = getError(b3view.getB3r7());
            b3view.setB3r7(dummy);
            b3listerr.add(b3listerr.size(), new Error("b3r7", "Kesalahan Korelasi dengan Umur", 2));
        }
        if (b3.getB3r7().getKode().equals("3") && umur < 13) {
            dummy = getError(b3view.getB3r7());
            b3view.setB3r7(dummy);
            b3listerr.add(b3listerr.size(), new Error("b3r7", "Kesalahan Korelasi dengan Umur", 2));
        }
        if (b3.getB3r7().getKode().equals("4") && umur < 16) {
            dummy = getError(b3view.getB3r7());
            b3view.setB3r7(dummy);
            b3listerr.add(b3listerr.size(), new Error("b3r7", "Kesalahan Korelasi dengan Umur", 2));
        }
        if (b3.getB3r7().getKode().equals("5") && umur < 16) {
            dummy = getError(b3view.getB3r7());
            b3view.setB3r7(dummy);
            b3listerr.add(b3listerr.size(), new Error("b3r7", "Kesalahan Korelasi dengan Umur", 2));
        }
        if (b3.getB3r7().getKode().equals("6") && umur < 17) {
            dummy = getError(b3view.getB3r7());
            b3view.setB3r7(dummy);
            b3listerr.add(b3listerr.size(), new Error("b3r7", "Kesalahan Korelasi dengan Umur", 2));
        }
        if (b3.getB3r7().getKode().equals("7") && umur < 19) {
            dummy = getError(b3view.getB3r7());
            b3view.setB3r7(dummy);
            b3listerr.add(b3listerr.size(), new Error("b3r7", "Kesalahan Korelasi dengan Umur", 2));
        }
        if (b3.getB3r7().getKode().equals("8") && umur < 20) {
            dummy = getError(b3view.getB3r7());
            b3view.setB3r7(dummy);
            b3listerr.add(b3listerr.size(), new Error("b3r7", "Kesalahan Korelasi dengan Umur", 2));
        }
        if (b3.getB3r7().getKode().equals("9") && umur < 22) {
            dummy = getError(b3view.getB3r7());
            b3view.setB3r7(dummy);
            b3listerr.add(b3listerr.size(), new Error("b3r7", "Kesalahan Korelasi dengan Umur", 2));
        }
    }

    private void cekB3R9() {
        if (b3.getB3r9s1d1().getKode().equals("2")
                && b3.getB3r9s1d2().getKode().equals("2")
                && b3.getB3r9s1d3().getKode().equals("2")
                && b3.getB3r9s1d4().getKode().equals("2")) {
            if (b3.getB3r9s2() != null) {
                dummy = getError(b3view.getB3r9s2());
                b3view.setB3r9s2(dummy);
                b3listerr.add(b3listerr.size(), new Error("b3r9s2", "Harus Kosong Karena Tidak Melakukan Apapun", 2));
            }
        } else if (b3.getB3r9s1d1().getKode().equals("2") && b3.getB3r9s2().equals("1")) {
            dummy = getError(b3view.getB3r9s2());
            b3view.setB3r9s2(dummy);
            b3listerr.add(b3listerr.size(), new Error("b3r9s2", "Kesalahan Korelasi dengan b3r9s1d1", 2));
        } else if (b3.getB3r9s1d2().getKode().equals("2") && b3.getB3r9s2().equals("2")) {
            dummy = getError(b3view.getB3r9s2());
            b3view.setB3r9s2(dummy);
            b3listerr.add(b3listerr.size(), new Error("b3r9s2", "Kesalahan Korelasi dengan b3r9s1d2", 2));
        } else if (b3.getB3r9s1d3().getKode().equals("2") && b3.getB3r9s2().equals("3")) {
            dummy = getError(b3view.getB3r9s2());
            b3view.setB3r9s2(dummy);
            b3listerr.add(b3listerr.size(), new Error("b3r9s2", "Kesalahan Korelasi dengan b3r9s1d3", 2));
        } else if (b3.getB3r9s1d4().getKode().equals("2") && b3.getB3r9s2().equals("4")) {
            dummy = getError(b3view.getB3r9s2());
            b3view.setB3r9s2(dummy);
            b3listerr.add(b3listerr.size(), new Error("b3r9s2", "Kesalahan Korelasi dengan b3r9s1d4", 2));
        } else if (b3.getB3r9s1d1().getKode().equals("1")
                && b3.getB3r9s1d2().getKode().equals("1")
                && b3.getB3r9s1d3().getKode().equals("1")
                && b3.getB3r9s1d4().getKode().equals("1")
                && b3.getB3r9s2() == null) {
            dummy = getError(b3view.getB3r9s2());
            b3view.setB3r9s2(dummy);
            b3listerr.add(b3listerr.size(), new Error("b3r9s2", "Harus Terisi Antara 1-4", 2));
        } else if (b3.getB3r9s2() != null) {
            int minDigit = b3view.getB3r9s2().getMinDigit();
            int maxDigit = b3view.getB3r9s2().getMaxDigit();
            if (Integer.valueOf(b3.getB3r9s2()) > maxDigit || Integer.valueOf(b3.getB3r9s2()) < minDigit) {
                dummy = getError(b3view.getB3r9s2());
                b3view.setB3r9s2(dummy);
                b3listerr.add(b3listerr.size(), new Error("b3r9s2", "Harus Terisi Antara " + minDigit + "-" + maxDigit, 2));
            }
        }
    }

    private void cekB3R10() {
        if (b3.getB3r9s1d1().getKode().equals("2") && b3.getB3r10() == null) {
            dummy = getError(b3view.getB3r10());
            b3view.setB3r10(dummy);
            b3listerr.add(b3listerr.size(), new Error("b3r10", "Harus Terisi karena Tidak Bekerja", 2));
        }
        if (b3.getB3r9s1d1().getKode().equals("1") && b3.getB3r10() != null) {
            dummy = getError(b3view.getB3r10());
            b3view.setB3r10(dummy);
            b3listerr.add(b3listerr.size(), new Error("b3r10", "Harus Kosong karena Bekerja", 2));
        } else if (b3.getB3r10() != null) {
            int minDigit = b3view.getB3r10().getMinDigit();
            int maxDigit = b3view.getB3r10().getMaxDigit();
            if (Integer.valueOf(b3.getB3r10()) > maxDigit || Integer.valueOf(b3.getB3r10()) < minDigit) {
                dummy = getError(b3view.getB3r10());
                b3view.setB3r10(dummy);
                b3listerr.add(b3listerr.size(), new Error("b3r10", "Harus Terisi Antara " + minDigit + "-" + maxDigit, 2));
            }
        }
    }

    private void cekB3R11() {
        if (b3.getB3r10() == null) {
            if (b3.getB3r9s1d1().getKode().equals("1")) {
                if (b3.getB3r11() == null) {
                    dummy = getError(b3view.getB3r11());
                    b3view.setB3r11(dummy);
                    b3listerr.add(b3listerr.size(), new Error("b3r11", "Harus Terisi Karena B3r9s1d1=1", 2));
                }
            } else if (b3.getB3r11() == null) {
                dummy = getError(b3view.getB3r11());
                b3view.setB3r11(dummy);
                b3listerr.add(b3listerr.size(), new Error("b3r11", "Harus Terisi Karena B3r9s1d1=1", 2));
            }
        } else if (b3.getB3r10().equals("1")) {
            if (b3.getB3r11() == null) {
                dummy = getError(b3view.getB3r11());
                b3view.setB3r11(dummy);
                b3listerr.add(b3listerr.size(), new Error("b3r11", "Harus Terisi Karena B3r10=1", 2));
            }
        } else if (b3.getB3r11() != null) {
            int minDigit = b3view.getB3r11().getMinDigit();
            int maxDigit = b3view.getB3r11().getMaxDigit();
            if (Integer.valueOf(b3.getB3r11()) > maxDigit || Integer.valueOf(b3.getB3r11()) < minDigit) {
                dummy = getError(b3view.getB3r11());
                b3view.setB3r11(dummy);
                b3listerr.add(b3listerr.size(), new Error("b3r11", "Harus Terisi Antara " + minDigit + "-" + maxDigit, 2));
            }
        }
    }

    private void cekB3R12() {
        if (b3.getB3r10() == null) {
            if (b3.getB3r9s1d1().getKode().equals("1")) {
                if (b3.getB3r12() == null) {
                    dummy = getError(b3view.getB3r12());
                    b3view.setB3r12(dummy);
                    b3listerr.add(b3listerr.size(), new Error("b3r12", "Harus Terisi Karena B3r9s1d1=1", 2));
                }
            } else if (b3.getB3r12() == null) {
                dummy = getError(b3view.getB3r12());
                b3view.setB3r12(dummy);
                b3listerr.add(b3listerr.size(), new Error("b3r12", "Harus Terisi Karena B3r9s1d1=1", 2));

            }
        } else if (b3.getB3r10().equals("1")) {
            if (b3.getB3r12() == null) {
                dummy = getError(b3view.getB3r12());
                b3view.setB3r12(dummy);
                b3listerr.add(b3listerr.size(), new Error("b3r12", "Harus Terisi Karena B3r10=1", 2));
            }
        } else if (b3.getB3r12() != null) {
            int minDigit = b3view.getB3r12().getMinDigit();
            int maxDigit = b3view.getB3r12().getMaxDigit();
            if (Integer.valueOf(b3.getB3r12().getKode()) > maxDigit || Integer.valueOf(b3.getB3r12().getKode()) < minDigit) {
                dummy = getError(b3view.getB3r12());
                b3view.setB3r12(dummy);
                b3listerr.add(b3listerr.size(), new Error("b3r12", "Harus Terisi Antara " + minDigit + "-" + maxDigit, 2));
            }
        }
    }

}
