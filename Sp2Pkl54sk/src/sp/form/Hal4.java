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
public class Hal4 extends javax.swing.JPanel {

    /**
     * Creates new form Hal4
     */
    protected static int startPos = Hal1.maxPos + Hal2.maxPos + Hal3.maxPos;
    protected static int maxPos;

    private ArrayList<TextField> listTextFieldHal4 = new ArrayList<TextField>();

    public Hal4() {
        initComponents();
        addListTextfield();
        setListTextFieldHal4(FormControl.setFixedPos1(startPos, getListTextField()));
    }

    public ArrayList<TextField> getListTextField() {
        return listTextFieldHal4;
    }

    public int getMaxPertanyaan() {
        return maxPos;
    }

    public void setFieldHal4(B4 b) {
        b4br1.setText(b.getB4br1());
        b4br2.setText(b.getB4br2());
        b4br3.setText(b.getB4br3());
        b4br4.setText(b.getB4br4());
        b4br5.setText(b.getB4br5());
        b4br6.setText(b.getB4br6());
        b4br7.setText(b.getB4br7());
        b4br8.setText(b.getB4br8());
        b4br9.setText(b.getB4br9());
        b4br10.setText(b.getB4br10());
        b4br11.setText(b.getB4br11());
        b4br12.setText(b.getB4br12());
        b4br13.setText(b.getB4br13());
        b4br14.setText(b.getB4br14());
        b4br15.setText(b.getB4br15());
        b4br16.setText(b.getB4br16());
        b4br17.setText(b.getB4br17());
        b4br18.setText(b.getB4br18());
        b4br19.setText(b.getB4br19());
        b4br20.setText(b.getB4br20());
        b4br21.setText(b.getB4br21());
        b4br22.setText(b.getB4br22());
        b4br23.setText(b.getB4br23());
        b4br24.setText(b.getB4br24());
        b4br25.setText(b.getB4br25());
        b4br26.setText(b.getB4br26());
        b4br27.setText(b.getB4br27());
        b4br28.setText(b.getB4br28());
        b4br29.setText(b.getB4br29());
    }

    private void addListTextfield() {
        getListTextField().add(0, b4br1);
        getListTextField().add(1, b4br2);
        getListTextField().add(2, b4br3);
        getListTextField().add(3, b4br4);
        getListTextField().add(4, b4br5);
        getListTextField().add(5, b4br6);
        getListTextField().add(6, b4br7);
        getListTextField().add(7, b4br8);
        getListTextField().add(8, b4br9);
        getListTextField().add(9, b4br10);
        getListTextField().add(10, b4br11);
        getListTextField().add(11, b4br12);
        getListTextField().add(12, b4br13);
        getListTextField().add(13, b4br14);
        getListTextField().add(14, b4br15);
        getListTextField().add(15, b4br16);
        getListTextField().add(16, b4br17);
        getListTextField().add(17, b4br18);
        getListTextField().add(18, b4br19);
        getListTextField().add(19, b4br20);
        getListTextField().add(20, b4br21);
        getListTextField().add(21, b4br22);
        getListTextField().add(22, b4br23);
        getListTextField().add(23, b4br24);
        getListTextField().add(24, b4br25);
        getListTextField().add(25, b4br26);
        getListTextField().add(26, b4br27);
        getListTextField().add(27, b4br28);
        getListTextField().add(28, b4br29);
    }

    public static int getStartPos() {
        return startPos;
    }

    public static void setStartPos(int startPos) {
        Hal4.startPos = startPos;
    }

    public static int getMaxPos() {
        return maxPos;
    }

    public static void setMaxPos(int maxPos) {
        Hal4.maxPos = maxPos;
    }

    public ArrayList<TextField> getListTextFieldHal4() {
        return listTextFieldHal4;
    }

    public void setListTextFieldHal4(ArrayList<TextField> listTextFieldHal4) {
        this.listTextFieldHal4 = listTextFieldHal4;
    }

    public TextField getB4br1() {
        return b4br1;
    }

    public void setB4br1(TextField b4br1) {
        this.b4br1 = b4br1;
    }

    public TextField getB4br10() {
        return b4br10;
    }

    public void setB4br10(TextField b4br10) {
        this.b4br10 = b4br10;
    }

    public TextField getB4br11() {
        return b4br11;
    }

    public void setB4br11(TextField b4br11) {
        this.b4br11 = b4br11;
    }

    public TextField getB4br12() {
        return b4br12;
    }

    public void setB4br12(TextField b4br12) {
        this.b4br12 = b4br12;
    }

