/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp.form;

import java.util.ArrayList;
import javax.swing.JLayeredPane;
import sp.component.TextFieldListing;
import sp.model.Dsartb4;
import sp.util.ListControl;

/**
 *
 * @author Rohma Hidayati [12.7363]
 */
public class Hal2Listing extends javax.swing.JPanel {

    /**
     * Creates new form Hal2Listing
     */
    private ArrayList<TextFieldListing> listTextFieldHal2Listing = new ArrayList<TextFieldListing>();
    protected static int startPos = Hal1Listing.maxPos;
    protected static int maxPos;

    public Hal2Listing() {
        initComponents();
        setFieldHal2();
        addListTextfield();
        setListTextFieldListingHal2Listing(ListControl.setFixedPos(startPos, getListTextFieldListing()));        
    }  

    public int getMaxPertanyaan() {
        return maxPos;
    }

    public ArrayList<TextFieldListing> getListTextFieldListing() {
        return listTextFieldHal2Listing;
    }

    public void setFieldHal2() {
        Ab4r2s1.setText("3");
        Ab4r2s2.setText("3");
        Ab4r2s3.setText("3");
        Ab4r3.setText("a");
        Ab4r4.setText("1");
        Ab4r5.setText("33");
        Ab4r6.setText("l");
        
        Bb4r2s1.setText("3");
        Bb4r2s2.setText("3");
        Bb4r2s3.setText("3");
        Bb4r3.setText("a");
        Bb4r4.setText("1");
        Bb4r5.setText("33");
        Bb4r6.setText("l");
        
        Cb4r2s1.setText("3");
        Cb4r2s2.setText("3");
        Cb4r2s3.setText("3");
        Cb4r3.setText("a");
        Cb4r4.setText("1");
        Cb4r5.setText("33");
        Cb4r6.setText("l");
        
        Db4r2s1.setText("3");
        Db4r2s2.setText("3");
        Db4r2s3.setText("3");
        Db4r3.setText("a");
        Db4r4.setText("1");
        Db4r5.setText("33");
        Db4r6.setText("l");
        
        Eb4r2s1.setText("3");
        Eb4r2s2.setText("3");
        Eb4r2s3.setText("3");
        Eb4r3.setText("a");
        Eb4r4.setText("1");
        Eb4r5.setText("33");
        Eb4r6.setText("l");
        
        Fb4r2s1.setText("3");
        Fb4r2s2.setText("3");
        Fb4r2s3.setText("3");
        Fb4r3.setText("a");
        Fb4r4.setText("1");
        Fb4r5.setText("33");
        Fb4r6.setText("l");
        
        Gb4r2s1.setText("3");
        Gb4r2s2.setText("3");
        Gb4r2s3.setText("3");
        Gb4r3.setText("a");
        Gb4r4.setText("1");
        Gb4r5.setText("33");
        Gb4r6.setText("l");
        
        Hb4r2s1.setText("3");
        Hb4r2s2.setText("3");
        Hb4r2s3.setText("3");
        Hb4r3.setText("a");
        Hb4r4.setText("1");
        Hb4r5.setText("33");
        Hb4r6.setText("l");
        
        Ib4r2s1.setText("3");
        Ib4r2s2.setText("3");
        Ib4r2s3.setText("3");
        Ib4r3.setText("a");
        Ib4r4.setText("1");
        Ib4r5.setText("33");
        Ib4r6.setText("l");
        
        Jb4r2s1.setText("3");
        Jb4r2s2.setText("3");
        Jb4r2s3.setText("3");
        Jb4r3.setText("a");
        Jb4r4.setText("1");
        Jb4r5.setText("33");
        Jb4r6.setText("l");
        
        Kb4r2s1.setText("3");
        Kb4r2s2.setText("3");
        Kb4r2s3.setText("3");
        Kb4r3.setText("a");
        Kb4r4.setText("1");
        Kb4r5.setText("33");
        Kb4r6.setText("l");
        
        Lb4r2s1.setText("3");
        Lb4r2s2.setText("3");
        Lb4r2s3.setText("3");
        Lb4r3.setText("a");
        Lb4r4.setText("1");
        Lb4r5.setText("33");
        Lb4r6.setText("l");
        
        Mb4r2s1.setText("3");
        Mb4r2s2.setText("3");
        Mb4r2s3.setText("3");
        Mb4r3.setText("a");
        Mb4r4.setText("1");
        Mb4r5.setText("33");
        Mb4r6.setText("l");
        
        Nb4r2s1.setText("3");
        Nb4r2s2.setText("3");
        Nb4r2s3.setText("3");
        Nb4r3.setText("a");
        Nb4r4.setText("1");
        Nb4r5.setText("33");
        Nb4r6.setText("l");
        
        Ob4r2s1.setText("3");
        Ob4r2s2.setText("3");
        Ob4r2s3.setText("3");
        Ob4r3.setText("a");
        Ob4r4.setText("1");
        Ob4r5.setText("33");
        Ob4r6.setText("l");
        
        Pb4r2s1.setText("3");
        Pb4r2s2.setText("3");
        Pb4r2s3.setText("3");
        Pb4r3.setText("a");
        Pb4r4.setText("1");
        Pb4r5.setText("33");
        Pb4r6.setText("l");
        
        Qb4r2s1.setText("3");
        Qb4r2s2.setText("3");
        Qb4r2s3.setText("3");
        Qb4r3.setText("a");
        Qb4r4.setText("1");
        Qb4r5.setText("33");
        Qb4r6.setText("l");
        
        Rb4r2s1.setText("3");
        Rb4r2s2.setText("3");
        Rb4r2s3.setText("3");
        Rb4r3.setText("a");
        Rb4r4.setText("1");
        Rb4r5.setText("33");
        Rb4r6.setText("l");
        
        Sb4r2s1.setText("3");
        Sb4r2s2.setText("3");
        Sb4r2s3.setText("3");
        Sb4r3.setText("a");
        Sb4r4.setText("1");
        Sb4r5.setText("33");
        Sb4r6.setText("l");
        
        Tb4r2s1.setText("3");
        Tb4r2s2.setText("3");
        Tb4r2s3.setText("3");
        Tb4r3.setText("a");
        Tb4r4.setText("1");
        Tb4r5.setText("33");
        Tb4r6.setText("l");
        
    }

    public void addListTextfield() {
        getListTextFieldListing().add(0, Ab4r2s1);
        getListTextFieldListing().add(1, Ab4r2s2);
        getListTextFieldListing().add(2, Ab4r2s3);
        getListTextFieldListing().add(3, Ab4r3);
        getListTextFieldListing().add(4, Ab4r4);
        getListTextFieldListing().add(5, Ab4r5);
        getListTextFieldListing().add(6, Ab4r6);
        getListTextFieldListing().add(7, Bb4r2s1);
        getListTextFieldListing().add(8, Bb4r2s2);
        getListTextFieldListing().add(9, Bb4r2s3);
        getListTextFieldListing().add(10, Bb4r3);
        getListTextFieldListing().add(11, Bb4r4);
        getListTextFieldListing().add(12, Bb4r5);
        getListTextFieldListing().add(13, Bb4r6);
        getListTextFieldListing().add(14, Cb4r2s1);
        getListTextFieldListing().add(15, Cb4r2s2);
        getListTextFieldListing().add(16, Cb4r2s3);
        getListTextFieldListing().add(17, Cb4r3);
        getListTextFieldListing().add(18, Cb4r4);
        getListTextFieldListing().add(19, Cb4r5);
        getListTextFieldListing().add(20, Cb4r6);
        getListTextFieldListing().add(21, Db4r2s1);
        getListTextFieldListing().add(22, Db4r2s2);
        getListTextFieldListing().add(23, Db4r2s3);
        getListTextFieldListing().add(24, Db4r3);
        getListTextFieldListing().add(25, Db4r4);
        getListTextFieldListing().add(26, Db4r5);
        getListTextFieldListing().add(27, Db4r6);
        getListTextFieldListing().add(28, Eb4r2s1);
        getListTextFieldListing().add(29, Eb4r2s2);
        getListTextFieldListing().add(30, Eb4r2s3);
        getListTextFieldListing().add(31, Eb4r3);
        getListTextFieldListing().add(32, Eb4r4);
        getListTextFieldListing().add(33, Eb4r5);
        getListTextFieldListing().add(34, Eb4r6);
        getListTextFieldListing().add(35, Fb4r2s1);
        getListTextFieldListing().add(36, Fb4r2s2);
        getListTextFieldListing().add(37, Fb4r2s3);
        getListTextFieldListing().add(38, Fb4r3);
        getListTextFieldListing().add(39, Fb4r4);
        getListTextFieldListing().add(40, Fb4r5);
        getListTextFieldListing().add(41, Fb4r6);
        getListTextFieldListing().add(42, Gb4r2s1);
        getListTextFieldListing().add(43, Gb4r2s2);
        getListTextFieldListing().add(44, Gb4r2s3);
        getListTextFieldListing().add(45, Gb4r3);
        getListTextFieldListing().add(46, Gb4r4);
        getListTextFieldListing().add(47, Gb4r5);
        getListTextFieldListing().add(48, Gb4r6);
        getListTextFieldListing().add(49, Hb4r2s1);
        getListTextFieldListing().add(50, Hb4r2s2);
        getListTextFieldListing().add(51, Hb4r2s3);
        getListTextFieldListing().add(52, Hb4r3);
        getListTextFieldListing().add(53, Hb4r4);
        getListTextFieldListing().add(54, Hb4r5);
        getListTextFieldListing().add(55, Hb4r6);
        getListTextFieldListing().add(56, Ib4r2s1);
        getListTextFieldListing().add(57, Ib4r2s2);
        getListTextFieldListing().add(58, Ib4r2s3);
        getListTextFieldListing().add(59, Ib4r3);
        getListTextFieldListing().add(60, Ib4r4);
        getListTextFieldListing().add(61, Ib4r5);
        getListTextFieldListing().add(62, Ib4r6);
        getListTextFieldListing().add(63, Jb4r2s1);
        getListTextFieldListing().add(64, Jb4r2s2);
        getListTextFieldListing().add(65, Jb4r2s3);
        getListTextFieldListing().add(66, Jb4r3);
        getListTextFieldListing().add(67, Jb4r4);
        getListTextFieldListing().add(68, Jb4r5);
        getListTextFieldListing().add(69, Jb4r6);
        getListTextFieldListing().add(70, Kb4r2s1);
        getListTextFieldListing().add(71, Kb4r2s2);
        getListTextFieldListing().add(72, Kb4r2s3);
        getListTextFieldListing().add(73, Kb4r3);
        getListTextFieldListing().add(74, Kb4r4);
        getListTextFieldListing().add(75, Kb4r5);
        getListTextFieldListing().add(76, Kb4r6);
        getListTextFieldListing().add(77, Lb4r2s1);
        getListTextFieldListing().add(78, Lb4r2s2);
        getListTextFieldListing().add(79, Lb4r2s3);
        getListTextFieldListing().add(80, Lb4r3);
        getListTextFieldListing().add(81, Lb4r4);
        getListTextFieldListing().add(82, Lb4r5);
        getListTextFieldListing().add(83, Lb4r6);
        getListTextFieldListing().add(84, Mb4r2s1);
        getListTextFieldListing().add(85, Mb4r2s2);
        getListTextFieldListing().add(86, Mb4r2s3);
        getListTextFieldListing().add(87, Mb4r3);
        getListTextFieldListing().add(88, Mb4r4);
        getListTextFieldListing().add(89, Mb4r5);
        getListTextFieldListing().add(90, Mb4r6);
        getListTextFieldListing().add(91, Nb4r2s1);
        getListTextFieldListing().add(92, Nb4r2s2);
        getListTextFieldListing().add(93, Nb4r2s3);
        getListTextFieldListing().add(94, Nb4r3);
        getListTextFieldListing().add(95, Nb4r4);
        getListTextFieldListing().add(96, Nb4r5);
        getListTextFieldListing().add(97, Nb4r6);
        getListTextFieldListing().add(98, Ob4r2s1);
        getListTextFieldListing().add(99, Ob4r2s2);
        getListTextFieldListing().add(100, Ob4r2s3);
        getListTextFieldListing().add(101, Ob4r3);
        getListTextFieldListing().add(102, Ob4r4);
        getListTextFieldListing().add(103, Ob4r5);
        getListTextFieldListing().add(104, Ob4r6);
        getListTextFieldListing().add(105, Pb4r2s1);
        getListTextFieldListing().add(106, Pb4r2s2);
        getListTextFieldListing().add(107, Pb4r2s3);
        getListTextFieldListing().add(108, Pb4r3);
        getListTextFieldListing().add(109, Pb4r4);
        getListTextFieldListing().add(110, Pb4r5);
        getListTextFieldListing().add(111, Pb4r6);
        getListTextFieldListing().add(112, Qb4r2s1);
        getListTextFieldListing().add(113, Qb4r2s2);
        getListTextFieldListing().add(114, Qb4r2s3);
        getListTextFieldListing().add(115, Qb4r3);
        getListTextFieldListing().add(116, Qb4r4);
        getListTextFieldListing().add(117, Qb4r5);
        getListTextFieldListing().add(118, Qb4r6);
        getListTextFieldListing().add(119, Rb4r2s1);
        getListTextFieldListing().add(120, Rb4r2s2);
        getListTextFieldListing().add(121, Rb4r2s3);
        getListTextFieldListing().add(122, Rb4r3);
        getListTextFieldListing().add(123, Rb4r4);
        getListTextFieldListing().add(124, Rb4r5);
        getListTextFieldListing().add(125, Rb4r6);
        getListTextFieldListing().add(126, Sb4r2s1);
        getListTextFieldListing().add(127, Sb4r2s2);
        getListTextFieldListing().add(128, Sb4r2s3);
        getListTextFieldListing().add(129, Sb4r3);
        getListTextFieldListing().add(130, Sb4r4);
        getListTextFieldListing().add(131, Sb4r5);
        getListTextFieldListing().add(132, Sb4r6);
        getListTextFieldListing().add(133, Tb4r2s1);
        getListTextFieldListing().add(134, Tb4r2s2);
        getListTextFieldListing().add(135, Tb4r2s3);
        getListTextFieldListing().add(136, Tb4r3);
        getListTextFieldListing().add(137, Tb4r4);
        getListTextFieldListing().add(138, Tb4r5);
        getListTextFieldListing().add(139, Tb4r6);
        maxPos = getListTextFieldListing().size();
    }

