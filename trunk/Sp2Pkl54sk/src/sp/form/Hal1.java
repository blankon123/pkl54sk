/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sp.form;

import java.util.ArrayList;
import javax.swing.JLayeredPane;
import sp.component.TextField;
import sp.model.B1;
import sp.model.B2;
import sp.util.FormControl;

/**
 *
 * @author ita
 */
public class Hal1 extends javax.swing.JPanel {

    /**
     * Creates new form Hal1
     */
    private ArrayList<TextField> listTextFieldHal1 = new ArrayList<TextField>();
    protected static int startPos=0;
    protected static int maxPos;
    
    public Hal1() {
        initComponents();
        addListTextfield();
        setListTextFieldHal1(FormControl.setFixedPos(startPos,getListTextField()));
    }
    
    public ArrayList<TextField> getListTextField() {
        return listTextFieldHal1;
    }
    
    public void setFieldHal1(B1 data1, B2 data2) {
        b1r1.setText(data1.getB1r1().getKode());
        b1r2.setText(data1.getB1r2());
        b1r3.setText(data1.getB1r3());
        b1r4.setText(data1.getB1r4().getKode());
        b1r5.setText(data1.getB1r5());
        b1r6.setText(data1.getB1r6());
        b1r7.setText(data1.getB1r7());
        b1r8.setText(data1.getB1r8());
        b1r9.setText(data1.getB1r9().getKode());
        b1r10.setText(data1.getB1r10());
        b2r1s1.setText(data2.getB2r1s1());
        b2r1s2.setText(data2.getB2r1s2());
        b2r2s1.setText(data2.getB2r2s1());
        b2r2s2.setText(data2.getB2r2s2());
        b2r3s1d1.setText(data2.getB2r3s1d1());
        b2r3s1d2.setText(data2.getB2r3s1d2());
        b2r3s2d1.setText(data2.getB2r3s2d1());
        b2r3s2d2.setText(data2.getB2r3s2d2());
    }
    
    private void addListTextfield() {
        getListTextField().add(0, b1r1);
        getListTextField().add(1, b1r2);
        getListTextField().add(2, b1r3);
        getListTextField().add(3, b1r4);
        getListTextField().add(4, b1r5);
        getListTextField().add(5, b1r6);
        getListTextField().add(6, b1r7);
        getListTextField().add(7, b1r8);
        getListTextField().add(8, b1r9);
        getListTextField().add(9, b1r10);
        getListTextField().add(10, b2r1s1);
        getListTextField().add(11, b2r1s2);
        getListTextField().add(12, b2r2s1);
        getListTextField().add(13, b2r2s2);
        getListTextField().add(14, b2r3s1d1);
        getListTextField().add(15, b2r3s1d2);
        getListTextField().add(16, b2r3s2d1);
        getListTextField().add(17, b2r3s2d2);
        maxPos = getListTextField().size();
    }
    
    public int getMaxPertanyaan() {
        return maxPos;
    }

    public ArrayList<TextField> getListTextFieldHal1() {
        return listTextFieldHal1;
    }

    public void setListTextFieldHal1(ArrayList<TextField> listTextFieldHal1) {
        this.listTextFieldHal1 = listTextFieldHal1;
    }

    public static int getStartPos() {
        return startPos;
    }

    public static void setStartPos(int startPos) {
        Hal1.startPos = startPos;
    }

    public static int getMaxPos() {
        return maxPos;
    }

