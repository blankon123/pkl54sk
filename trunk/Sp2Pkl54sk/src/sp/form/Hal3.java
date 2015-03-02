/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp.form;

import java.util.ArrayList;
import javax.swing.JLayeredPane;
import sp.component.TextField;
import sp.model.B4;
import sp.util.FormControl;

/**
 *
 * @author ita
 */
public class Hal3 extends javax.swing.JPanel {

    /**
     * Creates new form Hal3
     */
    private ArrayList<TextField> listTextFieldHal3 = new ArrayList<TextField>();
    protected static int startPos = Hal1.maxPos + Hal2.maxPos;
    protected static int maxPos;

    public Hal3() {
        initComponents();
        addListTextfield();
        setListTextFieldHal3(FormControl.setFixedPos1(startPos, getListTextField()));
    }

    public ArrayList<TextField> getListTextField() {
        return listTextFieldHal3;
    }

    public int getMaxPertanyaan() {
        return maxPos;
    }

    public void setFieldHal3(B4 b) {
        b4ar1.setText(b.getB4ar1().getKode());
        b4ar2.setText(b.getB4ar2().getKode());
        b4ar3.setText(b.getB4ar3().getKode());
        b4ar4.setText(b.getB4ar4().getKode());
        b4ar5.setText(b.getB4ar5().getKode());
        b4ar6.setText(b.getB4ar6().getKode());
        b4ar7.setText(b.getB4ar7().getKode());
        b4ar8.setText(b.getB4ar8().getKode());
        b4ar9.setText(b.getB4ar9().getKode());
        b4ar10.setText(b.getB4ar10().getKode());
        b4ar11.setText(b.getB4ar11().getKode());
        b4ar12.setText(b.getB4ar12().getKode());
        b4ar13.setText(b.getB4ar13().getKode());
        b4ar14.setText(b.getB4ar14().getKode());
        b4ar15.setText(b.getB4ar15().getKode());
        b4ar16.setText(b.getB4ar16().getKode());
        b4ar17.setText(b.getB4ar17().getKode());
        b4ar18.setText(b.getB4ar18().getKode());
        b4ar19.setText(b.getB4ar19().getKode());
        b4ar20.setText(b.getB4ar20().getKode());
        b4ar21.setText(b.getB4ar21().getKode());
        b4ar22.setText(b.getB4ar22().getKode());
        b4ar23.setText(b.getB4ar23().getKode());
        b4ar24.setText(b.getB4ar24().getKode());
        b4ar25.setText(b.getB4ar25().getKode());
        b4ar26.setText(b.getB4ar26().getKode());
        b4ar27.setText(b.getB4ar7().getKode());
    }

    private void addListTextfield() {
        getListTextField().add(0, b4ar1);
        getListTextField().add(1, b4ar2);
        getListTextField().add(2, b4ar3);
        getListTextField().add(3, b4ar4);
        getListTextField().add(4, b4ar5);
        getListTextField().add(5, b4ar6);
        getListTextField().add(6, b4ar7);
        getListTextField().add(7, b4ar8);
        getListTextField().add(8, b4ar9);
        getListTextField().add(9, b4ar10);
        getListTextField().add(10, b4ar11);
        getListTextField().add(11, b4ar12);
        getListTextField().add(12, b4ar13);
        getListTextField().add(13, b4ar14);
        getListTextField().add(14, b4ar15);
        getListTextField().add(15, b4ar16);
        getListTextField().add(16, b4ar17);
        getListTextField().add(17, b4ar18);
        getListTextField().add(18, b4ar19);
        getListTextField().add(19, b4ar20);
        getListTextField().add(20, b4ar21);
        getListTextField().add(21, b4ar22);
        getListTextField().add(22, b4ar23);
        getListTextField().add(23, b4ar24);
        getListTextField().add(24, b4ar25);
        getListTextField().add(25, b4ar26);
        getListTextField().add(26, b4ar27);
        maxPos = getListTextField().size();
    }

