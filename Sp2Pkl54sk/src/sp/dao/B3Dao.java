/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp.dao;

import sp.model.B3;


/**
 *
 * @author Imam Habib Pamungkas <imamhabibpamungkas@gmail.com>
 */
public class B3Dao extends DaoService<B3>{
    
    private B3Dao(){
        super(B3.class);
    }
    
    public static B3Dao getInstance() {
        return B3DaoHolder.INSTANCE;
    }
    
    private static class B3DaoHolder {
        private static final B3Dao INSTANCE = new B3Dao();
    }
    
    @Override
    public B3 getSingleBy(String N, String p, String k) {
        return (B3) super.getSingleBy(N, p, k); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public B3 getByID(Object id) {
        return super.getByID(id); //To change body of generated methods, choose Tools | Templates.
    }
}
