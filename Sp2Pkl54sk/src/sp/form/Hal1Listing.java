/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp.form;

import java.util.ArrayList;
import javax.swing.JLayeredPane;
import sp.component.TextFieldListing;
import sp.model.Dsartb1;
import sp.model.Dsartb2;
import sp.model.Dsartb3;
import sp.util.ListControl;

/**
 *
 * @author Rohma Hidayati [12.7363]
 */
public class Hal1Listing extends javax.swing.JPanel {

    /**
     * Creates new form Hal1Listing
     */
    private ArrayList<TextFieldListing> listTextFieldHal1Listing = new ArrayList<TextFieldListing>();
    protected static int startPos = 0;
    protected static int maxPos;

    public Hal1Listing() {
        initComponents();
        addListTextfield();
        setListTextFieldListingHal1Listing(ListControl.setFixedPos(startPos, getListTextFieldListing()));
    }

    public int getMaxPertanyaan() {
        return maxPos;
    }

    public ArrayList<TextFieldListing> getListTextFieldListing() {
        return listTextFieldHal1Listing;
    }

        public void setFieldHal1(Dsartb1 b, Dsartb2 c, Dsartb3 d) {
        b1r1.setText(b.getB1r1().getKode());
        b1r2.setText(b.getB1r2());
        b1r3.setText(b.getB1r3());
        b1r4.setText(b.getB1r4());
        b1r5.setText(b.getB1r5());
        b1r6s1.setText(b.getB1r6s1());
        b1r6s2.setText(b.getB1r6s2());
        b2r1.setText(getString(c.getB2r1()));
        b2r2.setText(getString(c.getB2r2()));
        b2r3s1.setText(getString(c.getB2r3s1()));
        b2r3s2.setText(getString(c.getB2r3s2()));
        b2r3s3.setText(getString(c.getB2r3s3()));
        b2r3s4.setText(getString(c.getB2r3s4()));
        b3r1.setText(d.getB3r1());
        b3r2.setText(d.getB3r2());
        b3r3.setText(d.getB3r3());
    }
        
    private void addListTextfield() {
        getListTextFieldListing().add(0, b1r1);
        getListTextFieldListing().add(1, b1r2);
        getListTextFieldListing().add(2, b1r3);
        getListTextFieldListing().add(3, b1r4);
        getListTextFieldListing().add(4, b1r5);
        getListTextFieldListing().add(5, b1r6s1);
        getListTextFieldListing().add(6, b1r6s2);
        getListTextFieldListing().add(7, b2r1);
        getListTextFieldListing().add(8, b2r2);
        getListTextFieldListing().add(9, b2r3s1);
        getListTextFieldListing().add(10, b2r3s2);
        getListTextFieldListing().add(11, b2r3s3);
        getListTextFieldListing().add(12, b2r3s4);
        getListTextFieldListing().add(13, b3r1);
        getListTextFieldListing().add(14, b3r2);
        getListTextFieldListing().add(15, b3r3);
        maxPos = getListTextFieldListing().size();
    }

    public ArrayList<TextFieldListing> getListTextFieldListingHal1Listing() {
        return listTextFieldHal1Listing;
    }

