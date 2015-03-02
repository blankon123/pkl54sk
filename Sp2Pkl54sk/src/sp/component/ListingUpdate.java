/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp.component;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Tiara Ratna Dewi [12.7403]
 */
public class ListingUpdate extends JPanel{
    private Image image;
    
    public ListingUpdate(){
        image = new ImageIcon(getClass().getResource("/sp/image/update-listing.png")).getImage();
        setPreferredSize(new Dimension(1066,620));
        setOpaque(false);
    }
    

    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D gd = (Graphics2D) g.create();
        gd.drawImage(image, 62 , 30, null);
        gd.dispose();
    }
    
}