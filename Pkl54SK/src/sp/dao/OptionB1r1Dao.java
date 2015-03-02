/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp.dao;
import sp.model.OptionB1r1;
/**
 *
 * @author StephenCN
 */
public class OptionB1r1Dao extends DaoService<OptionB1r1>{
    
    private OptionB1r1Dao(){
        super(OptionB1r1.class);
    }
    
    public static OptionB1r1Dao getInstance() {
        return OpsiB1r1DaoHolder.INSTANCE;
    }
    
    private static class OpsiB1r1DaoHolder {
        private static final OptionB1r1Dao INSTANCE = new OptionB1r1Dao();
    }
}