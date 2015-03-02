/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp.dao;
import sp.model.B5;

/**
 *
 * @author Imam Habib Pamungkas <imamhabibpamungkas@gmail.com>
 */
public class B5Dao extends DaoService<B5>{
    
    private B5Dao(){
        super(B5.class);
    }
    
    public static B5Dao getInstance() {
        return B5DaoHolder.INSTANCE;
    }
    
    private static class B5DaoHolder {
        private static final B5Dao INSTANCE = new B5Dao();
    }
    
    @Override
    public B5 getSingleBy(String N, String p, String k) {
        return (B5) super.getSingleBy(N, p, k); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public B5 getByID(Object id) {
        return super.getByID(id); //To change body of generated methods, choose Tools | Templates.
    }
}
