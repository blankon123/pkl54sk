/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp.controller;

import sp.form.Hal1Listing;
import sp.model.Dsartb3;

/**
 *
 * @author StephenCN
 */
public class DsartB3Controller {

    private Dsartb3 b3;
    private Hal1Listing b3view;
    

    public DsartB3Controller(Dsartb3 b3, Hal1Listing b3view) {
        this.b3 = b3;
        this.b3view = b3view;
    }

    public Dsartb3 B3hasil() {
       
        //b3.setNbs3(b1view.getB1r5().getText());
        b3.setB3r1(b3view.getB3r1().getText());
        b3.setB3r2(b3view.getB3r2().getText());
        b3.setB3r3(b3view.getB3r3().getText());
        
        
        return b3;
        
    }
}
