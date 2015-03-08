/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp.form;

import java.util.ArrayList;
import javax.swing.JLayeredPane;
import sp.component.TextField;
import sp.model.B3;
import sp.model.B4;
import sp.util.FormControl;

/**
 *
 * @author ita
 */
public class Hal2 extends javax.swing.JPanel {

    /**
     * Creates new form Hal2
     */
    protected static int startPos = Hal1.maxPos;
    protected static int maxPos;
    /**
     * Creates new form Hal2
     */
    private ArrayList<TextField> listTextFieldHal2 = new ArrayList<TextField>();

    public Hal2() {
        initComponents();
        addListTextfield();
        setListTextFieldHal2(FormControl.setFixedPos(startPos, getListTextField()));
    }

    public int getMaxPertanyaan() {
        return maxPos;
    }

    public ArrayList<TextField> getListTextField() {
        return listTextFieldHal2;
    }

    public void setFieldHal2(B3 b, B4 c) {
        b3r1.setText(b.getB3r1());
        b3r2.setText(b.getB3r2().getKode());
        b3r3.setText(b.getB3r3());
        b3r4s1.setText(b.getB3r4s1());
        b3r4s2.setText(b.getB3r4s2());
        b3r5s1.setText(b.getB3r5s1());
        b3r5s2.setText(b.getB3r5s2());
        b3r6.setText(b.getB3r6().getKode());
        b3r7.setText(b.getB3r7().getKode());
        b3r8s1.setText(b.getB3r8s1().getKode());
        b3r8s2.setText(b.getB3r8s2().getKode());
        b3r8s3.setText(b.getB3r8s3().getKode());
        b3r9s1d1.setText(b.getB3r9s1d1().getKode());
        b3r9s1d2.setText(b.getB3r9s1d2().getKode());
        b3r9s1d3.setText(b.getB3r9s1d3().getKode());
        b3r9s1d4.setText(b.getB3r9s1d4().getKode());
        b3r9s2.setText(b.getB3r9s2());
        b3r10.setText(b.getB3r10());
        b3r11.setText(b.getB3r11());
        b3r12.setText(b.getB3r12().getKode());
        b3r13.setText(b.getB3r13().getKode());
        b3r14.setText(b.getB3r14().getKode());
        b3r15.setText(b.getB3r15().getKode());
        b3r16.setText(b.getB3r16().getKode());
    }

    private void addListTextfield() {
        getListTextField().add(0, b3r1);
        getListTextField().add(1, b3r2);
        getListTextField().add(2, b3r3);
        getListTextField().add(3, b3r4s1);
        getListTextField().add(4, b3r4s2);
        getListTextField().add(5, b3r5s1);
        getListTextField().add(6, b3r5s2);
        getListTextField().add(7, b3r6);
        getListTextField().add(8, b3r7);
        getListTextField().add(9, b3r8s1);
        getListTextField().add(10, b3r8s2);
        getListTextField().add(11, b3r8s3);
        getListTextField().add(12, b3r9s1d1);
        getListTextField().add(13, b3r9s1d2);
        getListTextField().add(14, b3r9s1d3);
        getListTextField().add(15, b3r9s1d4);
        getListTextField().add(16, b3r9s2);
        getListTextField().add(17, b3r10);
        getListTextField().add(18, b3r11);
        getListTextField().add(19, b3r12);
        getListTextField().add(20, b3r13);
        getListTextField().add(21, b3r14);
        getListTextField().add(22, b3r15);
        getListTextField().add(23, b3r16);
        maxPos = getListTextField().size();
    }

    public ArrayList<TextField> getListTextFieldHal2() {
        return listTextFieldHal2;
    }

    public void setListTextFieldHal2(ArrayList<TextField> listTextFieldHal2) {
        this.listTextFieldHal2 = listTextFieldHal2;
    }

    public static int getStartPos() {
        return startPos;
    }

    public static void setStartPos(int startPos) {
        Hal2.startPos = startPos;
    }

    public static int getMaxPos() {
        return maxPos;
    }

    public static void setMaxPos(int maxPos) {
        Hal2.maxPos = maxPos;
    }

    public TextField getB3r1() {
        return b3r1;
    }

    public void setB3r1(TextField b3r1) {
        this.b3r1 = b3r1;
    }

    public TextField getB3r10() {
        return b3r10;
    }

    public void setB3r10(TextField b3r10) {
        this.b3r10 = b3r10;
    }

    public TextField getB3r11() {
        return b3r11;
    }

