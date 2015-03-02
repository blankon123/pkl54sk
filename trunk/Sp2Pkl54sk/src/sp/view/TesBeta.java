/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp.view;

import static java.awt.Frame.ICONIFIED;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.JTable;
import sp.controller.LoginControllerTest;
import sp.controller.SaveController;
import sp.form.*;
import sp.model.*;
import sp.panelcomponent.EntryFormListingTest;
import sp.panelcomponent.EntryFormQuestTest;
import sp.panelcomponent.ErrorTable;
import sp.util.ErrorControl;

/**
 *
 * @author Tiara Ratna Dewi [12.7403]
 */
public class TesBeta extends javax.swing.JFrame {

    /**
     * Creates new form TesBeta
     */
    LoginControllerTest controller;

    public TesBeta() {
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
            @Override
            public void actionPerformed(ActionEvent ae) {
                ConfirmClose konfirm = new ConfirmClose(null, rootPaneCheckingEnabled);
                konfirm.getYa().addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        konfirm.setVisible(false);
                        ConfirmClose konfirm1 = new ConfirmClose(null, rootPaneCheckingEnabled);
                        konfirm1.getYa().addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                konfirm1.setVisible(false);
                                controller.previous();
                            }
                        });
                        konfirm1.setVisible(rootPaneCheckingEnabled);
                    }
                });
                konfirm.setVisible(rootPaneCheckingEnabled);
            }
        });
        entryListing.getCloseBtn().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                ConfirmClose konfirm = new ConfirmClose(null, rootPaneCheckingEnabled);
                konfirm.getYa().addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        konfirm.setVisible(false);
                        ConfirmClose konfirm1 = new ConfirmClose(null, rootPaneCheckingEnabled);
                        konfirm1.getYa().addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                konfirm1.setVisible(false);
                                controller.previous();
                                controller.previous();
                            }
                        });
                        konfirm1.setVisible(rootPaneCheckingEnabled);
                    }
                });
                konfirm.setVisible(rootPaneCheckingEnabled);
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
                ConfirmSave konfirm = new ConfirmSave(null, rootPaneCheckingEnabled);
                konfirm.setVisible(true);
                konfirm.getTidak().addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        konfirm.setVisible(false);
                    }
                });
                konfirm.getYa().addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                    }
                });
            }
        });

        entryQuest.getSaveBtn().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ConfirmSave konfirm = new ConfirmSave(null, rootPaneCheckingEnabled);
                konfirm.setVisible(true);
                B1 b1 = new B1();
                B2 b2 = new B2();
                B3 b3 = new B3();
                B4 b4 = new B4();

                Hal1 hal1 = getEntryQuest().getHal11();
                Hal2 hal2 = getEntryQuest().getHal21();
                Hal3 hal3 = getEntryQuest().getHal31();
                Hal4 hal4 = getEntryQuest().getHal41();
                Hal5 hal5 = getEntryQuest().getHal51();
                Hal6 hal6 = getEntryQuest().getHal61();
                
                JTable errorTable = getEntryQuest().getErrorTable1().getTabelError();

                SaveController save = new SaveController(b1, b2, b3, b4, hal1, hal2, hal3, hal4, hal5, hal6, MainPanel, errorTable);

                konfirm.getTidak().addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        konfirm.setVisible(false);
                    }
                });
                konfirm.getYa().addActionListener(save);
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

    public LoginControllerTest getController() {
        return controller;
    }

    public JPanel getMainPanel() {
        return MainPanel;
    }

    public EntryFormListingTest getEntryListing() {
        return entryListing;
    }

    public EntryFormQuestTest getEntryQuest() {
        return entryQuest;
    }

    public LoginPanel getLoginPanel1() {
        return loginPanel1;
    }

    public Panel getPanel1() {
        return panel1;
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
            java.util.logging.Logger.getLogger(TesBeta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TesBeta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TesBeta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TesBeta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TesBeta().setVisible(true);
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
