/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp.controller;

import sp.form.Hal1Listing;
import sp.model.Dsartb1;
import sp.model.Dsartb2;

/**
 *
 * @author StephenCN
 */
public class DsartB2Controller {

    private Dsartb2 b2;
    private Dsartb1 b1;
    private Hal1Listing b2view;
  

    public DsartB2Controller(Dsartb2 b2,Dsartb1 b1, Hal1Listing b2view) {
        this.b2 = b2;
        this.b1 = b1;
        this.b2view = b2view;
    }

    public Dsartb2 B2hasil() {
        
        b2.setNbsb2(b1.getNbs());
//        b2.setB2r2(b1.getNbs());
//        b2.setB2r3s1(b1.getNbs());
//        b2.setB2r3s2(b1.getNbs());
//        b2.setB2r3s3(b1.getNbs());
//        b2.setB2r3s4(b1.getNbs());
        
        b2.setB2r1(Integer.parseInt(b2view.getB2r1().getText()));
        b2.setB2r2(Integer.parseInt(b2view.getB2r2().getText()));
        b2.setB2r3s1(Integer.parseInt(b2view.getB2r3s1().getText()));
        b2.setB2r3s2(Integer.parseInt(b2view.getB2r3s2().getText()));
        b2.setB2r3s3(Integer.parseInt(b2view.getB2r3s3().getText()));
        b2.setB2r3s4(Integer.parseInt(b2view.getB2r3s4().getText()));
      
        //System.out.println(b1.toString()+" "+b1.getB1r1()+" "+b1.getB1r2()+" "+b1.getB1r3()+" "+b1.getB1r4()+" "+b1.getB1r5());
        //B1Dao.getInstance().save(b1);
        return b2;
        //return b1;
    }
}

