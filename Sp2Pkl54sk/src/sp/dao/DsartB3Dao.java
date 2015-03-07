/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp.dao;
import sp.model.Dsartb3;

/**
 *
 * @author Imam Habib Pamungkas <imamhabibpamungkas@gmail.com>
 */
public class DsartB3Dao extends DaoService<Dsartb3> {

    private DsartB3Dao() {
        super(Dsartb3.class);
    }

    public static DsartB3Dao getInstance() {
        return DsartB3DaoHolder.INSTANCE;
    }

    private static class DsartB3DaoHolder {

        private static final DsartB3Dao INSTANCE = new DsartB3Dao();
    }

    @Override
    public Dsartb3 getSingleBy(String N, String p, String k) {
        return (Dsartb3) super.getSingleBy(N, p, k); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Dsartb3 getByID(Object id) {
        return super.getByID(id); //To change body of generated methods, choose Tools | Templates.
    }
}
