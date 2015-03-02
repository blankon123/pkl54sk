/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sp.controller;

import sp.model.B1;
import sp.form.Hal1;
import sp.model.OptionB1r1;
import sp.model.OptionB1r4;
import sp.model.OptionB1r9;
import sp.util.UserControl;

/**
 *
 * @author StephenCN
 */
public class B1Controller {

    private B1 b1;
    private Hal1 b1view;
    private OptionB1r1 opb1r1;
    private OptionB1r4 opb1r4;
    private OptionB1r9 opb1r9;

    public B1Controller(B1 b1, Hal1 b1view) {
        this.b1 = b1;
        this.b1view = b1view;
    }

    public B1 B1hasil() {
        b1.setNks(b1view.getB1r6().getText());
        //OptionB1r1Dao.getInstance().entity();
        //System.out.println("\nlol1\n");
        //System.out.println("S"+b1view.getB1r1().getText()+"S");
        //opb1r1 = OptionB1r1Dao.getInstance().entity().getReference(OptionB1r1.class, b1view.getB1r1().getText());

        b1.setB1r1(new OptionB1r1(b1view.getB1r1().getText()));
        b1.setB1r2(b1view.getB1r2().getText());
        b1.setB1r3(b1view.getB1r3().getText());
        b1.setB1r4(new OptionB1r4(b1view.getB1r4().getText()));
        b1.setB1r5(b1view.getB1r5().getText());
        b1.setB1r6(b1view.getB1r6().getText());
        b1.setB1r7(b1view.getB1r7().getText());
        b1.setB1r8(b1view.getB1r8().getText());
        b1.setB1r9(new OptionB1r9(b1view.getB1r9().getText()));
        b1.setB1r10(b1view.getB1r10().getText());
        b1.setNim(UserControl.getNim());
        b1.setFlag(UserControl.getFlag());
        b1.setFlag2(UserControl.getFlag2());
        b1.setTimestamp(null);
        
        //System.out.println(b1.toString()+" "+b1.getB1r1()+" "+b1.getB1r2()+" "+b1.getB1r3()+" "+b1.getB1r4()+" "+b1.getB1r5());
        //B1Dao.getInstance().save(b1);
        return b1;
        //return b1;
    }
}
