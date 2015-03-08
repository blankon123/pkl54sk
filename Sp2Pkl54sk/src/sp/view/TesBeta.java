/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp.view;

import static java.awt.Frame.ICONIFIED;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.JTable;
import sp.component.TextFieldListing;
import sp.controller.ButtonController;
import sp.controller.LoginController;
import sp.controller.SaveController;
import sp.controller.SaveCtrlListing;
import sp.controller.UpdateController21;
import sp.form.*;
import sp.model.*;
import sp.panelcomponent.EntryFormListingTest;
import sp.panelcomponent.EntryFormQuestTest;
import sp.util.FormControl;

/**
 *
 * @author Tiara Ratna Dewi [12.7403]
 */
public class TesBeta extends javax.swing.JFrame {

    /**
     * Creates new form TesBeta
     */
    LoginController controller;
    ButtonController butcontroller;

    public TesBeta() {
        initComponents();
        dispose();
        setUndecorated(true);
        setResizable(false);
        setVisible(true);

        setControllerSave();
        setLoginController();
        setLoadToFormController();
        setSaveCtrlListing();

        butcontroller = new ButtonController(this, entryQuest, entryListing, MainPanel);
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
                entryDariNol();
            }
        });
//        entryQuest.getCloseBtn().addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent ae) {
//                ConfirmClose konfirm = new ConfirmClose(null, rootPaneCheckingEnabled);
//                konfirm.getYa().addActionListener(new ActionListener() {
//                    @Override
//                    public void actionPerformed(ActionEvent e) {
//                        konfirm.setVisible(false);
//                        ConfirmClose konfirm1 = new ConfirmClose(null, rootPaneCheckingEnabled);
//                        konfirm1.getYa().addActionListener(new ActionListener() {
//                            @Override
//                            public void actionPerformed(ActionEvent e) {
//                                konfirm1.setVisible(false);
//                                closeQuest();
//                            }
//                        });
//                        konfirm1.setVisible(rootPaneCheckingEnabled);
//                    }
//                });
//                konfirm.setVisible(rootPaneCheckingEnabled);
//            }
//        });
//        entryListing.getCloseBtn().addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent ae) {
//                ConfirmClose konfirm = new ConfirmClose(null, rootPaneCheckingEnabled);
//                konfirm.getYa().addActionListener(new ActionListener() {
//                    @Override
//                    public void actionPerformed(ActionEvent e) {
//                        konfirm.setVisible(false);
//                        ConfirmClose konfirm1 = new ConfirmClose(null, rootPaneCheckingEnabled);
//                        konfirm1.getYa().addActionListener(new ActionListener() {
//                            @Override
//                            public void actionPerformed(ActionEvent e) {
//                                konfirm1.setVisible(false);
//                                controller.previous();
//                                controller.previous();
//                            }
//                        });
//                        konfirm1.setVisible(rootPaneCheckingEnabled);
//                    }
//                });
//                konfirm.setVisible(rootPaneCheckingEnabled);
//            }
//        });
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
        panel1.getMenuQuest().getUpdatebutton1().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                controller.show("updatequest");
                UpdateController21 con = new UpdateController21(getMainPanel(), getEntryQuest(), getPanel1().getUpdateQuest1());
                getPanel1().getMenuQuest().getUpdatebutton1().addActionListener(con);
            }
        });
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
        MainPanel.add(panel1, "panel");
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

    private void setControllerSave() {
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
        entryQuest.getSaveBtn().addActionListener(save);
    }

    private void setSaveCtrlListing() {
        Hal1Listing halL1 = getEntryListing().getHal1Listing1();
        Hal2Listing halL2 = getEntryListing().getHal2Listing1();
        Dsartb1 db1 = new Dsartb1();
        Dsartb2 db2 = new Dsartb2();
        Dsartb3 db3 = new Dsartb3();
        Dsartb4[] db4db4;
        db4db4 = new Dsartb4[20];
//        Dsartb4[] arr = getB4arr(db1, db4, halL2);

        JTable errTab = getEntryListing().getErrorTable2().getTabelError();
        SaveCtrlListing save = new SaveCtrlListing(db1, db2, db3, db4db4, halL1, halL2, MainPanel, errTab);
        entryListing.getSaveBtn().addActionListener(save);
    }

    private void setLoginController() {
        controller = new LoginController(panel1, MainPanel, getLoginPanel1());
        loginPanel1.getPassword1().addKeyListener(controller);
        loginPanel1.getLoginButton1().addActionListener(controller);
    }

    private void setLoadToFormController() {
        UpdateController21 updateController = new UpdateController21(getMainPanel(), getEntryQuest(), getPanel1().getUpdateQuest1());
        getPanel1().getUpdateQuest1().getNextButton1().addActionListener(updateController);
    }

    private void closeQuest() {
        entryQuest.getClc().first();
        FormControl.clearAll();
        controller.previous();
        TableErrorModel tem = new TableErrorModel();
        getEntryQuest().getErrorTable1().getTabelError().setModel(tem);
        getEntryQuest().getErrDesc().setText("");
        getEntryQuest().getErrField().setText("");
    }

    private void entryDariNol() {
        entryQuest.getSaveBtn().setEnabled(true);
        entryQuest.getUpdateBtn().setEnabled(false);
        //FormControl.clearAll();
        FormControl.getController().first();
        controller.show("entryQuest");
    }

    private Dsartb4[] getB4arr(Dsartb1 db1, Dsartb4 db4, Hal2Listing halL2) {
        Dsartb4[] arr;
        arr = new Dsartb4[21];
        int j = 0;
        halL2.addListTextfield();
//        ArrayList<TextFieldListing> dummy = halL2.getListTextFieldListingHal2Listing();
//        for (int i = 0; i < dummy.size(); i += 7) {
//            arr[i].setDsartb1(db1);
//            arr[i].setNbs(db1.getNbs());
//            arr[i].setNuart(arr[i].getNbs()+arr[i].getB4r1());
//            arr[i].setB4r1(getString(i+1));
            arr[0] = new Dsartb4(db1.getNbs(), db4.getNbs()+"01", "01", halL2.getAb4r2s1().getText(), halL2.getAb4r2s2().getText(), halL2.getAb4r2s3().getText(), halL2.getAb4r3().getText(), halL2.getAb4r5().getText(), halL2.getAb4r6().getText());
            arr[1] = new Dsartb4(db1.getNbs(), db4.getNbs()+"02", "02", halL2.getBb4r2s1().getText(), halL2.getBb4r2s2().getText(), halL2.getBb4r2s3().getText(), halL2.getBb4r3().getText(), halL2.getBb4r5().getText(), halL2.getBb4r6().getText());
            arr[2] = new Dsartb4(db1.getNbs(), db4.getNbs()+"02", "02", halL2.getCb4r2s1().getText(), halL2.getBb4r2s2().getText(), halL2.getBb4r2s3().getText(), halL2.getBb4r3().getText(), halL2.getBb4r5().getText(), halL2.getBb4r6().getText());
            arr[3] = new Dsartb4(db1.getNbs(), db4.getNbs()+"02", "02", halL2.getDb4r2s1().getText(), halL2.getBb4r2s2().getText(), halL2.getBb4r2s3().getText(), halL2.getBb4r3().getText(), halL2.getBb4r5().getText(), halL2.getBb4r6().getText());
            arr[4] = new Dsartb4(db1.getNbs(), db4.getNbs()+"02", "02", halL2.getEb4r2s1().getText(), halL2.getBb4r2s2().getText(), halL2.getBb4r2s3().getText(), halL2.getBb4r3().getText(), halL2.getBb4r5().getText(), halL2.getBb4r6().getText());
            arr[5] = new Dsartb4(db1.getNbs(), db4.getNbs()+"02", "02", halL2.getFb4r2s1().getText(), halL2.getBb4r2s2().getText(), halL2.getBb4r2s3().getText(), halL2.getBb4r3().getText(), halL2.getBb4r5().getText(), halL2.getBb4r6().getText());
            arr[6] = new Dsartb4(db1.getNbs(), db4.getNbs()+"02", "02", halL2.getGb4r2s1().getText(), halL2.getBb4r2s2().getText(), halL2.getBb4r2s3().getText(), halL2.getBb4r3().getText(), halL2.getBb4r5().getText(), halL2.getBb4r6().getText());
            arr[7] = new Dsartb4(db1.getNbs(), db4.getNbs()+"02", "02", halL2.getHb4r2s1().getText(), halL2.getBb4r2s2().getText(), halL2.getBb4r2s3().getText(), halL2.getBb4r3().getText(), halL2.getBb4r5().getText(), halL2.getBb4r6().getText());
            arr[8] = new Dsartb4(db1.getNbs(), db4.getNbs()+"02", "02", halL2.getIb4r2s1().getText(), halL2.getBb4r2s2().getText(), halL2.getBb4r2s3().getText(), halL2.getBb4r3().getText(), halL2.getBb4r5().getText(), halL2.getBb4r6().getText());
            arr[9] = new Dsartb4(db1.getNbs(), db4.getNbs()+"02", "02", halL2.getJb4r2s1().getText(), halL2.getBb4r2s2().getText(), halL2.getBb4r2s3().getText(), halL2.getBb4r3().getText(), halL2.getBb4r5().getText(), halL2.getBb4r6().getText());
            arr[10] = new Dsartb4(db1.getNbs(), db4.getNbs()+"02", "02", halL2.getKb4r2s1().getText(), halL2.getBb4r2s2().getText(), halL2.getBb4r2s3().getText(), halL2.getBb4r3().getText(), halL2.getBb4r5().getText(), halL2.getBb4r6().getText());
            arr[11] = new Dsartb4(db1.getNbs(), db4.getNbs()+"01", "01", halL2.getLb4r2s1().getText(), halL2.getAb4r2s2().getText(), halL2.getAb4r2s3().getText(), halL2.getAb4r3().getText(), halL2.getAb4r5().getText(), halL2.getAb4r6().getText());
            arr[12] = new Dsartb4(db1.getNbs(), db4.getNbs()+"02", "02", halL2.getMb4r2s1().getText(), halL2.getBb4r2s2().getText(), halL2.getBb4r2s3().getText(), halL2.getBb4r3().getText(), halL2.getBb4r5().getText(), halL2.getBb4r6().getText());
            arr[13] = new Dsartb4(db1.getNbs(), db4.getNbs()+"02", "02", halL2.getNb4r2s1().getText(), halL2.getBb4r2s2().getText(), halL2.getBb4r2s3().getText(), halL2.getBb4r3().getText(), halL2.getBb4r5().getText(), halL2.getBb4r6().getText());
            arr[14] = new Dsartb4(db1.getNbs(), db4.getNbs()+"02", "02", halL2.getOb4r2s1().getText(), halL2.getBb4r2s2().getText(), halL2.getBb4r2s3().getText(), halL2.getBb4r3().getText(), halL2.getBb4r5().getText(), halL2.getBb4r6().getText());
            arr[15] = new Dsartb4(db1.getNbs(), db4.getNbs()+"02", "02", halL2.getPb4r2s1().getText(), halL2.getBb4r2s2().getText(), halL2.getBb4r2s3().getText(), halL2.getBb4r3().getText(), halL2.getBb4r5().getText(), halL2.getBb4r6().getText());
            arr[16] = new Dsartb4(db1.getNbs(), db4.getNbs()+"02", "02", halL2.getQb4r2s1().getText(), halL2.getBb4r2s2().getText(), halL2.getBb4r2s3().getText(), halL2.getBb4r3().getText(), halL2.getBb4r5().getText(), halL2.getBb4r6().getText());
            arr[17] = new Dsartb4(db1.getNbs(), db4.getNbs()+"02", "02", halL2.getRb4r2s1().getText(), halL2.getBb4r2s2().getText(), halL2.getBb4r2s3().getText(), halL2.getBb4r3().getText(), halL2.getBb4r5().getText(), halL2.getBb4r6().getText());
            arr[18] = new Dsartb4(db1.getNbs(), db4.getNbs()+"02", "02", halL2.getSb4r2s1().getText(), halL2.getBb4r2s2().getText(), halL2.getBb4r2s3().getText(), halL2.getBb4r3().getText(), halL2.getBb4r5().getText(), halL2.getBb4r6().getText());
            arr[19] = new Dsartb4(db1.getNbs(), db4.getNbs()+"02", "02", halL2.getTb4r2s1().getText(), halL2.getBb4r2s2().getText(), halL2.getBb4r2s3().getText(), halL2.getBb4r3().getText(), halL2.getBb4r5().getText(), halL2.getBb4r6().getText());
            
            for(int i = 0 ; i< 20 ; i++){
                arr[i].setB4r4(new DsartoptionB4r4("p"));
            }
//            arr[j].setB4r2s1(dummy.get(i + 1).getText());
//            arr[j].setB4r2s2(dummy.get(i + 2).getText());
//            arr[j].setB4r2s3(dummy.get(i + 3).getText());
//            arr[j].setB4r3(dummy.get(i + 4).getText());
//            arr[j].setB4r4(new DsartoptionB4r4(dummy.get(i + 5).getText()));
//            arr[j].setB4r5(dummy.get(i + 6).getText());
//            arr[j].setB4r6(dummy.get(i + 7).getText());
//            j++;
//        }
        return arr;
    }
    
     public String getString(int angka) {
        String no = Integer.toString(angka);
        while(no.length()<3){
            no = "0" + no;
        }
        return no;
    }
}