    public TextField getB4br13() {
        return b4br13;
    }

    public void setB4br13(TextField b4br13) {
        this.b4br13 = b4br13;
    }

    public TextField getB4br14() {
        return b4br14;
    }

    public void setB4br14(TextField b4br14) {
        this.b4br14 = b4br14;
    }

    public TextField getB4br15() {
        return b4br15;
    }

    public void setB4br15(TextField b4br15) {
        this.b4br15 = b4br15;
    }

    public TextField getB4br16() {
        return b4br16;
    }

    public void setB4br16(TextField b4br16) {
        this.b4br16 = b4br16;
    }

    public TextField getB4br17() {
        return b4br17;
    }

    public void setB4br17(TextField b4br17) {
        this.b4br17 = b4br17;
    }

    public TextField getB4br18() {
        return b4br18;
    }

    public void setB4br18(TextField b4br18) {
        this.b4br18 = b4br18;
    }

    public TextField getB4br19() {
        return b4br19;
    }

    public void setB4br19(TextField b4br19) {
        this.b4br19 = b4br19;
    }

    public TextField getB4br2() {
        return b4br2;
    }

    public void setB4br2(TextField b4br2) {
        this.b4br2 = b4br2;
    }

    public TextField getB4br20() {
        return b4br20;
    }

    public void setB4br20(TextField b4br20) {
        this.b4br20 = b4br20;
    }

    public TextField getB4br21() {
        return b4br21;
    }

    public void setB4br21(TextField b4br21) {
        this.b4br21 = b4br21;
    }

    public TextField getB4br22() {
        return b4br22;
    }

    public void setB4br22(TextField b4br22) {
        this.b4br22 = b4br22;
    }

    public TextField getB4br23() {
        return b4br23;
    }

    public void setB4br23(TextField b4br23) {
        this.b4br23 = b4br23;
    }

    public TextField getB4br24() {
        return b4br24;
    }

    public void setB4br24(TextField b4br24) {
        this.b4br24 = b4br24;
    }

    public TextField getB4br25() {
        return b4br25;
    }

    public void setB4br25(TextField b4br25) {
        this.b4br25 = b4br25;
    }

    public TextField getB4br26() {
        return b4br26;
    }

    public void setB4br26(TextField b4br26) {
        this.b4br26 = b4br26;
    }

    public TextField getB4br27() {
        return b4br27;
    }

    public void setB4br27(TextField b4br27) {
        this.b4br27 = b4br27;
    }

    public TextField getB4br28() {
        return b4br28;
    }

    public void setB4br28(TextField b4br28) {
        this.b4br28 = b4br28;
    }

    public TextField getB4br29() {
        return b4br29;
    }

    public void setB4br29(TextField b4br29) {
        this.b4br29 = b4br29;
    }

    public TextField getB4br3() {
        return b4br3;
    }

    public void setB4br3(TextField b4br3) {
        this.b4br3 = b4br3;
    }

    public TextField getB4br4() {
        return b4br4;
    }

    public void setB4br4(TextField b4br4) {
        this.b4br4 = b4br4;
    }

    public TextField getB4br5() {
        return b4br5;
    }

    public void setB4br5(TextField b4br5) {
        this.b4br5 = b4br5;
    }

    public TextField getB4br6() {
        return b4br6;
    }

    public void setB4br6(TextField b4br6) {
        this.b4br6 = b4br6;
    }

    public TextField getB4br7() {
        return b4br7;
    }

    public void setB4br7(TextField b4br7) {
        this.b4br7 = b4br7;
    }

    public TextField getB4br8() {
        return b4br8;
    }

    public void setB4br8(TextField b4br8) {
        this.b4br8 = b4br8;
    }

    public TextField getB4br9() {
        return b4br9;
    }

    public void setB4br9(TextField b4br9) {
        this.b4br9 = b4br9;
    }

    public sp.imageClass.Hal4 getHal41() {
        return hal41;
    }

