/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp.form;

import java.util.ArrayList;
import javax.swing.JLayeredPane;
import sp.component.TextField;
import sp.util.FormControl;

/**
 *
 * @author Rohma Hidayati [12.7363]
 */
public class Hal1Listing extends javax.swing.JPanel {

    /**
     * Creates new form Hal1Listing
     */
    private ArrayList<TextField> listTextFieldHal1Listing = new ArrayList<TextField>();
    protected static int startPos = 0;
    protected static int maxPos;

    public Hal1Listing() {
        initComponents();
        addListTextfield();
        setListTextFieldHal1Listing(FormControl.setFixedPos(startPos, getListTextField()));
    }

    public int getMaxPertanyaan() {
        return maxPos;
    }

    public ArrayList<TextField> getListTextField() {
        return listTextFieldHal1Listing;
    }

    //    public void setFieldHal1(B1Listing b) {
//        b1r1.setText(b.getB1r1());
//        b1r2.setText(b.getB1r2());
//        b1r3.setText(b.getB1r3());
//        b1r4.setText(b.getB1r4());
//        b1r5.setText(b.getB1r5());
//        b1r6s1.setText(b.getB1r6s1());
//        b1r6s2.setText(b.getB1r6s2());
//        b2r1.setText(b.getB2r1());
//        b2r2.setText(b.getB2r2());
//        b2r3s1.setText(b.getB2r3s1());
//        b2r3s2.setText(b.getB2r3s2());
//        b2r3s3.setText(b.getB2r3s3());
//        b2r3s4.setText(b.getB2r3s4());
//        b3r1.setText(b.getB3r1());
//        b3r2.setText(b.getB3r2());
//        b3r3.setText(b.getB3r3());
//    }
    private void addListTextfield() {
        getListTextField().add(0, b1r1);
        getListTextField().add(1, b1r2);
        getListTextField().add(2, b1r3);
        getListTextField().add(3, b1r4);
        getListTextField().add(4, b1r5);
        getListTextField().add(5, b1r6s1);
        getListTextField().add(6, b1r6s2);
        getListTextField().add(7, b2r1);
        getListTextField().add(8, b2r2);
        getListTextField().add(9, b2r3s1);
        getListTextField().add(10, b2r3s2);
        getListTextField().add(11, b2r3s3);
        getListTextField().add(12, b2r3s4);
        getListTextField().add(13, b3r1);
        getListTextField().add(14, b3r2);
        getListTextField().add(15, b3r3);
        maxPos = getListTextField().size();
    }

    public ArrayList<TextField> getListTextFieldHal1Listing() {
        return listTextFieldHal1Listing;
    }

    public void setListTextFieldHal1Listing(ArrayList<TextField> listTextFieldHal1Listing) {
        this.listTextFieldHal1Listing = listTextFieldHal1Listing;
    }

    public static int getStartPos() {
        return startPos;
    }

    public static void setStartPos(int startPos) {
        Hal1Listing.startPos = startPos;
    }

    public static int getMaxPos() {
        return maxPos;
    }

    public static void setMaxPos(int maxPos) {
        Hal1Listing.maxPos = maxPos;
    }

    public TextField getB1r1() {
        return b1r1;
    }

    public void setB1r1(TextField b1r1) {
        this.b1r1 = b1r1;
    }

    public TextField getB1r2() {
        return b1r2;
    }

    public void setB1r2(TextField b1r2) {
        this.b1r2 = b1r2;
    }

    public TextField getB1r3() {
        return b1r3;
    }

    public void setB1r3(TextField b1r3) {
        this.b1r3 = b1r3;
    }

    public TextField getB1r4() {
        return b1r4;
    }

    public void setB1r4(TextField b1r4) {
        this.b1r4 = b1r4;
    }

    public TextField getB1r5() {
        return b1r5;
    }

    public void setB1r5(TextField b1r5) {
        this.b1r5 = b1r5;
    }

