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
import sp.componentButton.Closebutton;
import sp.componentButton.Savebutton;
import sp.panelcomponent.EntryFormListingTest;
import sp.panelcomponent.EntryFormQuestTest;
import sp.util.CardLayoutController;
import sp.view.ConfirmClose;
import sp.view.Panel;
import sp.view.TesBeta;

/**
 *
 * @author Tiara Ratna Dewi [12.7403]
 */
public class ButtonController {
    CardLayoutController controller;
    EntryFormQuestTest quest;
    EntryFormListingTest listing;
    Closebutton closebutton;
    Savebutton savebutton;
    TesBeta coba;
    Panel panel;
    JPanel Mainpanel;
    
public  ButtonController(TesBeta coba,EntryFormQuestTest quest,EntryFormListingTest listing,  JPanel Mainpanel){
        this.coba= coba;
        this.listing = listing;
        this.quest= quest;
        this.Mainpanel = Mainpanel;
        
        controller = new CardLayoutController();
        controller.setCardLayout((CardLayout) Mainpanel.getLayout());
        controller.setParentCard(Mainpanel);
        
        quest.getCloseBtn().addActionListener(new ActionListener() {

            int yakin = 0;

            @Override
            public void actionPerformed(ActionEvent ae) {

                ConfirmClose konfirm = new ConfirmClose(null, true);
                konfirm.getYa().addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        yakin++;
                        konfirm.setVisible(false);
                        ConfirmClose konfirm1 = new ConfirmClose(null, true);
                        konfirm1.getYa().addActionListener(new ActionListener() {

                            @Override
                            public void actionPerformed(ActionEvent e) {
                                yakin++;
                                konfirm1.setVisible(false);
                                if (yakin == 2) {
                                    controller.show("panel");
                                }
                            }
                        });
                        konfirm1.setVisible(true);
                    }
                });
                konfirm.setVisible(true);
                yakin = 0;
            }
        });
        
        listing.getCloseBtn().addActionListener(new ActionListener() {

            int yakin = 0;

            @Override
            public void actionPerformed(ActionEvent ae) {

                ConfirmClose konfirm = new ConfirmClose(null, true);
                konfirm.getYa().addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        yakin++;
                        konfirm.setVisible(false);
                        ConfirmClose konfirm1 = new ConfirmClose(null, true);
                        konfirm1.getYa().addActionListener(new ActionListener() {

                            @Override
                            public void actionPerformed(ActionEvent e) {
                                yakin++;
                                konfirm1.setVisible(false);
                                if (yakin == 2) {
                                    controller.show("panel");
                                }
                            }
                        });
                        konfirm1.setVisible(true);
                    }
                });
                konfirm.setVisible(true);
                yakin = 0;
            }
        });
        
    }
}
