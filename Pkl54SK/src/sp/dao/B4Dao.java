/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp.dao;
import sp.model.B4;


/**
 *
 * @author Imam Habib Pamungkas <imamhabibpamungkas@gmail.com>
 */
public class B4Dao extends DaoService<B4>{
    
    private B4Dao(){
        super(B4.class);
    }
    
    public static B4Dao getInstance() {
        return B4DaoHolder.INSTANCE;
    }
    
    private static class B4DaoHolder {
        private static final B4Dao INSTANCE = new B4Dao();
    }
    
    @Override
    public B4 getSingleBy(String N, String p, String k) {
        return (B4) super.getSingleBy(N, p, k); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public B4 getByID(Object id) {
        return super.getByID(id); //To change body of generated methods, choose Tools | Templates.
    }
}
