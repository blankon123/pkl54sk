/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp.dao;

/**
 *
 * @author StephenCN
 */
import sp.model.Dsartb4;

/**
 *
 * @author Imam Habib Pamungkas <imamhabibpamungkas@gmail.com>
 */
public class DsartB4Dao extends DaoService<Dsartb4> {

    private DsartB4Dao() {
        super(Dsartb4.class);
    }

    public static DsartB4Dao getInstance() {
        return DsartB4DaoHolder.INSTANCE;
    }

    private static class DsartB4DaoHolder {

        private static final DsartB4Dao INSTANCE = new DsartB4Dao();
    }

    @Override
    public Dsartb4 getSingleBy(String N, String p, String k) {
        return (Dsartb4) super.getSingleBy(N, p, k); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Dsartb4 getByID(Object id) {
        return super.getByID(id); //To change body of generated methods, choose Tools | Templates.
    }
}
