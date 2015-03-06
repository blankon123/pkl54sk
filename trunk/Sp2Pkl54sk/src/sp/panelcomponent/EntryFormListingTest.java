/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp.panelcomponent;

import java.awt.Color;
import javax.swing.JButton;
import sp.controller.ListingControllerTest;

/**
 *
 * @author Istiqomah [12.7194]
 */
public class EntryFormListingTest extends javax.swing.JPanel {
    public ListingControllerTest controller;
    /**
     * Creates new form DataEntryListingTest
     */
    public EntryFormListingTest() {
        initComponents();
        setActive(h1);
        setInactive(h2);
        controller = new ListingControllerTest(this, nextBtn, getBackBtn(), getCloseBtn(), getSaveBtn(), MainPanel);
    }
    
    public void setActive(JButton hal) {
        hal.setForeground(new Color(125, 175, 204));
    }

    public void setInactive(JButton x) {
        x.setForeground(new Color(44, 62, 80));
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgquest1 = new sp.background.Bgquest();
        backBtn = new sp.componentButton.BackminButton();
        nextBtn = new sp.componentButton.NextButton();
        closeBtn = new sp.componentButton.Closebutton();
        saveBtn = new sp.componentButton.Savebutton();
        h1 = new javax.swing.JButton();
        h2 = new javax.swing.JButton();
        closeminbutton1 = new sp.componentButton.Closeminbutton();
        minimizebutton1 = new sp.componentButton.Minimizebutton();
        errorTable2 = new sp.panelcomponent.ErrorTable();
        MainPanel = new javax.swing.JPanel();
        hal1 = new javax.swing.JScrollPane();
        hal1Listing1 = new sp.form.Hal1Listing();
        hal2 = new javax.swing.JScrollPane();
        hal2Listing1 = new sp.form.Hal2Listing();

        backBtn.setText("");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        nextBtn.setText("");

        closeBtn.setText("");

        saveBtn.setText("");

        h1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        h1.setText("Hal 1");

        h2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        h2.setText("Hal 2");

        closeminbutton1.setText("");

        minimizebutton1.setText("");

        MainPanel.setLayout(new java.awt.CardLayout());

        hal1.setViewportView(hal1Listing1);

        MainPanel.add(hal1, "hal1");

        hal2.setViewportView(hal2Listing1);

        MainPanel.add(hal2, "hal2");

        javax.swing.GroupLayout bgquest1Layout = new javax.swing.GroupLayout(bgquest1);
        bgquest1.setLayout(bgquest1Layout);
        bgquest1Layout.setHorizontalGroup(
            bgquest1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgquest1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(minimizebutton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(closeminbutton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(bgquest1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(errorTable2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(bgquest1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(h2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(h1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(bgquest1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgquest1Layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(nextBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(434, 434, 434)
                        .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(closeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(bgquest1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 950, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        bgquest1Layout.setVerticalGroup(
            bgquest1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgquest1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(h1)
                .addGap(28, 28, 28)
                .addComponent(h2)
                .addGap(348, 348, 348))
            .addGroup(bgquest1Layout.createSequentialGroup()
                .addGroup(bgquest1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgquest1Layout.createSequentialGroup()
                        .addGroup(bgquest1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(closeminbutton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(minimizebutton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(206, 206, 206)
                        .addComponent(errorTable2, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 111, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgquest1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(bgquest1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nextBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(closeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bgquest1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bgquest1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 22, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        if(controller.getCardName().equals("hal1")){
            setActive(getH1());
            setInactive(getH2());
        }else if (controller.getCardName().equals("hal2")){
            setActive(getH2());
            setInactive(getH1());

    }//GEN-LAST:event_backBtnActionPerformed
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MainPanel;
    private sp.componentButton.BackminButton backBtn;
    private sp.background.Bgquest bgquest1;
    private sp.componentButton.Closebutton closeBtn;
    private sp.componentButton.Closeminbutton closeminbutton1;
    private sp.panelcomponent.ErrorTable errorTable2;
    private javax.swing.JButton h1;
    private javax.swing.JButton h2;
    private javax.swing.JScrollPane hal1;
    private sp.form.Hal1Listing hal1Listing1;
    private javax.swing.JScrollPane hal2;
    private sp.form.Hal2Listing hal2Listing1;
    private sp.componentButton.Minimizebutton minimizebutton1;
    private sp.componentButton.NextButton nextBtn;
    private sp.componentButton.Savebutton saveBtn;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the h1
     */
    public javax.swing.JButton getH1() {
        return h1;
    }

    /**
     * @return the h2
     */
    public javax.swing.JButton getH2() {
        return h2;
    }

    /**
     * @return the h3
     */
    

    /**
     * @return the backBtn
     */
    public sp.componentButton.BackminButton getBackBtn() {
        return backBtn;
    }

    /**
     * @return the closeBtn
     */
    public sp.componentButton.Closebutton getCloseBtn() {
        return closeBtn;
    }

    /**
     * @return the saveBtn
     */
    public sp.componentButton.Savebutton getSaveBtn() {
        return saveBtn;
    }

    /**
     * @return the closeminbutton1
     */
    public sp.componentButton.Closeminbutton getCloseminbutton1() {
        return closeminbutton1;
    }

    /**
     * @return the minimizebutton1
     */
    public sp.componentButton.Minimizebutton getMinimizebutton1() {
        return minimizebutton1;
    }
}