    public void setListTextFieldListingHal1Listing(ArrayList<TextFieldListing> listTextFieldListingHal1Listing) {
        this.listTextFieldHal1Listing = listTextFieldListingHal1Listing;
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

    public TextFieldListing getB1r1() {
        return b1r1;
    }

    public void setB1r1(TextFieldListing b1r1) {
        this.b1r1 = b1r1;
    }

    public TextFieldListing getB1r2() {
        return b1r2;
    }

    public void setB1r2(TextFieldListing b1r2) {
        this.b1r2 = b1r2;
    }

    public TextFieldListing getB1r3() {
        return b1r3;
    }

    public void setB1r3(TextFieldListing b1r3) {
        this.b1r3 = b1r3;
    }

    public TextFieldListing getB1r4() {
        return b1r4;
    }

    public void setB1r4(TextFieldListing b1r4) {
        this.b1r4 = b1r4;
    }

    public TextFieldListing getB1r5() {
        return b1r5;
    }

    public void setB1r5(TextFieldListing b1r5) {
        this.b1r5 = b1r5;
    }

    public TextFieldListing getB1r6s1() {
        return b1r6s1;
    }

    public void setB1r6s1(TextFieldListing b1r6s1) {
        this.b1r6s1 = b1r6s1;
    }

    public TextFieldListing getB1r6s2() {
        return b1r6s2;
    }

    public void setB1r6s2(TextFieldListing b1r6s2) {
        this.b1r6s2 = b1r6s2;
    }

    public TextFieldListing getB2r1() {
        return b2r1;
    }

    public void setB2r1(TextFieldListing b2r1) {
        this.b2r1 = b2r1;
    }

    public TextFieldListing getB2r2() {
        return b2r2;
    }

    public void setB2r2(TextFieldListing b2r2) {
        this.b2r2 = b2r2;
    }

    public TextFieldListing getB2r3s1() {
        return b2r3s1;
    }

    public void setB2r3s1(TextFieldListing b2r3s1) {
        this.b2r3s1 = b2r3s1;
    }

    public TextFieldListing getB2r3s2() {
        return b2r3s2;
    }

    public void setB2r3s2(TextFieldListing b2r3s2) {
        this.b2r3s2 = b2r3s2;
    }

    public TextFieldListing getB2r3s3() {
        return b2r3s3;
    }

    public void setB2r3s3(TextFieldListing b2r3s3) {
        this.b2r3s3 = b2r3s3;
    }

    public TextFieldListing getB2r3s4() {
        return b2r3s4;
    }

    public void setB2r3s4(TextFieldListing b2r3s4) {
        this.b2r3s4 = b2r3s4;
    }

    public TextFieldListing getB3r1() {
        return b3r1;
    }

    public void setB3r1(TextFieldListing b3r1) {
        this.b3r1 = b3r1;
    }

    public TextFieldListing getB3r2() {
        return b3r2;
    }

    public void setB3r2(TextFieldListing b3r2) {
        this.b3r2 = b3r2;
    }

    public TextFieldListing getB3r3() {
        return b3r3;
    }

    public void setB3r3(TextFieldListing b3r3) {
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
        b1r1 = new sp.component.TextFieldListing();
        b1r2 = new sp.component.TextFieldListing();
        b1r3 = new sp.component.TextFieldListing();
        b1r4 = new sp.component.TextFieldListing();
        b1r5 = new sp.component.TextFieldListing();
        b1r6s1 = new sp.component.TextFieldListing();
        b1r6s2 = new sp.component.TextFieldListing();
        b2r1 = new sp.component.TextFieldListing();
        b2r2 = new sp.component.TextFieldListing();
        b2r3s1 = new sp.component.TextFieldListing();
        b2r3s2 = new sp.component.TextFieldListing();
        b2r3s3 = new sp.component.TextFieldListing();
        b2r3s4 = new sp.component.TextFieldListing();
        b3r1 = new sp.component.TextFieldListing();
        b3r2 = new sp.component.TextFieldListing();
        b3r3 = new sp.component.TextFieldListing();

        setLayout(new java.awt.BorderLayout());

        jLayeredPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        b1r1.setAngka(true);
        b1r1.setKhusus(true);
        b1r1.setKhususType('1');
        b1r1.setLength(2);
        b1r1.setRequired(true);
        jLayeredPane1.add(b1r1, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 230, 70, 30));

        b1r2.setAngka(true);
        b1r2.setLength(3);
        b1r2.setMaxDigit(999);
        b1r2.setRequired(true);
        jLayeredPane1.add(b1r2, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 280, 100, 30));

