/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp.dao;

import sp.model.Dsartb1;

/**
 *
 * @author Imam Habib Pamungkas <imamhabibpamungkas@gmail.com>
 */
public class DsartB1Dao extends DaoService<Dsartb1> {

    private DsartB1Dao() {
        super(Dsartb1.class);
    }

    public static DsartB1Dao getInstance() {
        return DsartB1DaoHolder.INSTANCE;
    }

    private static class DsartB1DaoHolder {

        private static final DsartB1Dao INSTANCE = new DsartB1Dao();
    }

    @Override
    public Dsartb1 getSingleBy(String N, String p, String k) {
        return (Dsartb1) super.getSingleBy(N, p, k); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Dsartb1 getByID(Object id) {
        return super.getByID(id); //To change body of generated methods, choose Tools | Templates.
    }
}
