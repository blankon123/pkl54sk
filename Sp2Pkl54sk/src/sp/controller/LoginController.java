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
import java.util.Arrays;
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
                try {
                    LogMessage.write("Logout\n-----------------------------------------------------------------");
                } catch (IOException e){
                    
                }
                UserControl.logOut();
            }
        }));
        panel.getEntryQuest().getStartButton1().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                controller.show("entryquest");
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            CheckConnection cekCon = new CheckConnection();
            doLogin();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(loginPanel, "Koneksi DB Bermasalah", "DB Inconnect", JOptionPane.WARNING_MESSAGE);
        }

    }

    private void doLogin() {
        String user = loginPanel.getLoginTextField1().getText();
        String pw = "";
        String nama = UserDAO.getInstance().getByID(user).getNama();
        char[] pass = loginPanel.getPassword1().getPassword();

        for (int i = 0; i < pass.length; i++) {
            pw += pass[i];
        }

        UserControl.setNim(user);
        UserControl.setNama(nama);
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
            panel.getNimLabel().setText(UserControl.getNim());
            panel.getNamaLabel().setText(UserControl.getNama());
        } else {
            JOptionPane.showMessageDialog(loginPanel, "Username Atau Password Salah", "Login Error", JOptionPane.WARNING_MESSAGE);
        }
    }

    public void show(String ss) {
        controller.show(ss);
    }

    public void previous() {
        controller.previous();
    }

    public void next() {
        controller.next();
    }

}
