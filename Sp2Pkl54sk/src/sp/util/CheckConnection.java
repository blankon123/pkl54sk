/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp.util;

import sp.dao.*;

/**
 *
 * @author Ristika Nugraha [12.7350]
 */
public class CheckConnection {
    public static void createConnection(){
        UserDAO.getInstance().entity();
        B1Dao.getInstance().entity();
        B2Dao.getInstance().entity();
        B3Dao.getInstance().entity();
        B4Dao.getInstance().entity();
    }
}
