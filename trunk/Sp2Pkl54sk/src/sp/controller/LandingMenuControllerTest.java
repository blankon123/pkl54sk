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
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import sp.dao.B1Dao;
import sp.dao.DsartB4Dao;
import sp.model.B1;
import sp.model.Dsartb4;
import sp.model.TableUpdateModel;
import sp.panelcomponent.DataEntryListing;
import sp.panelcomponent.DataEntryQuest;
import sp.panelcomponent.LandingButton;
import sp.panelcomponent.Menu;
import sp.panelcomponent.MenuListing;
import sp.panelcomponent.UpdateQuest;
import sp.util.CardLayoutController;
import sp.util.LogMessage;
import sp.util.UserControl;
import sp.view.Panel;

/**
 *
 * @author M Arif Rosyanto
 */
public class LandingMenuControllerTest {

    CardLayoutController CardController;
    Panel panel;
    Menu menuQuest;
    MenuListing menuListing;
    JPanel MainPanel;
    LandingButton landingButton;
    DataEntryListing entryListing;
    DataEntryQuest entryQuest;

    UpdateQuest quest;

    public LandingMenuControllerTest(DataEntryListing entryListing, DataEntryQuest entryQuest,
            UpdateQuest quest,
            Panel panel, JPanel MainPanel,
            MenuListing menuListing, Menu menuQuest,
            LandingButton landingButton
    ) {

        this.landingButton = landingButton;
        this.MainPanel = MainPanel;
        this.panel = panel;
        this.menuListing = menuListing;
        this.menuQuest = menuQuest;
        this.entryListing = entryListing;
        this.entryQuest = entryQuest;

        CardController = new CardLayoutController();
        CardController.setCardLayout((CardLayout) MainPanel.getLayout());
        CardController.setParentCard(MainPanel);

        panel.getNavbarButton1().getHomebutton1().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                CardController.show("landing");
                panel.getNavbarButton1().getListingbutton1().resetButton();
                panel.getNavbarButton1().getHomebutton1().Activebutton();
            }
        });

        panel.getNavbarButton1().getAboutbutton1().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                CardController.show("comingsoon");
                panel.getNavbarButton1().getHomebutton1().resetButton();
                panel.getNavbarButton1().getAboutbutton1().Activebutton();
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

        });

        panel.getNavbarButton1().getListingbutton1().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                CardController.show("menuListing");
                menuListing.getLabel().setText("Listing VSEM.PKL54.DSART");
                panel.getNavbarButton1().getListingbutton1().Activebutton();
                panel.getNavbarButton1().getHomebutton1().resetButton();
            }
        });
        panel.getNavbarButton1().getQuestionnairebutton1().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                CardController.show("menuQuest");
                menuQuest.getLabel().setText("Kuesioner VSEM.PKL54.P");
                panel.getNavbarButton1().getQuestionnairebutton1().Activebutton();
                panel.getNavbarButton1().getHomebutton1().resetButton();
            }
        });

        landingButton.getListinglandingbutton1().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                CardController.show("menuListing");
                menuListing.getLabel().setText("Listing VSEM.PKL54.DSART");
                panel.getNavbarButton1().getListingbutton1().Activebutton();
                panel.getNavbarButton1().getHomebutton1().resetButton();
            }
        });

        landingButton.getQuestionnairelandingbutton1().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                CardController.show("menuQuest");
                menuQuest.getLabel().setText("Kuesioner VSEM.PKL54.P");
                panel.getNavbarButton1().getQuestionnairebutton1().Activebutton();
                panel.getNavbarButton1().getHomebutton1().resetButton();
                //throw new UnsupportedOperationException("Not supported yet."); To change body of generated methods, choose Tools | Templates.
            }

        });

//        landingButton.getSelectButton1().addActionListener(new ActionListener() {
//
//            @Override
//            public void actionPerformed(ActionEvent ae) {
//                if (landingButton.getState().equalsIgnoreCase("listing")) {
//                    CardController.show("menuListing");
//                    menuListing.getLabel().setText("Listing ...");
//                    panel.getNavbarButton1().getListingbutton1().Activebutton();
//                    panel.getNavbarButton1().getHomebutton1().resetButton();
//                } else {
//                    CardController.show("menuQuest");
//                    menuQuest.getLabel().setText("Questionnaire ...");
//                    panel.getNavbarButton1().getQuestionnairebutton1().Activebutton();
//                    panel.getNavbarButton1().getHomebutton1().resetButton();
//                }
//
//            }
//        });
        menuListing.getDataentrybutton1().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                CardController.show("entrylisting");

                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });

