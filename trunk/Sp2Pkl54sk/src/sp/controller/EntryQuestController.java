/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp.controller;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import sp.componentButton.BackButton;
import sp.componentButton.BackminButton;
import sp.componentButton.Closebutton;
import sp.componentButton.NextButton;
import sp.componentButton.Savebutton;
import sp.panelcomponent.EntryFormQuestTest;

/**
 *
 * @author M Arif Rosyanto
 */
public class EntryQuestController {
    CardLayoutController controller;
    EntryFormQuestTest form;
    NextButton nextButton;
    BackminButton backButton;
    Closebutton closebutton;
    Savebutton savebutton;
    JPanel Mainpanel;
    String hal="hal";
    private int i = 1;
    int j=0;
    private String state;
    

    public EntryQuestController(EntryFormQuestTest form, NextButton nextButton, BackminButton backButton, Closebutton closebutton, Savebutton savebutton, JPanel Mainpanel) {
        
        this.form = form;
        this.nextButton = nextButton;
        this.backButton = backButton;
        this.closebutton = closebutton;
        this.savebutton = savebutton;
        this.Mainpanel = Mainpanel;
        
       
        
        controller = new CardLayoutController();
        controller.setCardLayout((CardLayout)Mainpanel.getLayout());
        controller.setParentCard(Mainpanel);
        
        
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                //controller.next();
                plus();
                if(getI()%7==0){
                    plus();
                    
                }
                setState(hal+(getI()%7));
                controller.show(getState());
                
               
            }
        });
        
        backButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                minus();
                if(getI()%7==0){
                    minus();
                } else if(getI()<0){
                    setI(6);
                }
                
                setState(hal+(getI()%7));
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
