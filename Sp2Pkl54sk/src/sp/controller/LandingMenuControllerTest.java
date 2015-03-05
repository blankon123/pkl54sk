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
import javax.swing.table.TableModel;
import sp.dao.B1Dao;
import sp.dao.B2Dao;
import sp.dao.B3Dao;
import sp.dao.B4Dao;
import sp.model.B1;
import sp.model.B2;
import sp.model.B3;
import sp.model.B4;
import sp.model.TableErrorModel;
import sp.panelcomponent.DataEntryListing;
import sp.panelcomponent.DataEntryQuest;
import sp.panelcomponent.LandingButton;
import sp.panelcomponent.Menu;
import sp.panelcomponent.UpdateListing;
import sp.panelcomponent.UpdateQuest;
import sp.util.ErrorControl;
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
    Menu menuListing, menuQuest;
    JPanel MainPanel;
    LandingButton landingButton;
    DataEntryListing entryListing;
    DataEntryQuest entryQuest;
    UpdateListing listing;
    UpdateQuest quest;

    public LandingMenuControllerTest(DataEntryListing entryListing, DataEntryQuest entryQuest,
            UpdateListing listing, UpdateQuest quest,
            Panel panel, JPanel MainPanel,
            Menu menuListing, Menu menuQuest,
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
        panel.getNavbarButton1().getListingbutton1().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                CardController.show("menuListing");
                menuListing.getLabel().setText("Listing ...");
                panel.getNavbarButton1().getListingbutton1().Activebutton();
                panel.getNavbarButton1().getHomebutton1().resetButton();
            }
        });
        panel.getNavbarButton1().getQuestionnairebutton1().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                CardController.show("menuQuest");
                menuQuest.getLabel().setText("Questionnaire ...");
                panel.getNavbarButton1().getQuestionnairebutton1().Activebutton();
                panel.getNavbarButton1().getHomebutton1().resetButton();
            }
        });
        landingButton.getSelectButton1().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                if (landingButton.getState().equalsIgnoreCase("listing")) {
                    CardController.show("menuListing");
                    menuListing.getLabel().setText("Listing ...");
                    panel.getNavbarButton1().getListingbutton1().Activebutton();
                    panel.getNavbarButton1().getHomebutton1().resetButton();
                } else {
                    CardController.show("menuQuest");
                    menuQuest.getLabel().setText("Questionnaire ...");
                    panel.getNavbarButton1().getQuestionnairebutton1().Activebutton();
                    panel.getNavbarButton1().getHomebutton1().resetButton();
                }

            }
        });
        menuListing.getSelectButton1().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                if (menuListing.getState().equalsIgnoreCase("dataentry")) {
                    CardController.show("entrylisting");
                } else if (menuListing.getState().equalsIgnoreCase("update")) {
                    CardController.show("updatelisting");
                } else {

                }
            }
        });
        menuQuest.getSelectButton1().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                if (menuQuest.getState().equalsIgnoreCase("dataentry")) {
                    CardController.show("entryquest");
                } else if (menuQuest.getState().equalsIgnoreCase("update")) {
                    loadUpdateDB();
                    CardController.show("updatequest");
                } else {

                }
            }
        });
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
        listing.getBacktobutton1().addActionListener(new ActionListener() {

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
                    panel.getUpdateQuest1().getTableUpdate1().getModel().setData(data);
                }
                panel.getUpdateQuest1().getTableUpdate1().setLebarKolom();
                refreshTxt = "Updating table loaded. Found " + results.size() + " data";
            } else {
                JOptionPane.showMessageDialog(quest, "Please login first");
            }
        } catch (NullPointerException ep) {
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

