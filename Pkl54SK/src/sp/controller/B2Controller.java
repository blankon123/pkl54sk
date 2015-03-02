/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp.controller;
import sp.form.Hal1;
import sp.model.B2;
import sp.model.B1;

/**
 *
 * @author StephenCN
 */
public class B2Controller  {
    public  B2 b2;
    public  B1 b1;
    public  Hal1 b2view;
    public  B1 nksb1;
    public  B1Controller b1Controller;
    
    
    public B2Controller(B2 b2 ,B1 b1,Hal1 b2view) {
        this.b2 = b2;
        this.b2view = b2view;
        this.b1 = b1;
    }
    
    public B2 B2hasil() {
        b2.setNksb2(b1.getNks());
        
        b2.setB2r1s1(b2view.getB2r1s1().getText());
        b2.setB2r1s2(b2view.getB2r1s2().getText());
        b2.setB2r2s1(b2view.getB2r2s1().getText());
        b2.setB2r2s2(b2view.getB2r2s2().getText());
        b2.setB2r3s1d1(b2view.getB2r3s1d1().getText());
        b2.setB2r3s1d2(b2view.getB2r3s1d2().getText());
        b2.setB2r3s2d1(b2view.getB2r3s2d1().getText());
        b2.setB2r3s2d2(b2view.getB2r3s2d2().getText());
        
        return b2;
    }
}
