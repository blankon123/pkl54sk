/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp.component;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author Tiara Ratna Dewi [12.7403]
 */
public class LoginTextField extends JTextField{
    
    public LoginTextField() {
        setOpaque(false);
        setBorder(new EmptyBorder(2,2,2,2));
        setPreferredSize(new Dimension(275,32));
        setText("Username ...");
        setForeground(Color.LIGHT_GRAY);
        setFont(new Font("abeatbyKai", 0, 18));
        
    }
    
}