    public ArrayList<TextFieldListing> getListTextFieldListingHal2Listing() {
        return listTextFieldHal2Listing;
    }

    public void setListTextFieldListingHal2Listing(ArrayList<TextFieldListing> listTextFieldListingHal2Listing) {
        this.listTextFieldHal2Listing = listTextFieldListingHal2Listing;
    }

    public static int getStartPos() {
        return startPos;
    }

    public static void setStartPos(int startPos) {
        Hal2Listing.startPos = startPos;
    }

    public static int getMaxPos() {
        return maxPos;
    }

    public static void setMaxPos(int maxPos) {
        Hal2Listing.maxPos = maxPos;
    }

    public TextFieldListing getAb4r2s1() {
        return Ab4r2s1;
    }

    public void setAb4r2s1(TextFieldListing Ab4r2s1) {
        this.Ab4r2s1 = Ab4r2s1;
    }

    public TextFieldListing getAb4r2s2() {
        return Ab4r2s2;
    }

    public void setAb4r2s2(TextFieldListing Ab4r2s2) {
        this.Ab4r2s2 = Ab4r2s2;
    }

    public TextFieldListing getAb4r2s3() {
        return Ab4r2s3;
    }

    public void setAb4r2s3(TextFieldListing Ab4r2s3) {
        this.Ab4r2s3 = Ab4r2s3;
    }

    public TextFieldListing getAb4r3() {
        return Ab4r3;
    }

    public void setAb4r3(TextFieldListing Ab4r3) {
        this.Ab4r3 = Ab4r3;
    }

    public TextFieldListing getAb4r4() {
        return Ab4r4;
    }

    public void setAb4r4(TextFieldListing Ab4r4) {
        this.Ab4r4 = Ab4r4;
    }

    public TextFieldListing getAb4r5() {
        return Ab4r5;
    }

    public void setAb4r5(TextFieldListing Ab4r5) {
        this.Ab4r5 = Ab4r5;
    }

    public TextFieldListing getAb4r6() {
        return Ab4r6;
    }

    public void setAb4r6(TextFieldListing Ab4r6) {
        this.Ab4r6 = Ab4r6;
    }

    public TextFieldListing getBb4r2s1() {
        return Bb4r2s1;
    }

    public void setBb4r2s1(TextFieldListing Bb4r2s1) {
        this.Bb4r2s1 = Bb4r2s1;
    }

    public TextFieldListing getBb4r2s2() {
        return Bb4r2s2;
    }

    public void setBb4r2s2(TextFieldListing Bb4r2s2) {
        this.Bb4r2s2 = Bb4r2s2;
    }

    public TextFieldListing getBb4r2s3() {
        return Bb4r2s3;
    }

    public void setBb4r2s3(TextFieldListing Bb4r2s3) {
        this.Bb4r2s3 = Bb4r2s3;
    }

    public TextFieldListing getBb4r3() {
        return Bb4r3;
    }

    public void setBb4r3(TextFieldListing Bb4r3) {
        this.Bb4r3 = Bb4r3;
    }

    public TextFieldListing getBb4r4() {
        return Bb4r4;
    }

    public void setBb4r4(TextFieldListing Bb4r4) {
        this.Bb4r4 = Bb4r4;
    }

    public TextFieldListing getBb4r5() {
        return Bb4r5;
    }

    public void setBb4r5(TextFieldListing Bb4r5) {
        this.Bb4r5 = Bb4r5;
    }

    public TextFieldListing getBb4r6() {
        return Bb4r6;
    }

    public void setBb4r6(TextFieldListing Bb4r6) {
        this.Bb4r6 = Bb4r6;
    }

    public TextFieldListing getCb4r2s1() {
        return Cb4r2s1;
    }

    public void setCb4r2s1(TextFieldListing Cb4r2s1) {
        this.Cb4r2s1 = Cb4r2s1;
    }

    public TextFieldListing getCb4r2s2() {
        return Cb4r2s2;
    }

    public void setCb4r2s2(TextFieldListing Cb4r2s2) {
        this.Cb4r2s2 = Cb4r2s2;
    }

    public TextFieldListing getCb4r2s3() {
        return Cb4r2s3;
    }

    public void setCb4r2s3(TextFieldListing Cb4r2s3) {
        this.Cb4r2s3 = Cb4r2s3;
    }

    public TextFieldListing getCb4r3() {
        return Cb4r3;
    }

    public void setCb4r3(TextFieldListing Cb4r3) {
        this.Cb4r3 = Cb4r3;
    }

    public TextFieldListing getCb4r4() {
        return Cb4r4;
    }

    public void setCb4r4(TextFieldListing Cb4r4) {
        this.Cb4r4 = Cb4r4;
    }

    public TextFieldListing getCb4r5() {
        return Cb4r5;
    }

    public void setCb4r5(TextFieldListing Cb4r5) {
        this.Cb4r5 = Cb4r5;
    }

    public TextFieldListing getCb4r6() {
        return Cb4r6;
    }

    public void setCb4r6(TextFieldListing Cb4r6) {
        this.Cb4r6 = Cb4r6;
    }

    public TextFieldListing getDb4r2s1() {
        return Db4r2s1;
    }

    public void setDb4r2s1(TextFieldListing Db4r2s1) {
        this.Db4r2s1 = Db4r2s1;
    }

    public TextFieldListing getDb4r2s2() {
        return Db4r2s2;
    }

    public void setDb4r2s2(TextFieldListing Db4r2s2) {
        this.Db4r2s2 = Db4r2s2;
    }

    public TextFieldListing getDb4r2s3() {
        return Db4r2s3;
    }

    public void setDb4r2s3(TextFieldListing Db4r2s3) {
        this.Db4r2s3 = Db4r2s3;
    }

    public TextFieldListing getDb4r3() {
        return Db4r3;
    }

    public void setDb4r3(TextFieldListing Db4r3) {
        this.Db4r3 = Db4r3;
    }

    public TextFieldListing getDb4r4() {
        return Db4r4;
    }

    public void setDb4r4(TextFieldListing Db4r4) {
        this.Db4r4 = Db4r4;
    }

    public TextFieldListing getDb4r5() {
        return Db4r5;
    }

    public void setDb4r5(TextFieldListing Db4r5) {
        this.Db4r5 = Db4r5;
    }

    public TextFieldListing getDb4r6() {
        return Db4r6;
    }

    public void setDb4r6(TextFieldListing Db4r6) {
        this.Db4r6 = Db4r6;
    }

    public TextFieldListing getEb4r2s1() {
        return Eb4r2s1;
    }

    public void setEb4r2s1(TextFieldListing Eb4r2s1) {
        this.Eb4r2s1 = Eb4r2s1;
    }

    public TextFieldListing getEb4r2s2() {
        return Eb4r2s2;
    }

    public void setEb4r2s2(TextFieldListing Eb4r2s2) {
        this.Eb4r2s2 = Eb4r2s2;
    }

    public TextFieldListing getEb4r2s3() {
        return Eb4r2s3;
    }

    public void setEb4r2s3(TextFieldListing Eb4r2s3) {
        this.Eb4r2s3 = Eb4r2s3;
    }

    public TextFieldListing getEb4r3() {
        return Eb4r3;
    }

    public void setEb4r3(TextFieldListing Eb4r3) {
        this.Eb4r3 = Eb4r3;
    }

    public TextFieldListing getEb4r4() {
        return Eb4r4;
    }

    public void setEb4r4(TextFieldListing Eb4r4) {
        this.Eb4r4 = Eb4r4;
    }

    public TextFieldListing getEb4r5() {
        return Eb4r5;
    }

    public void setEb4r5(TextFieldListing Eb4r5) {
        this.Eb4r5 = Eb4r5;
    }

    public TextFieldListing getEb4r6() {
        return Eb4r6;
    }

    public void setEb4r6(TextFieldListing Eb4r6) {
        this.Eb4r6 = Eb4r6;
    }

    public TextFieldListing getFb4r2s1() {
        return Fb4r2s1;
    }

    public void setFb4r2s1(TextFieldListing Fb4r2s1) {
        this.Fb4r2s1 = Fb4r2s1;
    }

    public TextFieldListing getFb4r2s2() {
        return Fb4r2s2;
    }

    public void setFb4r2s2(TextFieldListing Fb4r2s2) {
        this.Fb4r2s2 = Fb4r2s2;
    }

    public TextFieldListing getFb4r2s3() {
        return Fb4r2s3;
    }

    public void setFb4r2s3(TextFieldListing Fb4r2s3) {
        this.Fb4r2s3 = Fb4r2s3;
    }

    public TextFieldListing getFb4r3() {
        return Fb4r3;
    }

    public void setFb4r3(TextFieldListing Fb4r3) {
        this.Fb4r3 = Fb4r3;
    }

    public TextFieldListing getFb4r4() {
        return Fb4r4;
    }

    public void setFb4r4(TextFieldListing Fb4r4) {
        this.Fb4r4 = Fb4r4;
    }

    public TextFieldListing getFb4r5() {
        return Fb4r5;
    }

    public void setFb4r5(TextFieldListing Fb4r5) {
        this.Fb4r5 = Fb4r5;
    }

    public TextFieldListing getFb4r6() {
        return Fb4r6;
    }

    public void setFb4r6(TextFieldListing Fb4r6) {
        this.Fb4r6 = Fb4r6;
    }

    public TextFieldListing getGb4r2s1() {
        return Gb4r2s1;
    }

    public void setGb4r2s1(TextFieldListing Gb4r2s1) {
        this.Gb4r2s1 = Gb4r2s1;
    }

    public TextFieldListing getGb4r2s2() {
        return Gb4r2s2;
    }

    public void setGb4r2s2(TextFieldListing Gb4r2s2) {
        this.Gb4r2s2 = Gb4r2s2;
    }

    public TextFieldListing getGb4r2s3() {
        return Gb4r2s3;
    }

    public void setGb4r2s3(TextFieldListing Gb4r2s3) {
        this.Gb4r2s3 = Gb4r2s3;
    }

