/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp.controller;

import sp.form.Hal2;
import sp.form.Hal3;
import sp.form.Hal4;
import sp.form.Hal5;
import sp.form.Hal6;
import sp.model.B4;
import sp.model.B1;
import sp.model.OpsiTingkatKeseringan;

/**
 *
 * @author StephenCN
 */
public class B4Controller {
    public B4 b4;
    public B1 b1;
    public Hal3 b3view;
    public Hal4 b4view;
    public Hal5 b5view;
    public Hal6 b6view;
    
     public B4Controller(B4 b4 ,B1 b1,Hal3 b3view,Hal4 b4view, Hal5 b5view, Hal6 b6view) {
        this.b4 = b4;
        this.b3view = b3view;
        this.b4view = b4view;
        this.b5view = b5view;
        this.b6view = b6view;
        this.b1 = b1;
    }
    
    public B4 B4hasil(){
        b4.setNksb4(b1.getNks());
        
        b4.setB4ar1(new OpsiTingkatKeseringan(b3view.getB4ar1().getText()));
        b4.setB4ar2(new OpsiTingkatKeseringan(b3view.getB4ar2().getText()));
        b4.setB4ar3(new OpsiTingkatKeseringan(b3view.getB4ar3().getText()));
        b4.setB4ar4(new OpsiTingkatKeseringan(b3view.getB4ar4().getText()));
        b4.setB4ar5(new OpsiTingkatKeseringan(b3view.getB4ar5().getText()));
        b4.setB4ar6(new OpsiTingkatKeseringan(b3view.getB4ar6().getText()));
        b4.setB4ar7(new OpsiTingkatKeseringan(b3view.getB4ar7().getText()));
        b4.setB4ar8(new OpsiTingkatKeseringan(b3view.getB4ar8().getText()));
        b4.setB4ar9(new OpsiTingkatKeseringan(b3view.getB4ar9().getText()));
        b4.setB4ar10(new OpsiTingkatKeseringan(b3view.getB4ar10().getText()));
        b4.setB4ar11(new OpsiTingkatKeseringan(b3view.getB4ar11().getText()));
        b4.setB4ar12(new OpsiTingkatKeseringan(b3view.getB4ar12().getText()));
        b4.setB4ar13(new OpsiTingkatKeseringan(b3view.getB4ar13().getText()));
        b4.setB4ar14(new OpsiTingkatKeseringan(b3view.getB4ar14().getText()));
        b4.setB4ar15(new OpsiTingkatKeseringan(b3view.getB4ar15().getText()));
        b4.setB4ar16(new OpsiTingkatKeseringan(b3view.getB4ar16().getText()));
        b4.setB4ar17(new OpsiTingkatKeseringan(b3view.getB4ar17().getText()));
        b4.setB4ar18(new OpsiTingkatKeseringan(b3view.getB4ar18().getText()));
        b4.setB4ar19(new OpsiTingkatKeseringan(b3view.getB4ar19().getText()));
        b4.setB4ar20(new OpsiTingkatKeseringan(b3view.getB4ar20().getText()));
        b4.setB4ar21(new OpsiTingkatKeseringan(b3view.getB4ar21().getText()));
        b4.setB4ar22(new OpsiTingkatKeseringan(b3view.getB4ar22().getText()));
        b4.setB4ar23(new OpsiTingkatKeseringan(b3view.getB4ar23().getText()));
        b4.setB4ar24(new OpsiTingkatKeseringan(b3view.getB4ar24().getText()));
        b4.setB4ar25(new OpsiTingkatKeseringan(b3view.getB4ar25().getText()));
        b4.setB4ar26(new OpsiTingkatKeseringan(b3view.getB4ar26().getText()));
        b4.setB4ar27(new OpsiTingkatKeseringan(b3view.getB4ar27().getText()));
        
        b4.setB4br1(b4view.getB4br1().getText());
        b4.setB4br2(b4view.getB4br2().getText());
        b4.setB4br3(b4view.getB4br3().getText());
        b4.setB4br4(b4view.getB4br4().getText());
        b4.setB4br5(b4view.getB4br5().getText());
        b4.setB4br6(b4view.getB4br6().getText());
        b4.setB4br7(b4view.getB4br7().getText());
        b4.setB4br8(b4view.getB4br8().getText());
        b4.setB4br9(b4view.getB4br9().getText());
        b4.setB4br10(b4view.getB4br10().getText());
        b4.setB4br11(b4view.getB4br11().getText());
        b4.setB4br12(b4view.getB4br12().getText());
        b4.setB4br13(b4view.getB4br13().getText());
        b4.setB4br14(b4view.getB4br14().getText());
        b4.setB4br15(b4view.getB4br15().getText());
        b4.setB4br16(b4view.getB4br16().getText());
        b4.setB4br17(b4view.getB4br17().getText());
        b4.setB4br18(b4view.getB4br18().getText());
        b4.setB4br19(b4view.getB4br19().getText());
        b4.setB4br20(b4view.getB4br20().getText());
        b4.setB4br21(b4view.getB4br21().getText());
        b4.setB4br22(b4view.getB4br22().getText());
        b4.setB4br23(b4view.getB4br23().getText());
        b4.setB4br24(b4view.getB4br24().getText());
        b4.setB4br25(b4view.getB4br25().getText());
        b4.setB4br26(b4view.getB4br26().getText());
        b4.setB4br27(b4view.getB4br27().getText());
        b4.setB4br28(b4view.getB4br28().getText());
        b4.setB4br29(b4view.getB4br29().getText());
        
        b4.setB4br30(b5view.getB4br30().getText());
        b4.setB4br31(b5view.getB4br31().getText());
        b4.setB4br32(b5view.getB4br32().getText());
        b4.setB4br33(b5view.getB4br33().getText());
        b4.setB4br34(b5view.getB4br34().getText());
        b4.setB4br35(b5view.getB4br35().getText());
        b4.setB4br36(b5view.getB4br36().getText());
        b4.setB4br37(b5view.getB4br37().getText());
        b4.setB4br38(b5view.getB4br38().getText());
        b4.setB4br39(b5view.getB4br39().getText());
        b4.setB4br40(b5view.getB4br40().getText());
        b4.setB4br41(b5view.getB4br41().getText());
        b4.setB4br42(b5view.getB4br42().getText());
        b4.setB4br43(b5view.getB4br43().getText());
        b4.setB4br44(b5view.getB4br44().getText());
        b4.setB4br45(b5view.getB4br45().getText());
        b4.setB4br46(b5view.getB4br46().getText());
        b4.setB4br47(b5view.getB4br47().getText());
        b4.setB4br48(b5view.getB4br48().getText());
        b4.setB4br49(b5view.getB4br49().getText());
        
        b4.setB4br50(b6view.getB4br50().getText());
        b4.setB4br51(b6view.getB4br51().getText());
        b4.setB4br52(b6view.getB4br52().getText());
        b4.setB4br53(b6view.getB4br53().getText());
        b4.setB4br54(b6view.getB4br54().getText());
        b4.setB4br55(b6view.getB4br55().getText());
        b4.setB4br56(b6view.getB4br56().getText());
        b4.setB4br57(b6view.getB4br57().getText());
        b4.setB4br58(b6view.getB4br58().getText());
        b4.setB4br59(b6view.getB4br59().getText());
        b4.setB4br60(b6view.getB4br60().getText());
        b4.setB4br61(b6view.getB4br61().getText());
        b4.setB4br62(b6view.getB4br62().getText());
        b4.setB4br63(b6view.getB4br63().getText());
        b4.setB4br64(b6view.getB4br64().getText());
        
        return b4;
    }
}