    public void setB3r11(TextField b3r11) {
        this.b3r11 = b3r11;
    }

    public TextField getB3r12() {
        return b3r12;
    }

    public void setB3r12(TextField b3r12) {
        this.b3r12 = b3r12;
    }

    public TextField getB3r13() {
        return b3r13;
    }

    public void setB3r13(TextField b3r13) {
        this.b3r13 = b3r13;
    }

    public TextField getB3r14() {
        return b3r14;
    }

    public void setB3r14(TextField b3r14) {
        this.b3r14 = b3r14;
    }

    public TextField getB3r15() {
        return b3r15;
    }

    public void setB3r15(TextField b3r15) {
        this.b3r15 = b3r15;
    }

    public TextField getB3r16() {
        return b3r16;
    }

    public void setB3r16(TextField b3r16) {
        this.b3r16 = b3r16;
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

    public TextField getB3r4s1() {
        return b3r4s1;
    }

    public void setB3r4s1(TextField b3r4s1) {
        this.b3r4s1 = b3r4s1;
    }

    public TextField getB3r4s2() {
        return b3r4s2;
    }

    public void setB3r4s2(TextField b3r4s2) {
        this.b3r4s2 = b3r4s2;
    }

    public TextField getB3r5s1() {
        return b3r5s1;
    }

    public void setB3r5s1(TextField b3r5s1) {
        this.b3r5s1 = b3r5s1;
    }

    public TextField getB3r5s2() {
        return b3r5s2;
    }

    public void setB3r5s2(TextField b3r5s2) {
        this.b3r5s2 = b3r5s2;
    }

    public TextField getB3r6() {
        return b3r6;
    }

    public void setB3r6(TextField b3r6) {
        this.b3r6 = b3r6;
    }

    public TextField getB3r7() {
        return b3r7;
    }

    public void setB3r7(TextField b3r7) {
        this.b3r7 = b3r7;
    }

    public TextField getB3r8s1() {
        return b3r8s1;
    }

    public void setB3r8s1(TextField b3r8s1) {
        this.b3r8s1 = b3r8s1;
    }

    public TextField getB3r8s2() {
        return b3r8s2;
    }

    public void setB3r8s2(TextField b3r8s2) {
        this.b3r8s2 = b3r8s2;
    }

    public TextField getB3r8s3() {
        return b3r8s3;
    }

    public void setB3r8s3(TextField b3r8s3) {
        this.b3r8s3 = b3r8s3;
    }

    public TextField getB3r9s1d1() {
        return b3r9s1d1;
    }

    public void setB3r9s1d1(TextField b3r9s1d1) {
        this.b3r9s1d1 = b3r9s1d1;
    }

    public TextField getB3r9s1d2() {
        return b3r9s1d2;
    }

    public void setB3r9s1d2(TextField b3r9s1d2) {
        this.b3r9s1d2 = b3r9s1d2;
    }

    public TextField getB3r9s1d3() {
        return b3r9s1d3;
    }

    public void setB3r9s1d3(TextField b3r9s1d3) {
        this.b3r9s1d3 = b3r9s1d3;
    }

    public TextField getB3r9s1d4() {
        return b3r9s1d4;
    }

    public void setB3r9s1d4(TextField b3r9s1d4) {
        this.b3r9s1d4 = b3r9s1d4;
    }

    public TextField getB3r9s2() {
        return b3r9s2;
    }

    public void setB3r9s2(TextField b3r9s2) {
        this.b3r9s2 = b3r9s2;
    }

    public sp.imageClass.Hal2 getHal21() {
        return hal21;
    }

    public void setHal21(sp.imageClass.Hal2 hal21) {
        this.hal21 = hal21;
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

        hal21 = new sp.imageClass.Hal2();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        b3r1 = new sp.component.TextField();
        b3r2 = new sp.component.TextField();
        b3r3 = new sp.component.TextField();
        b3r4s1 = new sp.component.TextField();
        b3r4s2 = new sp.component.TextField();
        b3r5s1 = new sp.component.TextField();
        b3r5s2 = new sp.component.TextField();
        b3r6 = new sp.component.TextField();
        b3r7 = new sp.component.TextField();
        b3r8s1 = new sp.component.TextField();
        b3r8s2 = new sp.component.TextField();
        b3r8s3 = new sp.component.TextField();
        b3r9s1d1 = new sp.component.TextField();
        b3r9s1d2 = new sp.component.TextField();
        b3r9s1d3 = new sp.component.TextField();
        b3r9s1d4 = new sp.component.TextField();
        b3r9s2 = new sp.component.TextField();
        b3r10 = new sp.component.TextField();
        b3r11 = new sp.component.TextField();
        b3r12 = new sp.component.TextField();
        b3r13 = new sp.component.TextField();
        b3r14 = new sp.component.TextField();
        b3r15 = new sp.component.TextField();
        b3r16 = new sp.component.TextField();

        setLayout(new java.awt.BorderLayout());

        jLayeredPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        b3r1.setHuruf(true);
        b3r1.setLength(100);
        b3r1.setRequired(true);
        jLayeredPane1.add(b3r1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 310, 30));

        b3r2.setAngka(true);
        b3r2.setMaxDigit(2);
        b3r2.setMinDigit(1);
        b3r2.setPosisi(1);
        b3r2.setRequired(true);
        jLayeredPane1.add(b3r2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, 30, 30));

