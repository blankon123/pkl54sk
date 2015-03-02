/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp.util;

import sp.dao.B1Dao;
import sp.dao.B2Dao;
import sp.dao.B3Dao;
import sp.dao.B4Dao;

/**
 *
 * @author Ristika Nugraha [12.7350]
 */
public class CheckConnection {
    public static void createConnection(){
        B1Dao.getInstance().entity();
        B2Dao.getInstance().entity();
        B3Dao.getInstance().entity();
        B4Dao.getInstance().entity();
    }
    public static void closeConnection(){
//        B1Dao.getInstance().entity().close();
//        B2Dao.getInstance().entity().close();
//        B3Dao.getInstance().entity().close();
//        B4Dao.getInstance().entity().close();
    }
}