    public static void setMaxPos(int maxPos) {
        Hal1.maxPos = maxPos;
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

    public TextField getB1r6() {
        return b1r6;
    }

    public void setB1r6(TextField b1r6) {
        this.b1r6 = b1r6;
    }

    public TextField getB1r7() {
        return b1r7;
    }

    public void setB1r7(TextField b1r7) {
        this.b1r7 = b1r7;
    }

    public TextField getB1r8() {
        return b1r8;
    }

    public void setB1r8(TextField b1r8) {
        this.b1r8 = b1r8;
    }

    public TextField getB1r9() {
        return b1r9;
    }

    public void setB1r9(TextField b1r9) {
        this.b1r9 = b1r9;
    }

    public TextField getB1r10() {
        return b1r10;
    }

    public void setB1r10(TextField b1r10) {
        this.b1r10 = b1r10;
    }
    
    public TextField getB2r1s1() {
        return b2r1s1;
    }

    public void setB2r1s1(TextField b2r1s1) {
        this.b2r1s1 = b2r1s1;
    }

    public TextField getB2r1s2() {
        return b2r1s2;
    }

    public void setB2r1s2(TextField b2r1s2) {
        this.b2r1s2 = b2r1s2;
    }

    public TextField getB2r2s1() {
        return b2r2s1;
    }

    public void setB2r2s1(TextField b2r2s1) {
        this.b2r2s1 = b2r2s1;
    }

    public TextField getB2r2s2() {
        return b2r2s1;
    }

    public void setB2r2s2(TextField b2r2s2) {
        this.b2r2s1 = b2r2s2;
    }

    public TextField getB2r3s1d1() {
        return b2r3s1d1;
    }

    public void setB2r3s1d1(TextField b2r3s1d1) {
        this.b2r3s1d1 = b2r3s1d1;
    }

    public TextField getB2r3s1d2() {
        return b2r3s1d2;
    }

    public void setB2r3s1d2(TextField b2r3s1d2) {
        this.b2r3s1d2 = b2r3s1d2;
    }

    public TextField getB2r3s2d1() {
        return b2r3s2d1;
    }

    public void setB2r3s2d1(TextField b2r3s2d1) {
        this.b2r3s2d1 = b2r3s2d1;
    }

    public TextField getB2r3s2d2() {
        return b2r3s2d2;
    }

    public void setB2r3s2d2(TextField b2r3s2d2) {
        this.b2r3s2d2 = b2r3s2d2;
    }

    public sp.imageClass.Hal1 getHal11() {
        return hal11;
    }

    public void setHal11(sp.imageClass.Hal1 hal11) {
        this.hal11 = hal11;
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

        hal11 = new sp.imageClass.Hal1();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        b1r1 = new sp.component.TextField();
        b1r2 = new sp.component.TextField();
        b1r3 = new sp.component.TextField();
        b1r4 = new sp.component.TextField();
        b1r5 = new sp.component.TextField();
        b1r6 = new sp.component.TextField();
        b1r7 = new sp.component.TextField();
        b1r8 = new sp.component.TextField();
        b1r9 = new sp.component.TextField();
        b1r10 = new sp.component.TextField();
        b2r1s1 = new sp.component.TextField();
        b2r1s2 = new sp.component.TextField();
        b2r2s1 = new sp.component.TextField();
        b2r2s2 = new sp.component.TextField();
        b2r3s1d1 = new sp.component.TextField();
        b2r3s1d2 = new sp.component.TextField();
        b2r3s2d1 = new sp.component.TextField();
        b2r3s2d2 = new sp.component.TextField();

        setLayout(new java.awt.BorderLayout());

        jLayeredPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        b1r1.setAngka(true);
        b1r1.setKhusus(true);
        b1r1.setKhususType('1');
        b1r1.setRequired(true);
        jLayeredPane1.add(b1r1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 240, 50, 30));

        b1r2.setAngka(true);
        b1r2.setMaxDigit(999);
        b1r2.setMinDigit(1);
        b1r2.setPosisi(1);
        b1r2.setRequired(true);
        jLayeredPane1.add(b1r2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 280, 70, 30));

