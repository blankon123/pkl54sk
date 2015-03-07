/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp.dao;
import sp.model.Dsartb2;

/**
 *
 * @author Imam Habib Pamungkas <imamhabibpamungkas@gmail.com>
 */
public class DsartB2Dao extends DaoService<Dsartb2> {

    private DsartB2Dao() {
        super(Dsartb2.class);
    }

    public static DsartB2Dao getInstance() {
        return DsartB2DaoHolder.INSTANCE;
    }

    private static class DsartB2DaoHolder {

        private static final DsartB2Dao INSTANCE = new DsartB2Dao();
    }

    @Override
    public Dsartb2 getSingleBy(String N, String p, String k) {
        return (Dsartb2) super.getSingleBy(N, p, k); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Dsartb2 getByID(Object id) {
        return super.getByID(id); //To change body of generated methods, choose Tools | Templates.
    }
}
