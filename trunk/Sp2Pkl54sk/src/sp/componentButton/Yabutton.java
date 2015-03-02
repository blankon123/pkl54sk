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
public class Yabutton extends JButton {

    private ImageIcon icon;
    private boolean active;

    public Yabutton() {

        setOpaque(false);
        setContentAreaFilled(false);
        setFocusPainted(false);
        setBorderPainted(false);

        icon = new ImageIcon(getClass().getResource("/sp/image/ya_btn.png"));
        setIcon(icon);
        setDisabledIcon(icon);

        setPreferredSize(new Dimension(301, 72));
        setVisible(true);
        setText(null);
        active = false;

        addMouseListener(new MouseAdapter() {

            @Override
            public void mouseEntered(MouseEvent me) {
                icon = new ImageIcon(getClass().getResource("/sp/image/ya_btn-hover.png"));
                setIcon(icon);
            }

            @Override
            public void mouseExited(MouseEvent me) {
                icon = new ImageIcon(getClass().getResource("/sp/image/ya_btn.png"));
                setIcon(icon);
            }
        });
    }
}