        b1r3.setAngka(true);
        b1r3.setHuruf(true);
        b1r3.setLength(3);
        b1r3.setMaxDigit(999);
        b1r3.setMinDigit(1);
        b1r3.setPosisi(2);
        b1r3.setRequired(true);
        jLayeredPane1.add(b1r3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 310, 70, 30));

        b1r4.setAngka(true);
        b1r4.setMaxDigit(2);
        b1r4.setMinDigit(1);
        b1r4.setPosisi(3);
        b1r4.setRequired(true);
        jLayeredPane1.add(b1r4, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 350, 30, 30));

        b1r5.setAngka(true);
        b1r5.setMaxDigit(999);
        b1r5.setMinDigit(1);
        b1r5.setPosisi(4);
        b1r5.setRequired(true);
        jLayeredPane1.add(b1r5, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 380, 70, 30));

        b1r6.setAngka(true);
        b1r6.setMaxDigit(99);
        b1r6.setMinDigit(1);
        b1r6.setPosisi(5);
        b1r6.setRequired(true);
        jLayeredPane1.add(b1r6, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 410, 50, 30));

        b1r7.setHuruf(true);
        b1r7.setLength(100);
        b1r7.setPosisi(6);
        b1r7.setRequired(true);
        jLayeredPane1.add(b1r7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 450, 380, 30));

        b1r8.setAngka(true);
        b1r8.setHuruf(true);
        b1r8.setLength(200);
        b1r8.setPosisi(7);
        b1r8.setRequired(true);
        jLayeredPane1.add(b1r8, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 480, 380, 50));

        b1r9.setAngka(true);
        b1r9.setMaxDigit(3);
        b1r9.setMinDigit(1);
        b1r9.setPosisi(8);
        b1r9.setRequired(true);
        jLayeredPane1.add(b1r9, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 560, 30, 30));

        b1r10.setAngka(true);
        b1r10.setMaxDigit(99);
        b1r10.setMinDigit(1);
        b1r10.setPosisi(9);
        b1r10.setRequired(true);
        jLayeredPane1.add(b1r10, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 620, 50, 30));

        b2r1s1.setHuruf(true);
        b2r1s1.setLength(100);
        b2r1s1.setPosisi(10);
        b2r1s1.setRequired(true);
        jLayeredPane1.add(b2r1s1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 760, 220, 30));

        b2r1s2.setHuruf(true);
        b2r1s2.setLength(100);
        b2r1s2.setPosisi(11);
        b2r1s2.setRequired(true);
        jLayeredPane1.add(b2r1s2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 760, 220, 30));

        b2r2s1.setAngka(true);
        b2r2s1.setMaxDigit(129999);
        b2r2s1.setMinDigit(110000);
        b2r2s1.setPosisi(12);
        b2r2s1.setRequired(true);
        jLayeredPane1.add(b2r2s1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 790, 150, 30));

        b2r2s2.setAngka(true);
        b2r2s2.setMaxDigit(129999);
        b2r2s2.setMinDigit(110000);
        b2r2s2.setPosisi(13);
        jLayeredPane1.add(b2r2s2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 790, 150, 30));

        b2r3s1d1.setAngka(true);
        b2r3s1d1.setMaxDigit(31);
        b2r3s1d1.setMinDigit(1);
        b2r3s1d1.setPosisi(14);
        b2r3s1d1.setRequired(true);
        b2r3s1d1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2r3s1d1ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(b2r3s1d1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 830, 50, 30));

        b2r3s1d2.setAngka(true);
        b2r3s1d2.setMaxDigit(12);
        b2r3s1d2.setMinDigit(3);
        b2r3s1d2.setPosisi(15);
        b2r3s1d2.setRequired(true);
        jLayeredPane1.add(b2r3s1d2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 830, 50, 30));

        b2r3s2d1.setAngka(true);
        b2r3s2d1.setMaxDigit(31);
        b2r3s2d1.setMinDigit(1);
        b2r3s2d1.setPosisi(16);
        b2r3s2d1.setRequired(true);
        jLayeredPane1.add(b2r3s2d1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 830, 50, 30));

        b2r3s2d2.setAngka(true);
        b2r3s2d2.setMaxDigit(12);
        b2r3s2d2.setMinDigit(3);
        b2r3s2d2.setPosisi(17);
        b2r3s2d2.setRequired(true);
        jLayeredPane1.add(b2r3s2d2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 830, 50, 30));

        javax.swing.GroupLayout hal11Layout = new javax.swing.GroupLayout(hal11);
        hal11.setLayout(hal11Layout);
        hal11Layout.setHorizontalGroup(
            hal11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        hal11Layout.setVerticalGroup(
            hal11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 929, Short.MAX_VALUE)
        );

        add(hal11, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void b2r3s1d1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2r3s1d1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b2r3s1d1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private sp.component.TextField b1r1;
    private sp.component.TextField b1r10;
    private sp.component.TextField b1r2;
    private sp.component.TextField b1r3;
    private sp.component.TextField b1r4;
    private sp.component.TextField b1r5;
    private sp.component.TextField b1r6;
    private sp.component.TextField b1r7;
    private sp.component.TextField b1r8;
    private sp.component.TextField b1r9;
    private sp.component.TextField b2r1s1;
    private sp.component.TextField b2r1s2;
    private sp.component.TextField b2r2s1;
    private sp.component.TextField b2r2s2;
    private sp.component.TextField b2r3s1d1;
    private sp.component.TextField b2r3s1d2;
    private sp.component.TextField b2r3s2d1;
    private sp.component.TextField b2r3s2d2;
    private sp.imageClass.Hal1 hal11;
    private javax.swing.JLayeredPane jLayeredPane1;
    // End of variables declaration//GEN-END:variables
}
