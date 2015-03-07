/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp.controller;

import java.util.ArrayList;
import sp.component.TextFieldListing;
import sp.form.Hal2Listing;
import sp.model.Dsartb4;
import sp.model.DsartoptionB4r4;

/**
 *
 * @author StephenCN
 */
public class DsartB4Controller {

    private Dsartb4[] b4;
    private DsartoptionB4r4 optionb4;
    private Hal2Listing b4view;
    

    public DsartB4Controller(Dsartb4[] b4, Hal2Listing b4view) {
        this.b4 = b4;
        this.b4view = b4view;
    }

    public Dsartb4[] B4hasil() {
       
//        //b3.setNbs3(b1view.getB1r5().getText());
//        b4.setB4r1(b4view.getB3r1().getText());
//        b3.setB3r2(b3view.getB3r2().getText());
//        b3.setB3r3(b3view.getB3r3().getText());
//        
//       
        int j =0;
        //b4view.addListTextfield();
        ArrayList<TextFieldListing> dummy = b4view.getListTextFieldListing();
        for (int i = 0; i < dummy.size(); i+=7) {
            b4[j].setB4r2s1(dummy.get(i+1).getText());
            b4[j].setB4r2s2(dummy.get(i+2).getText());
            b4[j].setB4r2s3(dummy.get(i+3).getText());
            b4[j].setB4r3(dummy.get(i+4).getText());
            b4[j].setB4r4(new DsartoptionB4r4(dummy.get(i+5).getText()));
            b4[j].setB4r5(dummy.get(i+6).getText());
            b4[j].setB4r6(dummy.get(i+7).getText());
            j++;
        }

        return b4;
        
    }
}
