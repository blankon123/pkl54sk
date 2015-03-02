/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp.controller;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import javax.sound.midi.ControllerEventListener;
import javax.swing.JLabel;
import javax.swing.JPanel;
import sp.componentButton.BackButton;
import sp.componentButton.BackminButton;
import sp.componentButton.Closebutton;
import sp.componentButton.NextButton;
import sp.componentButton.Savebutton;
import sp.panelcomponent.EntryFormListingTest;

/**
 *
 * @author M Arif Rosyanto
 */
public class ListingControllerTest {
    CardLayoutController controller;
    EntryFormListingTest form;
    NextButton nextButton;
    BackminButton backButton;
    Closebutton closebutton;
    Savebutton savebutton;
    JPanel Mainpanel;
    String hal="hal";
    private int i = 1;
    int j=0;
    private String state;
    

    
    
    public ListingControllerTest(EntryFormListingTest form, NextButton nextButton, BackminButton backButton, Closebutton closebutton, Savebutton savebutton, JPanel Mainpanel) {
        
        this.form = form;
        this.nextButton = nextButton;
        this.backButton = backButton;
        this.closebutton = closebutton;
        this.savebutton = savebutton;
        this.Mainpanel = Mainpanel;
        
       
        
        controller = new CardLayoutController();
        controller.setCardLayout((CardLayout)Mainpanel.getLayout());
        controller.setParentCard(Mainpanel);
        
        form.getH1().addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                form.setActive(form.getH1());
                form.setInactive(form.getH2(), form.getH3(), form.getH4(), form.getH5(), form.getH6());
                form.controller.show("hal1");
            }
        });
        
        form.getH2().addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                form.setActive(form.getH2());
                form.setInactive(form.getH1(), form.getH3(), form.getH4(), form.getH5(), form.getH6());
                form.controller.show("hal2");
            }
        });
        
        form.getH3().addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                form.setActive(form.getH2());
                form.setInactive(form.getH1(), form.getH2(), form.getH4(), form.getH5(), form.getH6());
                form.controller.show("hal3");
            }
        });
        
        form.getH4().addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                form.setActive(form.getH4());
                form.setInactive(form.getH1(), form.getH3(), form.getH2(), form.getH5(), form.getH6());
                form.controller.show("hal4");
            }
        });
        
        form.getH5().addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                form.setActive(form.getH5());
                form.setInactive(form.getH1(), form.getH3(), form.getH4(), form.getH2(), form.getH6());
                form.controller.show("hal5");
            }
        });
        
        form.getH6().addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                form.setActive(form.getH6());
                form.setInactive(form.getH1(), form.getH3(), form.getH4(), form.getH5(), form.getH2());
                form.controller.show("hal6");
            }
        });
        
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                //controller.next();
                plus();
                if(getI()%6==0){
                    plus();
                    
                }
                setState(hal+(getI()%6));
                controller.show(getState());
                
               
            }
        });
        
        backButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                minus();
                if(getI()%6==0){
                    minus();
                } else if(getI()<0){
                    setI(5);
                }
                
                setState(hal+(getI()%6));
                controller.show(getState());
                
                
              
               
            }
        });
        
    }
    
    public void setI(){
        
    }
    
    public void plus(){
        i++;
    }
    public void minus(){
        i--;
    }
    
    public void show(String name){
        controller.show(name);
       
    }
    
    public String getCardName(){
        return getState();
    }

    /**
     * @return the i
     */
    public int getI() {
        return i;
    }

    /**
     * @return the state
     */
    public String getState() {
        return state;
    }

    /**
     * @param i the i to set
     */
    public void setI(int i) {
        this.i = i;
    }

    /**
     * @param state the state to set
     */
    public void setState(String state) {
        this.state = state;
    }

    
}