        b1r3.setAngka(true);
        b1r3.setLength(3);
        b1r3.setMaxDigit(999);
        b1r3.setRequired(true);
        jLayeredPane1.add(b1r3, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 330, 100, 30));

        b1r4.setAngka(true);
        b1r4.setLength(3);
        b1r4.setMaxDigit(999);
        b1r4.setRequired(true);
        jLayeredPane1.add(b1r4, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 370, 100, 30));

        b1r5.setAngka(true);
        b1r5.setLength(3);
        b1r5.setMaxDigit(999);
        b1r5.setRequired(true);
        jLayeredPane1.add(b1r5, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 420, 100, 30));

        b1r6s1.setAngka(true);
        b1r6s1.setHuruf(true);
        b1r6s1.setLength(100);
        b1r6s1.setRequired(true);
        jLayeredPane1.add(b1r6s1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 480, 550, 30));

        b1r6s2.setAngka(true);
        b1r6s2.setHuruf(true);
        b1r6s2.setLength(100);
        b1r6s2.setRequired(true);
        jLayeredPane1.add(b1r6s2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 510, 550, 30));

        b2r1.setAngka(true);
        b2r1.setLength(3);
        b2r1.setMaxDigit(999);
        b2r1.setRequired(true);
        jLayeredPane1.add(b2r1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 620, 100, 30));

        b2r2.setAngka(true);
        b2r2.setLength(4);
        b2r2.setMaxDigit(9999);
        b2r2.setRequired(true);
        jLayeredPane1.add(b2r2, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 680, 130, 30));

        b2r3s1.setAngka(true);
        b2r3s1.setLength(3);
        b2r3s1.setMaxDigit(999);
        b2r3s1.setRequired(true);
        jLayeredPane1.add(b2r3s1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 790, 100, 30));

        b2r3s2.setAngka(true);
        b2r3s2.setLength(3);
        b2r3s2.setMaxDigit(999);
        b2r3s2.setRequired(true);
        jLayeredPane1.add(b2r3s2, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 860, 100, 30));

        b2r3s3.setAngka(true);
        b2r3s3.setLength(3);
        b2r3s3.setMaxDigit(999);
        b2r3s3.setRequired(true);
        jLayeredPane1.add(b2r3s3, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 920, 100, 30));

        b2r3s4.setAngka(true);
        b2r3s4.setLength(4);
        b2r3s4.setMaxDigit(9999);
        b2r3s4.setRequired(true);
        jLayeredPane1.add(b2r3s4, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 980, 130, 30));

        b3r1.setHuruf(true);
        b3r1.setLength(100);
        b3r1.setRequired(true);
        jLayeredPane1.add(b3r1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 1090, 540, 30));

        b3r2.setAngka(true);
        b3r2.setLength(6);
        b3r2.setMaxDigit(129999);
        b3r2.setMinDigit(110000);
        b3r2.setRequired(true);
        jLayeredPane1.add(b3r2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 1140, 190, 30));

        b3r3.setAngka(true);
        b3r3.setLength(2);
        b3r3.setMaxDigit(31);
        b3r3.setMinDigit(1);
        b3r3.setRequired(true);
        jLayeredPane1.add(b3r3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 1180, 40, 30));

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
    private sp.component.TextFieldListing b1r1;
    private sp.component.TextFieldListing b1r2;
    private sp.component.TextFieldListing b1r3;
    private sp.component.TextFieldListing b1r4;
    private sp.component.TextFieldListing b1r5;
    private sp.component.TextFieldListing b1r6s1;
    private sp.component.TextFieldListing b1r6s2;
    private sp.component.TextFieldListing b2r1;
    private sp.component.TextFieldListing b2r2;
    private sp.component.TextFieldListing b2r3s1;
    private sp.component.TextFieldListing b2r3s2;
    private sp.component.TextFieldListing b2r3s3;
    private sp.component.TextFieldListing b2r3s4;
    private sp.component.TextFieldListing b3r1;
    private sp.component.TextFieldListing b3r2;
    private sp.component.TextFieldListing b3r3;
    private sp.imageClass.Hal1Listing hal1Listing1;
    private javax.swing.JLayeredPane jLayeredPane1;
    // End of variables declaration//GEN-END:variables

    public String getString(int angka) {
        String no = Integer.toString(angka);
        while(no.length()<3){
            no = "0" + no;
        }
        return no;
    }
}