    public TextFieldListing getGb4r3() {
        return Gb4r3;
    }

    public void setGb4r3(TextFieldListing Gb4r3) {
        this.Gb4r3 = Gb4r3;
    }

    public TextFieldListing getGb4r4() {
        return Gb4r4;
    }

    public void setGb4r4(TextFieldListing Gb4r4) {
        this.Gb4r4 = Gb4r4;
    }

    public TextFieldListing getGb4r5() {
        return Gb4r5;
    }

    public void setGb4r5(TextFieldListing Gb4r5) {
        this.Gb4r5 = Gb4r5;
    }

    public TextFieldListing getGb4r6() {
        return Gb4r6;
    }

    public void setGb4r6(TextFieldListing Gb4r6) {
        this.Gb4r6 = Gb4r6;
    }

    public TextFieldListing getHb4r2s1() {
        return Hb4r2s1;
    }

    public void setHb4r2s1(TextFieldListing Hb4r2s1) {
        this.Hb4r2s1 = Hb4r2s1;
    }

    public TextFieldListing getHb4r2s2() {
        return Hb4r2s2;
    }

    public void setHb4r2s2(TextFieldListing Hb4r2s2) {
        this.Hb4r2s2 = Hb4r2s2;
    }

    public TextFieldListing getHb4r2s3() {
        return Hb4r2s3;
    }

    public void setHb4r2s3(TextFieldListing Hb4r2s3) {
        this.Hb4r2s3 = Hb4r2s3;
    }

    public TextFieldListing getHb4r3() {
        return Hb4r3;
    }

    public void setHb4r3(TextFieldListing Hb4r3) {
        this.Hb4r3 = Hb4r3;
    }

    public TextFieldListing getHb4r4() {
        return Hb4r4;
    }

    public void setHb4r4(TextFieldListing Hb4r4) {
        this.Hb4r4 = Hb4r4;
    }

    public TextFieldListing getHb4r5() {
        return Hb4r5;
    }

    public void setHb4r5(TextFieldListing Hb4r5) {
        this.Hb4r5 = Hb4r5;
    }

    public TextFieldListing getHb4r6() {
        return Hb4r6;
    }

    public void setHb4r6(TextFieldListing Hb4r6) {
        this.Hb4r6 = Hb4r6;
    }

    public TextFieldListing getIb4r2s1() {
        return Ib4r2s1;
    }

    public void setIb4r2s1(TextFieldListing Ib4r2s1) {
        this.Ib4r2s1 = Ib4r2s1;
    }

    public TextFieldListing getIb4r2s2() {
        return Ib4r2s2;
    }

    public void setIb4r2s2(TextFieldListing Ib4r2s2) {
        this.Ib4r2s2 = Ib4r2s2;
    }

    public TextFieldListing getIb4r2s3() {
        return Ib4r2s3;
    }

    public void setIb4r2s3(TextFieldListing Ib4r2s3) {
        this.Ib4r2s3 = Ib4r2s3;
    }

    public TextFieldListing getIb4r3() {
        return Ib4r3;
    }

    public void setIb4r3(TextFieldListing Ib4r3) {
        this.Ib4r3 = Ib4r3;
    }

    public TextFieldListing getIb4r4() {
        return Ib4r4;
    }

    public void setIb4r4(TextFieldListing Ib4r4) {
        this.Ib4r4 = Ib4r4;
    }

    public TextFieldListing getIb4r5() {
        return Ib4r5;
    }

    public void setIb4r5(TextFieldListing Ib4r5) {
        this.Ib4r5 = Ib4r5;
    }

    public TextFieldListing getIb4r6() {
        return Ib4r6;
    }

    public void setIb4r6(TextFieldListing Ib4r6) {
        this.Ib4r6 = Ib4r6;
    }

    public TextFieldListing getJb4r2s1() {
        return Jb4r2s1;
    }

    public void setJb4r2s1(TextFieldListing Jb4r2s1) {
        this.Jb4r2s1 = Jb4r2s1;
    }

    public TextFieldListing getJb4r2s2() {
        return Jb4r2s2;
    }

    public void setJb4r2s2(TextFieldListing Jb4r2s2) {
        this.Jb4r2s2 = Jb4r2s2;
    }

    public TextFieldListing getJb4r2s3() {
        return Jb4r2s3;
    }

    public void setJb4r2s3(TextFieldListing Jb4r2s3) {
        this.Jb4r2s3 = Jb4r2s3;
    }

    public TextFieldListing getJb4r3() {
        return Jb4r3;
    }

    public void setJb4r3(TextFieldListing Jb4r3) {
        this.Jb4r3 = Jb4r3;
    }

    public TextFieldListing getJb4r4() {
        return Jb4r4;
    }

    public void setJb4r4(TextFieldListing Jb4r4) {
        this.Jb4r4 = Jb4r4;
    }

    public TextFieldListing getJb4r5() {
        return Jb4r5;
    }

    public void setJb4r5(TextFieldListing Jb4r5) {
        this.Jb4r5 = Jb4r5;
    }

    public TextFieldListing getJb4r6() {
        return Jb4r6;
    }

    public void setJb4r6(TextFieldListing Jb4r6) {
        this.Jb4r6 = Jb4r6;
    }

    public TextFieldListing getKb4r2s1() {
        return Kb4r2s1;
    }

    public void setKb4r2s1(TextFieldListing Kb4r2s1) {
        this.Kb4r2s1 = Kb4r2s1;
    }

    public TextFieldListing getKb4r2s2() {
        return Kb4r2s2;
    }

    public void setKb4r2s2(TextFieldListing Kb4r2s2) {
        this.Kb4r2s2 = Kb4r2s2;
    }

    public TextFieldListing getKb4r2s3() {
        return Kb4r2s3;
    }

    public void setKb4r2s3(TextFieldListing Kb4r2s3) {
        this.Kb4r2s3 = Kb4r2s3;
    }

    public TextFieldListing getKb4r3() {
        return Kb4r3;
    }

    public void setKb4r3(TextFieldListing Kb4r3) {
        this.Kb4r3 = Kb4r3;
    }

    public TextFieldListing getKb4r4() {
        return Kb4r4;
    }

    public void setKb4r4(TextFieldListing Kb4r4) {
        this.Kb4r4 = Kb4r4;
    }

    public TextFieldListing getKb4r5() {
        return Kb4r5;
    }

    public void setKb4r5(TextFieldListing Kb4r5) {
        this.Kb4r5 = Kb4r5;
    }

    public TextFieldListing getKb4r6() {
        return Kb4r6;
    }

    public void setKb4r6(TextFieldListing Kb4r6) {
        this.Kb4r6 = Kb4r6;
    }

    public TextFieldListing getLb4r2s1() {
        return Lb4r2s1;
    }

    public void setLb4r2s1(TextFieldListing Lb4r2s1) {
        this.Lb4r2s1 = Lb4r2s1;
    }

    public TextFieldListing getLb4r2s2() {
        return Lb4r2s2;
    }

    public void setLb4r2s2(TextFieldListing Lb4r2s2) {
        this.Lb4r2s2 = Lb4r2s2;
    }

    public TextFieldListing getLb4r2s3() {
        return Lb4r2s3;
    }

    public void setLb4r2s3(TextFieldListing Lb4r2s3) {
        this.Lb4r2s3 = Lb4r2s3;
    }

    public TextFieldListing getLb4r3() {
        return Lb4r3;
    }

    public void setLb4r3(TextFieldListing Lb4r3) {
        this.Lb4r3 = Lb4r3;
    }

    public TextFieldListing getLb4r4() {
        return Lb4r4;
    }

    public void setLb4r4(TextFieldListing Lb4r4) {
        this.Lb4r4 = Lb4r4;
    }

    public TextFieldListing getLb4r5() {
        return Lb4r5;
    }

    public void setLb4r5(TextFieldListing Lb4r5) {
        this.Lb4r5 = Lb4r5;
    }

    public TextFieldListing getLb4r6() {
        return Lb4r6;
    }

    public void setLb4r6(TextFieldListing Lb4r6) {
        this.Lb4r6 = Lb4r6;
    }

    public TextFieldListing getMb4r2s1() {
        return Mb4r2s1;
    }

    public void setMb4r2s1(TextFieldListing Mb4r2s1) {
        this.Mb4r2s1 = Mb4r2s1;
    }

    public TextFieldListing getMb4r2s2() {
        return Mb4r2s2;
    }

    public void setMb4r2s2(TextFieldListing Mb4r2s2) {
        this.Mb4r2s2 = Mb4r2s2;
    }

    public TextFieldListing getMb4r2s3() {
        return Mb4r2s3;
    }

    public void setMb4r2s3(TextFieldListing Mb4r2s3) {
        this.Mb4r2s3 = Mb4r2s3;
    }

    public TextFieldListing getMb4r3() {
        return Mb4r3;
    }

    public void setMb4r3(TextFieldListing Mb4r3) {
        this.Mb4r3 = Mb4r3;
    }

    public TextFieldListing getMb4r4() {
        return Mb4r4;
    }

    public void setMb4r4(TextFieldListing Mb4r4) {
        this.Mb4r4 = Mb4r4;
    }

    public TextFieldListing getMb4r5() {
        return Mb4r5;
    }

    public void setMb4r5(TextFieldListing Mb4r5) {
        this.Mb4r5 = Mb4r5;
    }

    public TextFieldListing getMb4r6() {
        return Mb4r6;
    }

    public void setMb4r6(TextFieldListing Mb4r6) {
        this.Mb4r6 = Mb4r6;
    }

    public TextFieldListing getNb4r2s1() {
        return Nb4r2s1;
    }

    public void setNb4r2s1(TextFieldListing Nb4r2s1) {
        this.Nb4r2s1 = Nb4r2s1;
    }

    public TextFieldListing getNb4r2s2() {
        return Nb4r2s2;
    }

    public void setNb4r2s2(TextFieldListing Nb4r2s2) {
        this.Nb4r2s2 = Nb4r2s2;
    }

    public TextFieldListing getNb4r2s3() {
        return Nb4r2s3;
    }

    public void setNb4r2s3(TextFieldListing Nb4r2s3) {
        this.Nb4r2s3 = Nb4r2s3;
    }

    public TextFieldListing getNb4r3() {
        return Nb4r3;
    }

    public void setNb4r3(TextFieldListing Nb4r3) {
        this.Nb4r3 = Nb4r3;
    }

    public TextFieldListing getNb4r4() {
        return Nb4r4;
    }

    public void setNb4r4(TextFieldListing Nb4r4) {
        this.Nb4r4 = Nb4r4;
    }

    public TextFieldListing getNb4r5() {
        return Nb4r5;
    }

    public void setNb4r5(TextFieldListing Nb4r5) {
        this.Nb4r5 = Nb4r5;
    }

    public TextFieldListing getNb4r6() {
        return Nb4r6;
    }

    public void setNb4r6(TextFieldListing Nb4r6) {
        this.Nb4r6 = Nb4r6;
    }

    public TextFieldListing getOb4r2s1() {
        return Ob4r2s1;
    }

    public void setOb4r2s1(TextFieldListing Ob4r2s1) {
        this.Ob4r2s1 = Ob4r2s1;
    }

    public TextFieldListing getOb4r2s2() {
        return Ob4r2s2;
    }

    public void setOb4r2s2(TextFieldListing Ob4r2s2) {
        this.Ob4r2s2 = Ob4r2s2;
    }

    public TextFieldListing getOb4r2s3() {
        return Ob4r2s3;
    }

    public void setOb4r2s3(TextFieldListing Ob4r2s3) {
        this.Ob4r2s3 = Ob4r2s3;
    }

    public TextFieldListing getOb4r3() {
        return Ob4r3;
    }

    public void setOb4r3(TextFieldListing Ob4r3) {
        this.Ob4r3 = Ob4r3;
    }

    public TextFieldListing getOb4r4() {
        return Ob4r4;
    }

    public void setOb4r4(TextFieldListing Ob4r4) {
        this.Ob4r4 = Ob4r4;
    }

    public TextFieldListing getOb4r5() {
        return Ob4r5;
    }

    public void setOb4r5(TextFieldListing Ob4r5) {
        this.Ob4r5 = Ob4r5;
    }

    public TextFieldListing getOb4r6() {
        return Ob4r6;
    }