    public void setHal41(sp.imageClass.Hal4 hal41) {
        this.hal41 = hal41;
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

        hal41 = new sp.imageClass.Hal4();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        b4br1 = new sp.component.TextField();
        b4br2 = new sp.component.TextField();
        b4br3 = new sp.component.TextField();
        b4br4 = new sp.component.TextField();
        b4br5 = new sp.component.TextField();
        b4br6 = new sp.component.TextField();
        b4br7 = new sp.component.TextField();
        b4br8 = new sp.component.TextField();
        b4br9 = new sp.component.TextField();
        b4br10 = new sp.component.TextField();
        b4br11 = new sp.component.TextField();
        b4br12 = new sp.component.TextField();
        b4br13 = new sp.component.TextField();
        b4br14 = new sp.component.TextField();
        b4br15 = new sp.component.TextField();
        b4br16 = new sp.component.TextField();
        b4br17 = new sp.component.TextField();
        b4br18 = new sp.component.TextField();
        b4br19 = new sp.component.TextField();
        b4br20 = new sp.component.TextField();
        b4br21 = new sp.component.TextField();
        b4br22 = new sp.component.TextField();
        b4br23 = new sp.component.TextField();
        b4br24 = new sp.component.TextField();
        b4br25 = new sp.component.TextField();
        b4br26 = new sp.component.TextField();
        b4br27 = new sp.component.TextField();
        b4br28 = new sp.component.TextField();
        b4br29 = new sp.component.TextField();

        setLayout(new java.awt.BorderLayout());

        jLayeredPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        b4br1.setAngka(true);
        b4br1.setMaxDigit(10);
        b4br1.setRequired(true);
        jLayeredPane1.add(b4br1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 290, 40, 20));

