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
 * @author Rohma Hidayati [12.7363]
 */
public class Hal5 extends javax.swing.JPanel {

    /**
     * Creates new form Hal5
     */
    protected static int startPos = Hal1.maxPos + Hal2.maxPos + Hal3.maxPos + Hal4.maxPos;
    protected static int maxPos;

    private ArrayList<TextField> listTextFieldHal5 = new ArrayList<TextField>();

    public Hal5() {
        initComponents();
        addListTextfield();
        setListTextFieldHal5(FormControl.setFixedPos1(startPos, getListTextField()));
    }

    public ArrayList<TextField> getListTextField() {
        return listTextFieldHal5;
    }

    public int getMaxPertanyaan() {
        return maxPos;
    }

    public void setFieldHal5(B4 b) {
        b4br30.setText(b.getB4br30());
        b4br31.setText(b.getB4br31());
        b4br32.setText(b.getB4br32());
        b4br33.setText(b.getB4br33());
        b4br34.setText(b.getB4br34());
        b4br35.setText(b.getB4br35());
        b4br36.setText(b.getB4br36());
        b4br37.setText(b.getB4br37());
        b4br38.setText(b.getB4br8());
        b4br39.setText(b.getB4br39());
        b4br40.setText(b.getB4br40());
        b4br41.setText(b.getB4br41());
        b4br42.setText(b.getB4br42());
        b4br43.setText(b.getB4br43());
        b4br44.setText(b.getB4br44());
        b4br45.setText(b.getB4br45());
        b4br46.setText(b.getB4br46());
        b4br47.setText(b.getB4br47());
        b4br48.setText(b.getB4br48());
        b4br49.setText(b.getB4br49());
    }

    private void addListTextfield() {
        getListTextField().add(0, b4br30);
        getListTextField().add(1, b4br31);
        getListTextField().add(2, b4br32);
        getListTextField().add(3, b4br33);
        getListTextField().add(4, b4br34);
        getListTextField().add(5, b4br35);
        getListTextField().add(6, b4br36);
        getListTextField().add(7, b4br37);
        getListTextField().add(8, b4br38);
        getListTextField().add(9, b4br39);
        getListTextField().add(10, b4br40);
        getListTextField().add(11, b4br41);
        getListTextField().add(12, b4br42);
        getListTextField().add(13, b4br43);
        getListTextField().add(14, b4br44);
        getListTextField().add(15, b4br45);
        getListTextField().add(16, b4br46);
        getListTextField().add(17, b4br47);
        getListTextField().add(18, b4br48);
        getListTextField().add(19, b4br49);
        maxPos = getListTextField().size();
    }

    public static int getStartPos() {
        return startPos;
    }

    public static void setStartPos(int startPos) {
        Hal5.startPos = startPos;
    }

    public static int getMaxPos() {
        return maxPos;
    }

    public static void setMaxPos(int maxPos) {
        Hal5.maxPos = maxPos;
    }

    public ArrayList<TextField> getListTextFieldHal5() {
        return listTextFieldHal5;
    }

    public void setListTextFieldHal5(ArrayList<TextField> listTextFieldHal5) {
        this.listTextFieldHal5 = listTextFieldHal5;
    }

    public TextField getB4br30() {
        return b4br30;
    }

    public void setB4br30(TextField b4br30) {
        this.b4br30 = b4br30;
    }

    public TextField getB4br31() {
        return b4br31;
    }

    public void setB4br31(TextField b4br31) {
        this.b4br31 = b4br31;
    }

    public TextField getB4br32() {
        return b4br32;
    }

    public void setB4br32(TextField b4br32) {
        this.b4br32 = b4br32;
    }

    public TextField getB4br33() {
        return b4br33;
    }

    public void setB4br33(TextField b4br33) {
        this.b4br33 = b4br33;
    }

    public TextField getB4br34() {
        return b4br34;
    }

    public void setB4br34(TextField b4br34) {
        this.b4br34 = b4br34;
    }

    public TextField getB4br35() {
        return b4br35;
    }

    public void setB4br35(TextField b4br35) {
        this.b4br35 = b4br35;
    }

    public TextField getB4br36() {
        return b4br36;
    }

    public void setB4br36(TextField b4br36) {
        this.b4br36 = b4br36;
    }

    public TextField getB4br37() {
        return b4br37;
    }

    public void setB4br37(TextField b4br37) {
        this.b4br37 = b4br37;
    }

