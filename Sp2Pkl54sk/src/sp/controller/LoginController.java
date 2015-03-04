/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp.controller;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import sp.dao.UserDAO;
import sp.util.CheckConnection;
import sp.util.LogMessage;
import sp.util.UserControl;
import sp.view.LoginPanel;
import sp.view.Panel;

/**
 *
 * @author M Arif Rosyanto
 */
public class LoginController implements ActionListener {

    JPanel MainPanel;
    CardLayoutController controller;
    LoginPanel loginPanel;
    Panel panel;
    Boolean logUser = false;

    public LoginController(Panel panel, JPanel MainPanel, LoginPanel loginPanel) {

        this.panel = panel;
        this.MainPanel = MainPanel;
        this.loginPanel = loginPanel;

        controller = new CardLayoutController();
        controller.setCardLayout((CardLayout) MainPanel.getLayout());
        controller.setParentCard(MainPanel);

        panel.getNavbarButton1().getLogoutbutton1().addActionListener((new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                controller.previous();
            }
        }));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        UserControl.setNim(loginPanel.getLoginTextField1().getText());
        String user = UserControl.getNim();
        String pw = loginPanel.getPassword1().getPassword().toString();
        CheckConnection.createConnection();
        LogMessage.clearLog();
        try {
            LogMessage.write("Login");
        } catch (IOException ex) {
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (UserDAO.getInstance().getByID(user).getPw().equals(pw)) {
            logUser = true;
        }
        cekLogin();
    }

    private void cekLogin() {
        if (logUser) {
            controller.next();
            panel.getNavbarButton1().getHomebutton1().Activebutton();
        } else {
            JOptionPane.showMessageDialog(MainPanel, "Error Login");
        }
    }

}
