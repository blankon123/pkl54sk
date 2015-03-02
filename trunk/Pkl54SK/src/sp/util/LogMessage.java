/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp.util;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.persistence.RollbackException;

/**
 *
 * @author Ristika Nugraha [12.7350]
 */
public class LogMessage {

    private static String logText = "";

    public static void write(String text) throws IOException {
        DateFormat df = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
        Date date = new Date();
        String username = UserControl.getNim();
        if (username != null) {
            File file = new File("src/sp/txt/" + username + ".txt");
            FileWriter output = new FileWriter(file, true);
            output.write("\n" + date + "\t" + logText + text);
            output.close();
        } else {

        }
    }

    public static void clearLog() {
        String blank = "";
        logText = blank;
    }

    public static void write(RollbackException e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
