/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp.controller;

import sp.form.Hal2;
import sp.model.*;

/**
 *
 * @author StephenCN
 */
public class B3Controller {

    public B1 b1;
    public B3 b3;
    public Hal2 b3view;
    public B1Controller b1Controller;
    public OptionB3r2 opb3r2;
    public OptionB3r6 opb3r6;
    public OptionB3r7 opb3r7;
    public OptionB3r12 opb3r12;
    public OptionB3r13 opb3r13;
    public OptionB3r14 opb3r14;

    public B3Controller(B3 b3, B1 b1, Hal2 b2view) {
        this.b3 = b3;
        this.b3view = b2view;
        this.b1 = b1;
    }

    public B3 B3hasil() {
        b3.setNksb3(b1.getNks());

        b3.setB3r1(b3view.getB3r1().getText());
        b3.setB3r2(new OptionB3r2(b3view.getB3r2().getText()));
        b3.setB3r3(b3view.getB3r3().getText());
        b3.setB3r4s1(b3view.getB3r4s1().getText());
        b3.setB3r4s2(b3view.getB3r4s2().getText());
        b3.setB3r5s1(b3view.getB3r5s1().getText());
        b3.setB3r5s2(b3view.getB3r5s2().getText());
        b3.setB3r6(new OptionB3r6(b3view.getB3r6().getText()));
        b3.setB3r7(new OptionB3r7(b3view.getB3r7().getText()));
        b3.setB3r8s1(new OptionYaTidak(b3view.getB3r8s1().getText()));
        b3.setB3r8s2(new OptionYaTidak(b3view.getB3r8s2().getText()));
        b3.setB3r8s3(new OptionYaTidak(b3view.getB3r8s3().getText()));
        b3.setB3r9s1d1(new OptionYaTidak(b3view.getB3r9s1d1().getText()));
        b3.setB3r9s1d2(new OptionYaTidak(b3view.getB3r9s1d2().getText()));
        b3.setB3r9s1d3(new OptionYaTidak(b3view.getB3r9s1d3().getText()));
        b3.setB3r9s1d4(new OptionYaTidak(b3view.getB3r9s1d4().getText()));

        if (!cekNull(b3view.getB3r9s2().getText()).equals("")) {
            b3.setB3r9s2(b3view.getB3r9s2().getText());
        } else {
            b3.setB3r9s2(null);
        }
        if (!cekNull(b3view.getB3r10().getText()).equals("")) {
            b3.setB3r10(b3view.getB3r10().getText());
        } else {
            b3.setB3r10(null);
        }
        if (!cekNull(b3view.getB3r11().getText()).equals("")) {
            b3.setB3r11(b3view.getB3r11().getText());
        } else {
            b3.setB3r11(null);
        }
        if (!cekNull(b3view.getB3r11().getText()).equals("")) {
            b3.setB3r12(new OptionB3r12(cekNull(b3view.getB3r12().getText())));
        } else {
            b3.setB3r12(null);
        }

        b3.setB3r13(new OptionB3r13(b3view.getB3r13().getText()));
        b3.setB3r14(new OptionB3r14(b3view.getB3r14().getText()));
        b3.setB3r15(new OptionB3r15(b3view.getB3r15().getText()));
        b3.setB3r16(new OptionB3r16(b3view.getB3r16().getText()));

        return b3;
    }

    private String cekNull(String text) {
        String t = "";
        if (text != null) {
            if (!text.isEmpty()) {
                t = text;
            }
        }
        return t;
    }
}