        b3r3.setAngka(true);
        b3r3.setKhusus(true);
        b3r3.setKhususType('2');
        b3r3.setMaxDigit(64);
        b3r3.setMinDigit(15);
        b3r3.setPosisi(2);
        b3r3.setRequired(true);
        jLayeredPane1.add(b3r3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, 40, 30));

        b3r4s1.setAngka(true);
        b3r4s1.setHuruf(true);
        b3r4s1.setKhusus(true);
        b3r4s1.setKhususType('2');
        b3r4s1.setLength(2);
        b3r4s1.setMaxDigit(94);
        b3r4s1.setMinDigit(11);
        b3r4s1.setPosisi(3);
        b3r4s1.setRequired(true);
        jLayeredPane1.add(b3r4s1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 220, 40, 20));

        b3r4s2.setAngka(true);
        b3r4s2.setLength(2);
        b3r4s2.setMaxDigit(99);
        b3r4s2.setMinDigit(1);
        b3r4s2.setPosisi(4);
        jLayeredPane1.add(b3r4s2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 250, 40, 20));

        b3r5s1.setAngka(true);
        b3r5s1.setHuruf(true);
        b3r5s1.setKhusus(true);
        b3r5s1.setKhususType('2');
        b3r5s1.setLength(2);
        b3r5s1.setMaxDigit(94);
        b3r5s1.setMinDigit(11);
        b3r5s1.setPosisi(5);
        b3r5s1.setRequired(true);
        jLayeredPane1.add(b3r5s1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 290, 40, 20));

        b3r5s2.setAngka(true);
        b3r5s2.setLength(2);
        b3r5s2.setMaxDigit(99);
        b3r5s2.setMinDigit(1);
        b3r5s2.setPosisi(6);
        jLayeredPane1.add(b3r5s2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 320, 40, 20));

        b3r6.setAngka(true);
        b3r6.setMaxDigit(4);
        b3r6.setMinDigit(1);
        b3r6.setPosisi(7);
        b3r6.setRequired(true);
        jLayeredPane1.add(b3r6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 390, 30, 30));

        b3r7.setAngka(true);
        b3r7.setMaxDigit(9);
        b3r7.setPosisi(8);
        b3r7.setRequired(true);
        jLayeredPane1.add(b3r7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 560, 30, 30));

        b3r8s1.setAngka(true);
        b3r8s1.setMaxDigit(2);
        b3r8s1.setMinDigit(1);
        b3r8s1.setPosisi(9);
        b3r8s1.setRequired(true);
        jLayeredPane1.add(b3r8s1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 730, 30, 30));

        b3r8s2.setAngka(true);
        b3r8s2.setMaxDigit(2);
        b3r8s2.setMinDigit(1);
        b3r8s2.setPosisi(10);
        b3r8s2.setRequired(true);
        jLayeredPane1.add(b3r8s2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 760, 30, 30));

        b3r8s3.setAngka(true);
        b3r8s3.setMaxDigit(2);
        b3r8s3.setMinDigit(1);
        b3r8s3.setPosisi(11);
        b3r8s3.setRequired(true);
        jLayeredPane1.add(b3r8s3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 790, 30, 30));

        b3r9s1d1.setAngka(true);
        b3r9s1d1.setMaxDigit(2);
        b3r9s1d1.setMinDigit(1);
        b3r9s1d1.setPosisi(12);
        b3r9s1d1.setRequired(true);
        jLayeredPane1.add(b3r9s1d1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 860, 30, 30));

        b3r9s1d2.setAngka(true);
        b3r9s1d2.setMaxDigit(2);
        b3r9s1d2.setMinDigit(1);
        b3r9s1d2.setPosisi(13);
        b3r9s1d2.setRequired(true);
        jLayeredPane1.add(b3r9s1d2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 900, 30, 30));

        b3r9s1d3.setAngka(true);
        b3r9s1d3.setMaxDigit(2);
        b3r9s1d3.setMinDigit(1);
        b3r9s1d3.setPosisi(14);
        b3r9s1d3.setRequired(true);
        jLayeredPane1.add(b3r9s1d3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 940, 30, 30));

        b3r9s1d4.setAngka(true);
        b3r9s1d4.setMaxDigit(2);
        b3r9s1d4.setMinDigit(1);
        b3r9s1d4.setPosisi(15);
        b3r9s1d4.setRequired(true);
        jLayeredPane1.add(b3r9s1d4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 980, 30, 30));

        b3r9s2.setAngka(true);
        b3r9s2.setMaxDigit(4);
        b3r9s2.setMinDigit(1);
        b3r9s2.setPosisi(16);
        jLayeredPane1.add(b3r9s2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 1110, 30, 30));

        b3r10.setAngka(true);
        b3r10.setMaxDigit(2);
        b3r10.setMinDigit(1);
        b3r10.setPosisi(17);
        jLayeredPane1.add(b3r10, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 1230, 30, 30));

        b3r11.setAngka(true);
        b3r11.setLength(2);
        b3r11.setMaxDigit(10);
        b3r11.setMinDigit(1);
        b3r11.setPosisi(18);
        jLayeredPane1.add(b3r11, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 200, 30, 30));

        b3r12.setAngka(true);
        b3r12.setLength(1);
        b3r12.setMaxDigit(6);
        b3r12.setMinDigit(1);
        b3r12.setPosisi(19);
        jLayeredPane1.add(b3r12, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 430, 30, 30));

        b3r13.setAngka(true);
        b3r13.setMaxDigit(7);
        b3r13.setMinDigit(1);
        b3r13.setPosisi(20);
        b3r13.setRequired(true);
        jLayeredPane1.add(b3r13, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 750, 30, 30));

        b3r14.setAngka(true);
        b3r14.setMaxDigit(7);
        b3r14.setMinDigit(1);
        b3r14.setPosisi(21);
        b3r14.setRequired(true);
        b3r14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3r14ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(b3r14, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 950, 30, 30));

        b3r15.setAngka(true);
        b3r15.setMaxDigit(4);
        b3r15.setMinDigit(1);
        b3r15.setPosisi(22);
        b3r15.setRequired(true);
        jLayeredPane1.add(b3r15, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 1060, 30, 30));

        b3r16.setAngka(true);
        b3r16.setMaxDigit(6);
        b3r16.setMinDigit(1);
        b3r16.setPosisi(23);
        b3r16.setRequired(true);
        jLayeredPane1.add(b3r16, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 1200, 30, 30));

        javax.swing.GroupLayout hal21Layout = new javax.swing.GroupLayout(hal21);
        hal21.setLayout(hal21Layout);
        hal21Layout.setHorizontalGroup(
            hal21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1)
        );
        hal21Layout.setVerticalGroup(
            hal21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1)
        );

        add(hal21, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void b3r14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3r14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b3r14ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private sp.component.TextField b3r1;
    private sp.component.TextField b3r10;
    private sp.component.TextField b3r11;
    private sp.component.TextField b3r12;
    private sp.component.TextField b3r13;
    private sp.component.TextField b3r14;
    private sp.component.TextField b3r15;
    private sp.component.TextField b3r16;
    private sp.component.TextField b3r2;
    private sp.component.TextField b3r3;
    private sp.component.TextField b3r4s1;
    private sp.component.TextField b3r4s2;
    private sp.component.TextField b3r5s1;
    private sp.component.TextField b3r5s2;
    private sp.component.TextField b3r6;
    private sp.component.TextField b3r7;
    private sp.component.TextField b3r8s1;
    private sp.component.TextField b3r8s2;
    private sp.component.TextField b3r8s3;
    private sp.component.TextField b3r9s1d1;
    private sp.component.TextField b3r9s1d2;
    private sp.component.TextField b3r9s1d3;
    private sp.component.TextField b3r9s1d4;
    private sp.component.TextField b3r9s2;
    private sp.imageClass.Hal2 hal21;
    private javax.swing.JLayeredPane jLayeredPane1;
    // End of variables declaration//GEN-END:variables
}