    public TextField getB1r6s1() {
        return b1r6s1;
    }

    public void setB1r6s1(TextField b1r6s1) {
        this.b1r6s1 = b1r6s1;
    }

    public TextField getB1r6s2() {
        return b1r6s2;
    }

    public void setB1r6s2(TextField b1r6s2) {
        this.b1r6s2 = b1r6s2;
    }

    public TextField getB2r1() {
        return b2r1;
    }

    public void setB2r1(TextField b2r1) {
        this.b2r1 = b2r1;
    }

    public TextField getB2r2() {
        return b2r2;
    }

    public void setB2r2(TextField b2r2) {
        this.b2r2 = b2r2;
    }

    public TextField getB2r3s1() {
        return b2r3s1;
    }

    public void setB2r3s1(TextField b2r3s1) {
        this.b2r3s1 = b2r3s1;
    }

    public TextField getB2r3s2() {
        return b2r3s2;
    }

    public void setB2r3s2(TextField b2r3s2) {
        this.b2r3s2 = b2r3s2;
    }

    public TextField getB2r3s3() {
        return b2r3s3;
    }

    public void setB2r3s3(TextField b2r3s3) {
        this.b2r3s3 = b2r3s3;
    }

    public TextField getB2r3s4() {
        return b2r3s4;
    }

    public void setB2r3s4(TextField b2r3s4) {
        this.b2r3s4 = b2r3s4;
    }

    public TextField getB3r1() {
        return b3r1;
    }

    public void setB3r1(TextField b3r1) {
        this.b3r1 = b3r1;
    }

    public TextField getB3r2() {
        return b3r2;
    }

    public void setB3r2(TextField b3r2) {
        this.b3r2 = b3r2;
    }

    public TextField getB3r3() {
        return b3r3;
    }

    public void setB3r3(TextField b3r3) {
        this.b3r3 = b3r3;
    }

    public sp.imageClass.Hal1Listing getHal1Listing1() {
        return hal1Listing1;
    }

    public void setHal1Listing1(sp.imageClass.Hal1Listing hal1Listing1) {
        this.hal1Listing1 = hal1Listing1;
    }

    public JLayeredPane getjLayeredPane1() {
        return jLayeredPane1;
    }

    public void setjLayeredPane1(JLayeredPane jLayeredPane1) {
        this.jLayeredPane1 = jLayeredPane1;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        hal1Listing1 = new sp.imageClass.Hal1Listing();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        b1r1 = new sp.component.TextField();
        b1r2 = new sp.component.TextField();
        b1r3 = new sp.component.TextField();
        b1r4 = new sp.component.TextField();
        b1r5 = new sp.component.TextField();
        b1r6s1 = new sp.component.TextField();
        b1r6s2 = new sp.component.TextField();
        b2r1 = new sp.component.TextField();
        b2r2 = new sp.component.TextField();
        b2r3s1 = new sp.component.TextField();
        b2r3s2 = new sp.component.TextField();
        b2r3s3 = new sp.component.TextField();
        b2r3s4 = new sp.component.TextField();
        b3r1 = new sp.component.TextField();
        b3r2 = new sp.component.TextField();
        b3r3 = new sp.component.TextField();

        setLayout(new java.awt.BorderLayout());

        jLayeredPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        b1r1.setAngka(true);
        b1r1.setKhusus(true);
        b1r1.setKhususType('1');
        b1r1.setRequired(true);
        jLayeredPane1.add(b1r1, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 220, 90, 40));

