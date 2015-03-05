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
public class Hal6 extends javax.swing.JPanel {

    /**
     * Creates new form Hal6
     */
    protected static int startPos = Hal1.maxPos + Hal2.maxPos + Hal3.maxPos + Hal4.maxPos + Hal5.maxPos;
    protected static int maxPos;

    private ArrayList<TextField> listTextFieldHal6 = new ArrayList<TextField>();

    public Hal6() {
        initComponents();
        addListTextfield();
        setListTextFieldHal6(FormControl.setFixedPos1(startPos, getListTextField()));
    }

    public ArrayList<TextField> getListTextField() {
        return listTextFieldHal6;
    }

    public int getMaxPertanyaan() {
        return maxPos;
    }

    public void setFieldHal6(B4 b) {
        b4br50.setText(b.getB4br50());
        b4br51.setText(b.getB4br51());
        b4br52.setText(b.getB4br52());
        b4br53.setText(b.getB4br53());
        b4br54.setText(b.getB4br54());
        b4br55.setText(b.getB4br55());
        b4br56.setText(b.getB4br56());
        b4br57.setText(b.getB4br57());
        b4br58.setText(b.getB4br58());
        b4br59.setText(b.getB4br59());
        b4br60.setText(b.getB4br60());
        b4br61.setText(b.getB4br61());
        b4br62.setText(b.getB4br62());
        b4br63.setText(b.getB4br63());
        b4br64.setText(b.getB4br64());
    }

    private void addListTextfield() {
        getListTextField().add(0, b4br50);
        getListTextField().add(1, b4br51);
        getListTextField().add(2, b4br52);
        getListTextField().add(3, b4br53);
        getListTextField().add(4, b4br54);
        getListTextField().add(5, b4br55);
        getListTextField().add(6, b4br56);
        getListTextField().add(7, b4br57);
        getListTextField().add(8, b4br58);
        getListTextField().add(9, b4br59);
        getListTextField().add(10, b4br60);
        getListTextField().add(11, b4br61);
        getListTextField().add(12, b4br62);
        getListTextField().add(13, b4br63);
        getListTextField().add(14, b4br64);
        maxPos = getListTextField().size();
    }

    public static int getStartPos() {
        return startPos;
    }

    public static void setStartPos(int startPos) {
        Hal6.startPos = startPos;
    }

    public static int getMaxPos() {
        return maxPos;
    }

    public static void setMaxPos(int maxPos) {
        Hal6.maxPos = maxPos;
    }

    public ArrayList<TextField> getListTextFieldHal6() {
        return listTextFieldHal6;
    }

    public void setListTextFieldHal6(ArrayList<TextField> listTextFieldHal6) {
        this.listTextFieldHal6 = listTextFieldHal6;
    }

    public TextField getB4br50() {
        return b4br50;
    }

    public void setB4br50(TextField b4br50) {
        this.b4br50 = b4br50;
    }

    public TextField getB4br51() {
        return b4br51;
    }

    public void setB4br51(TextField b4br51) {
        this.b4br51 = b4br51;
    }

    public TextField getB4br52() {
        return b4br52;
    }

    public void setB4br52(TextField b4br52) {
        this.b4br52 = b4br52;
    }

    public TextField getB4br53() {
        return b4br53;
    }

    public void setB4br53(TextField b4br53) {
        this.b4br53 = b4br53;
    }

    public TextField getB4br54() {
        return b4br54;
    }

    public void setB4br54(TextField b4br54) {
        this.b4br54 = b4br54;
    }

    public TextField getB4br55() {
        return b4br55;
    }

    public void setB4br55(TextField b4br55) {
        this.b4br55 = b4br55;
    }

    public TextField getB4br56() {
        return b4br56;
    }

    public void setB4br56(TextField b4br56) {
        this.b4br56 = b4br56;
    }

    public TextField getB4br57() {
        return b4br57;
    }

    public void setB4br57(TextField b4br57) {
        this.b4br57 = b4br57;
    }

    public TextField getB4br58() {
        return b4br58;
    }

    public void setB4br58(TextField b4br58) {
        this.b4br58 = b4br58;
    }

    public TextField getB4br59() {
        return b4br59;
    }

    public void setB4br59(TextField b4br59) {
        this.b4br59 = b4br59;
    }

    public TextField getB4br60() {
        return b4br60;
    }

    public void setB4br60(TextField b4br60) {
        this.b4br60 = b4br60;
    }

    public TextField getB4br61() {
        return b4br61;
    }

    public void setB4br61(TextField b4br61) {
        this.b4br61 = b4br61;
    }

    public TextField getB4br62() {
        return b4br62;
    }

    public void setB4br62(TextField b4br62) {
        this.b4br62 = b4br62;
    }

    public TextField getB4br63() {
        return b4br63;
    }

    public void setB4br63(TextField b4br63) {
        this.b4br63 = b4br63;
    }

    public TextField getB4br64() {
        return b4br64;
    }

    public void setB4br64(TextField b4br64) {
        this.b4br64 = b4br64;
    }

    public sp.imageClass.Hal6 getHal61() {
        return hal61;
    }