//        menuListing.getSelectButton1().addActionListener(new ActionListener() {
//
//            @Override
//            public void actionPerformed(ActionEvent ae) {
//                if (menuListing.getState().equalsIgnoreCase("dataentry")) {
//                    CardController.show("entrylisting");
//                } else if (menuListing.getState().equalsIgnoreCase("update")) {
//                    CardController.show("updatelisting");
//                } else {
//
//                }
//            }
//        });
        menuQuest.getUpdatebutton1().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                loadUpdateDB();
                CardController.show("updatequest");

//                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

        });

        menuQuest.getDataentrybutton1().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                CardController.show("entryquest");
                loadTableListing();

            }

            private void loadTableListing() {
                String refreshTxt = "";
                try {
                    List<Object> results = DsartB4Dao.getInstance().getAll();
                    if (results.isEmpty()) {
                        JOptionPane.showMessageDialog(quest, "DSART Kosong");
                    } else {
                        JOptionPane.showMessageDialog(quest, "Ditemukan " + results.size() + " data");
                        List<Dsartb4> data = new ArrayList<>();
                        int count = results.size();
                        for (int i = 0; i < count; i++) {
                            data.add((Dsartb4) results.get(i));
                        }
                        //((TableUpdateModel) panel.getEntryQuest().getTableUpdate1().getTabelUpdate().getModel()).setData(data);
                    }
                    panel.getEntryQuest().getTableUpdate1().getTabelUpdate();
                    refreshTxt = "Updating table loaded. Found " + results.size() + " data";
                } catch (Exception ep) {
                    refreshTxt = "Failed to load updating table " + ep.getMessage();
                    System.out.println(refreshTxt);
                }
                try {
                    LogMessage.write(refreshTxt);
                } catch (IOException ex) {
                    Logger.getLogger(UpdateController21.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        });

//        menuQuest.getSelectButton1().addActionListener(new ActionListener() {
//
//            @Override
//            public void actionPerformed(ActionEvent ae) {
//                if (menuQuest.getState().equalsIgnoreCase("dataentry")) {
//                    CardController.show("entryquest");
//                } else if (menuQuest.getState().equalsIgnoreCase("update")) {
//                    loadUpdateDB();
//                    CardController.show("updatequest");
//                } else {
//
//                }
//            }
//        });
        menuListing.getBackButton1().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                CardController.show("landing");
                panel.getNavbarButton1().getListingbutton1().resetButton();
                panel.getNavbarButton1().getHomebutton1().Activebutton();
            }
        });
        menuQuest.getBackButton1().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                CardController.show("landing");
                panel.getNavbarButton1().getHomebutton1().Activebutton();
                panel.getNavbarButton1().getQuestionnairebutton1().resetButton();;
            }
        });
        entryListing.getBacktobutton1().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                CardController.show("menuListing");
            }
        });

        entryQuest.getBacktobutton1().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                CardController.show("menuQuest");
            }
        });
        quest.getBacktobutton1().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                CardController.show("menuQuest");
            }
        });

    }

    public void show(String name) {
        CardController.show(name);
    }

    private void loadUpdateDB() {
        String refreshTxt = "";
        try {
            String nim = UserControl.getNim();
            if (nim != null) {
                List<Object> results = B1Dao.getInstance().getBy("B1.findByNim", "nim", nim);
                if (results.isEmpty()) {
                    JOptionPane.showMessageDialog(quest, nim + ", Anda belum melakukan Entry Data");
                } else {
                    JOptionPane.showMessageDialog(quest, "Ditemukan " + results.size() + " data");
                    List<B1> data = new ArrayList<>();
                    int count = results.size();
                    for (int i = 0; i < count; i++) {
                        data.add((B1) results.get(i));
                    }
                    ((TableUpdateModel) panel.getUpdateQuest1().getTableUpdate1().getTabelUpdate().getModel()).setData(data);
                }
                panel.getUpdateQuest1().getTableUpdate1().setLebarKolom();
                refreshTxt = "Updating table loaded. Found " + results.size() + " data";
            } else {
                JOptionPane.showMessageDialog(quest, "Please login first");
            }
        } catch (Exception ep) {
            refreshTxt = "Failed to load updating table " + ep.getMessage();
            System.out.println(refreshTxt);
        }
        try {
            LogMessage.write(refreshTxt);
        } catch (IOException ex) {
            Logger.getLogger(UpdateController21.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
