/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp.dao;
import sp.model.OptionB1r4;
/**
 *
 * @author StephenCN
 */
public class OptionB1r4Dao extends DaoService<OptionB1r4>{
    
    private OptionB1r4Dao(){
        super(OptionB1r4.class);
    }
    
    public static OptionB1r4Dao getInstance() {
        return OpsiB1r4DaoHolder.INSTANCE;
    }
    
    private static class OpsiB1r4DaoHolder {
        private static final OptionB1r4Dao INSTANCE = new OptionB1r4Dao();
    }
}