    public ArrayList<TextField> getListTextFieldHal3() {
        return listTextFieldHal3;
    }

    public void setListTextFieldHal3(ArrayList<TextField> listTextFieldHal3) {
        this.listTextFieldHal3 = listTextFieldHal3;
    }

    public static int getStartPos() {
        return startPos;
    }

    public static void setStartPos(int startPos) {
        Hal3.startPos = startPos;
    }

    public static int getMaxPos() {
        return maxPos;
    }

    public static void setMaxPos(int maxPos) {
        Hal3.maxPos = maxPos;
    }

    public TextField getB4ar1() {
        return b4ar1;
    }

    public void setB4ar1(TextField b4ar1) {
        this.b4ar1 = b4ar1;
    }

    public TextField getB4ar10() {
        return b4ar10;
    }

    public void setB4ar10(TextField b4ar10) {
        this.b4ar10 = b4ar10;
    }

    public TextField getB4ar11() {
        return b4ar11;
    }

    public void setB4ar11(TextField b4ar11) {
        this.b4ar11 = b4ar11;
    }

    public TextField getB4ar12() {
        return b4ar12;
    }

    public void setB4ar12(TextField b4ar12) {
        this.b4ar12 = b4ar12;
    }

    public TextField getB4ar13() {
        return b4ar13;
    }

    public void setB4ar13(TextField b4ar13) {
        this.b4ar13 = b4ar13;
    }

    public TextField getB4ar14() {
        return b4ar14;
    }

    public void setB4ar14(TextField b4ar14) {
        this.b4ar14 = b4ar14;
    }

    public TextField getB4ar15() {
        return b4ar15;
    }

    public void setB4ar15(TextField b4ar15) {
        this.b4ar15 = b4ar15;
    }

    public TextField getB4ar16() {
        return b4ar16;
    }

    public void setB4ar16(TextField b4ar16) {
        this.b4ar16 = b4ar16;
    }

    public TextField getB4ar17() {
        return b4ar17;
    }

    public void setB4ar17(TextField b4ar17) {
        this.b4ar17 = b4ar17;
    }

    public TextField getB4ar18() {
        return b4ar18;
    }

    public void setB4ar18(TextField b4ar18) {
        this.b4ar18 = b4ar18;
    }

    public TextField getB4ar19() {
        return b4ar19;
    }

    public void setB4ar19(TextField b4ar19) {
        this.b4ar19 = b4ar19;
    }

    public TextField getB4ar2() {
        return b4ar2;
    }

    public void setB4ar2(TextField b4ar2) {
        this.b4ar2 = b4ar2;
    }

    public TextField getB4ar20() {
        return b4ar20;
    }

    public void setB4ar20(TextField b4ar20) {
        this.b4ar20 = b4ar20;
    }

    public TextField getB4ar21() {
        return b4ar21;
    }

    public void setB4ar21(TextField b4ar21) {
        this.b4ar21 = b4ar21;
    }

    public TextField getB4ar22() {
        return b4ar22;
    }

    public void setB4ar22(TextField b4ar22) {
        this.b4ar22 = b4ar22;
    }

    public TextField getB4ar23() {
        return b4ar23;
    }

    public void setB4ar23(TextField b4ar23) {
        this.b4ar23 = b4ar23;
    }

    public TextField getB4ar24() {
        return b4ar24;
    }

    public void setB4ar24(TextField b4ar24) {
        this.b4ar24 = b4ar24;
    }

    public TextField getB4ar25() {
        return b4ar25;
    }

    public void setB4ar25(TextField b4ar25) {
        this.b4ar25 = b4ar25;
    }

    public TextField getB4ar26() {
        return b4ar26;
    }

    public void setB4ar26(TextField b4ar26) {
        this.b4ar26 = b4ar26;
    }

    public TextField getB4ar27() {
        return b4ar27;
    }

    public void setB4ar27(TextField b4ar27) {
        this.b4ar27 = b4ar27;
    }

    public TextField getB4ar3() {
        return b4ar3;
    }

