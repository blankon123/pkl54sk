/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp.dao;

import sp.model.OptionB1r9;

/**
 *
 * @author StephenCN
 */
public class OptionB1r9Dao extends DaoService<OptionB1r9>{
    
    private OptionB1r9Dao(){
        super(OptionB1r9.class);
    }
    
    public static OptionB1r9Dao getInstance() {
        return OpsiB1r10DaoHolder.INSTANCE;
    }
    
    private static class OpsiB1r10DaoHolder {
        private static final OptionB1r9Dao INSTANCE = new OptionB1r9Dao();
    }
}