    public void setOb4r6(TextFieldListing Ob4r6) {
        this.Ob4r6 = Ob4r6;
    }

    public TextFieldListing getPb4r2s1() {
        return Pb4r2s1;
    }

    public void setPb4r2s1(TextFieldListing Pb4r2s1) {
        this.Pb4r2s1 = Pb4r2s1;
    }

    public TextFieldListing getPb4r2s2() {
        return Pb4r2s2;
    }

    public void setPb4r2s2(TextFieldListing Pb4r2s2) {
        this.Pb4r2s2 = Pb4r2s2;
    }

    public TextFieldListing getPb4r2s3() {
        return Pb4r2s3;
    }

    public void setPb4r2s3(TextFieldListing Pb4r2s3) {
        this.Pb4r2s3 = Pb4r2s3;
    }

    public TextFieldListing getPb4r3() {
        return Pb4r3;
    }

    public void setPb4r3(TextFieldListing Pb4r3) {
        this.Pb4r3 = Pb4r3;
    }

    public TextFieldListing getPb4r4() {
        return Pb4r4;
    }

    public void setPb4r4(TextFieldListing Pb4r4) {
        this.Pb4r4 = Pb4r4;
    }

    public TextFieldListing getPb4r5() {
        return Pb4r5;
    }

    public void setPb4r5(TextFieldListing Pb4r5) {
        this.Pb4r5 = Pb4r5;
    }

    public TextFieldListing getPb4r6() {
        return Pb4r6;
    }

    public void setPb4r6(TextFieldListing Pb4r6) {
        this.Pb4r6 = Pb4r6;
    }

    public TextFieldListing getQb4r2s1() {
        return Qb4r2s1;
    }

    public void setQb4r2s1(TextFieldListing Qb4r2s1) {
        this.Qb4r2s1 = Qb4r2s1;
    }

    public TextFieldListing getQb4r2s2() {
        return Qb4r2s2;
    }

    public void setQb4r2s2(TextFieldListing Qb4r2s2) {
        this.Qb4r2s2 = Qb4r2s2;
    }

    public TextFieldListing getQb4r2s3() {
        return Qb4r2s3;
    }

    public void setQb4r2s3(TextFieldListing Qb4r2s3) {
        this.Qb4r2s3 = Qb4r2s3;
    }

    public TextFieldListing getQb4r3() {
        return Qb4r3;
    }

    public void setQb4r3(TextFieldListing Qb4r3) {
        this.Qb4r3 = Qb4r3;
    }

    public TextFieldListing getQb4r4() {
        return Qb4r4;
    }

    public void setQb4r4(TextFieldListing Qb4r4) {
        this.Qb4r4 = Qb4r4;
    }

    public TextFieldListing getQb4r5() {
        return Qb4r5;
    }

    public void setQb4r5(TextFieldListing Qb4r5) {
        this.Qb4r5 = Qb4r5;
    }

    public TextFieldListing getQb4r6() {
        return Qb4r6;
    }

    public void setQb4r6(TextFieldListing Qb4r6) {
        this.Qb4r6 = Qb4r6;
    }

    public TextFieldListing getRb4r2s1() {
        return Rb4r2s1;
    }

    public void setRb4r2s1(TextFieldListing Rb4r2s1) {
        this.Rb4r2s1 = Rb4r2s1;
    }

    public TextFieldListing getRb4r2s2() {
        return Rb4r2s2;
    }

    public void setRb4r2s2(TextFieldListing Rb4r2s2) {
        this.Rb4r2s2 = Rb4r2s2;
    }

    public TextFieldListing getRb4r2s3() {
        return Rb4r2s3;
    }

    public void setRb4r2s3(TextFieldListing Rb4r2s3) {
        this.Rb4r2s3 = Rb4r2s3;
    }

    public TextFieldListing getRb4r3() {
        return Rb4r3;
    }

    public void setRb4r3(TextFieldListing Rb4r3) {
        this.Rb4r3 = Rb4r3;
    }

    public TextFieldListing getRb4r4() {
        return Rb4r4;
    }

    public void setRb4r4(TextFieldListing Rb4r4) {
        this.Rb4r4 = Rb4r4;
    }

    public TextFieldListing getRb4r5() {
        return Rb4r5;
    }

    public void setRb4r5(TextFieldListing Rb4r5) {
        this.Rb4r5 = Rb4r5;
    }

    public TextFieldListing getRb4r6() {
        return Rb4r6;
    }

    public void setRb4r6(TextFieldListing Rb4r6) {
        this.Rb4r6 = Rb4r6;
    }

    public TextFieldListing getSb4r2s1() {
        return Sb4r2s1;
    }

    public void setSb4r2s1(TextFieldListing Sb4r2s1) {
        this.Sb4r2s1 = Sb4r2s1;
    }

    public TextFieldListing getSb4r2s2() {
        return Sb4r2s2;
    }

    public void setSb4r2s2(TextFieldListing Sb4r2s2) {
        this.Sb4r2s2 = Sb4r2s2;
    }

    public TextFieldListing getSb4r2s3() {
        return Sb4r2s3;
    }

    public void setSb4r2s3(TextFieldListing Sb4r2s3) {
        this.Sb4r2s3 = Sb4r2s3;
    }

    public TextFieldListing getSb4r3() {
        return Sb4r3;
    }

    public void setSb4r3(TextFieldListing Sb4r3) {
        this.Sb4r3 = Sb4r3;
    }

    public TextFieldListing getSb4r4() {
        return Sb4r4;
    }

    public void setSb4r4(TextFieldListing Sb4r4) {
        this.Sb4r4 = Sb4r4;
    }

    public TextFieldListing getSb4r5() {
        return Sb4r5;
    }

    public void setSb4r5(TextFieldListing Sb4r5) {
        this.Sb4r5 = Sb4r5;
    }

    public TextFieldListing getSb4r6() {
        return Sb4r6;
    }

    public void setSb4r6(TextFieldListing Sb4r6) {
        this.Sb4r6 = Sb4r6;
    }

    public TextFieldListing getTb4r2s1() {
        return Tb4r2s1;
    }

    public void setTb4r2s1(TextFieldListing Tb4r2s1) {
        this.Tb4r2s1 = Tb4r2s1;
    }

    public TextFieldListing getTb4r2s2() {
        return Tb4r2s2;
    }

    public void setTb4r2s2(TextFieldListing Tb4r2s2) {
        this.Tb4r2s2 = Tb4r2s2;
    }

    public TextFieldListing getTb4r2s3() {
        return Tb4r2s3;
    }

    public void setTb4r2s3(TextFieldListing Tb4r2s3) {
        this.Tb4r2s3 = Tb4r2s3;
    }

    public TextFieldListing getTb4r3() {
        return Tb4r3;
    }

    public void setTb4r3(TextFieldListing Tb4r3) {
        this.Tb4r3 = Tb4r3;
    }

    public TextFieldListing getTb4r4() {
        return Tb4r4;
    }

    public void setTb4r4(TextFieldListing Tb4r4) {
        this.Tb4r4 = Tb4r4;
    }

    public TextFieldListing getTb4r5() {
        return Tb4r5;
    }

    public void setTb4r5(TextFieldListing Tb4r5) {
        this.Tb4r5 = Tb4r5;
    }

    public TextFieldListing getTb4r6() {
        return Tb4r6;
    }

    public void setTb4r6(TextFieldListing Tb4r6) {
        this.Tb4r6 = Tb4r6;
    }

    public sp.imageClass.Hal2Listing getHal2Listing1() {
        return hal2Listing1;
    }

    public void setHal2Listing1(sp.imageClass.Hal2Listing hal2Listing1) {
        this.hal2Listing1 = hal2Listing1;
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

        hal2Listing1 = new sp.imageClass.Hal2Listing();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        Ab4r2s1 = new sp.component.TextFieldListing();
        Ab4r2s2 = new sp.component.TextFieldListing();
        Ab4r2s3 = new sp.component.TextFieldListing();
        Ab4r3 = new sp.component.TextFieldListing();
        Ab4r4 = new sp.component.TextFieldListing();
        Ab4r5 = new sp.component.TextFieldListing();
        Ab4r6 = new sp.component.TextFieldListing();
        Bb4r2s1 = new sp.component.TextFieldListing();
        Bb4r2s2 = new sp.component.TextFieldListing();
        Bb4r2s3 = new sp.component.TextFieldListing();
        Bb4r3 = new sp.component.TextFieldListing();
        Bb4r4 = new sp.component.TextFieldListing();
        Bb4r5 = new sp.component.TextFieldListing();
        Bb4r6 = new sp.component.TextFieldListing();
        Cb4r2s1 = new sp.component.TextFieldListing();
        Cb4r2s2 = new sp.component.TextFieldListing();
        Cb4r2s3 = new sp.component.TextFieldListing();
        Cb4r3 = new sp.component.TextFieldListing();
        Cb4r4 = new sp.component.TextFieldListing();
        Cb4r5 = new sp.component.TextFieldListing();
        Cb4r6 = new sp.component.TextFieldListing();
        Db4r2s1 = new sp.component.TextFieldListing();
        Db4r2s2 = new sp.component.TextFieldListing();
        Db4r2s3 = new sp.component.TextFieldListing();
        Db4r3 = new sp.component.TextFieldListing();
        Db4r4 = new sp.component.TextFieldListing();
        Db4r5 = new sp.component.TextFieldListing();
        Db4r6 = new sp.component.TextFieldListing();
        Eb4r2s1 = new sp.component.TextFieldListing();
        Eb4r2s2 = new sp.component.TextFieldListing();
        Eb4r2s3 = new sp.component.TextFieldListing();
        Eb4r3 = new sp.component.TextFieldListing();
        Eb4r4 = new sp.component.TextFieldListing();
        Eb4r5 = new sp.component.TextFieldListing();
        Eb4r6 = new sp.component.TextFieldListing();
        Fb4r2s1 = new sp.component.TextFieldListing();
        Fb4r2s2 = new sp.component.TextFieldListing();
        Fb4r2s3 = new sp.component.TextFieldListing();
        Fb4r3 = new sp.component.TextFieldListing();
        Fb4r4 = new sp.component.TextFieldListing();
        Fb4r5 = new sp.component.TextFieldListing();
        Fb4r6 = new sp.component.TextFieldListing();
        Gb4r2s1 = new sp.component.TextFieldListing();
        Gb4r2s2 = new sp.component.TextFieldListing();
        Gb4r2s3 = new sp.component.TextFieldListing();
        Gb4r3 = new sp.component.TextFieldListing();
        Gb4r4 = new sp.component.TextFieldListing();
        Gb4r5 = new sp.component.TextFieldListing();
        Gb4r6 = new sp.component.TextFieldListing();
        Hb4r2s1 = new sp.component.TextFieldListing();
        Hb4r2s2 = new sp.component.TextFieldListing();
        Hb4r2s3 = new sp.component.TextFieldListing();
        Hb4r3 = new sp.component.TextFieldListing();
        Hb4r4 = new sp.component.TextFieldListing();
        Hb4r5 = new sp.component.TextFieldListing();
        Hb4r6 = new sp.component.TextFieldListing();
        Ib4r2s1 = new sp.component.TextFieldListing();
        Ib4r2s2 = new sp.component.TextFieldListing();
        Ib4r2s3 = new sp.component.TextFieldListing();
        Ib4r3 = new sp.component.TextFieldListing();
        Ib4r4 = new sp.component.TextFieldListing();
        Ib4r5 = new sp.component.TextFieldListing();
        Ib4r6 = new sp.component.TextFieldListing();
        Jb4r2s1 = new sp.component.TextFieldListing();
        Jb4r2s2 = new sp.component.TextFieldListing();
        Jb4r2s3 = new sp.component.TextFieldListing();
        Jb4r3 = new sp.component.TextFieldListing();
        Jb4r4 = new sp.component.TextFieldListing();
        Jb4r5 = new sp.component.TextFieldListing();
        Jb4r6 = new sp.component.TextFieldListing();
        Kb4r2s1 = new sp.component.TextFieldListing();
        Kb4r2s2 = new sp.component.TextFieldListing();
        Kb4r2s3 = new sp.component.TextFieldListing();
        Kb4r3 = new sp.component.TextFieldListing();
        Kb4r4 = new sp.component.TextFieldListing();
        Kb4r5 = new sp.component.TextFieldListing();
        Kb4r6 = new sp.component.TextFieldListing();
        Lb4r2s1 = new sp.component.TextFieldListing();
        Lb4r2s2 = new sp.component.TextFieldListing();
        Lb4r2s3 = new sp.component.TextFieldListing();
        Lb4r3 = new sp.component.TextFieldListing();
        Lb4r4 = new sp.component.TextFieldListing();
        Lb4r5 = new sp.component.TextFieldListing();
        Lb4r6 = new sp.component.TextFieldListing();
        Mb4r2s1 = new sp.component.TextFieldListing();
        Mb4r2s2 = new sp.component.TextFieldListing();
        Mb4r2s3 = new sp.component.TextFieldListing();
        Mb4r3 = new sp.component.TextFieldListing();
        Mb4r4 = new sp.component.TextFieldListing();
        Mb4r5 = new sp.component.TextFieldListing();
        Mb4r6 = new sp.component.TextFieldListing();
        Nb4r2s1 = new sp.component.TextFieldListing();
        Nb4r2s2 = new sp.component.TextFieldListing();
        Nb4r2s3 = new sp.component.TextFieldListing();
        Nb4r3 = new sp.component.TextFieldListing();
        Nb4r4 = new sp.component.TextFieldListing();
        Nb4r5 = new sp.component.TextFieldListing();
        Nb4r6 = new sp.component.TextFieldListing();
        Ob4r2s1 = new sp.component.TextFieldListing();
        Ob4r2s2 = new sp.component.TextFieldListing();
        Ob4r2s3 = new sp.component.TextFieldListing();
        Ob4r3 = new sp.component.TextFieldListing();
        Ob4r4 = new sp.component.TextFieldListing();
        Ob4r5 = new sp.component.TextFieldListing();
        Ob4r6 = new sp.component.TextFieldListing();
        Pb4r2s1 = new sp.component.TextFieldListing();
        Pb4r2s2 = new sp.component.TextFieldListing();
        Pb4r2s3 = new sp.component.TextFieldListing();
        Pb4r3 = new sp.component.TextFieldListing();
        Pb4r4 = new sp.component.TextFieldListing();
        Pb4r5 = new sp.component.TextFieldListing();
        Pb4r6 = new sp.component.TextFieldListing();
        Qb4r2s1 = new sp.component.TextFieldListing();
        Qb4r2s2 = new sp.component.TextFieldListing();
        Qb4r2s3 = new sp.component.TextFieldListing();
        Qb4r3 = new sp.component.TextFieldListing();
        Qb4r4 = new sp.component.TextFieldListing();
        Qb4r5 = new sp.component.TextFieldListing();
        Qb4r6 = new sp.component.TextFieldListing();
        Rb4r2s1 = new sp.component.TextFieldListing();
        Rb4r2s2 = new sp.component.TextFieldListing();
        Rb4r2s3 = new sp.component.TextFieldListing();
        Rb4r3 = new sp.component.TextFieldListing();
        Rb4r4 = new sp.component.TextFieldListing();
        Rb4r5 = new sp.component.TextFieldListing();
        Rb4r6 = new sp.component.TextFieldListing();
        Sb4r2s1 = new sp.component.TextFieldListing();
        Sb4r2s2 = new sp.component.TextFieldListing();
        Sb4r2s3 = new sp.component.TextFieldListing();
        Sb4r3 = new sp.component.TextFieldListing();
        Sb4r4 = new sp.component.TextFieldListing();
        Sb4r5 = new sp.component.TextFieldListing();
        Sb4r6 = new sp.component.TextFieldListing();
        Tb4r2s1 = new sp.component.TextFieldListing();
        Tb4r2s2 = new sp.component.TextFieldListing();
        Tb4r2s3 = new sp.component.TextFieldListing();
        Tb4r3 = new sp.component.TextFieldListing();
        Tb4r4 = new sp.component.TextFieldListing();
        Tb4r5 = new sp.component.TextFieldListing();
        Tb4r6 = new sp.component.TextFieldListing();

        setLayout(new java.awt.BorderLayout());

        jLayeredPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Ab4r2s1.setAngka(true);
        Ab4r2s1.setMaxDigit(999);
        Ab4r2s1.setMinDigit(1);
        Ab4r2s1.setRequired(true);
        jLayeredPane1.add(Ab4r2s1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 40, 30));

