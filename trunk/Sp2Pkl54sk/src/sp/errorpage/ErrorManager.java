/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp.errorpage;

/**
 *
 * @author Tiara Ratna Dewi [12.7403]
 */

import sp.component.Error;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class ErrorManager {

 
    private List<Error> err=new ArrayList <Error>();
 
    public ErrorManager(List<Error> err) {
        this.err = err;  
    }

    public ErrorManager() {
    }
    
    
    public DefaultTableModel getError()
    {
 
        DefaultTableModel model = new DefaultTableModel();
        String[] judul = {"Kode", "Deskripsi Error"};
        model.setColumnIdentifiers(judul);
        for ( Error n : err)
        {
            String[] isi =  {String.valueOf(n.getKode()),String.valueOf(n.getDeserror())};
            model.addRow(isi);
        }
        return model;
    }
}

