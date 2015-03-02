/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp.dao;

import sp.model.B1;

/**
 *
 * @author Imam Habib Pamungkas <imamhabibpamungkas@gmail.com>
 */
public class B1Dao extends DaoService<B1> {

    private B1Dao() {
        super(B1.class);
    }

    public static B1Dao getInstance() {
        return B1DaoHolder.INSTANCE;
    }

    private static class B1DaoHolder {

        private static final B1Dao INSTANCE = new B1Dao();
    }

    @Override
    public B1 getSingleBy(String N, String p, String k) {
        return (B1) super.getSingleBy(N, p, k); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public B1 getByID(Object id) {
        return super.getByID(id); //To change body of generated methods, choose Tools | Templates.
    }
}
