/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp.panelcomponent;

/**
 *
 * @author Tiara Ratna Dewi [12.7403]
 */
public class DataEntryQuest extends javax.swing.JPanel {

    /**
     * Creates new form DataEntryQuest
     */
    public DataEntryQuest() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        questDataEntry1 = new sp.component.QuestDataEntry();
        tableUpdate1 = new sp.panelcomponent.TableUpdate();
        startButton1 = new sp.componentButton.StartButton();
        backtobutton1 = new sp.componentButton.Backtobutton();

        startButton1.setText("");

        backtobutton1.setText("");

        javax.swing.GroupLayout questDataEntry1Layout = new javax.swing.GroupLayout(questDataEntry1);
        questDataEntry1.setLayout(questDataEntry1Layout);
        questDataEntry1Layout.setHorizontalGroup(
            questDataEntry1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(questDataEntry1Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(tableUpdate1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(questDataEntry1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(startButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backtobutton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(127, Short.MAX_VALUE))
        );
        questDataEntry1Layout.setVerticalGroup(
            questDataEntry1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, questDataEntry1Layout.createSequentialGroup()
                .addContainerGap(170, Short.MAX_VALUE)
                .addComponent(tableUpdate1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102))
            .addGroup(questDataEntry1Layout.createSequentialGroup()
                .addGap(247, 247, 247)
                .addComponent(startButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(backtobutton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(questDataEntry1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(questDataEntry1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private sp.componentButton.Backtobutton backtobutton1;
    private sp.component.QuestDataEntry questDataEntry1;
    private sp.componentButton.StartButton startButton1;
    private sp.panelcomponent.TableUpdate tableUpdate1;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the backtobutton1
     */
    public sp.componentButton.Backtobutton getBacktobutton1() {
        return backtobutton1;
    }

    /**
     * @return the startButton2
     */
    public sp.componentButton.StartButton getStartButton1() {
        return startButton1;
    }

    public TableUpdate getTableUpdate1() {
        return tableUpdate1;
    }

    /**
     * @return the backButton1
     */
    
    
}
