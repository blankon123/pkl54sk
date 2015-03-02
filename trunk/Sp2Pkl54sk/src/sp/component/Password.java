/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp.component;

import java.awt.Dimension;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author Tiara Ratna Dewi [12.7403]
 */
public class Password extends JPasswordField{
    
    
    public Password(){
        setOpaque(false);
        setBorder(new EmptyBorder(2, 2, 2, 2));
        setPreferredSize(new Dimension(275,32));
    }
    
}
