/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp.util;

import sp.component.TextField;
import java.awt.Component;
import java.awt.Container;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 *
 * @author Imam Habib Pamungkas <imamhabibpamungkas@gmail.com>
 */
public class FormControl {

    private static LinkedList<TextField> listForm;
    private static List limitSection;
    private static int posisi;
    private static JPanel Parent;
    private static CardLayoutController controller;
    private static final FormCompare formCompare;
    private static JScrollPane scrollPane;

    static {
        limitSection = new ArrayList();
        listForm = new LinkedList<TextField>();
        formCompare = new FormCompare();
    }

    /**
     * Mendapatkan posisi kursor berdasarkan penomoran textfield
     *
     * @return
     */
    public static int getPosisi() {
        return posisi;
    }

    public static void setPosisi(int posisi) {
        FormControl.posisi = posisi;
    }

    /**
     * Menambahkan textfield kedalam listForm (registrasi textfield ke form
     * controller)
     *
     * @param text TextField
     */
    public static void addtoForm(TextField text) {
        listForm.add(text);
    }

    public static LinkedList<TextField> getListForm() {
        //  Collections.sort(listForm,formCompare);
        return listForm;
    }

    public static TextField getTextFieldbyPosisi(int posisi) {
        return listForm.get(posisi);
    }

    /**
     * Disable TextField dari txt1 sampai txt2
     *
     * @param txt1
     * @param txt2
     */
    public static void disableText(TextField txt1, TextField txt2) {
        int i = txt1.getPosisi();
        int j = txt2.getPosisi();
        while (i < j) {
            listForm.get(i).setEnabled(false);
            i++;
        }
    }

    /**
     * Disable text pada txt tertentu berdasarkan urutan pada satu quesioner
     *
     * @param txt1
     */
    public static void disableText(TextField txt1) {
        int i = getPosisi() + 1;
        int j = txt1.getPosisi() - 1;
        while (i < j) {
            listForm.get(i).setEnabled(false);
            i++;
        }
    }

    /**
     * Disable text pada txt tertentu berdasarkan namanya pada satu quesioner
     *
     * @param namaTextField
     */
    public static void disableText(String namaTextField) {
        ResetText.disableTextField(Parent, namaTextField);
    }

    /**
     * Disable text pada txt tertentu berdasarkan namanya pada container c
     *
     * @param c
     * @param namaTextField
     */
    public static void disableText(Container c, String namaTextField) {
        ResetText.disableTextField(c, namaTextField);
    }

    /**
     * Lanjut pada pengisian TextField berikutnya (urut)
     */
    public static void next() {
        Integer pos = getPosisi();
        if (limitSection.contains(pos)) {
            controller.next();
            int ind = getPosisi() + 1;
            if (ind == listForm.size()) {
                listForm.get(0).requestFocus();
            } else {
                listForm.get(ind).requestFocus();
            }
        } else {
            int ind = getPosisi() + 1;
            listForm.get(ind).requestFocus();
        }
    }

    public static void remove(TextField txt) {
        listForm.remove(txt);
    }

    /**
     * Reset TextField pada quesioner reset pada posisi kursor berada
     */
    public static void clear() {
        listForm.get(getPosisi()).setText("");
    }

    public static TextField getCurrentText() {
        return listForm.get(getPosisi());
    }

    /**
     * ClearAll textField pada panel quesioner
     */
    public static void clearAll() {
        ResetText.resetJTextField(Parent);
    }

    public static void refineList() {
        System.out.println(listForm.size());
        for (int i = 0; i < listForm.size(); i++) {
            if (i >= 123) {
                listForm.remove(i);
            }
        }
    }

    private static class FormCompare implements Comparator<TextField> {

        @Override
        public int compare(TextField o1, TextField o2) {
            if (o1.getPosisi() < o2.getPosisi()) {
                return -1;
            } else {
                return 1;
            }
        }
    }

    /**
     * Melakukan skip pengisian tujuan skip berada pada section yang berbeda
     *
     * @param cardName
     * @param txtTarget
     */
    public static void skipTo(String cardName, TextField txtTarget) {
        controller.show(cardName);
        txtTarget.requestFocus();
    }

    /**
     * Melakukan skip pengisian tujuan skip berada pada section yang sama
     *
     * @param txtTarget
     */
    public static void skipTo(TextField txtTarget) {
        txtTarget.requestFocus();
        FormControl.disableText(txtTarget);
    }

    public static List getLimitSection() {
        return limitSection;
    }

    public static void setLimitSection(List limitSection) {
        FormControl.limitSection = limitSection;
    }

    public static JPanel getParent() {
        return Parent;
    }

    private static void setParent(JPanel Parent) {
        FormControl.Parent = Parent;
    }

    /**
     * Mengambil CardLayout pada kuesioner
     *
     * @return
     */
    public static CardLayoutController getController() {
        return controller;
    }

    private static void setController(CardLayoutController controller) {
        FormControl.controller = controller;
    }

    /**
     * Inisialisasi awal ketika akan menggunakan form controller
     *
     * @param Parent
     * @param controller
     */
    public static void init(JPanel Parent, CardLayoutController controller) {
        setParent(Parent);
        setController(controller);
        //Collections.sort(listForm, formCompare);
    }

    public static void setScoller(JScrollPane scrollPane) {
        FormControl.scrollPane = scrollPane;
    }

    public static JScrollPane getScroller() {
        return controller.getScrollPane();
    }

    public static ArrayList<TextField> setFixedPos(int startPos, ArrayList<TextField> arrList) {
        int posHal = startPos;
        int pos = 0;
        for (int i = 0; i < arrList.size(); i++) {
            pos = posHal+i;
            arrList.get(i).setPosisi(pos);
        }
        limitSection.add(pos);
        return arrList;
    }
    
    public static ArrayList<TextField> setFixedPos1(int startPos, ArrayList<TextField> arrList) {
        int posHal = startPos;
        int pos = 0;
        for (int i = 0; i < arrList.size(); i++) {
            pos = posHal+i;
            arrList.get(i).setPosisi(pos);
            arrList.get(i).setText("1");
        }
        limitSection.add(pos);
        return arrList;
    }
}

class ResetText {

    private static Component[] comp;
    private static List<Component> listComp;

    private static boolean isJTextField(Component c) {
        boolean kondisi = false;

        try {
            TextField jt = (TextField) c;
            kondisi = true;
        } catch (Exception e) {
        }
        return kondisi;
    }

    public static List<Component> resetJTextField(final Container cont) {
        comp = cont.getComponents();
        listComp = new ArrayList<Component>();
        for (Component c : comp) {
            listComp.add(c);
            if (isJTextField(c)) {
                TextField jt = (TextField) c;
                if (jt.isEditable()) {
                    jt.setText("");
                    jt.setBackground(null);
                }
            }

            if (c instanceof Container) {
                listComp.addAll(resetJTextField((Container) c));
            }

        }
        return listComp;
    }

    public static List<Component> disableTextField(final Container c, String textfieldTujuan) {
        comp = c.getComponents();
        listComp = new ArrayList<Component>();
        for (Component co : comp) {
            listComp.add(co);
            if (isJTextField(co)) {
                TextField field = (TextField) co;
                if (field.getName().equalsIgnoreCase(textfieldTujuan)) {
                    field.setEditable(false);
                }
            }

            if (co instanceof Container) {
                listComp.addAll(disableTextField((Container) c, textfieldTujuan));
            }
        }
        return null;
    }
}