    public void setHal61(sp.imageClass.Hal6 hal61) {
        this.hal61 = hal61;
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

        hal61 = new sp.imageClass.Hal6();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        b4br50 = new sp.component.TextField();
        b4br51 = new sp.component.TextField();
        b4br52 = new sp.component.TextField();
        b4br53 = new sp.component.TextField();
        b4br54 = new sp.component.TextField();
        b4br55 = new sp.component.TextField();
        b4br56 = new sp.component.TextField();
        b4br57 = new sp.component.TextField();
        b4br58 = new sp.component.TextField();
        b4br59 = new sp.component.TextField();
        b4br60 = new sp.component.TextField();
        b4br61 = new sp.component.TextField();
        b4br62 = new sp.component.TextField();
        b4br63 = new sp.component.TextField();
        b4br64 = new sp.component.TextField();

        setLayout(new java.awt.BorderLayout());

        jLayeredPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        b4br50.setBackground(new java.awt.Color(217, 217, 217));
        b4br50.setAngka(true);
        b4br50.setMaxDigit(10);
        b4br50.setRequired(true);
        jLayeredPane1.add(b4br50, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 40, 40, 30));

        b4br51.setAngka(true);
        b4br51.setMaxDigit(10);
        b4br51.setRequired(true);
        jLayeredPane1.add(b4br51, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 80, 40, 30));

        b4br52.setBackground(new java.awt.Color(217, 217, 217));
        b4br52.setAngka(true);
        b4br52.setMaxDigit(10);
        b4br52.setRequired(true);
        jLayeredPane1.add(b4br52, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 120, 40, 30));

        b4br53.setAngka(true);
        b4br53.setMaxDigit(10);
        b4br53.setRequired(true);
        jLayeredPane1.add(b4br53, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 150, 40, 30));

        b4br54.setBackground(new java.awt.Color(217, 217, 217));
        b4br54.setAngka(true);
        b4br54.setMaxDigit(10);
        b4br54.setRequired(true);
        jLayeredPane1.add(b4br54, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 190, 40, 30));

        b4br55.setAngka(true);
        b4br55.setMaxDigit(10);
        b4br55.setRequired(true);
        jLayeredPane1.add(b4br55, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 230, 40, 30));

        b4br56.setBackground(new java.awt.Color(217, 217, 217));
        b4br56.setAngka(true);
        b4br56.setMaxDigit(10);
        b4br56.setRequired(true);
        jLayeredPane1.add(b4br56, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 270, 40, 30));

        b4br57.setAngka(true);
        b4br57.setMaxDigit(10);
        b4br57.setRequired(true);
        jLayeredPane1.add(b4br57, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 310, 40, 30));

        b4br58.setBackground(new java.awt.Color(217, 217, 217));
        b4br58.setAngka(true);
        b4br58.setMaxDigit(10);
        b4br58.setRequired(true);
        jLayeredPane1.add(b4br58, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 360, 40, 30));

        b4br59.setAngka(true);
        b4br59.setMaxDigit(10);
        b4br59.setRequired(true);
        jLayeredPane1.add(b4br59, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 400, 40, 30));

        b4br60.setBackground(new java.awt.Color(217, 217, 217));
        b4br60.setAngka(true);
        b4br60.setMaxDigit(10);
        b4br60.setRequired(true);
        jLayeredPane1.add(b4br60, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 440, 40, 30));

        b4br61.setAngka(true);
        b4br61.setMaxDigit(10);
        b4br61.setRequired(true);
        jLayeredPane1.add(b4br61, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 480, 40, 30));

        b4br62.setBackground(new java.awt.Color(217, 217, 217));
        b4br62.setAngka(true);
        b4br62.setMaxDigit(10);
        b4br62.setRequired(true);
        jLayeredPane1.add(b4br62, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 520, 40, 30));

        b4br63.setAngka(true);
        b4br63.setMaxDigit(10);
        b4br63.setRequired(true);
        jLayeredPane1.add(b4br63, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 560, 40, 30));

        b4br64.setBackground(new java.awt.Color(217, 217, 217));
        b4br64.setAngka(true);
        b4br64.setMaxDigit(10);
        b4br64.setRequired(true);
        jLayeredPane1.add(b4br64, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 600, 40, 30));

        javax.swing.GroupLayout hal61Layout = new javax.swing.GroupLayout(hal61);
        hal61.setLayout(hal61Layout);
        hal61Layout.setHorizontalGroup(
            hal61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1)
        );
        hal61Layout.setVerticalGroup(
            hal61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1)
        );

        add(hal61, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private sp.component.TextField b4br50;
    private sp.component.TextField b4br51;
    private sp.component.TextField b4br52;
    private sp.component.TextField b4br53;
    private sp.component.TextField b4br54;
    private sp.component.TextField b4br55;
    private sp.component.TextField b4br56;
    private sp.component.TextField b4br57;
    private sp.component.TextField b4br58;
    private sp.component.TextField b4br59;
    private sp.component.TextField b4br60;
    private sp.component.TextField b4br61;
    private sp.component.TextField b4br62;
    private sp.component.TextField b4br63;
    private sp.component.TextField b4br64;
    private sp.imageClass.Hal6 hal61;
    private javax.swing.JLayeredPane jLayeredPane1;
    // End of variables declaration//GEN-END:variables
}
