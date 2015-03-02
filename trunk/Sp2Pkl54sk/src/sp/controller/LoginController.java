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
import sp.view.LoginPanel;
import sp.view.Panel;

/**
 *
 * @author M Arif Rosyanto
 */
public class LoginController {
    
    JPanel MainPanel;
    CardLayoutController controller;
    LoginPanel loginPanel;
    Panel panel;
    
    public LoginController(Panel panel, JPanel MainPanel, LoginPanel loginPanel){
        
        this.panel = panel;
        this.MainPanel= MainPanel;
        this.loginPanel = loginPanel;
        
        
        controller = new CardLayoutController();
        controller.setCardLayout((CardLayout) MainPanel.getLayout());
        controller.setParentCard(MainPanel);
        
        loginPanel.getLoginButton1().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                //panel.getNimLabel().setText(loginPanel.getLoginTextField1().getText());
                controller.next();
                panel.getNavbarButton1().getHomebutton1().Activebutton();
            }
        });
        
        panel.getNavbarButton1().getLogoutbutton1().addActionListener((new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                controller.previous();
            }
        }));
    }
    
    
}