    public void setB4ar3(TextField b4ar3) {
        this.b4ar3 = b4ar3;
    }

    public TextField getB4ar4() {
        return b4ar4;
    }

    public void setB4ar4(TextField b4ar4) {
        this.b4ar4 = b4ar4;
    }

    public TextField getB4ar5() {
        return b4ar5;
    }

    public void setB4ar5(TextField b4ar5) {
        this.b4ar5 = b4ar5;
    }

    public TextField getB4ar6() {
        return b4ar6;
    }

    public void setB4ar6(TextField b4ar6) {
        this.b4ar6 = b4ar6;
    }

    public TextField getB4ar7() {
        return b4ar7;
    }

    public void setB4ar7(TextField b4ar7) {
        this.b4ar7 = b4ar7;
    }

    public TextField getB4ar8() {
        return b4ar8;
    }

    public void setB4ar8(TextField b4ar8) {
        this.b4ar8 = b4ar8;
    }

    public TextField getB4ar9() {
        return b4ar9;
    }

    public void setB4ar9(TextField b4ar9) {
        this.b4ar9 = b4ar9;
    }

    

    public sp.imageClass.Hal3 getHal31() {
        return hal31;
    }

    public void setHal31(sp.imageClass.Hal3 hal31) {
        this.hal31 = hal31;
    }

    public JLayeredPane getjLayeredPane2() {
        return jLayeredPane2;
    }

    public void setjLayeredPane2(JLayeredPane jLayeredPane2) {
        this.jLayeredPane2 = jLayeredPane2;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        hal31 = new sp.imageClass.Hal3();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        b4ar1 = new sp.component.TextField();
        b4ar2 = new sp.component.TextField();
        b4ar3 = new sp.component.TextField();
        b4ar4 = new sp.component.TextField();
        b4ar5 = new sp.component.TextField();
        b4ar6 = new sp.component.TextField();
        b4ar7 = new sp.component.TextField();
        b4ar8 = new sp.component.TextField();
        b4ar9 = new sp.component.TextField();
        b4ar10 = new sp.component.TextField();
        b4ar11 = new sp.component.TextField();
        b4ar12 = new sp.component.TextField();
        b4ar13 = new sp.component.TextField();
        b4ar14 = new sp.component.TextField();
        b4ar15 = new sp.component.TextField();
        b4ar16 = new sp.component.TextField();
        b4ar17 = new sp.component.TextField();
        b4ar18 = new sp.component.TextField();
        b4ar19 = new sp.component.TextField();
        b4ar20 = new sp.component.TextField();
        b4ar21 = new sp.component.TextField();
        b4ar22 = new sp.component.TextField();
        b4ar23 = new sp.component.TextField();
        b4ar24 = new sp.component.TextField();
        b4ar25 = new sp.component.TextField();
        b4ar26 = new sp.component.TextField();
        b4ar27 = new sp.component.TextField();

        setLayout(new java.awt.BorderLayout());

        jLayeredPane2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        b4ar1.setBackground(new java.awt.Color(217, 217, 217));
        b4ar1.setAngka(true);
        b4ar1.setMaxDigit(4);
        b4ar1.setRequired(true);
        jLayeredPane2.add(b4ar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 130, 30, -1));