        b4br2.setBackground(new java.awt.Color(217, 217, 218));
        b4br2.setAngka(true);
        b4br2.setMaxDigit(10);
        b4br2.setRequired(true);
        jLayeredPane1.add(b4br2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 310, 40, -1));

        b4br3.setAngka(true);
        b4br3.setMaxDigit(10);
        b4br3.setRequired(true);
        jLayeredPane1.add(b4br3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 330, 40, -1));

        b4br4.setBackground(new java.awt.Color(217, 217, 218));
        b4br4.setAngka(true);
        b4br4.setMaxDigit(10);
        b4br4.setRequired(true);
        jLayeredPane1.add(b4br4, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 360, 40, -1));

        b4br5.setAngka(true);
        b4br5.setMaxDigit(10);
        b4br5.setRequired(true);
        jLayeredPane1.add(b4br5, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 380, 40, -1));

        b4br6.setBackground(new java.awt.Color(217, 217, 218));
        b4br6.setAngka(true);
        b4br6.setMaxDigit(10);
        b4br6.setRequired(true);
        jLayeredPane1.add(b4br6, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 410, 40, -1));

        b4br7.setAngka(true);
        b4br7.setMaxDigit(10);
        b4br7.setRequired(true);
        jLayeredPane1.add(b4br7, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 430, 40, -1));

        b4br8.setBackground(new java.awt.Color(217, 217, 218));
        b4br8.setAngka(true);
        b4br8.setMaxDigit(10);
        b4br8.setRequired(true);
        jLayeredPane1.add(b4br8, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 450, 40, -1));

        b4br9.setAngka(true);
        b4br9.setMaxDigit(10);
        b4br9.setRequired(true);
        jLayeredPane1.add(b4br9, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 480, 40, -1));

        b4br10.setBackground(new java.awt.Color(217, 217, 218));
        b4br10.setAngka(true);
        b4br10.setMaxDigit(10);
        b4br10.setRequired(true);
        jLayeredPane1.add(b4br10, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 500, 40, -1));

        b4br11.setAngka(true);
        b4br11.setMaxDigit(10);
        b4br11.setRequired(true);
        jLayeredPane1.add(b4br11, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 530, 40, -1));

        b4br12.setBackground(new java.awt.Color(217, 217, 218));
        b4br12.setAngka(true);
        b4br12.setMaxDigit(10);
        b4br12.setRequired(true);
        jLayeredPane1.add(b4br12, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 550, 40, -1));

        b4br13.setAngka(true);
        b4br13.setMaxDigit(10);
        b4br13.setRequired(true);
        jLayeredPane1.add(b4br13, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 570, 40, 20));

        b4br14.setBackground(new java.awt.Color(217, 217, 218));
        b4br14.setAngka(true);
        b4br14.setMaxDigit(10);
        b4br14.setRequired(true);
        jLayeredPane1.add(b4br14, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 600, 40, -1));

        b4br15.setAngka(true);
        b4br15.setMaxDigit(10);
        b4br15.setRequired(true);
        jLayeredPane1.add(b4br15, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 620, 40, -1));

        b4br16.setBackground(new java.awt.Color(217, 217, 218));
        b4br16.setAngka(true);
        b4br16.setMaxDigit(10);
        b4br16.setRequired(true);
        jLayeredPane1.add(b4br16, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 650, 40, -1));

        b4br17.setAngka(true);
        b4br17.setMaxDigit(10);
        b4br17.setRequired(true);
        jLayeredPane1.add(b4br17, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 670, 40, -1));

        b4br18.setBackground(new java.awt.Color(217, 217, 218));
        b4br18.setAngka(true);
        b4br18.setMaxDigit(10);
        b4br18.setRequired(true);
        jLayeredPane1.add(b4br18, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 690, 40, -1));

        b4br19.setAngka(true);
        b4br19.setMaxDigit(10);
        b4br19.setRequired(true);
        jLayeredPane1.add(b4br19, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 720, 40, -1));

        b4br20.setBackground(new java.awt.Color(217, 217, 218));
        b4br20.setAngka(true);
        b4br20.setMaxDigit(10);
        b4br20.setRequired(true);
        jLayeredPane1.add(b4br20, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 740, 40, -1));

        b4br21.setAngka(true);
        b4br21.setMaxDigit(10);
        b4br21.setRequired(true);
        jLayeredPane1.add(b4br21, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 770, 40, -1));

        b4br22.setBackground(new java.awt.Color(217, 217, 218));
        b4br22.setAngka(true);
        b4br22.setMaxDigit(10);
        b4br22.setRequired(true);
        jLayeredPane1.add(b4br22, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 800, 40, -1));

        b4br23.setAngka(true);
        b4br23.setMaxDigit(10);
        b4br23.setRequired(true);
        jLayeredPane1.add(b4br23, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 820, 40, -1));

        b4br24.setBackground(new java.awt.Color(217, 217, 218));
        b4br24.setAngka(true);
        b4br24.setMaxDigit(10);
        b4br24.setRequired(true);
        jLayeredPane1.add(b4br24, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 850, 40, -1));

        b4br25.setAngka(true);
        b4br25.setMaxDigit(10);
        b4br25.setRequired(true);
        jLayeredPane1.add(b4br25, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 870, 40, -1));

        b4br26.setBackground(new java.awt.Color(217, 217, 218));
        b4br26.setAngka(true);
        b4br26.setMaxDigit(10);
        b4br26.setRequired(true);
        jLayeredPane1.add(b4br26, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 900, 40, -1));

        b4br27.setAngka(true);
        b4br27.setMaxDigit(10);
        b4br27.setRequired(true);
        jLayeredPane1.add(b4br27, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 920, 40, -1));

        b4br28.setBackground(new java.awt.Color(217, 217, 218));
        b4br28.setAngka(true);
        b4br28.setMaxDigit(10);
        b4br28.setRequired(true);
        jLayeredPane1.add(b4br28, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 950, 40, -1));

        b4br29.setAngka(true);
        b4br29.setMaxDigit(10);
        b4br29.setRequired(true);
        jLayeredPane1.add(b4br29, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 970, 40, -1));

        javax.swing.GroupLayout hal41Layout = new javax.swing.GroupLayout(hal41);
        hal41.setLayout(hal41Layout);
        hal41Layout.setHorizontalGroup(
            hal41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1)
        );
        hal41Layout.setVerticalGroup(
            hal41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 993, Short.MAX_VALUE)
        );

        add(hal41, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private sp.component.TextField b4br1;
    private sp.component.TextField b4br10;
    private sp.component.TextField b4br11;
    private sp.component.TextField b4br12;
    private sp.component.TextField b4br13;
    private sp.component.TextField b4br14;
    private sp.component.TextField b4br15;
    private sp.component.TextField b4br16;
    private sp.component.TextField b4br17;
    private sp.component.TextField b4br18;
    private sp.component.TextField b4br19;
    private sp.component.TextField b4br2;
    private sp.component.TextField b4br20;
    private sp.component.TextField b4br21;
    private sp.component.TextField b4br22;
    private sp.component.TextField b4br23;
    private sp.component.TextField b4br24;
    private sp.component.TextField b4br25;
    private sp.component.TextField b4br26;
    private sp.component.TextField b4br27;
    private sp.component.TextField b4br28;
    private sp.component.TextField b4br29;
    private sp.component.TextField b4br3;
    private sp.component.TextField b4br4;
    private sp.component.TextField b4br5;
    private sp.component.TextField b4br6;
    private sp.component.TextField b4br7;
    private sp.component.TextField b4br8;
    private sp.component.TextField b4br9;
    private sp.imageClass.Hal4 hal41;
    private javax.swing.JLayeredPane jLayeredPane1;
    // End of variables declaration//GEN-END:variables
}
