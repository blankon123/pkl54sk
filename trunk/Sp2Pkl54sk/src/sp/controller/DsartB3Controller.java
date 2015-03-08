/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp.controller;

import sp.form.Hal1Listing;
import sp.model.Dsartb1;
import sp.model.Dsartb3;

/**
 *
 * @author StephenCN
 */
public class DsartB3Controller {

    private Dsartb3 b3;
    private Dsartb1 b1;
    private Hal1Listing b1view;

    public DsartB3Controller(Dsartb3 b3, Dsartb1 b1, Hal1Listing b1view) {
        this.b3 = b3;
        this.b1 = b1;
        this.b1view = b1view;
    }

    public Dsartb3 B3hasil() {
        b3.setDsartb1(b1);
        System.out.println(b3.getNbs3());
        String kodeKab = b1view.getB1r1().getText();
        String kodeKec = b1view.getB1r2().getText();
        String kodeDes = b1view.getB1r3().getText();
        String kodeNbs = b1view.getB1r4().getText();
        b3.setNbs3(kodeKab + kodeKec + kodeDes + kodeNbs);
        
        
        //b3.setNbs3(b1view.getB1r5().getText());
        b3.setB3r1(b1view.getB3r1().getText());
        b3.setB3r2(b1view.getB3r2().getText());
        b3.setB3r3(b1view.getB3r3().getText());

        return b3;

    }
}
