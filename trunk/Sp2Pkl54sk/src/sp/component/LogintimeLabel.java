/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp.component;

import static com.sun.javafx.iio.ImageStorage.ImageType.RGB;
import java.awt.Color;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;
import org.w3c.dom.css.CSSPrimitiveValue;
import org.w3c.dom.css.RGBColor;

/**
 *
 * @author Tiara Ratna Dewi [12.7403]
 */
public class LogintimeLabel extends JLabel{
    
    private Date date;
    private DateFormat format;
    private Color warna;
    
    public LogintimeLabel(){
        date = new Date();
       // format = DateFormat.getDateInstance(DateFormat.FULL);
        format = new SimpleDateFormat("HH:mm:ss | dd/MM/yyyy");
        setText("Login at : [ "+format.format(date)+" ]"); 
        setForeground(Color.CYAN);
    }
    
}
