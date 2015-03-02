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
import sp.panelcomponent.DataEntryListing;
import sp.panelcomponent.DataEntryQuest;
import sp.panelcomponent.LandingButton;
import sp.panelcomponent.Menu;
import sp.panelcomponent.UpdateListing;
import sp.panelcomponent.UpdateQuest;
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
        this.listing = listing;
        this.quest = quest;

        CardController = new CardLayoutController();
        CardController.setCardLayout((CardLayout) MainPanel.getLayout());
        CardController.setParentCard(MainPanel);

        entryQuest.getStartButton1().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                CardController.show("entryformQuest");
            }
        });

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
}
