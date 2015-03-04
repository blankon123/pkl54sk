/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp.dao;

import sp.model.B1;
import sp.model.Username;

/**
 *
 * @author Imam Habib Pamungkas <imamhabibpamungkas@gmail.com>
 */
public class UserDAO extends DaoService<Username> {

    private UserDAO() {
        super(Username.class);
    }

    public static UserDAO getInstance() {
        return UserDaoHolder.INSTANCE;
    }

    private static class UserDaoHolder {

        private static final UserDAO INSTANCE = new UserDAO();
    }

    @Override
    public B1 getSingleBy(String N, String p, String k) {
        return (B1) super.getSingleBy(N, p, k); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Username getByID(Object id) {
        return super.getByID(id); //To change body of generated methods, choose Tools | Templates.
    }
}