        Ab4r2s2.setAngka(true);
        Ab4r2s2.setMaxDigit(999);
        Ab4r2s2.setMinDigit(1);
        Ab4r2s2.setRequired(true);
        Ab4r2s2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ab4r2s2ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(Ab4r2s2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 50, 30));

        Ab4r2s3.setAngka(true);
        Ab4r2s3.setMaxDigit(999);
        Ab4r2s3.setMinDigit(1);
        Ab4r2s3.setRequired(true);
        jLayeredPane1.add(Ab4r2s3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 50, 30));

        Ab4r3.setHuruf(true);
        Ab4r3.setLength(100);
        Ab4r3.setRequired(true);
        Ab4r3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ab4r3ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(Ab4r3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 220, 30));

        Ab4r4.setHuruf(true);
        Ab4r4.setKhusus(true);
        Ab4r4.setKhususType('3');
        Ab4r4.setLength(5);
        Ab4r4.setRequired(true);
        jLayeredPane1.add(Ab4r4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 160, 90, 30));

        Ab4r5.setAngka(true);
        Ab4r5.setKhusus(true);
        Ab4r5.setKhususType('2');
        Ab4r5.setMaxDigit(64);
        Ab4r5.setMinDigit(15);
        Ab4r5.setRequired(true);
        jLayeredPane1.add(Ab4r5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 160, 50, 30));

        Ab4r6.setAngka(true);
        Ab4r6.setHuruf(true);
        Ab4r6.setLength(200);
        Ab4r6.setRequired(true);
        jLayeredPane1.add(Ab4r6, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 160, 290, 30));

        Bb4r2s1.setAngka(true);
        Bb4r2s1.setMaxDigit(999);
        Bb4r2s1.setMinDigit(1);
        Bb4r2s1.setRequired(true);
        jLayeredPane1.add(Bb4r2s1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 40, 30));

        Bb4r2s2.setAngka(true);
        Bb4r2s2.setMaxDigit(999);
        Bb4r2s2.setMinDigit(1);
        Bb4r2s2.setRequired(true);
        jLayeredPane1.add(Bb4r2s2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 50, 30));

        Bb4r2s3.setAngka(true);
        Bb4r2s3.setMaxDigit(999);
        Bb4r2s3.setMinDigit(1);
        Bb4r2s3.setRequired(true);
        jLayeredPane1.add(Bb4r2s3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 50, 30));

        Bb4r3.setHuruf(true);
        Bb4r3.setLength(100);
        Bb4r3.setRequired(true);
        jLayeredPane1.add(Bb4r3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 220, 30));

        Bb4r4.setHuruf(true);
        Bb4r4.setKhusus(true);
        Bb4r4.setKhususType('3');
        Bb4r4.setLength(5);
        Bb4r4.setRequired(true);
        jLayeredPane1.add(Bb4r4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 200, 90, 30));

        Bb4r5.setAngka(true);
        Bb4r5.setKhusus(true);
        Bb4r5.setKhususType('2');
        Bb4r5.setMaxDigit(64);
        Bb4r5.setMinDigit(15);
        Bb4r5.setRequired(true);
        jLayeredPane1.add(Bb4r5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 200, 50, 30));

        Bb4r6.setAngka(true);
        Bb4r6.setHuruf(true);
        Bb4r6.setLength(200);
        Bb4r6.setRequired(true);
        jLayeredPane1.add(Bb4r6, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 200, 290, 30));

        Cb4r2s1.setAngka(true);
        Cb4r2s1.setMaxDigit(999);
        Cb4r2s1.setMinDigit(1);
        Cb4r2s1.setRequired(true);
        jLayeredPane1.add(Cb4r2s1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 40, 30));

        Cb4r2s2.setAngka(true);
        Cb4r2s2.setMaxDigit(999);
        Cb4r2s2.setMinDigit(1);
        Cb4r2s2.setRequired(true);
        jLayeredPane1.add(Cb4r2s2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 50, 30));

        Cb4r2s3.setAngka(true);
        Cb4r2s3.setMaxDigit(999);
        Cb4r2s3.setMinDigit(1);
        Cb4r2s3.setRequired(true);
        jLayeredPane1.add(Cb4r2s3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 50, 30));

        Cb4r3.setHuruf(true);
        Cb4r3.setLength(100);
        Cb4r3.setRequired(true);
        jLayeredPane1.add(Cb4r3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, 220, 30));

        Cb4r4.setHuruf(true);
        Cb4r4.setKhusus(true);
        Cb4r4.setKhususType('3');
        Cb4r4.setLength(5);
        Cb4r4.setRequired(true);
        jLayeredPane1.add(Cb4r4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 240, 90, 30));

        Cb4r5.setAngka(true);
        Cb4r5.setKhusus(true);
        Cb4r5.setKhususType('2');
        Cb4r5.setMaxDigit(64);
        Cb4r5.setMinDigit(15);
        Cb4r5.setRequired(true);
        jLayeredPane1.add(Cb4r5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 240, 50, 30));

        Cb4r6.setAngka(true);
        Cb4r6.setHuruf(true);
        Cb4r6.setLength(200);
        Cb4r6.setRequired(true);
        jLayeredPane1.add(Cb4r6, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 240, 290, 30));

        Db4r2s1.setAngka(true);
        Db4r2s1.setMaxDigit(999);
        Db4r2s1.setMinDigit(1);
        Db4r2s1.setRequired(true);
        jLayeredPane1.add(Db4r2s1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 40, 30));

        Db4r2s2.setAngka(true);
        Db4r2s2.setMaxDigit(999);
        Db4r2s2.setMinDigit(1);
        Db4r2s2.setRequired(true);
        jLayeredPane1.add(Db4r2s2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 50, 30));

        Db4r2s3.setAngka(true);
        Db4r2s3.setMaxDigit(999);
        Db4r2s3.setMinDigit(1);
        Db4r2s3.setRequired(true);
        jLayeredPane1.add(Db4r2s3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 50, 30));

        Db4r3.setHuruf(true);
        Db4r3.setLength(100);
        Db4r3.setRequired(true);
        jLayeredPane1.add(Db4r3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, 220, 30));

        Db4r4.setHuruf(true);
        Db4r4.setKhusus(true);
        Db4r4.setKhususType('3');
        Db4r4.setLength(5);
        Db4r4.setRequired(true);
        jLayeredPane1.add(Db4r4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 280, 90, 30));

        Db4r5.setAngka(true);
        Db4r5.setKhusus(true);
        Db4r5.setKhususType('2');
        Db4r5.setMaxDigit(64);
        Db4r5.setMinDigit(15);
        Db4r5.setRequired(true);
        jLayeredPane1.add(Db4r5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 280, 50, 30));

        Db4r6.setAngka(true);
        Db4r6.setHuruf(true);
        Db4r6.setLength(200);
        Db4r6.setRequired(true);
        jLayeredPane1.add(Db4r6, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 280, 290, 30));

        Eb4r2s1.setAngka(true);
        Eb4r2s1.setMaxDigit(999);
        Eb4r2s1.setMinDigit(1);
        Eb4r2s1.setRequired(true);
        jLayeredPane1.add(Eb4r2s1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 40, 30));

        Eb4r2s2.setAngka(true);
        Eb4r2s2.setMaxDigit(999);
        Eb4r2s2.setMinDigit(1);
        Eb4r2s2.setRequired(true);
        jLayeredPane1.add(Eb4r2s2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, 50, 30));

        Eb4r2s3.setAngka(true);
        Eb4r2s3.setMaxDigit(999);
        Eb4r2s3.setMinDigit(1);
        Eb4r2s3.setRequired(true);
        jLayeredPane1.add(Eb4r2s3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 50, 30));

        Eb4r3.setHuruf(true);
        Eb4r3.setLength(100);
        Eb4r3.setRequired(true);
        jLayeredPane1.add(Eb4r3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, 220, 30));

        Eb4r4.setHuruf(true);
        Eb4r4.setKhusus(true);
        Eb4r4.setKhususType('3');
        Eb4r4.setLength(5);
        Eb4r4.setRequired(true);
        jLayeredPane1.add(Eb4r4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 320, 90, 30));

        Eb4r5.setAngka(true);
        Eb4r5.setKhusus(true);
        Eb4r5.setKhususType('2');
        Eb4r5.setMaxDigit(64);
        Eb4r5.setMinDigit(15);
        Eb4r5.setRequired(true);
        jLayeredPane1.add(Eb4r5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 320, 50, 30));

        Eb4r6.setAngka(true);
        Eb4r6.setHuruf(true);
        Eb4r6.setLength(200);
        Eb4r6.setRequired(true);
        jLayeredPane1.add(Eb4r6, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 320, 290, 30));

        Fb4r2s1.setAngka(true);
        Fb4r2s1.setMaxDigit(999);
        Fb4r2s1.setMinDigit(1);
        Fb4r2s1.setRequired(true);
        jLayeredPane1.add(Fb4r2s1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 40, 30));

        Fb4r2s2.setAngka(true);
        Fb4r2s2.setMaxDigit(999);
        Fb4r2s2.setMinDigit(1);
        Fb4r2s2.setRequired(true);
        jLayeredPane1.add(Fb4r2s2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, 50, 30));

        Fb4r2s3.setAngka(true);
        Fb4r2s3.setMaxDigit(999);
        Fb4r2s3.setMinDigit(1);
        Fb4r2s3.setRequired(true);
        jLayeredPane1.add(Fb4r2s3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, 50, 30));

        Fb4r3.setHuruf(true);
        Fb4r3.setLength(100);
        Fb4r3.setRequired(true);
        jLayeredPane1.add(Fb4r3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 360, 220, 30));

        Fb4r4.setHuruf(true);
        Fb4r4.setKhusus(true);
        Fb4r4.setKhususType('3');
        Fb4r4.setLength(5);
        Fb4r4.setRequired(true);
        jLayeredPane1.add(Fb4r4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 360, 90, 30));

        Fb4r5.setAngka(true);
        Fb4r5.setKhusus(true);
        Fb4r5.setKhususType('2');
        Fb4r5.setMaxDigit(64);
        Fb4r5.setMinDigit(15);
        Fb4r5.setRequired(true);
        jLayeredPane1.add(Fb4r5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 360, 50, 30));

        Fb4r6.setAngka(true);
        Fb4r6.setHuruf(true);
        Fb4r6.setLength(200);
        Fb4r6.setRequired(true);
        jLayeredPane1.add(Fb4r6, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 360, 290, 30));

        Gb4r2s1.setAngka(true);
        Gb4r2s1.setMaxDigit(999);
        Gb4r2s1.setMinDigit(1);
        Gb4r2s1.setRequired(true);
        jLayeredPane1.add(Gb4r2s1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 40, 30));

        Gb4r2s2.setAngka(true);
        Gb4r2s2.setMaxDigit(999);
        Gb4r2s2.setMinDigit(1);
        Gb4r2s2.setRequired(true);
        jLayeredPane1.add(Gb4r2s2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 410, 50, 30));

        Gb4r2s3.setAngka(true);
        Gb4r2s3.setMaxDigit(999);
        Gb4r2s3.setMinDigit(1);
        Gb4r2s3.setRequired(true);
        jLayeredPane1.add(Gb4r2s3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 410, 50, 30));

        Gb4r3.setHuruf(true);
        Gb4r3.setLength(100);
        Gb4r3.setRequired(true);
        jLayeredPane1.add(Gb4r3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 410, 220, 30));

        Gb4r4.setHuruf(true);
        Gb4r4.setKhusus(true);
        Gb4r4.setKhususType('3');
        Gb4r4.setLength(5);
        Gb4r4.setRequired(true);
        jLayeredPane1.add(Gb4r4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 410, 90, 30));

        Gb4r5.setAngka(true);
        Gb4r5.setKhusus(true);
        Gb4r5.setKhususType('2');
        Gb4r5.setMaxDigit(64);
        Gb4r5.setMinDigit(15);
        Gb4r5.setRequired(true);
        jLayeredPane1.add(Gb4r5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 410, 50, 30));

        Gb4r6.setAngka(true);
        Gb4r6.setHuruf(true);
        Gb4r6.setLength(200);
        Gb4r6.setRequired(true);
        jLayeredPane1.add(Gb4r6, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 410, 290, 30));

        Hb4r2s1.setAngka(true);
        Hb4r2s1.setMaxDigit(999);
        Hb4r2s1.setMinDigit(1);
        Hb4r2s1.setRequired(true);
        jLayeredPane1.add(Hb4r2s1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, 40, 30));

        Hb4r2s2.setAngka(true);
        Hb4r2s2.setMaxDigit(999);
        Hb4r2s2.setMinDigit(1);
        Hb4r2s2.setRequired(true);
        jLayeredPane1.add(Hb4r2s2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 450, 50, 30));

        Hb4r2s3.setAngka(true);
        Hb4r2s3.setMaxDigit(999);
        Hb4r2s3.setMinDigit(1);
        Hb4r2s3.setRequired(true);
        jLayeredPane1.add(Hb4r2s3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 450, 50, 30));

        Hb4r3.setHuruf(true);
        Hb4r3.setLength(100);
        Hb4r3.setRequired(true);
        jLayeredPane1.add(Hb4r3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 490, 220, 30));

        Hb4r4.setHuruf(true);
        Hb4r4.setKhusus(true);
        Hb4r4.setKhususType('3');
        Hb4r4.setLength(5);
        Hb4r4.setRequired(true);
        jLayeredPane1.add(Hb4r4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 450, 90, 30));

        Hb4r5.setAngka(true);
        Hb4r5.setKhusus(true);
        Hb4r5.setKhususType('2');
        Hb4r5.setMaxDigit(64);
        Hb4r5.setMinDigit(15);
        Hb4r5.setRequired(true);
        jLayeredPane1.add(Hb4r5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 450, 50, 30));

        Hb4r6.setAngka(true);
        Hb4r6.setHuruf(true);
        Hb4r6.setLength(200);
        Hb4r6.setRequired(true);
        jLayeredPane1.add(Hb4r6, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 450, 290, 30));

        Ib4r2s1.setAngka(true);
        Ib4r2s1.setMaxDigit(999);
        Ib4r2s1.setMinDigit(1);
        Ib4r2s1.setRequired(true);
        jLayeredPane1.add(Ib4r2s1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 490, 40, 30));

        Ib4r2s2.setAngka(true);
        Ib4r2s2.setMaxDigit(999);
        Ib4r2s2.setMinDigit(1);
        Ib4r2s2.setRequired(true);
        jLayeredPane1.add(Ib4r2s2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 490, 50, 30));

        Ib4r2s3.setAngka(true);
        Ib4r2s3.setMaxDigit(999);
        Ib4r2s3.setMinDigit(1);
        Ib4r2s3.setRequired(true);
        jLayeredPane1.add(Ib4r2s3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 490, 50, 30));

        Ib4r3.setHuruf(true);
        Ib4r3.setLength(100);
        Ib4r3.setRequired(true);
        Ib4r3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ib4r3ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(Ib4r3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 450, 220, 30));

        Ib4r4.setHuruf(true);
        Ib4r4.setKhusus(true);
        Ib4r4.setKhususType('3');
        Ib4r4.setLength(5);
        Ib4r4.setRequired(true);
        jLayeredPane1.add(Ib4r4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 490, 90, 30));

        Ib4r5.setAngka(true);
        Ib4r5.setKhusus(true);
        Ib4r5.setKhususType('2');
        Ib4r5.setMaxDigit(64);
        Ib4r5.setMinDigit(15);
        Ib4r5.setRequired(true);
        jLayeredPane1.add(Ib4r5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 490, 50, 30));

        Ib4r6.setAngka(true);
        Ib4r6.setHuruf(true);
        Ib4r6.setLength(200);
        Ib4r6.setRequired(true);
        jLayeredPane1.add(Ib4r6, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 490, 290, 30));

        Jb4r2s1.setAngka(true);
        Jb4r2s1.setMaxDigit(999);
        Jb4r2s1.setMinDigit(1);
        Jb4r2s1.setRequired(true);
        jLayeredPane1.add(Jb4r2s1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 530, 40, 30));

        Jb4r2s2.setAngka(true);
        Jb4r2s2.setMaxDigit(999);
        Jb4r2s2.setMinDigit(1);
        Jb4r2s2.setRequired(true);
        jLayeredPane1.add(Jb4r2s2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 530, 50, 30));

        Jb4r2s3.setAngka(true);
        Jb4r2s3.setMaxDigit(999);
        Jb4r2s3.setMinDigit(1);
        Jb4r2s3.setRequired(true);
        jLayeredPane1.add(Jb4r2s3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 530, 50, 30));

        Jb4r3.setHuruf(true);
        Jb4r3.setLength(100);
        Jb4r3.setRequired(true);
        jLayeredPane1.add(Jb4r3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 530, 220, 30));

        Jb4r4.setHuruf(true);
        Jb4r4.setKhusus(true);
        Jb4r4.setKhususType('3');
        Jb4r4.setLength(5);
        Jb4r4.setRequired(true);
        jLayeredPane1.add(Jb4r4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 530, 90, 30));

        Jb4r5.setAngka(true);
        Jb4r5.setKhusus(true);
        Jb4r5.setKhususType('2');
        Jb4r5.setMaxDigit(64);
        Jb4r5.setMinDigit(15);
        Jb4r5.setRequired(true);
        jLayeredPane1.add(Jb4r5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 530, 50, 30));

        Jb4r6.setAngka(true);
        Jb4r6.setHuruf(true);
        Jb4r6.setLength(200);
        Jb4r6.setRequired(true);
        jLayeredPane1.add(Jb4r6, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 530, 290, 30));

        Kb4r2s1.setAngka(true);
        Kb4r2s1.setMaxDigit(999);
        Kb4r2s1.setMinDigit(1);
        Kb4r2s1.setRequired(true);
        jLayeredPane1.add(Kb4r2s1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 570, 40, 30));

        Kb4r2s2.setAngka(true);
        Kb4r2s2.setMaxDigit(999);
        Kb4r2s2.setMinDigit(1);
        Kb4r2s2.setRequired(true);
        jLayeredPane1.add(Kb4r2s2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 570, 50, 30));

        Kb4r2s3.setAngka(true);
        Kb4r2s3.setMaxDigit(999);
        Kb4r2s3.setMinDigit(1);
        Kb4r2s3.setRequired(true);
        jLayeredPane1.add(Kb4r2s3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 570, 50, 30));

        Kb4r3.setHuruf(true);
        Kb4r3.setLength(100);
        Kb4r3.setRequired(true);
        jLayeredPane1.add(Kb4r3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 570, 220, 30));

        Kb4r4.setHuruf(true);
        Kb4r4.setKhusus(true);
        Kb4r4.setKhususType('3');
        Kb4r4.setLength(5);
        Kb4r4.setRequired(true);
        jLayeredPane1.add(Kb4r4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 570, 90, 30));

        Kb4r5.setAngka(true);
        Kb4r5.setKhusus(true);
        Kb4r5.setKhususType('2');
        Kb4r5.setMaxDigit(64);
        Kb4r5.setMinDigit(15);
        Kb4r5.setRequired(true);
        jLayeredPane1.add(Kb4r5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 570, 50, 30));

        Kb4r6.setAngka(true);
        Kb4r6.setHuruf(true);
        Kb4r6.setLength(200);
        Kb4r6.setRequired(true);
        jLayeredPane1.add(Kb4r6, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 570, 290, 30));

        Lb4r2s1.setAngka(true);
        Lb4r2s1.setMaxDigit(999);
        Lb4r2s1.setMinDigit(1);
        Lb4r2s1.setRequired(true);
        jLayeredPane1.add(Lb4r2s1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 610, 40, 30));

        Lb4r2s2.setAngka(true);
        Lb4r2s2.setMaxDigit(999);
        Lb4r2s2.setMinDigit(1);
        Lb4r2s2.setRequired(true);
        jLayeredPane1.add(Lb4r2s2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 610, 50, 30));

        Lb4r2s3.setAngka(true);
        Lb4r2s3.setMaxDigit(999);
        Lb4r2s3.setMinDigit(1);
        Lb4r2s3.setRequired(true);
        jLayeredPane1.add(Lb4r2s3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 610, 50, 30));

        Lb4r3.setHuruf(true);
        Lb4r3.setLength(100);
        Lb4r3.setRequired(true);
        jLayeredPane1.add(Lb4r3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 610, 220, 30));

        Lb4r4.setHuruf(true);
        Lb4r4.setKhusus(true);
        Lb4r4.setKhususType('3');
        Lb4r4.setLength(5);
        Lb4r4.setRequired(true);
        jLayeredPane1.add(Lb4r4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 610, 90, 30));

        Lb4r5.setAngka(true);
        Lb4r5.setKhusus(true);
        Lb4r5.setKhususType('2');
        Lb4r5.setMaxDigit(64);
        Lb4r5.setMinDigit(15);
        Lb4r5.setRequired(true);
        jLayeredPane1.add(Lb4r5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 610, 50, 30));

        Lb4r6.setAngka(true);
        Lb4r6.setHuruf(true);
        Lb4r6.setLength(200);
        Lb4r6.setRequired(true);
        jLayeredPane1.add(Lb4r6, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 610, 290, 30));

        Mb4r2s1.setAngka(true);
        Mb4r2s1.setMaxDigit(999);
        Mb4r2s1.setMinDigit(1);
        Mb4r2s1.setRequired(true);
        jLayeredPane1.add(Mb4r2s1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 650, 40, 30));

        Mb4r2s2.setAngka(true);
        Mb4r2s2.setMaxDigit(999);
        Mb4r2s2.setMinDigit(1);
        Mb4r2s2.setRequired(true);
        jLayeredPane1.add(Mb4r2s2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 650, 50, 30));

        Mb4r2s3.setAngka(true);
        Mb4r2s3.setMaxDigit(999);
        Mb4r2s3.setMinDigit(1);
        Mb4r2s3.setRequired(true);
        jLayeredPane1.add(Mb4r2s3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 650, 50, 30));

        Mb4r3.setHuruf(true);
        Mb4r3.setLength(100);
        Mb4r3.setRequired(true);
        jLayeredPane1.add(Mb4r3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 650, 220, 30));

        Mb4r4.setHuruf(true);
        Mb4r4.setKhusus(true);
        Mb4r4.setKhususType('3');
        Mb4r4.setLength(5);
        Mb4r4.setRequired(true);
        jLayeredPane1.add(Mb4r4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 650, 90, 30));

        Mb4r5.setAngka(true);
        Mb4r5.setKhusus(true);
        Mb4r5.setKhususType('2');
        Mb4r5.setMaxDigit(64);
        Mb4r5.setMinDigit(15);
        Mb4r5.setRequired(true);
        jLayeredPane1.add(Mb4r5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 650, 50, 30));

        Mb4r6.setAngka(true);
        Mb4r6.setHuruf(true);
        Mb4r6.setLength(200);
        Mb4r6.setRequired(true);
        jLayeredPane1.add(Mb4r6, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 650, 290, 30));

        Nb4r2s1.setAngka(true);
        Nb4r2s1.setMaxDigit(999);
        Nb4r2s1.setMinDigit(1);
        Nb4r2s1.setRequired(true);
        jLayeredPane1.add(Nb4r2s1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 690, 40, 30));

        Nb4r2s2.setAngka(true);
        Nb4r2s2.setMaxDigit(999);
        Nb4r2s2.setMinDigit(1);
        Nb4r2s2.setRequired(true);
        jLayeredPane1.add(Nb4r2s2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 690, 50, 30));

        Nb4r2s3.setAngka(true);
        Nb4r2s3.setMaxDigit(999);
        Nb4r2s3.setMinDigit(1);
        Nb4r2s3.setRequired(true);
        jLayeredPane1.add(Nb4r2s3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 690, 50, 30));

        Nb4r3.setHuruf(true);
        Nb4r3.setLength(100);
        Nb4r3.setRequired(true);
        jLayeredPane1.add(Nb4r3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 690, 220, 30));

        Nb4r4.setHuruf(true);
        Nb4r4.setKhusus(true);
        Nb4r4.setKhususType('3');
        Nb4r4.setLength(5);
        Nb4r4.setRequired(true);
        jLayeredPane1.add(Nb4r4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 690, 90, 30));

        Nb4r5.setAngka(true);
        Nb4r5.setKhusus(true);
        Nb4r5.setKhususType('2');
        Nb4r5.setMaxDigit(64);
        Nb4r5.setMinDigit(15);
        Nb4r5.setRequired(true);
        jLayeredPane1.add(Nb4r5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 690, 50, 30));

        Nb4r6.setAngka(true);
        Nb4r6.setHuruf(true);
        Nb4r6.setLength(200);
        Nb4r6.setRequired(true);
        jLayeredPane1.add(Nb4r6, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 690, 290, 30));

        Ob4r2s1.setAngka(true);
        Ob4r2s1.setMaxDigit(999);
        Ob4r2s1.setMinDigit(1);
        Ob4r2s1.setRequired(true);
        jLayeredPane1.add(Ob4r2s1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 730, 40, 30));

        Ob4r2s2.setAngka(true);
        Ob4r2s2.setMaxDigit(999);
        Ob4r2s2.setMinDigit(1);
        Ob4r2s2.setRequired(true);
        jLayeredPane1.add(Ob4r2s2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 730, 50, 30));

        Ob4r2s3.setAngka(true);
        Ob4r2s3.setMaxDigit(999);
        Ob4r2s3.setMinDigit(1);
        Ob4r2s3.setRequired(true);
        jLayeredPane1.add(Ob4r2s3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 730, 50, 30));

        Ob4r3.setHuruf(true);
        Ob4r3.setLength(100);
        Ob4r3.setRequired(true);
        jLayeredPane1.add(Ob4r3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 730, 220, 30));

        Ob4r4.setHuruf(true);
        Ob4r4.setKhusus(true);
        Ob4r4.setKhususType('3');
        Ob4r4.setLength(5);
        Ob4r4.setRequired(true);
        jLayeredPane1.add(Ob4r4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 730, 90, 30));

        Ob4r5.setAngka(true);
        Ob4r5.setKhusus(true);
        Ob4r5.setKhususType('2');
        Ob4r5.setMaxDigit(64);
        Ob4r5.setMinDigit(15);
        Ob4r5.setRequired(true);
        jLayeredPane1.add(Ob4r5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 730, 50, 30));

        Ob4r6.setAngka(true);
        Ob4r6.setHuruf(true);
        Ob4r6.setLength(200);
        Ob4r6.setRequired(true);
        jLayeredPane1.add(Ob4r6, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 730, 290, 30));

        Pb4r2s1.setAngka(true);
        Pb4r2s1.setMaxDigit(999);
        Pb4r2s1.setMinDigit(1);
        Pb4r2s1.setRequired(true);
        jLayeredPane1.add(Pb4r2s1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 770, 40, 30));

        Pb4r2s2.setAngka(true);
        Pb4r2s2.setMaxDigit(999);
        Pb4r2s2.setMinDigit(1);
        Pb4r2s2.setRequired(true);
        jLayeredPane1.add(Pb4r2s2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 770, 50, 30));

        Pb4r2s3.setAngka(true);
        Pb4r2s3.setMaxDigit(999);
        Pb4r2s3.setMinDigit(1);
        Pb4r2s3.setRequired(true);
        jLayeredPane1.add(Pb4r2s3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 770, 50, 30));

        Pb4r3.setHuruf(true);
        Pb4r3.setLength(100);
        Pb4r3.setRequired(true);
        jLayeredPane1.add(Pb4r3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 770, 220, 30));

        Pb4r4.setHuruf(true);
        Pb4r4.setKhusus(true);
        Pb4r4.setKhususType('3');
        Pb4r4.setLength(5);
        Pb4r4.setRequired(true);
        jLayeredPane1.add(Pb4r4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 770, 90, 30));

        Pb4r5.setAngka(true);
        Pb4r5.setKhusus(true);
        Pb4r5.setKhususType('2');
        Pb4r5.setMaxDigit(64);
        Pb4r5.setMinDigit(15);
        Pb4r5.setRequired(true);
        jLayeredPane1.add(Pb4r5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 770, 50, 30));

        Pb4r6.setAngka(true);
        Pb4r6.setHuruf(true);
        Pb4r6.setLength(200);
        Pb4r6.setRequired(true);
        jLayeredPane1.add(Pb4r6, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 770, 290, 30));

        Qb4r2s1.setAngka(true);
        Qb4r2s1.setMaxDigit(999);
        Qb4r2s1.setMinDigit(1);
        Qb4r2s1.setRequired(true);
        jLayeredPane1.add(Qb4r2s1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 810, 40, 30));

        Qb4r2s2.setAngka(true);
        Qb4r2s2.setMaxDigit(999);
        Qb4r2s2.setMinDigit(1);
        Qb4r2s2.setRequired(true);
        jLayeredPane1.add(Qb4r2s2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 810, 50, 30));

        Qb4r2s3.setAngka(true);
        Qb4r2s3.setMaxDigit(999);
        Qb4r2s3.setMinDigit(1);
        Qb4r2s3.setRequired(true);
        jLayeredPane1.add(Qb4r2s3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 810, 50, 30));

        Qb4r3.setHuruf(true);
        Qb4r3.setLength(100);
        Qb4r3.setRequired(true);
        jLayeredPane1.add(Qb4r3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 810, 220, 30));

        Qb4r4.setHuruf(true);
        Qb4r4.setKhusus(true);
        Qb4r4.setKhususType('3');
        Qb4r4.setLength(5);
        Qb4r4.setRequired(true);
        jLayeredPane1.add(Qb4r4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 810, 90, 30));

        Qb4r5.setAngka(true);
        Qb4r5.setKhusus(true);
        Qb4r5.setKhususType('2');
        Qb4r5.setMaxDigit(64);
        Qb4r5.setMinDigit(15);
        Qb4r5.setRequired(true);
        jLayeredPane1.add(Qb4r5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 810, 50, 30));

        Qb4r6.setAngka(true);
        Qb4r6.setHuruf(true);
        Qb4r6.setLength(200);
        Qb4r6.setRequired(true);
        jLayeredPane1.add(Qb4r6, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 810, 290, 30));

        Rb4r2s1.setAngka(true);
        Rb4r2s1.setMaxDigit(999);
        Rb4r2s1.setMinDigit(1);
        Rb4r2s1.setRequired(true);
        jLayeredPane1.add(Rb4r2s1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 850, 40, 30));

        Rb4r2s2.setAngka(true);
        Rb4r2s2.setMaxDigit(999);
        Rb4r2s2.setMinDigit(1);
        Rb4r2s2.setRequired(true);
        jLayeredPane1.add(Rb4r2s2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 850, 50, 30));

        Rb4r2s3.setAngka(true);
        Rb4r2s3.setMaxDigit(999);
        Rb4r2s3.setMinDigit(1);
        Rb4r2s3.setRequired(true);
        jLayeredPane1.add(Rb4r2s3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 850, 50, 30));

        Rb4r3.setHuruf(true);
        Rb4r3.setLength(100);
        Rb4r3.setRequired(true);
        jLayeredPane1.add(Rb4r3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 850, 220, 30));

        Rb4r4.setHuruf(true);
        Rb4r4.setKhusus(true);
        Rb4r4.setKhususType('3');
        Rb4r4.setLength(5);
        Rb4r4.setRequired(true);
        jLayeredPane1.add(Rb4r4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 850, 90, 30));

        Rb4r5.setAngka(true);
        Rb4r5.setKhusus(true);
        Rb4r5.setKhususType('2');
        Rb4r5.setMaxDigit(64);
        Rb4r5.setMinDigit(15);
        Rb4r5.setRequired(true);
        jLayeredPane1.add(Rb4r5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 850, 50, 30));

        Rb4r6.setAngka(true);
        Rb4r6.setHuruf(true);
        Rb4r6.setLength(200);
        Rb4r6.setRequired(true);
        jLayeredPane1.add(Rb4r6, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 850, 290, 30));

        Sb4r2s1.setAngka(true);
        Sb4r2s1.setMaxDigit(999);
        Sb4r2s1.setMinDigit(1);
        Sb4r2s1.setRequired(true);
        jLayeredPane1.add(Sb4r2s1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 890, 40, 30));

        Sb4r2s2.setAngka(true);
        Sb4r2s2.setMaxDigit(999);
        Sb4r2s2.setMinDigit(1);
        Sb4r2s2.setRequired(true);
        jLayeredPane1.add(Sb4r2s2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 890, 50, 30));

        Sb4r2s3.setAngka(true);
        Sb4r2s3.setMaxDigit(999);
        Sb4r2s3.setMinDigit(1);
        Sb4r2s3.setRequired(true);
        jLayeredPane1.add(Sb4r2s3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 890, 50, 30));

        Sb4r3.setHuruf(true);
        Sb4r3.setLength(100);
        Sb4r3.setRequired(true);
        jLayeredPane1.add(Sb4r3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 890, 220, 30));

        Sb4r4.setHuruf(true);
        Sb4r4.setKhusus(true);
        Sb4r4.setKhususType('3');
        Sb4r4.setLength(5);
        Sb4r4.setRequired(true);
        jLayeredPane1.add(Sb4r4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 890, 90, 30));

        Sb4r5.setAngka(true);
        Sb4r5.setKhusus(true);
        Sb4r5.setKhususType('2');
        Sb4r5.setMaxDigit(64);
        Sb4r5.setMinDigit(15);
        Sb4r5.setRequired(true);
        jLayeredPane1.add(Sb4r5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 890, 50, 30));

        Sb4r6.setAngka(true);
        Sb4r6.setHuruf(true);
        Sb4r6.setLength(200);
        Sb4r6.setRequired(true);
        jLayeredPane1.add(Sb4r6, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 890, 290, 30));

        Tb4r2s1.setAngka(true);
        Tb4r2s1.setMaxDigit(999);
        Tb4r2s1.setMinDigit(1);
        Tb4r2s1.setRequired(true);
        jLayeredPane1.add(Tb4r2s1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 940, 40, 30));

        Tb4r2s2.setAngka(true);
        Tb4r2s2.setMaxDigit(999);
        Tb4r2s2.setMinDigit(1);
        Tb4r2s2.setRequired(true);
        jLayeredPane1.add(Tb4r2s2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 940, 50, 30));

        Tb4r2s3.setAngka(true);
        Tb4r2s3.setMaxDigit(999);
        Tb4r2s3.setMinDigit(1);
        Tb4r2s3.setRequired(true);
        jLayeredPane1.add(Tb4r2s3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 940, 50, 30));

        Tb4r3.setHuruf(true);
        Tb4r3.setLength(100);
        Tb4r3.setRequired(true);
        jLayeredPane1.add(Tb4r3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 940, 220, 30));

        Tb4r4.setHuruf(true);
        Tb4r4.setKhusus(true);
        Tb4r4.setKhususType('3');
        Tb4r4.setLength(5);
        Tb4r4.setRequired(true);
        jLayeredPane1.add(Tb4r4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 940, 90, 30));

        Tb4r5.setAngka(true);
        Tb4r5.setKhusus(true);
        Tb4r5.setKhususType('2');
        Tb4r5.setMaxDigit(64);
        Tb4r5.setMinDigit(15);
        Tb4r5.setRequired(true);
        jLayeredPane1.add(Tb4r5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 940, 50, 30));

        Tb4r6.setAngka(true);
        Tb4r6.setHuruf(true);
        Tb4r6.setLength(200);
        Tb4r6.setRequired(true);
        jLayeredPane1.add(Tb4r6, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 940, 290, 30));

        javax.swing.GroupLayout hal2Listing1Layout = new javax.swing.GroupLayout(hal2Listing1);
        hal2Listing1.setLayout(hal2Listing1Layout);
        hal2Listing1Layout.setHorizontalGroup(
            hal2Listing1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 923, Short.MAX_VALUE)
        );
        hal2Listing1Layout.setVerticalGroup(
            hal2Listing1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1)
        );

        add(hal2Listing1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void Ab4r3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ab4r3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ab4r3ActionPerformed

    private void Ab4r2s2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ab4r2s2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ab4r2s2ActionPerformed

    private void Ib4r3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ib4r3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ib4r3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private sp.component.TextFieldListing Ab4r2s1;
    private sp.component.TextFieldListing Ab4r2s2;
    private sp.component.TextFieldListing Ab4r2s3;
    private sp.component.TextFieldListing Ab4r3;
    private sp.component.TextFieldListing Ab4r4;
    private sp.component.TextFieldListing Ab4r5;
    private sp.component.TextFieldListing Ab4r6;
    private sp.component.TextFieldListing Bb4r2s1;
    private sp.component.TextFieldListing Bb4r2s2;
    private sp.component.TextFieldListing Bb4r2s3;
    private sp.component.TextFieldListing Bb4r3;
    private sp.component.TextFieldListing Bb4r4;
    private sp.component.TextFieldListing Bb4r5;
    private sp.component.TextFieldListing Bb4r6;
    private sp.component.TextFieldListing Cb4r2s1;
    private sp.component.TextFieldListing Cb4r2s2;
    private sp.component.TextFieldListing Cb4r2s3;
    private sp.component.TextFieldListing Cb4r3;
    private sp.component.TextFieldListing Cb4r4;
    private sp.component.TextFieldListing Cb4r5;
    private sp.component.TextFieldListing Cb4r6;
    private sp.component.TextFieldListing Db4r2s1;
    private sp.component.TextFieldListing Db4r2s2;
    private sp.component.TextFieldListing Db4r2s3;
    private sp.component.TextFieldListing Db4r3;
    private sp.component.TextFieldListing Db4r4;
    private sp.component.TextFieldListing Db4r5;
    private sp.component.TextFieldListing Db4r6;
    private sp.component.TextFieldListing Eb4r2s1;
    private sp.component.TextFieldListing Eb4r2s2;
    private sp.component.TextFieldListing Eb4r2s3;
    private sp.component.TextFieldListing Eb4r3;
    private sp.component.TextFieldListing Eb4r4;
    private sp.component.TextFieldListing Eb4r5;
    private sp.component.TextFieldListing Eb4r6;
    private sp.component.TextFieldListing Fb4r2s1;
    private sp.component.TextFieldListing Fb4r2s2;
    private sp.component.TextFieldListing Fb4r2s3;
    private sp.component.TextFieldListing Fb4r3;
    private sp.component.TextFieldListing Fb4r4;
    private sp.component.TextFieldListing Fb4r5;
    private sp.component.TextFieldListing Fb4r6;
    private sp.component.TextFieldListing Gb4r2s1;
    private sp.component.TextFieldListing Gb4r2s2;
    private sp.component.TextFieldListing Gb4r2s3;
    private sp.component.TextFieldListing Gb4r3;
    private sp.component.TextFieldListing Gb4r4;
    private sp.component.TextFieldListing Gb4r5;
    private sp.component.TextFieldListing Gb4r6;
    private sp.component.TextFieldListing Hb4r2s1;
    private sp.component.TextFieldListing Hb4r2s2;
    private sp.component.TextFieldListing Hb4r2s3;
    private sp.component.TextFieldListing Hb4r3;
    private sp.component.TextFieldListing Hb4r4;
    private sp.component.TextFieldListing Hb4r5;
    private sp.component.TextFieldListing Hb4r6;
    private sp.component.TextFieldListing Ib4r2s1;
    private sp.component.TextFieldListing Ib4r2s2;
    private sp.component.TextFieldListing Ib4r2s3;
    private sp.component.TextFieldListing Ib4r3;
    private sp.component.TextFieldListing Ib4r4;
    private sp.component.TextFieldListing Ib4r5;
    private sp.component.TextFieldListing Ib4r6;
    private sp.component.TextFieldListing Jb4r2s1;
    private sp.component.TextFieldListing Jb4r2s2;
    private sp.component.TextFieldListing Jb4r2s3;
    private sp.component.TextFieldListing Jb4r3;
    private sp.component.TextFieldListing Jb4r4;
    private sp.component.TextFieldListing Jb4r5;
    private sp.component.TextFieldListing Jb4r6;
    private sp.component.TextFieldListing Kb4r2s1;
    private sp.component.TextFieldListing Kb4r2s2;
    private sp.component.TextFieldListing Kb4r2s3;
    private sp.component.TextFieldListing Kb4r3;
    private sp.component.TextFieldListing Kb4r4;
    private sp.component.TextFieldListing Kb4r5;
    private sp.component.TextFieldListing Kb4r6;
    private sp.component.TextFieldListing Lb4r2s1;
    private sp.component.TextFieldListing Lb4r2s2;
    private sp.component.TextFieldListing Lb4r2s3;
    private sp.component.TextFieldListing Lb4r3;
    private sp.component.TextFieldListing Lb4r4;
    private sp.component.TextFieldListing Lb4r5;
    private sp.component.TextFieldListing Lb4r6;
    private sp.component.TextFieldListing Mb4r2s1;
    private sp.component.TextFieldListing Mb4r2s2;
    private sp.component.TextFieldListing Mb4r2s3;
    private sp.component.TextFieldListing Mb4r3;
    private sp.component.TextFieldListing Mb4r4;
    private sp.component.TextFieldListing Mb4r5;
    private sp.component.TextFieldListing Mb4r6;
    private sp.component.TextFieldListing Nb4r2s1;
    private sp.component.TextFieldListing Nb4r2s2;
    private sp.component.TextFieldListing Nb4r2s3;
    private sp.component.TextFieldListing Nb4r3;
    private sp.component.TextFieldListing Nb4r4;
    private sp.component.TextFieldListing Nb4r5;
    private sp.component.TextFieldListing Nb4r6;
    private sp.component.TextFieldListing Ob4r2s1;
    private sp.component.TextFieldListing Ob4r2s2;
    private sp.component.TextFieldListing Ob4r2s3;
    private sp.component.TextFieldListing Ob4r3;
    private sp.component.TextFieldListing Ob4r4;
    private sp.component.TextFieldListing Ob4r5;
    private sp.component.TextFieldListing Ob4r6;
    private sp.component.TextFieldListing Pb4r2s1;
    private sp.component.TextFieldListing Pb4r2s2;
    private sp.component.TextFieldListing Pb4r2s3;
    private sp.component.TextFieldListing Pb4r3;
    private sp.component.TextFieldListing Pb4r4;
    private sp.component.TextFieldListing Pb4r5;
    private sp.component.TextFieldListing Pb4r6;
    private sp.component.TextFieldListing Qb4r2s1;
    private sp.component.TextFieldListing Qb4r2s2;
    private sp.component.TextFieldListing Qb4r2s3;
    private sp.component.TextFieldListing Qb4r3;
    private sp.component.TextFieldListing Qb4r4;
    private sp.component.TextFieldListing Qb4r5;
    private sp.component.TextFieldListing Qb4r6;
    private sp.component.TextFieldListing Rb4r2s1;
    private sp.component.TextFieldListing Rb4r2s2;
    private sp.component.TextFieldListing Rb4r2s3;
    private sp.component.TextFieldListing Rb4r3;
    private sp.component.TextFieldListing Rb4r4;
    private sp.component.TextFieldListing Rb4r5;
    private sp.component.TextFieldListing Rb4r6;
    private sp.component.TextFieldListing Sb4r2s1;
    private sp.component.TextFieldListing Sb4r2s2;
    private sp.component.TextFieldListing Sb4r2s3;
    private sp.component.TextFieldListing Sb4r3;
    private sp.component.TextFieldListing Sb4r4;
    private sp.component.TextFieldListing Sb4r5;
    private sp.component.TextFieldListing Sb4r6;
    private sp.component.TextFieldListing Tb4r2s1;
    private sp.component.TextFieldListing Tb4r2s2;
    private sp.component.TextFieldListing Tb4r2s3;
    private sp.component.TextFieldListing Tb4r3;
    private sp.component.TextFieldListing Tb4r4;
    private sp.component.TextFieldListing Tb4r5;
    private sp.component.TextFieldListing Tb4r6;
    private sp.imageClass.Hal2Listing hal2Listing1;
    private javax.swing.JLayeredPane jLayeredPane1;
    // End of variables declaration//GEN-END:variables
}