    public TextField getB4br38() {
        return b4br38;
    }

    public void setB4br38(TextField b4br38) {
        this.b4br38 = b4br38;
    }

    public TextField getB4br39() {
        return b4br39;
    }

    public void setB4br39(TextField b4br39) {
        this.b4br39 = b4br39;
    }

    public TextField getB4br40() {
        return b4br40;
    }

    public void setB4br40(TextField b4br40) {
        this.b4br40 = b4br40;
    }

    public TextField getB4br41() {
        return b4br41;
    }

    public void setB4br41(TextField b4br41) {
        this.b4br41 = b4br41;
    }

    public TextField getB4br42() {
        return b4br42;
    }

    public void setB4br42(TextField b4br42) {
        this.b4br42 = b4br42;
    }

    public TextField getB4br43() {
        return b4br43;
    }

    public void setB4br43(TextField b4br43) {
        this.b4br43 = b4br43;
    }

    public TextField getB4br44() {
        return b4br44;
    }

    public void setB4br44(TextField b4br44) {
        this.b4br44 = b4br44;
    }

    public TextField getB4br45() {
        return b4br45;
    }

    public void setB4br45(TextField b4br45) {
        this.b4br45 = b4br45;
    }

    public TextField getB4br46() {
        return b4br46;
    }

    public void setB4br46(TextField b4br46) {
        this.b4br46 = b4br46;
    }

    public TextField getB4br47() {
        return b4br47;
    }

    public void setB4br47(TextField b4br47) {
        this.b4br47 = b4br47;
    }

    public TextField getB4br48() {
        return b4br48;
    }

    public void setB4br48(TextField b4br48) {
        this.b4br48 = b4br48;
    }

    public TextField getB4br49() {
        return b4br49;
    }

    public void setB4br49(TextField b4br49) {
        this.b4br49 = b4br49;
    }

    public sp.imageClass.Hal5 getHal51() {
        return hal51;
    }

    public void setHal51(sp.imageClass.Hal5 hal51) {
        this.hal51 = hal51;
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

        hal51 = new sp.imageClass.Hal5();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        b4br30 = new sp.component.TextField();
        b4br31 = new sp.component.TextField();
        b4br32 = new sp.component.TextField();
        b4br33 = new sp.component.TextField();
        b4br34 = new sp.component.TextField();
        b4br35 = new sp.component.TextField();
        b4br36 = new sp.component.TextField();
        b4br37 = new sp.component.TextField();
        b4br38 = new sp.component.TextField();
        b4br39 = new sp.component.TextField();
        b4br40 = new sp.component.TextField();
        b4br41 = new sp.component.TextField();
        b4br42 = new sp.component.TextField();
        b4br43 = new sp.component.TextField();
        b4br44 = new sp.component.TextField();
        b4br45 = new sp.component.TextField();
        b4br46 = new sp.component.TextField();
        b4br47 = new sp.component.TextField();
        b4br48 = new sp.component.TextField();
        b4br49 = new sp.component.TextField();

        setLayout(new java.awt.BorderLayout());

        jLayeredPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        b4br30.setBackground(new java.awt.Color(217, 217, 217));
        b4br30.setAngka(true);
        b4br30.setMaxDigit(10);
        b4br30.setRequired(true);
        jLayeredPane1.add(b4br30, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 230, 40, 30));