        b1r2.setAngka(true);
        b1r2.setMaxDigit(999);
        b1r2.setMinDigit(1);
        b1r2.setRequired(true);
        jLayeredPane1.add(b1r2, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 270, 130, 40));

        b1r3.setAngka(true);
        b1r3.setMaxDigit(999);
        b1r3.setMinDigit(1);
        b1r3.setRequired(true);
        jLayeredPane1.add(b1r3, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 310, 130, 40));

        b1r4.setAngka(true);
        b1r4.setMaxDigit(999);
        b1r4.setRequired(true);
        jLayeredPane1.add(b1r4, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 360, 130, 40));

        b1r5.setAngka(true);
        b1r5.setMaxDigit(999);
        b1r5.setRequired(true);
        jLayeredPane1.add(b1r5, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 410, 130, 40));

        b1r6s1.setAngka(true);
        b1r6s1.setHuruf(true);
        b1r6s1.setLength(100);
        b1r6s1.setRequired(true);
        jLayeredPane1.add(b1r6s1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 470, 570, 30));

        b1r6s2.setAngka(true);
        b1r6s2.setHuruf(true);
        b1r6s2.setLength(100);
        b1r6s2.setRequired(true);
        jLayeredPane1.add(b1r6s2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 500, 570, 30));

        b2r1.setAngka(true);
        b2r1.setMaxDigit(999);
        b2r1.setRequired(true);
        jLayeredPane1.add(b2r1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 610, 130, 40));

        b2r2.setAngka(true);
        b2r2.setMaxDigit(9999);
        b2r2.setRequired(true);
        jLayeredPane1.add(b2r2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 660, 190, 40));

        b2r3s1.setAngka(true);
        b2r3s1.setMaxDigit(999);
        b2r3s1.setRequired(true);
        jLayeredPane1.add(b2r3s1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 770, 130, 40));

        b2r3s2.setAngka(true);
        b2r3s2.setMaxDigit(999);
        b2r3s2.setRequired(true);
        jLayeredPane1.add(b2r3s2, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 840, 130, 40));

        b2r3s3.setAngka(true);
        b2r3s3.setMaxDigit(999);
        b2r3s3.setRequired(true);
        jLayeredPane1.add(b2r3s3, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 910, 130, 40));

        b2r3s4.setAngka(true);
        b2r3s4.setMaxDigit(9999);
        b2r3s4.setRequired(true);
        jLayeredPane1.add(b2r3s4, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 970, 190, 40));

        b3r1.setHuruf(true);
        b3r1.setLength(100);
        b3r1.setRequired(true);
        jLayeredPane1.add(b3r1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 1070, 560, 40));

        b3r2.setAngka(true);
        b3r2.setMaxDigit(129999);
        b3r2.setMinDigit(120000);
        b3r2.setRequired(true);
        jLayeredPane1.add(b3r2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 1120, 250, 40));

        b3r3.setAngka(true);
        b3r3.setMaxDigit(31);
        b3r3.setMinDigit(1);
        b3r3.setRequired(true);
        jLayeredPane1.add(b3r3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 1170, 50, 40));

        javax.swing.GroupLayout hal1Listing1Layout = new javax.swing.GroupLayout(hal1Listing1);
        hal1Listing1.setLayout(hal1Listing1Layout);
        hal1Listing1Layout.setHorizontalGroup(
            hal1Listing1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1)
        );
        hal1Listing1Layout.setVerticalGroup(
            hal1Listing1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1)
        );

        add(hal1Listing1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private sp.component.TextField b1r1;
    private sp.component.TextField b1r2;
    private sp.component.TextField b1r3;
    private sp.component.TextField b1r4;
    private sp.component.TextField b1r5;
    private sp.component.TextField b1r6s1;
    private sp.component.TextField b1r6s2;
    private sp.component.TextField b2r1;
    private sp.component.TextField b2r2;
    private sp.component.TextField b2r3s1;
    private sp.component.TextField b2r3s2;
    private sp.component.TextField b2r3s3;
    private sp.component.TextField b2r3s4;
    private sp.component.TextField b3r1;
    private sp.component.TextField b3r2;
    private sp.component.TextField b3r3;
    private sp.imageClass.Hal1Listing hal1Listing1;
    private javax.swing.JLayeredPane jLayeredPane1;
    // End of variables declaration//GEN-END:variables
}
