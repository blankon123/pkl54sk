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
 * @author Istiqomah [12.7194]
 */
public class Updatebutton1 extends JButton{
    
    private ImageIcon icon;
    private boolean active;
    
    public Updatebutton1(){
        
        setOpaque(false);
        setContentAreaFilled(false);
        setFocusPainted(false);
        setBorderPainted(false);
        
        icon = new ImageIcon(getClass().getResource("/sp/image/updatebutton.png"));
        setIcon(icon);
        
        setPreferredSize(new Dimension(301,72));
        setVisible(true);
        setText(null);
        active = false;
        
        
                        
        addMouseListener(new MouseAdapter() {

            @Override
            public void mouseEntered(MouseEvent me) {
                icon = new ImageIcon(getClass().getResource("/sp/image/updatebutton-clicked.png"));
                setIcon(icon);
            }

            @Override
            public void mouseExited(MouseEvent me) {
                if(isActive()==true){
                    icon = new ImageIcon(getClass().getResource("/sp/image/updatebutton-clicked.png"));
                    setIcon(icon);
                }
                else{
                    resetButton();
                }
            }

            @Override
            public void mousePressed(MouseEvent me) {
                icon = new ImageIcon(getClass().getResource("/sp/image/updatebutton-clicked.png"));
                setIcon(icon);
                setActive(true);
            }

            @Override
            public void mouseReleased(MouseEvent me) {
                icon = new ImageIcon(getClass().getResource("/sp/image/updatebutton-clicked.png"));
                setIcon(icon);
                //setActive(true);
            }
        });
        
    }
    
    public void resetButton(){
        icon = new ImageIcon(getClass().getResource("/sp/image/updatebutton.png"));
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

    public void Activebutton() {
        icon = new ImageIcon(getClass().getResource("/sp/image/updatebutton-clicked.png"));
        setIcon(icon);
        setActive(true);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
