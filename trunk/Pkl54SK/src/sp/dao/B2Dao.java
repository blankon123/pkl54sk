/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp.dao;

import sp.model.B2;


/**
 *
 * @author Imam Habib Pamungkas <imamhabibpamungkas@gmail.com>
 */
public class B2Dao extends DaoService<B2>{
    
    private B2Dao(){
        super(B2.class);
    }
    
    public static B2Dao getInstance() {
        return B2DaoHolder.INSTANCE;
    }
    
    private static class B2DaoHolder {
        private static final B2Dao INSTANCE = new B2Dao();
    }
    
    @Override
    public B2 getSingleBy(String N, String p, String k) {
        return (B2) super.getSingleBy(N, p, k); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public B2 getByID(Object id) {
        return super.getByID(id); //To change body of generated methods, choose Tools | Templates.
    }
}