        b4ar2.setAngka(true);
        b4ar2.setMaxDigit(4);
        b4ar2.setPosisi(1);
        b4ar2.setRequired(true);
        jLayeredPane2.add(b4ar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 160, 30, -1));

        b4ar3.setBackground(new java.awt.Color(217, 217, 217));
        b4ar3.setAngka(true);
        b4ar3.setMaxDigit(4);
        b4ar3.setPosisi(2);
        b4ar3.setRequired(true);
        jLayeredPane2.add(b4ar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 190, 30, -1));

        b4ar4.setAngka(true);
        b4ar4.setMaxDigit(4);
        b4ar4.setPosisi(3);
        b4ar4.setRequired(true);
        jLayeredPane2.add(b4ar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 220, 30, -1));

        b4ar5.setBackground(new java.awt.Color(217, 217, 217));
        b4ar5.setAngka(true);
        b4ar5.setMaxDigit(4);
        b4ar5.setPosisi(4);
        b4ar5.setRequired(true);
        jLayeredPane2.add(b4ar5, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 260, 30, -1));

        b4ar6.setAngka(true);
        b4ar6.setMaxDigit(4);
        b4ar6.setPosisi(5);
        b4ar6.setRequired(true);
        jLayeredPane2.add(b4ar6, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 290, 30, -1));

        b4ar7.setBackground(new java.awt.Color(217, 217, 217));
        b4ar7.setAngka(true);
        b4ar7.setMaxDigit(4);
        b4ar7.setPosisi(6);
        b4ar7.setRequired(true);
        jLayeredPane2.add(b4ar7, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 320, 30, -1));

        b4ar8.setAngka(true);
        b4ar8.setMaxDigit(4);
        b4ar8.setPosisi(7);
        b4ar8.setRequired(true);
        jLayeredPane2.add(b4ar8, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 340, 30, -1));

        b4ar9.setBackground(new java.awt.Color(217, 217, 217));
        b4ar9.setAngka(true);
        b4ar9.setMaxDigit(4);
        b4ar9.setPosisi(8);
        b4ar9.setRequired(true);
        jLayeredPane2.add(b4ar9, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 370, 30, -1));

        b4ar10.setAngka(true);
        b4ar10.setMaxDigit(4);
        b4ar10.setPosisi(9);
        b4ar10.setRequired(true);
        jLayeredPane2.add(b4ar10, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 400, 30, -1));

        b4ar11.setBackground(new java.awt.Color(217, 217, 217));
        b4ar11.setAngka(true);
        b4ar11.setMaxDigit(4);
        b4ar11.setPosisi(10);
        b4ar11.setRequired(true);
        jLayeredPane2.add(b4ar11, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 430, 30, -1));

        b4ar12.setAngka(true);
        b4ar12.setMaxDigit(4);
        b4ar12.setPosisi(11);
        b4ar12.setRequired(true);
        b4ar12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ar12ActionPerformed(evt);
            }
        });
        jLayeredPane2.add(b4ar12, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 470, 30, -1));

        b4ar13.setBackground(new java.awt.Color(217, 217, 217));
        b4ar13.setAngka(true);
        b4ar13.setMaxDigit(4);
        b4ar13.setPosisi(12);
        b4ar13.setRequired(true);
        jLayeredPane2.add(b4ar13, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 500, 30, -1));

        b4ar14.setAngka(true);
        b4ar14.setMaxDigit(4);
        b4ar14.setPosisi(13);
        b4ar14.setRequired(true);
        jLayeredPane2.add(b4ar14, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 530, 30, -1));

        b4ar15.setBackground(new java.awt.Color(217, 217, 217));
        b4ar15.setAngka(true);
        b4ar15.setMaxDigit(4);
        b4ar15.setPosisi(14);
        b4ar15.setRequired(true);
        jLayeredPane2.add(b4ar15, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 550, 30, -1));

        b4ar16.setAngka(true);
        b4ar16.setMaxDigit(4);
        b4ar16.setPosisi(15);
        b4ar16.setRequired(true);
        jLayeredPane2.add(b4ar16, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 580, 30, -1));

        b4ar17.setBackground(new java.awt.Color(217, 217, 217));
        b4ar17.setAngka(true);
        b4ar17.setMaxDigit(4);
        b4ar17.setPosisi(16);
        b4ar17.setRequired(true);
        jLayeredPane2.add(b4ar17, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 620, 30, -1));

        b4ar18.setAngka(true);
        b4ar18.setMaxDigit(4);
        b4ar18.setPosisi(17);
        b4ar18.setRequired(true);
        jLayeredPane2.add(b4ar18, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 650, 30, -1));

        b4ar19.setBackground(new java.awt.Color(217, 217, 217));
        b4ar19.setAngka(true);
        b4ar19.setMaxDigit(4);
        b4ar19.setPosisi(18);
        b4ar19.setRequired(true);
        jLayeredPane2.add(b4ar19, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 680, 30, -1));

        b4ar20.setAngka(true);
        b4ar20.setMaxDigit(4);
        b4ar20.setPosisi(19);
        b4ar20.setRequired(true);
        jLayeredPane2.add(b4ar20, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 720, 30, -1));

        b4ar21.setBackground(new java.awt.Color(217, 217, 217));
        b4ar21.setAngka(true);
        b4ar21.setMaxDigit(4);
        b4ar21.setPosisi(21);
        b4ar21.setRequired(true);
        jLayeredPane2.add(b4ar21, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 750, 30, -1));

        b4ar22.setAngka(true);
        b4ar22.setMaxDigit(4);
        b4ar22.setPosisi(21);
        b4ar22.setRequired(true);
        jLayeredPane2.add(b4ar22, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 780, 30, -1));

        b4ar23.setBackground(new java.awt.Color(217, 217, 217));
        b4ar23.setAngka(true);
        b4ar23.setMaxDigit(4);
        b4ar23.setPosisi(22);
        b4ar23.setRequired(true);
        jLayeredPane2.add(b4ar23, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 830, 30, -1));

        b4ar24.setAngka(true);
        b4ar24.setMaxDigit(4);
        b4ar24.setPosisi(23);
        b4ar24.setRequired(true);
        jLayeredPane2.add(b4ar24, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 860, 30, -1));

        b4ar25.setBackground(new java.awt.Color(217, 217, 217));
        b4ar25.setAngka(true);
        b4ar25.setMaxDigit(4);
        b4ar25.setPosisi(24);
        b4ar25.setRequired(true);
        jLayeredPane2.add(b4ar25, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 880, 30, -1));

        b4ar26.setAngka(true);
        b4ar26.setMaxDigit(4);
        b4ar26.setPosisi(25);
        b4ar26.setRequired(true);
        jLayeredPane2.add(b4ar26, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 920, 30, -1));

        b4ar27.setBackground(new java.awt.Color(217, 217, 217));
        b4ar27.setAngka(true);
        b4ar27.setMaxDigit(4);
        b4ar27.setPosisi(26);
        b4ar27.setRequired(true);
        jLayeredPane2.add(b4ar27, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 960, 30, -1));

        javax.swing.GroupLayout hal31Layout = new javax.swing.GroupLayout(hal31);
        hal31.setLayout(hal31Layout);
        hal31Layout.setHorizontalGroup(
            hal31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane2)
        );
        hal31Layout.setVerticalGroup(
            hal31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 994, Short.MAX_VALUE)
        );

        add(hal31, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void b4ar12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ar12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b4ar12ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private sp.component.TextField b4ar1;
    private sp.component.TextField b4ar10;
    private sp.component.TextField b4ar11;
    private sp.component.TextField b4ar12;
    private sp.component.TextField b4ar13;
    private sp.component.TextField b4ar14;
    private sp.component.TextField b4ar15;
    private sp.component.TextField b4ar16;
    private sp.component.TextField b4ar17;
    private sp.component.TextField b4ar18;
    private sp.component.TextField b4ar19;
    private sp.component.TextField b4ar2;
    private sp.component.TextField b4ar20;
    private sp.component.TextField b4ar21;
    private sp.component.TextField b4ar22;
    private sp.component.TextField b4ar23;
    private sp.component.TextField b4ar24;
    private sp.component.TextField b4ar25;
    private sp.component.TextField b4ar26;
    private sp.component.TextField b4ar27;
    private sp.component.TextField b4ar3;
    private sp.component.TextField b4ar4;
    private sp.component.TextField b4ar5;
    private sp.component.TextField b4ar6;
    private sp.component.TextField b4ar7;
    private sp.component.TextField b4ar8;
    private sp.component.TextField b4ar9;
    private sp.imageClass.Hal3 hal31;
    private javax.swing.JLayeredPane jLayeredPane2;
    // End of variables declaration//GEN-END:variables
}