        b4br31.setAngka(true);
        b4br31.setMaxDigit(10);
        b4br31.setRequired(true);
        jLayeredPane1.add(b4br31, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 270, 40, 30));

        b4br32.setBackground(new java.awt.Color(217, 217, 217));
        b4br32.setAngka(true);
        b4br32.setMaxDigit(10);
        b4br32.setRequired(true);
        jLayeredPane1.add(b4br32, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 300, 40, 30));

        b4br33.setAngka(true);
        b4br33.setMaxDigit(10);
        b4br33.setRequired(true);
        jLayeredPane1.add(b4br33, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 340, 40, 30));

        b4br34.setBackground(new java.awt.Color(217, 217, 217));
        b4br34.setAngka(true);
        b4br34.setMaxDigit(10);
        b4br34.setRequired(true);
        jLayeredPane1.add(b4br34, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 380, 40, 30));

        b4br35.setAngka(true);
        b4br35.setMaxDigit(10);
        b4br35.setRequired(true);
        jLayeredPane1.add(b4br35, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 420, 40, 30));

        b4br36.setBackground(new java.awt.Color(217, 217, 217));
        b4br36.setAngka(true);
        b4br36.setMaxDigit(10);
        b4br36.setRequired(true);
        jLayeredPane1.add(b4br36, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 450, 40, 30));

        b4br37.setAngka(true);
        b4br37.setMaxDigit(10);
        b4br37.setRequired(true);
        jLayeredPane1.add(b4br37, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 490, 40, 30));

        b4br38.setBackground(new java.awt.Color(217, 217, 217));
        b4br38.setAngka(true);
        b4br38.setMaxDigit(10);
        b4br38.setRequired(true);
        jLayeredPane1.add(b4br38, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 530, 40, 30));

        b4br39.setAngka(true);
        b4br39.setMaxDigit(10);
        b4br39.setRequired(true);
        jLayeredPane1.add(b4br39, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 570, 40, 30));

        b4br40.setBackground(new java.awt.Color(217, 217, 217));
        b4br40.setAngka(true);
        b4br40.setMaxDigit(10);
        b4br40.setRequired(true);
        jLayeredPane1.add(b4br40, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 610, 40, 30));

        b4br41.setAngka(true);
        b4br41.setMaxDigit(10);
        b4br41.setRequired(true);
        jLayeredPane1.add(b4br41, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 660, 40, 30));

        b4br42.setBackground(new java.awt.Color(217, 217, 217));
        b4br42.setAngka(true);
        b4br42.setMaxDigit(10);
        b4br42.setRequired(true);
        jLayeredPane1.add(b4br42, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 700, 40, 30));

        b4br43.setAngka(true);
        b4br43.setMaxDigit(10);
        b4br43.setRequired(true);
        jLayeredPane1.add(b4br43, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 730, 40, 30));

        b4br44.setBackground(new java.awt.Color(217, 217, 217));
        b4br44.setAngka(true);
        b4br44.setMaxDigit(10);
        b4br44.setRequired(true);
        jLayeredPane1.add(b4br44, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 770, 40, 30));

        b4br45.setAngka(true);
        b4br45.setMaxDigit(10);
        b4br45.setRequired(true);
        jLayeredPane1.add(b4br45, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 810, 40, 30));

        b4br46.setBackground(new java.awt.Color(217, 217, 217));
        b4br46.setAngka(true);
        b4br46.setMaxDigit(10);
        b4br46.setRequired(true);
        jLayeredPane1.add(b4br46, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 850, 40, 30));

        b4br47.setAngka(true);
        b4br47.setMaxDigit(10);
        b4br47.setRequired(true);
        jLayeredPane1.add(b4br47, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 890, 40, 30));

        b4br48.setBackground(new java.awt.Color(217, 217, 217));
        b4br48.setAngka(true);
        b4br48.setMaxDigit(10);
        b4br48.setRequired(true);
        jLayeredPane1.add(b4br48, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 920, 40, 30));

        b4br49.setAngka(true);
        b4br49.setMaxDigit(10);
        b4br49.setRequired(true);
        jLayeredPane1.add(b4br49, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 960, 40, 30));

        javax.swing.GroupLayout hal51Layout = new javax.swing.GroupLayout(hal51);
        hal51.setLayout(hal51Layout);
        hal51Layout.setHorizontalGroup(
            hal51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1)
        );
        hal51Layout.setVerticalGroup(
            hal51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1)
        );

        add(hal51, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private sp.component.TextField b4br30;
    private sp.component.TextField b4br31;
    private sp.component.TextField b4br32;
    private sp.component.TextField b4br33;
    private sp.component.TextField b4br34;
    private sp.component.TextField b4br35;
    private sp.component.TextField b4br36;
    private sp.component.TextField b4br37;
    private sp.component.TextField b4br38;
    private sp.component.TextField b4br39;
    private sp.component.TextField b4br40;
    private sp.component.TextField b4br41;
    private sp.component.TextField b4br42;
    private sp.component.TextField b4br43;
    private sp.component.TextField b4br44;
    private sp.component.TextField b4br45;
    private sp.component.TextField b4br46;
    private sp.component.TextField b4br47;
    private sp.component.TextField b4br48;
    private sp.component.TextField b4br49;
    private sp.imageClass.Hal5 hal51;
    private javax.swing.JLayeredPane jLayeredPane1;
    // End of variables declaration//GEN-END:variables
}
