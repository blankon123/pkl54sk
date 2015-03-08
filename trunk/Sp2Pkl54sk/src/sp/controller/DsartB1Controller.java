/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp.controller;

import sp.model.Dsartb1;
import sp.form.Hal1Listing;
import sp.model.DsartoptionB1r1;
import sp.model.DsartoptionB4r4;
import sp.model.OptionB1r9;
import sp.util.UserControl;

/**
 *
 * @author StephenCN
 */
public class DsartB1Controller {

    private Dsartb1 b1;
    private Hal1Listing b1view;
    private DsartoptionB1r1 opb1r1;
    private DsartoptionB4r4 opb1r4;
    private OptionB1r9 opb1r9;

    public DsartB1Controller(Dsartb1 b1, Hal1Listing b1view) {
        this.b1 = b1;
        this.b1view = b1view;
    }

    public Dsartb1 B1hasil() {
        String kodeKab = b1view.getB1r1().getText();
        String kodeKec = b1view.getB1r2().getText();
        String kodeDes = b1view.getB1r3().getText();
        String kodeNbs = b1view.getB1r4().getText();
        
        b1.setNbs(kodeKab + kodeKec + kodeDes + kodeNbs);
        b1.setB1r1(new DsartoptionB1r1(kodeKab));
        b1.setB1r2(kodeKec);
        b1.setB1r3(kodeDes);
        b1.setB1r4(kodeNbs);
//        if DB using bloksensus+B
//        b1.setB1r5(b1view.getB1r5().getText()+"B");
        b1.setB1r5(b1view.getB1r5().getText());
        b1.setB1r6s1(b1view.getB1r6s1().getText());
        b1.setB1r6s2(b1view.getB1r6s2().getText());
        b1.setNim(UserControl.getNim());
        b1.setFlag(UserControl.getFlag());
        b1.setFlag2(UserControl.getFlag2());
        b1.setTimestamp(null);
        b1.setIsLocked("1");

        //System.out.println(b1.toString()+" "+b1.getB1r1()+" "+b1.getB1r2()+" "+b1.getB1r3()+" "+b1.getB1r4()+" "+b1.getB1r5());
        //B1Dao.getInstance().save(b1);
        return b1;
    }
}
