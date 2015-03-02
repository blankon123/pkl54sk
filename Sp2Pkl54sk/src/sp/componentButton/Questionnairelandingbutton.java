/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp.componentButton;

import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author Tiara Ratna Dewi [12.7403]
 */
public class Questionnairelandingbutton extends JButton{
    
    private ImageIcon icon;
    private boolean active;
    
    public Questionnairelandingbutton(){
        
        setOpaque(false);
        setContentAreaFilled(false);
        setFocusPainted(false);
        setBorderPainted(false);
        
        icon = new ImageIcon(getClass().getResource("/sp/image/quest.png"));
        setIcon(icon);
        
        setPreferredSize(new Dimension(232,291));
        setVisible(true);
        setText(null);
        active=false;
        
                        
        addMouseListener(new MouseAdapter() {
            
            @Override
            public void mousePressed(MouseEvent me) {
                icon = new ImageIcon(getClass().getResource("/sp/image/quest-selected.png"));
                setIcon(icon);
                setActive(true);
            }

            @Override
            public void mouseEntered(MouseEvent me) {
               icon = new ImageIcon(getClass().getResource("/sp/image/quest-hover.png"));
                setIcon(icon);                
            }
            
            @Override
            public void mouseExited(MouseEvent me) {
                if(isActive()==true){
                    icon = new ImageIcon(getClass().getResource("/sp/image/quest-selected.png"));
                    setIcon(icon);
                }
                else{
                    resetButton();
                }
            }

        });
        
    }
    
    public void resetButton(){
        icon = new ImageIcon(getClass().getResource("/sp/image/quest.png"));
        setIcon(icon);
        setActive(false);
    }
    
    /**
     * @return the active
     */
    public boolean isActive() {
        return active;
    }

    /**
     * @param active the active to set
     */
    public void setActive(boolean active) {
       
        this.active = active;
    }

    
}
