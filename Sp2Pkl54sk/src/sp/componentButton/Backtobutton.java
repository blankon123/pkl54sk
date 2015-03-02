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
public class Backtobutton extends JButton{
    
    private ImageIcon icon;
    
    public Backtobutton(){
        
        setOpaque(false);
        setContentAreaFilled(false);
        setFocusPainted(false);
        setBorderPainted(false);
        
        icon = new ImageIcon(getClass().getResource("/sp/image/backto.png"));
        setIcon(icon);
        
        setPreferredSize(new Dimension(301,37));
        setVisible(true);
        setText(null);
        
                        
        addMouseListener(new MouseAdapter() {

            
            @Override
            public void mousePressed(MouseEvent me) {
                icon = new ImageIcon(getClass().getResource("/sp/image/backto-clicked.png"));
                setIcon(icon);
                
            }

            @Override
            public void mouseReleased(MouseEvent me) {
                resetButton();
            }
        });
        
    }
    
    public void resetButton(){
        icon = new ImageIcon(getClass().getResource("/sp/image/backto.png"));
        setIcon(icon);
    }

    
}