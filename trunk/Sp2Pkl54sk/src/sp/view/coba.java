/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp.view;

import static java.awt.Frame.ICONIFIED;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import sp.controller.LoginControllerTest;

/**
 *
 * @author Tiara Ratna Dewi [12.7403]
 */
public class coba extends javax.swing.JFrame {

    /**
     * Creates new form coba
     */
    LoginControllerTest controller;

    public coba() {
        initComponents();

        controller = new LoginControllerTest(panel1, MainPanel, loginPanel1);

        //fullscreen Frame
        dispose();
        setUndecorated(true);
        setResizable(false);
        setVisible(true);

        loginPanel1.getCloseminbutton1().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
            }

            
        });

        panel1.getCloseminbutton1().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
            }
        });
        
        entryQuest.getCloseminbutton1().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        entryListing.getCloseminbutton1().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        
        panel1.getEntryListing().getStartButton1().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                controller.show("entrylisting");
            }

        });

        panel1.getEntryQuest().getStartButton1().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                controller.show("entryquest");
            }
        });

        entryQuest.getCloseBtn().addActionListener(new ActionListener() {

            int yakin = 0;

            @Override
            public void actionPerformed(ActionEvent ae) {

                ConfirmClose konfirm = new ConfirmClose(null, rootPaneCheckingEnabled);
                konfirm.getYa().addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        yakin++;
                        konfirm.setVisible(false);
                        ConfirmClose konfirm1 = new ConfirmClose(null, rootPaneCheckingEnabled);
                        konfirm1.getYa().addActionListener(new ActionListener() {

                            @Override
                            public void actionPerformed(ActionEvent e) {
                                yakin++;
                                konfirm1.setVisible(false);
                                if (yakin == 2) {
                                    controller.previous();
                                }
                            }
                        });
                        konfirm1.setVisible(rootPaneCheckingEnabled);
                    }
                });
                konfirm.setVisible(rootPaneCheckingEnabled);
                yakin = 0;
            }
        });

        entryListing.getCloseBtn().addActionListener(new ActionListener() {

            int yakin = 0;

            @Override
            public void actionPerformed(ActionEvent ae) {

                ConfirmClose konfirm = new ConfirmClose(null, rootPaneCheckingEnabled);
                konfirm.getYa().addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        yakin++;
                        konfirm.setVisible(false);
                        ConfirmClose konfirm1 = new ConfirmClose(null, rootPaneCheckingEnabled);
                        konfirm1.getYa().addActionListener(new ActionListener() {

                            @Override
                            public void actionPerformed(ActionEvent e) {
                                yakin++;
                                konfirm1.setVisible(false);
                                if (yakin == 2) {
                                    controller.previous();
                                    controller.previous();
                                }
                            }
                        });
                        konfirm1.setVisible(rootPaneCheckingEnabled);
                    }
                });
                konfirm.setVisible(rootPaneCheckingEnabled);
                yakin = 0;
            }

        });

        loginPanel1.getLoginButton1().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
             //   entryListing.getNimLabel().setText(loginPanel1.getLoginTextField1().getText());
             //   entryQuest.getNimLabel().setText(loginPanel1.getLoginTextField1().getText());
            }
        });

        entryListing.getSaveBtn().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                ConfirmSave konfirm=new ConfirmSave(null, rootPaneCheckingEnabled);
                konfirm.setVisible(true);
                controller.previous();
                controller.previous();
            }
        });

        entryQuest.getSaveBtn().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                ConfirmSave konfirm=new ConfirmSave(null, rootPaneCheckingEnabled);
                konfirm.setVisible(true);
                controller.previous();
            }
        });

        panel1.getMinimizebutton1().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                setState(ICONIFIED);
            }
        });
        
        loginPanel1.getMinimizebutton1().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                setState(ICONIFIED);
            }
        });

        entryQuest.getMinimizebutton1().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                setState(ICONIFIED);
            }
        });
        
        entryListing.getMinimizebutton1().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                setState(ICONIFIED);
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        loginPanel1 = new sp.view.LoginPanel();
        panel1 = new sp.view.Panel();
        entryQuest = new sp.panelcomponent.EntryFormQuestTest();
        entryListing = new sp.panelcomponent.EntryFormListingTest();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MainPanel.setLayout(new java.awt.CardLayout());
        MainPanel.add(loginPanel1, "login");
        MainPanel.add(panel1, "card5");
        MainPanel.add(entryQuest, "entryquest");
        MainPanel.add(entryListing, "entrylisting");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(coba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(coba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(coba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(coba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new coba().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MainPanel;
    private sp.panelcomponent.EntryFormListingTest entryListing;
    private sp.panelcomponent.EntryFormQuestTest entryQuest;
    private sp.view.LoginPanel loginPanel1;
    private sp.view.Panel panel1;
    // End of variables declaration//GEN-END:variables
}
